package ParAbstractTask;

public class Student extends Teacher{

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("Java Developer");
	}

	@Override
	void priya() {
		// TODO Auto-generated method stub
		System.out.println("Web Developer");
	}
	
	public static void main(String[] args) {
		
		Student ela = new Student();
		
		ela.add();
		ela.elango();
		ela.priya();
		ela.sub();
	}

}
