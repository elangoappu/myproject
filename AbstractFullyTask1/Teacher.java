package AbstractFullyTask1;

public class Teacher implements Student{

	@Override
	public void name() {
		
		System.out.println("Appu");
	}

	@Override
	public void dept() {
		
		System.out.println("Developer");
	}

	public static void main(String[] args) {
		
		Teacher te = new Teacher();
		
		te.name();
		te.dept();
	}
}
