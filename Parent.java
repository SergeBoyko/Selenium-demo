public class Parent {

	public static void main(String[] args) {
		System.out.println("Parent");

		Child child = new Child();
		child.SomeCode();

		AnotherChild anotherChild = new AnotherChild();
		String achild = anotherChild.SomeCode();
		System.out.println(achild);

		Student s = new Student();
		s.setName("Danielle");
		String name = s.getName();

		System.out.println("name : " + name);
	}

}
