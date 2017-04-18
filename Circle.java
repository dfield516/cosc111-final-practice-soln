
public class Circle extends Shape
{
	int r;
	
	public Circle(int r)
	{
		this.r = r;
	}
	
	@Override
	public String toString()
	{
		return "Circle (r=" + r + ")";
	}
}
