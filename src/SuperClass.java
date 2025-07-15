
public class SuperClass extends cunstructorDemo {
	
	String name= "Suyash";

	public void printString() {
		System.out.println(name);}
	
	public SuperClass() {
		super(45); 
	}
	
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		System.out.println(sc.b);
		sc.printString();

		
	}

}
