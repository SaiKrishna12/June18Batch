package day7;

public class Course {
	int fee;
	String subject;
	public void courseDetails(int fee,String subject)
	{
		this.fee=fee;
		this.subject=subject;
	}
	public static void main(String[] args) {
		Course c=new Course();
		c.courseDetails(1111,"Selenium");
		System.out.println(c.fee+"---"+c.subject);

	}
}
