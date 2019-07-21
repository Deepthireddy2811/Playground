import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=0;
      int r=n;
      int s=n;
      int i=0;
      int p=0;
      int x=1;
      int sum=0;
      while(n>0)
      {
        i++;
        n=n/10;
      }
      p=i;
      while(r>0)
      {
        k=r%10;
        while(i>0)
        {
          x=k*x;
          i=i-1;
        }
        sum=sum+x;
        i=p;
         x=1;
        r=r/10;
      }
      if(sum==s)
      {
      System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
	}
}