package com.example.basic.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {
    static class Capital implements Comparable<Capital> {
        int cap;
        PriorityQueue<Integer> profit = new PriorityQueue<Integer>(10,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ( o1 < 02 ) return 1 ;
                else if ( o1 > 02 ) return -1;
                else return 0;
            }
            
        });

        public Capital(int cap) {
            this.cap = cap;
        }

        public Capital(int cap , int profit) {
            this.cap = cap;
            this.profit.add(profit);
        }

        @Override
        public boolean equals(Object o) {
            if (((Capital)o).cap == this.cap)
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

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        for (int i = 0; i < capital.length; i++) {
            Capital c = new Capital(capital[i],profits[i]);
            int index = arr.indexOf(c);
            if (index == -1) {
                arr.add(c);
            } else {
                Capital ct = arr.get(index);
                ct.profit.add(profits[i]);
            }
        }

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
        while (k > 0 && arr.size() > 0) {
            System.out.println( " capital : " +new_cap + " k : "+ k);
            Capital c = new Capital(new_cap);
            int index = Collections.binarySearch(arr, c);

            Capital d = null;
            if (index >= 0) {
                // get from Array the requisite profit
                d = arr.get(index);

                if (d.profit != null && d.profit.size() > 0) {
                    int p = d.profit.remove();
                    new_cap += p;
                    k--;
                    if(d.profit.size() == 0) {
                        arr.remove(index);
                    }
                }
            } else {
                int new_index = -1 * (index + 1);
                if ( new_index == 0) return new_cap;
                if (new_index == arr.size()) { new_index = arr.size() -1; }
                else {
                    new_index --;
                }
                if (new_index >= 0) {
                    d = arr.get(new_index);
                    if (d.cap < new_cap &&  d.profit != null && d.profit.size() > 0) {
                        int p = d.profit.remove();
                        new_cap += p;
                        k--;
                        //if there are no projects with profit delete record 
                        if(d.profit.size() == 0) {
                            arr.remove(new_index);
                        }
                    }
                }

            }

        }
        return new_cap;
    }

}
