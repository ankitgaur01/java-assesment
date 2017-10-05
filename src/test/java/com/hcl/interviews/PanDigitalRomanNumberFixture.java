package com.hcl.interviews;

import static com.hcl.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;
import static org.junit.Assert.*;

public class PanDigitalRomanNumberFixture {

	private PanDigitalRomanNumber panDigitalRomanNumber;
	private String inputValue;

	@Test
	public void panDigitalRomanNumberAcceptanceTests() throws Exception {
		aBehaviouralTestRunner().usingStepsFrom(this).withStory("PanDigitalRomanNumber.story").run();
	}

	@When("the input is $input")
	public void whenInputIs(int input) {
		panDigitalRomanNumber = new PanDigitalRomanNumberImpl();
		inputValue = panDigitalRomanNumber.checkNumber(input);
	}

	@Then("the output will be $")
	public void thenNumberShouldBe(Boolean theExpectedOutput) {
		assertTrue("Success" + inputValue, theExpectedOutput);

	}
}
