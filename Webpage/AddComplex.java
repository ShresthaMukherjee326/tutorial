import java.io.*;
class Complex
{
	int real,img;
	Complex()
	{
		real=0;
		img=0;
	}
	Complex(int x)
	{
		real=x;
		img=x;
	}
	Complex(int p,int q)
	{
		real=p;
		img=q;
	}
	Complex(Complex obj)
	{
		real=obj.real;
		img=obj.img;
	}
	Complex sum(Complex A,Complex B)
	{
		Complex C=new Complex();
		C.real=A.real+B.real;
		C.img=A.img+B.img;
		return(C);
	}
	void output()
	{
		if(img>0)
			System.out.print(real+"+"+img+"i");
		else
			System.out.print(real+"(+)"+img+"i");
	}
}
class AddComplex
{
	public static void main(String args[])throws IOException
	{
		Complex C1=new Complex();
		DataInputStream dis=new DataInputStream(System.in);
		int a,b,c;
		System.out.print("\nEnter 3 no: ");
		a=Integer.parseInt(dis.readLine());
		b=Integer.parseInt(dis.readLine());
		c=Integer.parseInt(dis.readLine());
		Complex C2=new Complex(a);
		Complex C3=new Complex(b,c);
		Complex C4=new Complex(C3);
		System.out.print("\n1st Complex No: ");
		C2.output();
		System.out.print("\n2nd Complex No: ");
		C4.output();
		Complex C5=new Complex();
		C1=C5.sum(C2,C4);
		System.out.print("\nSum= ");
		C1.output();
	}
}