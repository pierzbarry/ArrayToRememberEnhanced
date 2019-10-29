package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> history = new ArrayList<>();
	Scanner keyboard = new Scanner(System.in);
	boolean repeat = true;

	do{
        System.out.println("Enter president: ");
        String word = keyboard.next();

        if(word.equalsIgnoreCase("history")){
            repeat = false;
        }
        else{
            history.add(0, word);
        }
    } while(repeat);
        for (String value : history) {
            System.out.println(value);
    }


    }
}
