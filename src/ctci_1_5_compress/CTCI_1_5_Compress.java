/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_1_5_compress;

/**
 *
 * @author klsandbox
 */
public class CTCI_1_5_Compress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        str = "aaabbbbcccc";
        System.out.println("Str:" + str + " compress:" + compress(str));
        str = "aaabbbbccccd";
        System.out.println("Str:" + str + " compress:" + compress(str));
        str = "";
        System.out.println("Str:" + str + " compress:" + compress(str));
        str = "aaaa";
        System.out.println("Str:" + str + " compress:" + compress(str));
        str = "abc";
        System.out.println("Str:" + str + " compress:" + compress(str));
        str = "abccd";
        System.out.println("Str:" + str + " compress:" + compress(str));
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char letter = str.charAt(0);
        int letterCount = 1;
        StringBuilder sb = new StringBuilder();
        for (int ctr = 1; ctr < str.length(); ctr++) {
            if (str.charAt(ctr) == letter) {
                letterCount++;
            } else {
                sb.append(letter);
                sb.append(letterCount);
                letter = str.charAt(ctr);
                letterCount = 1;
            }
        }

        sb.append(letter);
        sb.append(letterCount);
        return sb.length() < str.length() ? sb.toString() : str;
    }

}
