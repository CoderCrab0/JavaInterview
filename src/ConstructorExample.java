class Student{
	String Name,Address;
	
	public Student()
	{
		System.out.println("I am No-Arg Constructor !!!");
	}
	
	public Student(String Name,String Address)
	{
		System.out.println("I am Parametrized Constructor!!!");
		this.Name = Name;
		this.Address = Address;
	}
	
	Student(Student st)
	{
		System.out.println("I am Copy Constructor!!!");
		this.Name = st.Name;
		this.Address = st.Address;
	}
}


public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		System.out.println(obj.Name);
		System.out.println(obj.Address);
		Student obj1 = new Student("Deepankar","india");
		System.out.println(obj1.Name);
		System.out.println(obj1.Address);
		Student obj2 = new Student(obj1);
		System.out.println(obj2.Name);
		System.out.println(obj2.Address);

	}

}

