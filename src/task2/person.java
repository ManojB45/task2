package task2;


public class person {

	
	int age;
	String name;
	
	public person()
	{
		System.out.println("the age of the person is 18");
	}
	
	public person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
@Override
	public String toString() {
		return "person [age=" + age + ", name=" + name + "]";
	}

 public String display() {
	 return "person [age=" + age + ", name=" + name + "]";
 }
 

public static void main(String[] args) {
		// TODO Auto-generated method stub

	person data=new person();
	person data1=new person(20,"manoj");
	System.out.println(data1);
	
}
}
