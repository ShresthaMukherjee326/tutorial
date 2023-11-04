import java.io.*;
class A
{
	void f()
	{
		System.out.print("\nClass A Function");
	}
}
class B extends A
{
	void f()
	{
		System.out.print("\nClass B Function");
	}
}
class Overriding1
{
	public static void main(String args[])
	{
		B obj= new B();
		obj.f();
	}
}

