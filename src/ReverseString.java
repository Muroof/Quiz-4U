/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class ReverseString {

    public String reverseString(String word) {
        // BASE CASE
        // if no word is entered or if word is only one letter return the word
        if (word == null || word.length() <= 1) {
            return word;
        }
        // takes the first character of the string and puts it and the end
        // runs through recursively until string is less than or equal to one
        return reverseString(word.substring(1)) + word.charAt(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReverseString test = new ReverseString();
        String reverseString = test.reverseString("yors");
        System.out.println(reverseString);

    }
}
