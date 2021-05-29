package com.interview;
import java.io.*;
import java.util.*;
class Test{
	
	public static void main(String args[]) {
		System.out.println("Hello");

		    	//Write code here
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        
		       // String s[]=new String[n];
		        for(int i=0;i<n;i++){
		            String s=sc.next();
		            int arr[]=new int [26];
		            for(int j=0;j<s.length();j++){
		                arr[s.charAt(j)-'a']++;
		            }
		            int max=-1;
		            int index=0;
		            System.out.println(Arrays.toString(arr));
		            for(int k=0;k<26;k++){
		                if(max<arr[k]){
		                    max=arr[k];
		                    index=k;
		                }
//		                else if(max==arr[k]){
//
//		                }
		            }
		            char c=(char) (index+'a');
		            System.out.println(c);
		            System.out.println();

		        }
		        
		        
		   }
		

	}
