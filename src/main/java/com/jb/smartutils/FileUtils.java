package com.jb.smartutils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FileUtils {

    private FileUtils() {
    }

    public static String readFileAsString(Path path) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("path cannot be null");
        }

        return Files.readString(path);
    }
}
