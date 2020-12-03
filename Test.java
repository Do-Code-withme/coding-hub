class Student
{
}
class Coustomer
{
}
class Test
{
	public static void main(String args[])throws Exception
	{
		Object o =Class.forName(args[0]).newInstance();
		System.out.println("Object created for:"+o.getClass().getName());
	}
}