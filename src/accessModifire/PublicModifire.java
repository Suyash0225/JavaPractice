package accessModifire;

public class PublicModifire {
    int a = 345;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultModifier defaultModifire = new DefaultModifier();
		System.out.println("Public Modifire of a :" + defaultModifire.a);// We can acess default modifire out side of class and same package
		
		
		PrivateModifire privatemodifire = new PrivateModifire();
		//We can not access private variable out side of class
		//privatemodifire.a;
	}

}
