import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sa=new Scanner(System.in);
      int n1=sa.nextInt();
      int n2=n1/100;
      int n3=n1%10;
      int n4=n2+n3;
      System.out.println(n4);
	}
}