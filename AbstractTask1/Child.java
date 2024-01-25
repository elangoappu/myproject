package AbstractTask1;

public class Child implements Parent,Parent1{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Elango");
	}

	@Override
	public void dept() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int e=8;
		int a=5;
		int p=e-a;
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		Child appu = new Child();
		
		appu.name();
		appu.dept();
		appu.add();
		appu.sub();
	}

}
