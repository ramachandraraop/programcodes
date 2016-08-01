package com.ts.BasicCoreJava;

import java.util.ArrayList;

public class ListPrimes {
	public static void main(String args[]) {
		int Start = 1;
		int End = 100;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = listPrime(Start,End);
		for(int num : list){
			if(num!=0)
			System.out.print(num+" ");
		}
	}

	private static ArrayList<Integer> listPrime(int start, int end) {
	
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int num = start; num <= end; ++num){
			al.add(isPrime(num));
			}
		return al;
	}

	public static int isPrime(int n) {
		int i = 1;
		int num = 0;
		int count = 0;
		while (n >= i) {
			if (n % i++ == 0)
				count++;
		}
		if (count == 2)
			num = n;
		
		return num;
	}
}
