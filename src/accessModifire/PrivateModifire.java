package accessModifire;

public class PrivateModifire {
   private int a = 45643;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicModifire publicModifire = new PublicModifire();
		
		publicModifire.a = 1234; // Accessing public variable from PublicModifire class

	}

}
