package com.searchalgorithm;

public class Search {
	
	private static void linearSearch(int[] list, int search) {
			int i=0;
			for(i=0; i < list.length;i++) {
					if(list[i] == search) {
						System.out.println(search +" is found that the location " +(i+1)+"\n");
						break;
					}
				}
				if (i == list.length) {
					System.out.println(search +" not found.\n");
				}
			}
	
	private static void binarySearch(int[] list, int search) {
		int first = 0;
		int last = list.length;
		int middle = (first + last)/2;
		
		
		while(first <= last ) {
			if(list[middle] < search) {
				first = middle + 1;
			}else if(list[middle] == search){
				System.out.println(search +" is found that the location " + (middle+1) + "\n");
				break;
			}else {
				last = middle-1;
			}
			middle = (first + last)/2;
		}
		
		if (first > last) {
			System.out.println(search + " is not found.\n");
		}
	}
			
	public static void main(String[] args) {
		int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
		//int search = 3;
		
		linearSearch(list, 51);//linear search on the number 55
		
		binarySearch(list, 43);//binary search on the number 45
	}
}



