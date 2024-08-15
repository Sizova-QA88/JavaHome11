package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {

    @Test
    public void shouldSimpleTaskMatchQuery() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        assertTrue(simpleTask.matches("Позвонить"));
        assertFalse(simpleTask.matches("Накричать"));
    }

    @Test
    public void shouldEpicMatchQuery() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        assertTrue(epic.matches("Яйца"));
        assertFalse(epic.matches("Тортик"));
    }

    @Test
    public void shouldMeetingMatchesQuery() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        assertTrue(meeting.matches("Выкатка"));
        assertFalse(meeting.matches("Четверг"));

    }
}