package com.smalaca.tdd.testsuite;

interface TestScenarioRepository {
    boolean existsWithName(String name);

    void save(TestScenario testScenario, Author author);
}
