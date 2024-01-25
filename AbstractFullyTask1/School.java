package AbstractFullyTask1;

public class School implements Student {

	@Override
	public void name() {
		
		System.out.println("Elango");
	}

	@Override
	public void dept() {
		
		System.out.println("Computer Application");
	}
	
	void add() {
		
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
	
	void sub() {
		
		int p=15;
		int k=6;
		int e=p-k;
		System.out.println(e);
	}

	public static void main(String[] args) {
		
		School sc = new School();
		
		sc.name();
		sc.dept();
		sc.add();
		sc.sub();
	}
}
