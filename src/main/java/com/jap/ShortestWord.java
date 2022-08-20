package com.jap;

public class ShortestWord {
    public static void main(String[] args) {

        //Declare and initialize a String array.
        String[] words = {"Java", "Programming", "Language"};
        // Create an object of the class ShortestWord
        ShortestWord shortestWord = new ShortestWord();
        //Call the method findShortestWord() and pass the array.
        String result = shortestWord.findShortestWord(words);
        System.out.println("ShortestWord = " + result);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
        String smallestWord = words[0];
        for (int index = 1; index < words.length; index++) {
            if (words[index].length() < smallestWord.length()) {
                smallestWord = words[index];
            }
        }
        return smallestWord;
    }
}