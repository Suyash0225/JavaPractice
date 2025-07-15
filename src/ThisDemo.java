
public class ThisDemo {
	
	int a=10;
	
	public void get() {
		int a=20;
		System.out.println("This is a value of a indide method: "+ a+ "\nThis is value of a class valiable "+ this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisDemo td = new ThisDemo();
        td.get();
	}

}
