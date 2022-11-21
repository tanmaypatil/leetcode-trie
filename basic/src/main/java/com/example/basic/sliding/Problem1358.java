package com.example.basic.sliding;

public class Problem1358 {

    int abc = -2;
    int abcplus = 0;
    int abccount = 0;
    int acb = -2;
    int acbplus = 0;
    int acbcount = 0;
    int bac = -2;
    int bacplus = 0;
    int baccount = 0;
    int bca = -2;
    int bcaplus = 0;
    int bcacount = 0;
    int cab = -2;
    int cabplus = 0;
    int cabcount = 0;
    int cba = -2;
    int cbaplus = 0;
    int cbacount = 0;

    public int numberOfSubstrings(String s) {
        int numStrings = 0;
        String prev = null;
        for (int index = 0; index < s.length(); index++) {
            String c = String.valueOf(s.charAt(index));
            switch (c) {
                case "a":
                    if (abc == -2) {
                        abc = -1;
                    }
                    if (abccount >= 1) {
                        abcplus += abccount;
                    }

                    if (acb == -2) {
                        acb = -1;
                    }
                    if (acbcount >= 1) {
                        acbplus += acbcount;
                    }

                    if ("b".equals(prev) && (bac == -1)) {
                        bac = 0;
                    }
                    if (bacplus >= 1) {
                        bacplus++;
                    }
                    if (bcacount >= 1) {
                        bcaplus += bcacount;
                    }
                    if (("c".equals(prev) && bca == 0)) {
                        bca = -2;
                        bcacount++;
                        bcaplus += 1;
                       
                    }
                    
                    if (("c".equals(prev) && cab == -1)) {
                        cab++;
                    }
                    if (cabcount >= 1) {
                        cabplus += cabcount;
                    }
                    if (cbacount >= 1) {
                        cbaplus += cbacount;
                    }
                    if (("b".equals(prev) && cba == 0)) {
                        cba = -2;
                        cbacount++;
                        cbaplus += 1;
                        
                    }
                    break;
                case "b":
                    if ("a".equals(prev) && abc == -1) {
                        abc = 0;
                    }
                    if (abccount >= 1) {
                        abcplus += abccount;
                    }

                    if (acbcount >= 1) {
                        acbplus+= acbcount;
                    }
                    if (("c".equals(prev) && acb == 0)) {
                        acb = -2;
                        acbcount++;
                        acbplus += 1;
                        
                    }
                   
                    if (bac == -2) {
                        bac = -1;
                    }
                    if (baccount >= 1) {
                        bacplus++;
                    }
                    if (bca == -2) {
                        bca = -1;
                    }
                    if (bcaplus >= 1) {
                        bcaplus++;
                    }
                    if (cabcount >= 1) {
                        cabplus += cabcount;
                    }
                    if (("a".equals(prev) && cab == 0)) {
                        cab = -2;
                        cabcount++;
                        cabplus += 1;
                       
                    }
                   
                    if (("c".equals(prev) && cba == -1)) {
                        cba = 0;
                    }
                    if (cbacount >= 1) {
                        cbaplus += cbacount;
                    }
                    break;
                case "c":
                    if (abccount >= 1) {
                        abcplus += abccount;
                    }
                    if (("b".equals(prev) && abc == 0)) {
                        abc = -2; 
                        abccount++;
                        abcplus += 1;
                       
                    }

                    if (("a".equals(prev) && acb == -1)) {
                        acb = 0;
                    }
                    if (acbcount >= 1) {
                        acbplus += acbcount;
                    }
                    if (baccount >= 1) {
                        bacplus += baccount;
                    }
                    if (("a".equals(prev) && bac == 0)) {
                        bac = -2;
                        baccount ++;
                        bacplus += 1;
                       
                    }
                    
                    if (("b".equals(prev) && bca == -1)) {
                        bca++;
                    }
                    if (bcacount >= 1) {
                        bcaplus += bcacount;
                    }
                    if (cab == -2) {
                        cab = -1;
                    }
                    if (cabcount >= 1) {
                        cabplus += cabcount;
                    }
                    if (cba == -2) {
                        cba = -1;
                    }
                    if (cbacount >= 1) {
                        cbaplus += cbacount;
                    }
                    break;
            }
            // System.out.println("abc : "+abc + " acb : "+acb );
            // System.out.println("bca : "+bca + " bac : "+bac );
            // System.out.println("cab : "+cab + " cba: "+cba );
            prev = c;

        }
        System.out.println("abc : " + abc + " acb : " + acb);
        System.out.println("bca : " + bca + " bac : " + bac);
        System.out.println("cab : " + cab + " cba: " + cba);
        System.out.println("abcplus : " + abcplus + " acbplus : " + acbplus);
        System.out.println("bcaplus : " + bcaplus + " bacplus : " + bacplus);
        System.out.println("cabplus : " + cabplus + " cbaplus: " + cbaplus);

        numStrings = abcplus > 0 ? numStrings + abcplus : numStrings;
        numStrings = acbplus > 0 ? numStrings + acbplus : numStrings;
        numStrings = bcaplus > 0 ? numStrings + bcaplus : numStrings;
        numStrings = bacplus > 0 ? numStrings + bacplus : numStrings;
        numStrings = cabplus > 0 ? numStrings + cabplus : numStrings;
        numStrings = cbaplus > 0 ? numStrings + cbaplus : numStrings;

        return numStrings;
    }

}