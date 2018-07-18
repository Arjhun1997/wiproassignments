package MiniProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Dictionary {
	static Scanner sc=new Scanner(System.in);
	ArrayList<String> l=new ArrayList<String>(); 
	public void insert() {
		System.out.println("Enter your item to be inserted");
		try {
		l.add(sc.next());
		System.out.println("Inserted successfully");
		}catch(Exception e) {
		  System.out.println(e.getMessage());	
		}
	}
	public void search() {
		System.out.println("Enter the Item to Search");
		String s=sc.next();
		if(l.contains(s)) {
			System.out.println("Item Found in the List");
		}
		else {
			System.out.println("Item not found in the List");
		}
	}
	public void delete() {
		System.out.println("Enter the item to delete");
		String s=sc.next();
		if(l.contains(s)) {
			l.remove(s);
			System.out.println("Item deleted");
		}
		else {
			System.out.println("Item not found");
		}
	}
	public void display() {
		System.out.println("Items in the List are");
		for(int i=0;i<l.size();i++)
		System.out.println(l.get(i));
	}
	public void replace() {
		System.out.println("There are "+l.size()+" in the list");
		System.out.println("Enter the index form (0 "+(l.size()-1)+") that you want to replace");
		int s=sc.nextInt();
		if(s<l.size()) {
			System.out.println("Element at the index "+s+"is "+l.get(s));
			System.out.println("What do you what to replace it with?");
			String s1=sc.next();
			l.set(s, s1);
			System.out.println("Item replaced successfully");
		}
		else {
			System.out.println("Index not Found");
		}
	}
	public void sort(){
		l.sort(new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
			
		});
	}
	public void shuffle() {
		Collections.shuffle(l);
		System.out.println("Shuffled list");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	public void reverse() {
		Collections.reverse(l);
	}
	public void exit() {
		System.exit(0);
	}
public static void main(String[] args) {
    String s="";
	Dictionary d=new Dictionary();
	do {
		System.out.println("MAIN MENU");
		System.out.println("-----------");
		System.out.println("1.INSERT");
		System.out.println("2.SEARCH");
		System.out.println("3.DELETE");
		System.out.println("4.DISPLAY");
		System.out.println("5.REPLACE");
		System.out.println("6.SORT");
		System.out.println("7.SHUFFLE");
		System.out.println("8.REVERSE");
		System.out.println("9.EXIT");
		System.out.println("Enter your choice");
	    s=sc.next();
		switch(s) {
		case "1":
			d.insert();
			break;
		case "2":
			d.search();
			break;
		case "3":
			d.delete();
			break;
		case "4":
			d.display();
			break;
		case "5":
			d.replace();
			break;
		case "6":
			d.sort();
			break;
		case "7":
			d.shuffle();
			break;
		case "8":
			d.reverse();
			break;
		case "9":
			d.exit();
			break;
		default :
			System.out.println("Invalid Input");
			break;
		}
	}while(s!="q");
}
}
