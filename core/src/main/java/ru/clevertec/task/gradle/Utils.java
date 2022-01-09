package ru.clevertec.task.gradle;


import static ru.clevertec.task.gradle.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(String... strings) {
        for (String str : strings) {
            if (!isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}
