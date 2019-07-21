import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int s=n-1;
      int l=1;
      for(int i=1;i<=n;i++)
        {for(int j=1;j<=s;j++){
          System.out.print(" ");
        }
         for(int j=1;j<=l;j++){
           System.out.print("*");
         }
         System.out.println();
         s--;
         l=l+2;}
          
        
	}
}