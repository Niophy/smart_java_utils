package com.jb.smartutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isNullOrEmpty_returnsTrueForNull() {
        assertTrue(StringUtils.isNullOrEmpty(null));
    }

    @Test
    void isNullOrEmpty_returnsTrueForEmpty() {
        assertTrue(StringUtils.isNullOrEmpty(""));
    }

    @Test
    void isNullOrEmpty_returnsFalseForText() {
        assertFalse(StringUtils.isNullOrEmpty("jb"));
    }

    @Test
    void capitalizeFirst_capitalizesFirstLetter() {
        assertEquals("Hello", StringUtils.capitalizeFirst("hello"));
    }

    @Test
    void toSnakeCase_basicWords() {
        assertEquals("hello_world", StringUtils.toSnakeCase("Hello World"));
    }

    @Test
    void toSnakeCase_multipleSpaces() {
        assertEquals("hello_world", StringUtils.toSnakeCase("  Hello   World  "));
    }

    @Test
    void toSnakeCase_nullInput() {
        assertNull(StringUtils.toSnakeCase(null));
    }

    @Test
    void toSnakeCase_emptyInput() {
        assertEquals("", StringUtils.toSnakeCase(""));
    }

}
