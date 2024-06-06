package task2;


class person123{
	 int a=20;
	 String name="manu";
	 
	 
	 public person123() {
	}

	public void add()
	 {
		 System.out.println("test add passed");
	 }
}

class Employee extends person123{
	 double sal=20000;
	 int empid=21;
	 
	 public Employee() {
		super();
	}
	public void addon()
	 {
		 System.out.println("test addon is excuted");
		 System.out.println(super.a);
		 super.add();
	 }
}

public class superkeywod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee data=new Employee();
		System.out.println(data.a);
		System.out.println(data.name);
		System.out.println(data.sal);
		System.out.println(data.empid);
		data.add();
	}

}
