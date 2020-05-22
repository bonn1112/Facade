package Facade;

//Client
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CPU cpu = new CPU();
		Memory memory = new Memory();
		HardDrive hardDrive = new HardDrive();

		ComputerFacade computerFacade = new ComputerFacade(cpu, hardDrive, memory);
		computerFacade.start();
	}

}
