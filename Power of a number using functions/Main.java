import java.util.Scanner;
class Main
{
  public static int powr(int base,int expo)
  {
    int sum=1;
    while(expo>0)
    {
      sum=sum*base;
      expo--;
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int expo=sc.nextInt();
    int r=powr(base,expo);
    System.out.print(r);
  }
}
  
  