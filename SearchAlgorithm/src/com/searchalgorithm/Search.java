package com.searchalgorithm;

public class Search {
	
	private static void linearSearch(int[] list, int search) {
			int i=0;
			for(i=0; i < list.length;i++) {
					if(list[i] == search) {
						System.out.println(search +" is found that the location " +(i+1));
						break;
					}
				}
				if (i == list.length) {
					System.out.println(search +" not found.");
				}
			}
			
	public static void main(String[] args) {
		int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
		//int search = 3;
		
		linearSearch(list, 55);
	}
}



