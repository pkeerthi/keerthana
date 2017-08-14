import java.lang.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;
class Prefix {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i)-48;
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		scan.close();
	}

}
