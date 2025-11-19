package com.jb.smartutils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void readFileAsString_readsContentCorrectly() throws IOException {
        // create temporary file
        Path temp = Files.createTempFile("testfile", ".txt");
        Files.writeString(temp, "hello");

        String result = FileUtils.readFileAsString(temp);
        assertEquals("hello", result);

        // delete temp file
        Files.deleteIfExists(temp);
    }

    @Test
    void readFileAsString_nullPathThrows() {
        assertThrows(IllegalArgumentException.class, () -> FileUtils.readFileAsString(null));
    }
}
