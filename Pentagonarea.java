import java.util.*;
class Pentagonarea
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  double s,a,area;
  System.out.println("Side");
  s=sc.nextDouble();
  System.out.println("Height");
  a=sc.nextDouble();
  area=(5.0/2.0)*s*a;
  System.out.println("AREA OF PENTAGON IS "+area);
  }
}
