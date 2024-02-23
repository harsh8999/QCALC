package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);


		// StandardCalculator calc = new StandardCalculator();
		// calc.add(1, 1);
		// System.out.println("Result = "+ calc.getResult());
		
		// ScientificCalculator scalc = new ScientificCalculator();
		// scalc.cbrt(8);
		// System.out.println("Scientific Result = "+ scalc.getResult());

		LogicCalculator calc = new LogicCalculator();
		calc.OR(8, 6);
		calc.printResult();

		calc.AND(8, 6);
		calc.printResult();
	}

}
