/*
 * First part of KataBankOCR from codingdojo.org
 * as written at #IWDEV Dec 2013
 */
package com.qubecad.KataBankOCR;

import java.io.BufferedReader;

/**
 *
 * @author carl
 */
public class KataBankOCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int charMin = 0;
        int charMax = 4;
        
        String line1 = " __      __  __      __  __  __  __  __ ";
        String line2 = "|  |   | __| __||__||__ |__    ||__||__|";
        String line3 = "|__|   ||__  __|   | __||__|   ||__|   |";
        
        String r = "";
        
        do {
            do {

                r = testForZero(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForOne(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForTwo(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForThree(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForFour(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForFive(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForSix(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForSeven(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForEight(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
                r = testForNine(getSample(line1, charMin, charMax), getSample(line2, charMin, charMax), getSample(line3, charMin, charMax));
                if (!r.equals("")) {
                    break;
                }
            } while (true);
            System.out.print(r);
            charMin = charMin + 4;
            charMax = charMax + 4;


        } while (charMax <= line1.length());
        System.out.println("");
       
        System.exit(0);
    }
/*
 * Test 3 passed in lines against sample and return the digit or "".
 */
    private static String testForZero(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("|  |");
        boolean r3 = l3.equals("|__|");

        if (r1 && r2 && r3) {
            result = "0";
        }


        return result;
    }

    private static String testForOne(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals("    ");
        boolean r2 = l2.equals("   |");
        boolean r3 = l3.equals("   |");

        if (r1 && r2 && r3) {
            result = "1";
        }


        return result;
    }

    private static String testForTwo(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals(" __|");
        boolean r3 = l3.equals("|__ ");

        if (r1 && r2 && r3) {
            result = "2";
        }


        return result;
    }

    private static String testForThree(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals(" __|");
        boolean r3 = l3.equals(" __|");

        if (r1 && r2 && r3) {
            result = "3";
        }


        return result;
    }

    private static String testForFour(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals("    ");
        boolean r2 = l2.equals("|__|");
        boolean r3 = l3.equals("   |");

        if (r1 && r2 && r3) {
            result = "4";
        }


        return result;
    }

    private static String testForFive(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("|__ ");
        boolean r3 = l3.equals(" __|");

        if (r1 && r2 && r3) {
            result = "5";
        }


        return result;
    }

    private static String testForSix(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("|__ ");
        boolean r3 = l3.equals("|__|");

        if (r1 && r2 && r3) {
            result = "6";
        }


        return result;
    }

    private static String testForSeven(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("   |");
        boolean r3 = l3.equals("   |");

        if (r1 && r2 && r3) {
            result = "7";
        }


        return result;
    }

    private static String testForEight(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("|__|");
        boolean r3 = l3.equals("|__|");

        if (r1 && r2 && r3) {
            result = "8";
        }


        return result;
    }

    private static String testForNine(String l1, String l2, String l3) {
        String result = "";

        boolean r1 = l1.equals(" __ ");
        boolean r2 = l2.equals("|__|");
        boolean r3 = l3.equals("   |");

        if (r1 && r2 && r3) {
            result = "9";
        }


        return result;
    }

    
    /*
     * Return a substring of the line between the min and max character values.
     */
    private static String getSample(String line, int charMin, int charMax) {
        return String.valueOf(line.subSequence(charMin, charMax));
    }
}
