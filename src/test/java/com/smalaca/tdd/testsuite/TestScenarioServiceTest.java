package com.smalaca.tdd.testsuite;

import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

/*
Wymagania:
1. TestScenarioService umożliwia zapisanie TestScenario dla danego Autora gdy TestScenario jest poprawny.
2. TestScenario jest poprawny gdy zawiera co najmniej jedną asercję oraz fragment wywołujący kod produkcyjny.
3. TestScenario może zostać zapisany gdy nie istnieje TestScenario z taką samą nazwą
 */
public class TestScenarioServiceTest {
    public static final String TEST_SCENARIO_NAME = "same name of test scenario";
    private final TestScenarioRepository repository = mock(TestScenarioRepository.class);
    private final TestScenarioService service = new TestScenarioService(repository);

    @Test
    void shouldSaveTestScenarioWhenIsValid() {
        // given
        givenNotExistingTestScenarioWithName(TEST_SCENARIO_NAME);
        Author author = new Author();
        TestScenario testScenario = new TestScenario(TEST_SCENARIO_NAME);
        testScenario.add(new TestAssertion());
        testScenario.add(new GivenPart());

        // when
        service.add(testScenario, author);

        // then
        thenTestScenarioWasSaved(testScenario, author);
    }

    private void givenNotExistingTestScenarioWithName(String name) {
        given(repository.existsWithName(name)).willReturn(false);
    }

    private void thenTestScenarioWasSaved(TestScenario testScenario, Author author) {
        then(repository).should().save(testScenario, author);
    }
}
