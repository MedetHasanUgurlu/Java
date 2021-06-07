import java.util.Arrays;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {3,512,212,1,2,};
		Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		
		
		
		int [] v = new int[5];
		
		//System.out.println(ortalamaBulma(a));

		
	
		// Değer artırma
		/*for (int i = 0; i < v.length; i++) {
			
			System.out.println(v[i] = 4*i+4);
			
			
		}*/
		//**********************************************************************************
		//Deger alma
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array boyunu giriniz.");
		
		int input = scanner.nextInt();
		int[] b = new int[input];calcu
 		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println("Array degerlerini giriniz");
			b[i] = scanner.nextInt();
			
		}
		

		
		
		for (int i : b) {
			
			System.out.println("ArrayDegerleri "+i);
			
		}*/
		
		//boolean f =Arrays.equals(a,v);
		//System.out.println(f);
		
		int [][] poliarray = {{10,20,30},{40,50,60},{70,80,90}};
		
		}
		
		
		
	
		
		
		
	
	
	
	public static double ortalamaBulma(double[] array) {
		
		double toplam = 0;
		double ortalama;
		for (int i = 0; i < array.length; i++) {
			toplam +=array[i]; 
			
		}
		
		ortalama = toplam/(double)array.length;
		
		return  ortalama;
		
		
		
	}
	
	

}
