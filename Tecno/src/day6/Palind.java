package day6;

public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123;
		 int temp=no;
		 int rev=0,rem;
		 while(temp!=0)
		 {
			 rem=temp%10;
			 rev=(rev*10)+rem;
			 temp=temp/10;
			 
		 }
		 if(temp==rev)
		 {
			 System.out.println("palindrome");
			 
		 }
		 else
		 {
			 System.out.println(" Not palindrome");	 
		 }

	}

}
