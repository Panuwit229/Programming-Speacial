import java.util.*;
class BMI 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
      System.out.print("Weight (kg.) = ");
      double weight = sc.nextDouble();
      System.out.print("Height (cm.) = ");
      double height = sc.nextDouble();
      double hm = height / 100.0;
      double bmi = weight / (hm * hm);
      System.out.println("BMI = " + bmi);
	}
}

