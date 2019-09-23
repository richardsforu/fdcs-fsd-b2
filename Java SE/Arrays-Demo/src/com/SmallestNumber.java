package com;

public class SmallestNumber {

	public static void main(String[] args) {

		int[] nums = { 43, 5454, 23, -98, 342,4,87 };
		int smallNumber = Integer.MAX_VALUE;

		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<=smallNumber) {
				smallNumber=nums[i];
				
			}
		}
		
		System.out.println("Smallest number: "+smallNumber);

	}

}
