package ru.clevertec.task.gradle;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void isPositiveInt() {
        assert(Utils.isAllPositiveNumbers("12", "79"));
    }


}
