package AbstractFullyTask1;

public class LazyPerson implements Person {

	@Override
	public void eat() {
		
		System.out.println("LazyPerson Foods : ");
		System.out.println();
	}

	@Override
	public void exercise() {
		
		System.out.println("LazyPerson Exercise : ");
		System.out.println();
	}

}
