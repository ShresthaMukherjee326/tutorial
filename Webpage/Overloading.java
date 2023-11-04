import java.io.*;
class Shape
{
	int t,s,r;
	float c,f=3.14f;
	int parameter(int x)
	{
		s=4*x;
		return(s);
	}
	float parameter(float r)
	{
		c=2*f*r;
		return(c);
	}
	int parameter(int p,int a)
	{
		r=2*(p+a);
		return(r);
	}
	int parameter(int a,int b,int c)
	{
		t=a+b+c;
		return(t);
	}
}
class Overloading
{
	public static void main(String args[])throws IOException
	{
		int a,b,c,d,e,f,t,s,r;
		float g,cc;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("\nEnter no : ");
		a = Integer.parseInt(dis.readLine());
		b = Integer.parseInt(dis.readLine());
		c = Integer.parseInt(dis.readLine());
		d = Integer.parseInt(dis.readLine());
		e = Integer.parseInt(dis.readLine());
		f = Integer.parseInt(dis.readLine());
		g = Float.parseFloat(dis.readLine());
		Shape obj= new Shape();
		s=obj.parameter(a);
		System.out.print("\nPerimeter of Square: "+s);
		cc=obj.parameter(g);
		System.out.print("\nPerimeter of circle: "+cc);
		r=obj.parameter(b,c);
		System.out.print("\nPerimeter of Rectungular: "+r);
		t=obj.parameter(d,e,f);
		System.out.print("\nPerimeter of Triangle: "+t);
	}
}