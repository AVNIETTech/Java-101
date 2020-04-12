package org.avniet.stringops;

public class StringOperations {
    private final String testString;

    public StringOperations(String testString) {
        this.testString = testString;
    }

    public int findLength() {
        return testString.length();
    }

    public char findCharacter(int index) {
        return testString.charAt(index);
    }

    public boolean checkStringEquality(String compString) {
        return testString.equals(compString);
    }

    public boolean checkEqualityWithAnyCase(String compString) {
        return testString.equalsIgnoreCase(compString);
    }

    public boolean checkIfStringContains(CharSequence stringSequence) {
        return testString.contains(stringSequence);
    }

    public boolean checkIfStringStartsWith(String prefix) {
        return testString.startsWith(prefix);
    }

    public boolean checkIfStringEndsWith(String suffix) {
        return testString.endsWith(suffix);
    }

    public char[] convertStringToCharArr() {
        return testString.toCharArray();
    }

    public String[] splitStrings(String delimiter) {
        return testString.split(delimiter);
    }

    public String convertToLowerCase() {
        return testString.toLowerCase();
    }

    public String convertToUpperCase() {
        return testString.toUpperCase();
    }

    public String removeSurroundingWhiteSpace() {
        return testString.trim();
    }

    public String findSubstring(int startIndex) {
        return testString.substring(startIndex);
    }

    public String findSubstringWithEndIndex(int startIndex, int endIndex) {
        return testString.substring(startIndex, endIndex);
    }

    public int findIndexOf(String str) {
        return testString.indexOf(str);
    }

    public int findIndexOfFromIndex(String str, int startIdx) {
        return testString.indexOf(str, startIdx);
    }

    public int findLastIndexOf(String str) {
        return testString.lastIndexOf(str);
    }

    public int findLastIndexOfFromIndex(String str, int startIdx) {
        return testString.lastIndexOf(str, startIdx);
    }

    public boolean checkStringIfEmpty() {
        return testString.isEmpty();
    }

}