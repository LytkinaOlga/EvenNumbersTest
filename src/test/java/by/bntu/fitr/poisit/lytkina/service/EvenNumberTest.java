package by.bntu.fitr.poisit.lytkina.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {

    @Test
    public void checkEvenNumberReturnTrue() {
        int number = 6;
        EvenNumber evenNumber = new EvenNumber();
        Boolean expected = true;
        Boolean actual = evenNumber.checkEvenNumber(number);
        assertEquals(expected, actual);
    }
    @Test
    public void checkEvenNumberReturnFalse() {
        int number = 5;
        EvenNumber evenNumber = new EvenNumber();
        Boolean expected = false;
        Boolean actual = evenNumber.checkEvenNumber(number);
        assertEquals(expected, actual);
    }
}