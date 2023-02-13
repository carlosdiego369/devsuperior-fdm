package modulo04.capitulo15.labs.application;

import modulo04.capitulo15.model.devices.ComboDevice;
import modulo04.capitulo15.model.devices.ConcretePrinter;
import modulo04.capitulo15.model.devices.ConcreteScanner;

public class ProgramDevice {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("\n2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}

}
