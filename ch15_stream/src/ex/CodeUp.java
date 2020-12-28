package ex;

import java.util.Scanner;

public class CodeUp {

		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("input: ");
		    int n=sc.nextInt();
		    int sum=0;
			int i;
			for (i = 0;i<n; i++) {
				sum+=i;
				if(sum>=n) {
					break;
				
				}
			}
			System.out.println(i);
		
		
		}
		

	}


