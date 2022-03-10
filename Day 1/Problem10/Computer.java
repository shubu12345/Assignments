package question11;

public class Computer {
	private Moniter moniter;
	private Keyboard keyboard;
	private Mouse mouse;
	private Cpu cpu;
	
	public Computer(int size, String keyboardType, String mouseType, String processor) {
		this.moniter = new Moniter(size);
		this.keyboard = new Keyboard(keyboardType);
		this.mouse = new Mouse(mouseType);
		this.cpu =new Cpu(processor);
	}

	public String getComputer() {
		return moniter.getSize()+"  "+keyboard.getKeyboardType()+"  "+mouse.getMouseType()+"  "+cpu.getProcessor();
	}

}
