package org.deltaj.transformations.formula.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinimizerTest {

	@Test
	public void minimizesExplicitFalse() {

		LogicFormula formula = new LogicFormula(false);
		formula = formula.minimize();

		assertEquals("false", formula.toString());
	}

	@Test
	public void minimizesImplicitFalse() {

		LogicFormula formula = new LogicFormula(1);
		formula = formula.minimize();

		assertEquals("false", formula.toString());
	}

	@Test
	public void minimizesExplicitTrue() {

		LogicFormula formula = new LogicFormula(true);
		formula = formula.minimize();

		assertEquals("true", formula.toString());
	}

	@Test
	public void minimizesImplicitTrue() {

		LogicFormula formula = new LogicFormula(1);
		formula.addTerm("0");
		formula.addTerm("1");
		formula = formula.minimize();

		assertEquals("true", formula.toString());
	}

	@Test
	public void minimizesCorrectly1() {

		LogicFormula formula = new LogicFormula(3);
		formula.addTerm("000");
		formula.addTerm("010");
		formula.addTerm("011");
		formula.addTerm("110");
		formula.addTerm("101");
		formula.addTerm("111");
		formula = formula.minimize();

		assertEquals("0_0 + 1_1 + _1_", formula.toString());
	}

	@Test
	public void minimizesCorrectly2() {

		LogicFormula formula = new LogicFormula(4);
		formula.addTerm("0100");
		formula.addTerm("1000");
		formula.addTerm("1001");
		formula.addTerm("1010");
		formula.addTerm("1011");
		formula.addTerm("1100");
		formula.addTerm("1110");
		formula.addTerm("1111");
		formula = formula.minimize();

		assertEquals("10__ + 1_1_ + _100", formula.toString());
	}

	@Test
	public void minimizesCorrectly3() {

		LogicFormula formula = new LogicFormula(4);
		formula.addTerm("0000");
		formula.addTerm("0001");
		formula.addTerm("0010");
		formula.addTerm("0011");
		formula.addTerm("0101");
		formula.addTerm("0111");
		formula.addTerm("1000");
		formula.addTerm("1010");
		formula.addTerm("1100");
		formula.addTerm("1101");
		formula.addTerm("1111");
		formula = formula.minimize();

		assertEquals("00__ + 110_ + _0_0 + _1_1", formula.toString());
	}
}
