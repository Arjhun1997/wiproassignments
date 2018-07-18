package MiniProjects;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Card {
   String symbol="";
   int number=0;
   Card(String symbol,int number){
	   this.symbol=symbol;
	   this.number=number;
   }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   Set<Card> s=new TreeSet<Card>(new Comparator<Card>() {
		@Override
		public int compare(Card o1, Card o2) {
			return o1.symbol.compareTo(o2.symbol);
		}
	   });
	for(int i=0;i<8;i++) {
		System.out.println("Enter a Card");
		String s1=sc.next();
		int s2=sc.nextInt();
		s.add(new Card(s1, s2));
	}
	Iterator<Card> it=s.iterator();
	while(it.hasNext()) {
		Card e=it.next();
		System.out.println(e.symbol+" "+e.number);
	}
	sc.close();
}
}
