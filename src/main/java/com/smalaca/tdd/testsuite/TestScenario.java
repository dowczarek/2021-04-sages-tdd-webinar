package com.smalaca.tdd.testsuite;

class TestScenario {
    private final String name;
    private TestAssertion assertion;
    private GivenPart given;

    public TestScenario(String name) {
        this.name = name;
    }

    void add(TestAssertion assertion) {
        this.assertion = assertion;
    }

    void add(GivenPart given) {
        this.given = given;
    }

    boolean isValid() {
        return hasAssertion() && hasExecutablePart();
    }

    private boolean hasAssertion() {
        return assertion != null;
    }

    private boolean hasExecutablePart() {
        return given != null;
    }

    String name() {
        return name;
    }
}
