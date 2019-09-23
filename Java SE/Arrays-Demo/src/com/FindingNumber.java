package com;

import java.util.Arrays;

public class FindingNumber {

	public static void main(String[] args) {

		int[] nums = { 43, 54, 23, 98, 342,23,87 };
		
		int key = 23;
		
		int index = -1;
		boolean found=false;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==key) {
				found=true;
				index=i;
			//	break;
			}
		}
		
		if(found) {
			System.out.println(key+" element found at "+index+" location");
		}else {
			System.out.println(key+" not found");
		}

	}

}
