import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    //int n1=in.nextInt();
    //int r=in.nextInt();
    while(n>99)
    {
     n = n/10;
    }
    int r = n % 10;
    System.out.println(r);
  }
}
