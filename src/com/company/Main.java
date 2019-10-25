package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	    Scanner k = new Scanner(System.in);
	    Random r = new Random();
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0; i < 10; i++){
	        list.add(1 + r.nextInt(50));
        }
        System.out.println("ArrayList: " + list);
        System.out.println("Value to find: ");
        int index = k.nextInt();
        int count = 0;
        for( int i : list){
            if(i == index){
                count++;
            }
        }
        if(count > 0){
            System.out.println(index + "was found " + count + " time(s).");;
        }
        else{
            System.out.println(index + " was not found.");
        }
    }
}
