import java.lang.*;
import java.ytil.*;
class one
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner sc.nextInt(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int s=0;
      int x=sc.nextInt();
      int y=sc.nextInt();
      for(int j=x;j<=y;j++)
        s^=a[j];
      System.out.print(s+" ");
    }
    
  }
}
