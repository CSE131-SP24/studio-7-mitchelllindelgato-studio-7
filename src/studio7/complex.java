package studio7;

public class complex {
double real;
double imagine;

complex (double r, double i)
{
	real = r;
	imagine = i;
}
public String getcomplex()
{
	return this.real + "+" + this.imagine + "i";
}
public String add(complex x)
{
real = this.real +x.real;
imagine = this.imagine + x.imagine;
return getcomplex();
}
public String multiply(complex x)
{
real = (this.real*x.real-this.imagine*x.imagine);
imagine = (this.real*x.imagine+this.imagine*x.real);
return getcomplex();

}
}