import java.util.*;
public class Circumference {
    public static double circum(float r){
        double circumference=4*Math.PI*r;
        return circumference;
        }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    float r=sc.nextFloat();
	    System.out.println("Circumference Of circle : "+circum(r));
       }
}
return
