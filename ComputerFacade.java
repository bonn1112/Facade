package Facade;

public class ComputerFacade {
	private CPU processor;
	private HardDrive hardDrive;
	private Memory ram;
	
	public ComputerFacade(CPU processor, HardDrive hardDrive, Memory ram) {
		this.processor = processor;
		this.hardDrive = hardDrive;
		this.ram = ram;
	}
	
	public void start() {
		processor.freeze();
		ram.load(132, hardDrive.read(3456, 89));
		processor.jump(132);
		processor.execute();
		
	}
	
}
