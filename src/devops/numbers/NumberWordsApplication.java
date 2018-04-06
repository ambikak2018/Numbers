package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public final class NumberWordsApplication {
	//@SuppressWarnings("unused")
	private NumberWords numberWords ;
	private static BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	 public void pw(int n,String ch)
	  {
	    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
	 
	    String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};
	 
	    if(n > 19) { System.out.print(ten[n/10]+" "+one[n%10]);} else { System.out.print(one[n]);}
	    if(n > 0)System.out.print(ch);
	    
	  }
	 public void execute() {
			while( true ) {
				try{
					int n=0;
					
					System.out.println( "Enter number (0 to exit): " ) ;
					String value = null;
					try {
						value = reader.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					n = Integer.parseInt( value );
					System.out.print( Integer.parseInt( value ) + " ==> ");
					if(n > 0)  {                 
				    	  NumberWordsApplication a = new NumberWordsApplication();
					      a.pw((n/1000000000)," Hundred");
					      a.pw((n/10000000)%100," crore");
					      a.pw(((n/100000)%100)," lakh");
					      a.pw(((n/1000)%100)," thousand");
					      a.pw(((n/100)%10)," hundred");
					      a.pw((n%100)," ");
					      System.out.println();
					}
					else{
						System.out.println("Thanks for running the program ");
						break;
					}
	   
				}catch ( NumberFormatException e ) {
					System.out.println( "Invalid number" ) ;
					continue;
				}
			}
	 }

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}

