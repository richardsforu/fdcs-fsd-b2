package com;

public class BigNumber {

	public static void main(String[] args) {

		int[] nums = { 43, 5454, 23, 98, 342,23,87 };
		int bigNumber = 0;
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=bigNumber) {
				bigNumber=nums[i];
				
			}
		}
		
		System.out.println("Biggest number: "+bigNumber);

	}

}
