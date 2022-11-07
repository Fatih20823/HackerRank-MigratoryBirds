package com.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		int temp=0;
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,3,2,4));
		int [] dizi= new int[arr.size()];
		 	// 0 1 2 3 4 5
			// 0 2 2 1 1 0
			for (int i = 0; i < arr.size(); i++) {				
				dizi[arr.get(i)]++;
			}
			int enCokGocEdenKusTipi=dizi[1];
			int result = 1;	
			for (int j = 2; j <dizi.length; j++) {
				if(dizi[j]>enCokGocEdenKusTipi) {
					enCokGocEdenKusTipi=dizi[j];
					result=j;
				}
			}
			System.out.println("EnCokGocEdenKusTipi : "+result);
	}

}
