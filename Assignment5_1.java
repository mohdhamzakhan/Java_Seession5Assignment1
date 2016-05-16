package myApps;

public class Assignment5_1 extends area {
	public static void main(String args[])
	{
		Assignment5_1 ass=new Assignment5_1();
		ass.rarea(10, 20);
		ass.tarea(10, 20);
	}
}

class area{
	double _area;
	
	public void rarea(double length, double breath)
	{
		_area=length*breath;
		System.out.println("the area of rectangle is "+_area);
	}
	public void tarea(double length, double breath)
	{
		_area=(0.5)*length*breath;
		System.out.println("the area of triangle is "+_area);
	}
}
