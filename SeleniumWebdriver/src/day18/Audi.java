package day18;

public class Audi extends Car{

	String model;
	public void accelerate()
	{
		System.out.println("Car acceleration");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="audi";
		a.accelerate();
		a.price=1111;
		a.start();

	}

}
