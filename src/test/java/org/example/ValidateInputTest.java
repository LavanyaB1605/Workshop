package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateInputTest {
    @Test
    public void inputValidationTest() {
        ValidateInput validateInput = new ValidateInput();
        assertTrue(validateInput.validateInput("Lava7@05161996"));
    }
}