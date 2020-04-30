package ru.mirea.test;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


import java.math.BigInteger;

import static org.junit.Assert.*;


public class CalculatorSteps {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    double a;
    double b;
    double result;
    int c;
    BigInteger resultBig;
    Exception ex;



    @Given("{double} and {double}")
    public void given(double a, double b){
        this.a = a;
        this.b = b;
    }

    @When("I add them")
    public void adding() {
       result = Calculator.add(a, b);
    }


    @Then("the result is {double}")
    public void the_result_is(double expected) {

        assertEquals(expected, result, 0.000001);
    }

    @When("I divide them")
    public void divide() {
        try {
        result = Calculator.divide(a, b);
        } catch (Exception e) {
            ex = e;
        }
    }

    @Then("it fails")
    public void fails() {
        assertTrue(ex != null);
    }


    @Given("{int}")
    public void given(int c) {
        this.c = c;
    }

    @When("I factorial it")
    public void fact() {
        resultBig = Calculator.factBig(c);
    }

    @Then("result is {biginteger}")
    public void result(BigInteger expected) {
        assertEquals(expected, resultBig);
    }
}
