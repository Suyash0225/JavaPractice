package accessModifire;

public class ProtectedModifire {
	
	protected int a = 678;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedModifire protectedModifire = new ProtectedModifire();
		protectedModifire.a= 567;
		System.out.println("Variable of ProtectedClass : "+ protectedModifire.a);
		// We can access protected variable or method only within class or subclass4
		                                                                           
	}

}
