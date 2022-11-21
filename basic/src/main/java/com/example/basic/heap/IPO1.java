package com.example.basic.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO1 {
    static class Capital implements Comparable<Capital> {
        int cap;
        ArrayList<Integer> prof = new ArrayList<Integer>();

        public Capital(int c, int p) {
            this.cap = c;
            this.prof.add(p);
        }

        public Capital(int c) {
            this.cap = c;
        }

        @Override
        public boolean equals(Object o) {
            if (((Capital) o).cap == this.cap)
                return true;
            return false;

        }

        @Override
        public int compareTo(Capital o) {
            if (this.cap < o.cap) {
                return -1;
            } else if (this.cap == o.cap) {
                return 0;
            } else
                return 1;
        }
    }

    ArrayList<Capital> arr = new ArrayList<Capital>();
    PriorityQueue<Integer> profit = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2)
                return 1;
            else if (o1 > o2)
                return -1;
            else
                return 0;
        }

    });

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // create arraylist of capital and profit
        for (int i = 0; i < profits.length; i++) {
            Capital c = new Capital(capital[i], profits[i]);
            int index = arr.indexOf(c);
            if (index == -1) {
                arr.add(c);
            } else {
                arr.get(index).prof.add(profits[i]);
            }
        }
        // Sort list by capital
        arr.sort(new Comparator<Capital>() {
            @Override
            public int compare(Capital o1, Capital o2) {
                if (o1.cap == o2.cap)
                    return 0;
                else if (o1.cap < o2.cap)
                    return -1;
                else
                    return 1;
            }
        });
        int new_cap = w;
        int bottom = 0;
        boolean allProjAdded = false;
        while (k > 0 && arr.size() > 0) {
           // System.out.println(" capital : " + new_cap + " k : " + k);
            Capital c = new Capital(new_cap);
            int index = Collections.binarySearch(arr, c);

            int new_index = index;
            if (index < 0) {
                new_index = -1 * (index + 1);
                if (new_index == 0 && new_cap < capital[0]) {
                    return new_cap;
                }
                new_index--;
            }
            /*
             * Create a priority Queue of indexes <= new_index
             * In another words of capital <= new_cap
             * If all projects are added . then skip
             */
            if (allProjAdded == false) {
                for (int j = new_index; j >= bottom; j--) {
                    ArrayList<Integer> t = arr.get(j).prof;
                    if (t != null & t.size() > 0) {
                        for (Integer p : t) {
                            profit.add(p);
                        }
                    }
                }
            }

            if (profit.size() > 0) {
                Integer high = profit.remove();
              
                new_cap += high;
                k--;
                //System.out.println("adding profit :"+high + " k : "+k + " size : "+profit.size() + " new cap "+new_cap);
                 
                if (new_index == arr.size() - 1) {
                    // all records are already added
                    allProjAdded = true;
                    break;
                } else {
                    bottom = new_index + 1;
                }
            }
            else {
                return new_cap;
            }
        }

        while(k > 0  && profit.size() > 0) {
            Integer high = profit.remove();
            new_cap += high;
            k--;
            //System.out.println("adding profit :"+high + " k : "+k + " size : "+profit.size());
        }

        return new_cap;
    }
}
