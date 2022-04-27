public class Test
{
	public static class Complex
	{
		 int id;
		 String name;

		public Complex(int x,String s)
		{
			this.id=x;
			this.name=s;
		}

		// copy constructor 
		// @Override
		Complex(Complex c)
		{
			id=c.id;
			name=c.name;
		}

		@Override
		public String toString()
		{
			return "(" + id + " + " +name + "i)";
		}
	}

	public static void main(String[] args)
	{
		Complex obj1=new Complex(10,"guru");

        Complex obj2=new Complex(obj1);

		System.out.println(obj1.id);
		System.out.println(obj1.name);

         // assign in obj3 
		Complex obj3=obj2;

        // toString method called here 
		System.out.println(obj2);
	}
}