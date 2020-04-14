package org.avniet.stringops;

public class Application {

    public static void main(String[] args) {
        testString(" This is a test string! ");
    }

    public static void testString(String testString) {
        StringOperations stringOps = new StringOperations(testString);

        // Check if the String is empty
        if(stringOps.checkStringIfEmpty()) {
             // Find the length of the string.
            System.out.println("Length of the non-empty string is "+stringOps.findLength()+".");
        }

        // Verify if the string contains 'test'
        if(stringOps.checkIfStringContains("test")) { 
            // Find the index where test starts.
            System.out.println("The index of first occurence of 'test' is "+stringOps.findIndexOf("test"));
        }

        // Check if the string contains whitespaces to the left and right of the sentences
        if(stringOps.checkIfStringStartsWith(" ") && stringOps.checkIfStringEndsWith(" ")) {
            // Remove the unneccesary whitespace.
            System.out.println("The string without the trailing whitespace: "+stringOps.removeSurroundingWhiteSpace());
        }

        // Check if the strings are perfectly equal
        if(! stringOps.checkStringEquality(" This is A TeSt STRinG! ")) {
            System.out.println("They are not equal because ");
            // Check if the strings are equal irrespective of the case
            if(stringOps.checkEqualityWithAnyCase(" This is A TeSt STRinG! ")) {
                System.out.print("the case is different!");
                // Convert all the characters to lower case
                System.out.println("Converting to all lower case: "+stringOps.convertToLowerCase());

                // Conver all the characters to upper case
                System.out.println("And to all upper case: "+stringOps.convertToUpperCase());
            }
            else {
                System.out.print("the words are not same at all!");
            }
        }

        // Check if the string contains the specified string
        if(stringOps.checkIfStringContains("string!")) {
            System.out.println("The index of ng! is "+stringOps.findIndexOf("ng!"));
            System.out.println("The first index of 'st'" +stringOps.findIndexOf("st"));
            System.out.println("The last index of 'st'" +stringOps.findLastIndexOf("st"));
        }

        // Let's divide the string based on spaces!
        String[] strings = stringOps.splitStrings(" ");
        System.out.println("Divided string: ");
        for(String stx: strings) {
            System.out.println(stx);
        }

        // Find a part of the string between two strings
        System.out.println("Substring between 3rd and 6th indices: "+stringOps.findSubstringWithEndIndex(3, 6));

        //Find a part of the string from the given index to the end
        System.out.println("Substring from the 4th: "+stringOps.findSubstring(4));

        // Divide the characters individually from the string
        char[] characters = stringOps.convertStringToCharArr();
        for(char c: characters) {
            System.out.print("'"+ c + "' ");
        }
    }
}