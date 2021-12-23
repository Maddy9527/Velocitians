package Programs;

public class Factorial_of_Number {

	public static void main(String[] args) {
//		3!
//		3*2*1=
		int num=3;
		int fact=1;
		for (int i=num;i>=1;i--)//9,8
		{
			fact=fact*i; //9*1=9*8=72
		}
		
		System.out.println("factorial of number is "+fact);
		
		

	}

}
