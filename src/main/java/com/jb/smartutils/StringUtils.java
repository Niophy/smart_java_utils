package com.jb.smartutils;

public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public static String capitalizeFirst(String value) {
        if (isNullOrEmpty(value)) {
            return value;
        }
        if (value.length() == 1) {
            return value.toUpperCase();
        }
        return value.substring(0, 1).toUpperCase() + value.substring(1);

    }

    public static String toSnakeCase(String input) {
        if (input == null || input.isBlank()) {
            return input;
        }

        // replace spaces with underscore
        String result = input.trim().toLowerCase().replaceAll("\\s+", "_");

        return result;
    }


}
