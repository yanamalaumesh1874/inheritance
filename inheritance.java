class ford
{
public void model()
{
System.out.println("MUSTANG");
}
}
class ecosport extends ford
{
public void model()
{
System.out.println("FROM FORD");
}
}
class ecosportltz extends ecosport 
{
public void model() 
{
	System.out.println("top end variant");
}
}
class inherit
{
public static void main(String[] args) 
{
		ford cars=new ford();
		cars.model();
		ecosport carz=new ecosport();
		carz.model();
		ecosportltz car=new ecosportltz();
		car.model();
	}
}
