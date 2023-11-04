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
class C extends B
{
	void f3()
	{
		System.out.print("\nClass C Function 3");
	}
}
class Multilevel_Inheritance
{
	public static void main(String args[])
	{
		C obj= new C();
		obj.f1();
		obj.f2();
		obj.f3();
	}
}

