import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1;
      int x=1;
      for(i=1;i<=n;i++)
      {
        x=x*i;
      }
      System.out.println(x);
	}
}