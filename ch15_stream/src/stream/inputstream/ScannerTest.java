package stream.inputstream;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸�: ");
		String name=sc.nextLine();
		System.out.println("����: ");
		String job=sc.nextLine();
		System.out.println("���: ");
		int num=sc.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}
}
