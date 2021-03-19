
public class Student {//// default ----parent Object
	private int id;
	private String name;
	private String email;
	private float math,science,history;
	
	//default constructor
	public Student() {
		id=0;
		name=null;
		email=null;
		math=0.0f;
		science=0.0f;
		history=0.0f;
	}
	
	///parametrised constructor
	 /// 6 parameters   -----> 1 implicit -->this    5 parameters explicitly
	public Student(int id,String nm,String em,float m1,float m2,float m3) {
		this.id=id;
		this.name=nm;
		this.email=em;
		math=m1;
		science=m2;
		history=m3;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	///getter methods
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public float getMath() {
		return this.math;
	}
	public float getScience() {
		return this.science;
	}
	public float getHistory() {
		return this.history;
	}
	//setter method
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String nm) {
		this.name=nm;
	}
	public void setMath(float m1) {
		this.math=m1;
	}
	public void setScience(float m2) {
		this.science=m2;
	}
	public void setHistory(float m3) {
		this.history=m3;
	}
	////1 parameter----- 1 parameter this----> implicit
	/*public void display() {
		System.out.println("Student Id :"+this.id);
		System.out.println("Student name : "+this.name);
		System.out.println("MAth : "+math);
		System.out.println("Science : "+science);
		System.out.println("History : "+history);
	}*/
	public float calculateGpa()
	{
		return ((0.03f*math)+(0.5f*science)+(0.25f*history));
	}
	public String toString() {
		System.out.println("Student tostring ");
		return "Stduent id : "+id+"\nStudent Name : "+name+"\n Email :"+email+"\nMath :"+math+"\nScience :"+science+"\nHistory : "+history;
	}

}
