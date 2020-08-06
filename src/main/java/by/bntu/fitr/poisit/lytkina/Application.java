package by.bntu.fitr.poisit.lytkina;

import by.bntu.fitr.poisit.lytkina.service.EvenNumber;

public class Application {
    public static void main(String[] args) {
        int number = 5;
        EvenNumber evenNumber = new EvenNumber();
        System.out.println("evenNumber.checkEvenNumber(number) = " + evenNumber.checkEvenNumber(number));
    }
}
