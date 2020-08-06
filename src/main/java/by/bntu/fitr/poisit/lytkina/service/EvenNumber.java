package by.bntu.fitr.poisit.lytkina.service;

public class EvenNumber {
    public boolean checkEvenNumber(int number) {
        if ( number % 2 == 0 && number > 1) {
            return true;
        }
        return false;
    }
}
