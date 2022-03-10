package question11;

public class ComputerMain {
	public static void main(String[] args) {
		Computer[] c=new Computer[3];
		c[0]=new Computer(15,"Wired","Wireless","Intel i5");
		c[1]=new Computer(24,"Wireless","Wireless","Intel i7");
		c[2]=new Computer(17,"Wired","Wired","Ryzen 7");
	
		for (Computer computer : c) {
			System.out.println(computer.getComputer());
		}
	
	}

}
