package com.smalaca.tdd.testsuite;

class TestScenarioService {
    private final TestScenarioRepository repository;

    public TestScenarioService(TestScenarioRepository repository) {
        this.repository = repository;
    }

    void add(TestScenario testScenario, Author author) {
        if (testScenario.isValid()) {
            repository.save(testScenario, author);
        }
    }
}
