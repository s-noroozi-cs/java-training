package com.lambda;

public class StrategyDesignPattern {
    private static final String LOWER_CASE_ALPHABET = "[a-z]+";
    private static final String NUMBER_REG_EXP = "\\d+";

    interface ValidationStrategy {
        boolean execute(String s);
    }

    static class isLowerCaseAlphabet implements ValidationStrategy {
        public boolean execute(String s) {
            return s.matches(LOWER_CASE_ALPHABET);
        }
    }

    static class IsNumber implements ValidationStrategy {
        public boolean execute(String s) {
            return s.matches(NUMBER_REG_EXP);
        }
    }

    static class Validator {
        private final ValidationStrategy strategy;

        public Validator(ValidationStrategy v) {
            this.strategy = v;
        }

        public boolean validate(String s) {
            return strategy.execute(s);
        }
    }

    public static void main(String[] args) {
        // old style
        Validator v1 = new Validator(new IsNumber());
        System.out.println(v1.validate("this is number"));
        Validator v2 = new Validator(new isLowerCaseAlphabet ());
        System.out.println(v2.validate("abc"));

        //refactoring with lambda
        Validator v3 = new Validator((String s) -> s.matches(NUMBER_REG_EXP));
        System.out.println(v3.validate("123"));
        Validator v4 = new Validator((String s) -> s.matches(LOWER_CASE_ALPHABET));
        System.out.println(v4.validate("321"));
    }

}
