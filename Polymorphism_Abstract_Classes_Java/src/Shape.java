

public abstract class Shape {
	protected String color;
	protected Boolean filled;
	
	public Shape() {
		this.color = "red";
		this.filled = true;
	};
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString() {
		return "Shape[color="+color+", filled="+filled+"]";
	}
}

class Circle extends Shape{
	protected double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public String toString() {
		return "Circle[Shape[color="+color+", filled= "+filled+"]"+"radius= "+radius+"]";
	}
}

class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		return width*length;
	}
	@Override
	public double getPerimeter() {
		return 2*(width+length);
	}
	@Override
	public String toString() {
		return "Rectangle[Shape[color="+color+", filled="+filled+"], width= "+width+", length= "+length+"]";
	}
}

class Square extends Rectangle{
	public Square() {
		super();
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	public double getSide() {
		return width;
	}
	public void setSide(double side) {
		this.width = side;
	}
	@Override
	public void setWidth(double side) {
		this.width = side;
	}
	@Override
	public void setLength(double side) {
		this.length = side;
	}
	@Override
	public String toString() {
		return "Square[Rectangle[Shape[color="+color+",filled= "+filled+"],width= "+width+", length= "+length+"]]";
	}
}