package exponent;
public class exponent
{
    public double exponentXN(double x,double n)
    {
        return n*Math.pow(x,n-1);
    }
    public double exponentAN(double a ,double n)
    {
        return Math.pow(a,n)*Math.log(a)/Math.log(Math.E);
    }
}