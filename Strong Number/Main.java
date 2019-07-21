import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int x=1;
      int r=0;
      int k=n;
      while(n>0)
      {
        r=n%10;
        for(int i=1;i<=r;i++)
        {
         x=x*i; 
      }
      sum=sum+x;
      x=1;
      n=n/10;
      }
      if(sum==k)
      {
        System.out.println("Yes");
      }
      else 
      {
        System.out.println("No");
      }
      
      
	}
}