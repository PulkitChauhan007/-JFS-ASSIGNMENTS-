class ArmstrongWhile
{
	public static void main(String[] arg)
	{
	int i=100,arm;
	while(i<1000)
	{
	arm=armstrongOrNot(i);
	if(arm==i)
	System.out.print(i+" ");
	i++;
	}
	}
static int armstrongOrNot(int num)
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
}