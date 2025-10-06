package basic;

import java.util.Scanner;

public class TestAppp11 
{
	public static void main(String[] args) 
	{
		int no,temp,revNo=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		no = sc.nextInt();
		
		for(;no > 0;) 
		{
			temp = no % 10;
			
			revNo = (revNo * 10) + temp;
			
			no = no / 10;
		}
		System.out.println("RevNo : " +revNo);
	}
}
