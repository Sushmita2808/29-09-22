package com.test5.bll;

import java.util.Comparator;



public class AgeComparator implements Comparator<Students> { 
	@Override
	public int compare(Students  student1 , Students  student2) {
		
		if(student1.getAge() == student2.getAge()) {
			return 0;
		}
		else if(student1.getAge() > student2.getAge()) {
			return 1;
		}
		else 
			return -1;
	}

	}
	