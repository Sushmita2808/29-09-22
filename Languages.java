package com.test5.bll;
import java.util.Iterator;
import java.util.LinkedList;
//1.	Create a list of elements as shown below into the LinkedList and name it as languages.
public class Languages {
	public static void main(String[] args) {
		LinkedList<String> languages =new LinkedList<String>();  
		
		languages.add("C");  
		languages.add("C++");  
		languages.add("Java");  
		languages.add("Kotlin ");  
		languages.add("Python "); 
		languages.add("Perl "); 
		languages.add("Ruby"); 
		
		//display the  list of languages 
		 Iterator<String> itr=languages.iterator(); 
		  System.out.println("*********Languages**************");
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  //remove index5
		  System.out.println(" ");
		  languages.remove(5) ;
		  Iterator<String> itr1=languages.iterator(); 
		  System.out.println("*********Languages**************");
		  while(itr1.hasNext()){  
			  System.out.println(itr1.next()); 
		  }
		  //remove kotlin
		  System.out.println(" ");
		  languages.remove("Kotlin ") ;
		  Iterator<String> itr2=languages.iterator(); 
		  System.out.println("*********Languages**************");
		  while(itr2.hasNext()){  
			  System.out.println(itr2.next());  
		  }
		  //new list is created
		  LinkedList<String> Scriptinglanguages =new LinkedList<String>();  
		  
		  Scriptinglanguages.add("Python "); 	
		  Scriptinglanguages.add("Ruby"); 	
		  Scriptinglanguages.add("Perl "); 	
		  
		 
		  Iterator<String> itr3=Scriptinglanguages.iterator(); 
		   //display all
		  
		  System.out.println("*********ScriptingLanguages**************");
		  while(itr3.hasNext()){  
			  System.out.println(itr3.next());  
		  }
		  //list of Scripting languages  all remove 
		 
		  System.out.println(" ");
		   Scriptinglanguages.removeAll(Scriptinglanguages) ;
		  Iterator<String> itr4=Scriptinglanguages.iterator(); 
		  System.out.println("*********ScriptingLanguages**************");
		  while(itr4.hasNext()){  
			  System.out.println(itr4.next());  
			  
		  }
		  //list of languages  all remove 
		
		  System.out.println(" ");
		  languages.clear(); ;
		  Iterator<String> itr5=languages.iterator(); 
		  System.out.println("*********Languages**************");
		  while(itr5.hasNext()){  
			  System.out.println(itr5.next());  
		  }
	}
}






