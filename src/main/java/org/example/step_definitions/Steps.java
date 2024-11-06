package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.Calculator;

public class Steps {

    public Calculator calculator;
    public float actualResult;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I sum up {int} and {int}")
    public void iSumUpAnd(int arg0, int arg1) {
        this.actualResult = arg0 + arg1;

    }

    @Then("I expect the result to be {int}")
    public void iExpectTheResultToBe(int expectedResult) {
        if (expectedResult == this.actualResult) {
            System.out.println("Test passed! Expected equals actual result!");
        } else {
            System.out.println("Test failed! Expected is differrent from actual results!");
        }
    }

    @When("I sum up {int}, {int}, {int}, {int}")
    public void sumUpForInteger(int arg0, int arg1, int arg2, int arg3) {
        this.actualResult = arg0 + arg1 + arg2 + arg3;
    }

    @When("I multiply {int} by {int} times")
    public void muliplyTwoIntegers(int arg0, int arg1) {
        this.actualResult = arg0 + arg1;
    }
}
