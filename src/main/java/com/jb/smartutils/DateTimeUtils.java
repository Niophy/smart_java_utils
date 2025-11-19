package com.jb.smartutils;

import java.time.Instant;

public final class DateTimeUtils {

    private DateTimeUtils() {
    }

    public static String getCurrentUtcTimestamp() {
        return Instant.now().toString();
    }
}
