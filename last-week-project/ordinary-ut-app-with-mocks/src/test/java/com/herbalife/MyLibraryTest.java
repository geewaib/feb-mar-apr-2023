package com.herbalife;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLibraryTest {
    private MyLibrary myLibrary;

    @BeforeEach
    public void init() {
        myLibrary = new MyLibrary();
    }

    @Test
    public void myLibraryIsNotNull() {
        assertNotNull(myLibrary);
    }

    @Test
    public void addNumberAndTestSize() {
        myLibrary.add(10);
        assertEquals(myLibrary.size(), 1);
    }
}
