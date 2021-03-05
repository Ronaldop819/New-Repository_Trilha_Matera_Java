package ctt;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class CalculatorSalaryTest {

	public void mustDiscountTwentyPercentOfTheDeveloperSalaryGreaterThanThreeThousand() {
		
		@Test
		Employee employee = new Employee("Developer");
		CalculatorSalary calculator = new CalculatorSalary();
		calculator.calculatorSalary(employee);
		
	}
	
}
