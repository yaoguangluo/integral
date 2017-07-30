package anti;
public class anti
{
  public double arcsinx(double x)
  {
      return 1/Math.sqrt(1-Math.pow(x,2));
  }
  public double arccos(double x)
  {
      return -1/Math.sqrt(1-Math.pow(x,2));
  }
  public double arctan(double x)
  {
      return 1/1+Math.pow(x,2);

  }
  public double arccot(double x)
  {
      return -1/1+Math.pow(x,2);
  }
  public double arcsec(double x)
  {
      return 1/Math.abs(x)*Math.sqrt(x*x-1);
  }
  public double arccsc(double x)
  {
      return -1/Math.abs(x)*Math.sqrt(x*x-1);
  }
}