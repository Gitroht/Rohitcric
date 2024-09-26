package day8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class ScannerDemo {

	public void addition() {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		num1= sc.nextInt();
		System.out.println("enter the second number: ");
		num2=sc.nextInt();
		
		sc.close();
		sum=num1 + num2;
		System.out.println("sum of these numbers: "+sum);
		

	}

}

public class InputDemo{
	public static void main(string[] args) throws IOException{
		
	}
}
