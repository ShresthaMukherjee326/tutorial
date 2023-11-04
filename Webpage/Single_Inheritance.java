import java.io.*;
class A
{
	void f1()
	{
		System.out.print("\nClass A Function 1");
	}
}
class B extends A
{
	void f2()
	{
		System.out.print("\nClass B Function 2");
	}
}
class Single_Inheritance
{
	public static void main(String args[])
	{
		B obj= new B();
		obj.f1();
		obj.f2();
	}
}

