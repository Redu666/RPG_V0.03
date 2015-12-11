package moje;
import java.util.Scanner;



public class pin {

		public static void manySec(long s) {
		try {
		Thread.currentThread().sleep(s * 10);
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		
	
	public static void putString(String tekst){
		System.out.print(tekst);
		
	}
	
	public static void putInt(int liczba){
		System.out.print(liczba);
		
	}
	
	public static void clearScr(){
		for(int i=0;i<10;i++){
			System.out.println("                           ");
			}
		
	    System.out.flush(); 
	}
	
	public static String text(){
		Scanner wejscie = new Scanner(System.in);
		return wejscie.nextLine();
	
	}
	
	public static int number(){
		Scanner wejscie = new Scanner(System.in);
		String tekst = wejscie.nextLine();
		int liczba = 0;
		
		try
		{
		liczba = Integer.parseInt(tekst);
		}
		catch(NumberFormatException e)
		{
		System.out.println("Tu nie ma liczby :[");
		}
		
		return liczba;
	}	
	
	
	
	
}
