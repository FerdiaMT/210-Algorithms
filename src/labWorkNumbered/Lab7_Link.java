package labWorkNumbered;

public class Lab7_Link {

	public String name;
	public int age;
	public String degree;
	public int yearOfStudy;
	
	public Lab7_Link next; // next is auto set to null 
	
	public Lab7_Link(String name, int age, String degree, int yearOfStudy) {
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.yearOfStudy = yearOfStudy;
	}
	
	public void displayLink() {
		System.out.println(name+','+age+','+degree+','+yearOfStudy);

	}
}
