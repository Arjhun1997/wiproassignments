package DayTwo.java;

import java.util.Scanner;

class Video{
	String title;
	boolean flag;
	float rating;
	public Video(String title) {
		this.title=title;
		this.flag=true;
	}
	boolean beingCheckedout() {
		return flag;
	}
	void beingReturned() {
		flag=true;
	}
	void receivingRating(int rating) {
		this.rating=(this.rating+rating)/2;
	}
}
class VideoStore{
	int i;
	Video objVideo[]=new Video[10];
 void addVideo(String title) {
	 objVideo[i++]=new Video(title);
	}
void checkOut(String title) {
		for(int j=0;j<i;j++) {
			if(objVideo[j].title.toString().equals(title)) {
				if(objVideo[j].flag) {
					System.out.println("This video "+title+" is available");
					objVideo[j].flag=false;
					break;
				}
				else
					System.out.println("This video "+title+" not available");
			}
		}
	}
	void returnVideo(String r) {
		int rating=0;
		for(int k=0;k<i;k++) {
			if(objVideo[k].title.equals(r)) {
				System.out.println("Enter the rating for the video");
			       rating=new Scanner(System.in).nextInt();
			       //objVideo[k].flag=true;
			       objVideo[k].beingReturned();
			       receiveRating(r,rating);
	     }
	  }
	}
	void receiveRating(String r,int a) {
		  for(int j=0;j<i;j++) {
			  if(objVideo[j].title.equals(r)) {
				  objVideo[j].receivingRating(a);
				  break;
				  
			  }
		  }
	}
	void listInventory() {
		System.out.println("S.NO. \t\t Video Title \t\t\t Rating \t\t Availability");
		for(int k=0;k<i;k++) {
			System.out.println(k+1+"\t\t\t"+objVideo[k].title+"\t \t \t "+objVideo[k].rating+"  \t\t  \t   "+objVideo[k].flag);
		}
	}
	
}
public class VideoStoreLauncher {
  public static void main(String[] args) {
	  int choice=0;
	  VideoStore obj=new VideoStore();
	  do {
		  System.out.println("1.add new video");
		  System.out.println("2.List Invertory");
		  System.out.println("3.Return Video");
		  System.out.println("4.checkout movie");
		  choice=new Scanner(System.in).nextInt();
		  switch(choice) {
		  case 1:
			  System.out.println("enter the new video");
			  String title=new Scanner(System.in).nextLine();
			  obj.addVideo(title);
			  break;
		  case 2:
			  obj.listInventory();
			  break;
		  case 3:{
			  System.out.println("enter the movie to return");
			  String sc=new Scanner(System.in).nextLine();
			  obj.returnVideo(sc);
			  break;
		  }
	      case 4:{
	    	  System.out.println("Enter movie name");
	    	  String sc=new Scanner(System.in).nextLine();
	    	  obj.checkOut(sc);
	    	  break;
	      }
				  
		  }
		  
			  
	  }while(choice !=0);
  }
}
	  
