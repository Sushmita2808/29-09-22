package com.test5.bll;

import java.util.ArrayList;
/*
 * Write a method minToFront that takes an ArrayList of integers 
 * as a parameter and that moves the minimum value in the list to the front, 
 * otherwise preserving the order of the elements. 
 */

public class MinToFront {
	 public static void main(String[] args) {
		 
		    ArrayList<Integer> sortedList = new ArrayList<Integer>();
		    //create arraylist for sorting list
		    ArrayList<Integer> orignalList = new ArrayList<Integer>();
		    //create arraylist for original list 
		  
		    orignalList.add(3);
		    orignalList.add(8);
		    orignalList.add(92);
		    orignalList.add(4);
		    orignalList.add(2);
		    orignalList.add(17);
		    orignalList.add(9);
		 
		    System.out.println("orignal List :"+orignalList);//original list  is display 
		    
		    while(orignalList.size() > 0){
		    		orignalList = minToFront(orignalList);//minToFront() will call first 
		    		sortedList.add(orignalList.get(0));
		    		orignalList.remove(0);
		    	}
		   
		    ;
	 
		    System.out.println("Sorted List :"+sortedList);//Sorted list  is display 
	 }
	 
	 
	 public static ArrayList<Integer> minToFront(ArrayList<Integer> list) {
		    
		   int min = list.get(0);
		    int minIndex = 0;
		    for (int i = 0; i < list.size(); i++) {

		        if (list.get(i) < min) {
		            minIndex = i;
		            min = list.get(i);
		        }

		    }
		    int temp = list.get(0);
		    list.set(0, min);
		    list.set(minIndex,temp);

		    return list;
		  }
		}
