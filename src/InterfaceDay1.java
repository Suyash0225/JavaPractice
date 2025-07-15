
public class InterfaceDay1 implements InterfaceIndiaTraffic{
	
	
	
	public void main(String [] args) {
		
		InterfaceIndiaTraffic ob =new  InterfaceDay1();
		ob.green();
		ob.red();
		yello();
	}
	
	
	
	
	
	
	

	@Override
	public void green() {
		System.out.println("GREEN");
		
	}

	@Override
	public void red() {
		System.out.println("RED");
		
	}

	@Override
	public void yello() {
		System.out.println("YELLO");
		
	}

	
}
