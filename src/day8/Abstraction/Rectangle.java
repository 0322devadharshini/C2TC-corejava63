package day8.Abstraction;
//sub clss
public class Rectangle extends Shape {
	private float width, height;

	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}
//rectangle
	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}
}
