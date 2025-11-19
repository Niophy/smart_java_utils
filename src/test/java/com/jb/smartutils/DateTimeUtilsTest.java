package com.jb.smartutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilsTest {

    @Test
    void getCurrentUtcTimestamp_returnsIsoFormat() {
        String ts = DateTimeUtils.getCurrentUtcTimestamp();

        // Basic check: contains "T" and "Z", which ISO-8601 timestamps always have.
        assertTrue(ts.contains("T"));
        assertTrue(ts.contains("Z"));
    }
}
