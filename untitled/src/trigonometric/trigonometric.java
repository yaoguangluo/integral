package trigonometric;
public class trigonometric
{
     public double sin(double x)
     {
         return Math.cos(x);
     }
     public double cos(double x)
     {
         return 0 - Math.sin(x);
     }
     public double tan(double x)
     {
         return 1/Math.pow(Math.sin(x),2);
     }
     public double cot(double x)
     {
         return -1/Math.pow(Math.sin(x),2);
     }
     public double sec (double x)
     {
         return 1/Math.sin(x)*Math.tan(x);
     }
     public double csc(double x)
     {
         return (-1)/Math.cos(x)*(Math.cos(x)/Math.sin(x));
     }
}