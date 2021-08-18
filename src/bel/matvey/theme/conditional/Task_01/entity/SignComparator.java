package bel.matvey.theme.conditional.Task_01.entity;

public class SignComparator {

    public String compare(int number) {
        if (number > 0)
            return "Number is positive";
        if (number < 0)
            return "Number is negative";

        return "Number is equal to zero";
    }

}