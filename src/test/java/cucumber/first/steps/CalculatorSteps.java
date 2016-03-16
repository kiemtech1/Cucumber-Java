package cucumber.first.steps;

import cucumber.first.calculator.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {

    private Calculator calculator;
    private Calculator cal2Sub;

    @Before
    public void setUp() {
        calculator = new Calculator();
        cal2Sub = new Calculator();
    }

    @Given("^I have a calculator$")
    public void iHaveACalculator() throws Throwable {
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg1, int arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }
    //A test for subtraction
    @Given("^I have a calculator for substraction$")
    public void iHaveACalculatorForSub() throws Throwable {
        assertNotNull(cal2Sub);
    }
    @When("^I substract (\\d+) and (\\d+)$")
    public void iSubstractAnd (int arg1, int arg2) throws Throwable {
        cal2Sub.substract(arg1, arg2);
    }
    @Then("^the result for substraction should be -(\\d+)$")
    public void theResultForSubShouldBe(int result) throws Throwable {
        assertEquals((-result), cal2Sub.getSubResult());
    }
    //test multiplication and devition
    @Given("^I have a calculator for multiplication and devision$")
    public void iHaveACalculatorForMulAndDev(){
        assertNotNull(calculator);
    }
    @When("^I multiple (\\d+) and (\\d+)$")
    public void iMultipleAnd(int arg1, int arg2) throws Throwable {
        calculator.multiple(arg1,arg2);
    }
    @When("^devide by (\\d+)$")
    public void iDevideAnd(int arg1) throws Throwable {
        calculator.devide(calculator.getMulResult(),arg1);
    }
    @Then("^the result for mul and dev should be (\\d+)$")
    public void theResultForMulAndDevShouldBe(int result) throws Throwable {
        assertEquals(result,calculator.getDevResult());
    }
}
