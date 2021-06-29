package com.company;

public class Main {

    public static void main(String[] args) {
	// TASK 1. Write a program that takes a string and prints the number of vowels in that string. e.g Apples - "There are two vowels in the string, Apples"

        String name = "Fish & Chips";
     int counter = 0;

     // Analyse letters in "name"
     for (int i = 0; i < name.length(); i++) {
         char x = name.charAt(i);
         if (x == 'A' || x == 'a' || x == 'O' || x == 'o' || x == 'U' || x == 'u' || x == 'E' || x == 'e'|| x == 'I' || x == 'i') {
         counter++;
         }

     }
        System.out.println("There are "+ counter + " vowels in a word: " + name);
    }
}
