import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int min;
      if(n1<n2 && n1<n3) 
      {
       // System.out.println(n1);
         min=n1;
      }
      else if(n2<n1 && n2<n3)
      {
        //System.out.println(n2);
        min=n2;
      }
      else
      {
        //System.out.println(n3);
         min=n3;
      }
      if(n1%min==0 && n2%min==0 && n3%min==0)
      {
        System.out.println(min);
      }
      min--;
    }
	}
