import java.util.*;
class Circlearea
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  double r;
  double a;
  System.out.println("radius");
  r=sc.nextDouble();
  a=(4.0/3.0)*(22.0/7.0)*r*r*r;
  System.out.println("AREA OF CIRCLE IS "+a);
  }
}
