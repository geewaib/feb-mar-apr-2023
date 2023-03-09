package com.herbalife.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLibraryTest {

    private MyLibrary myLibrary;

    @BeforeEach
    public void init() {
        myLibrary = new MyLibrary();
    }

    @AfterEach
    public void cleanup() {
        myLibrary = null;
    }

    @Test
    public void myLibraryIsNotNull() {
        assertNotNull(myLibrary);
    }

    @Test
    public void myLibrarySizeIsZeroInTheBeginning() {
        assertTrue(myLibrary.size() == 0);
    }

    @Test
    public void myLibrarySizeAfterAddingANumber() {
        myLibrary.add(1);
        assertTrue(myLibrary.size() == 1);
    }

    @Test
    public void myLibraryNumberAtAPositionAfterAddingANumber() {
        myLibrary.add(100);
        assertTrue(myLibrary.getNum(0) == 100);
    }

    @Test
    public void myLibraryNumberSizeAfterAddingAFewNumbers() {
        myLibrary.add(100);
        myLibrary.add(200);
        myLibrary.add(300);
        assertEquals(myLibrary.size(), 3);
    }

    @Test
    public void myLibraryThrowsExceptionWhileAddingDuplicates() {
        assertThrows(RuntimeException.class, () -> {
            myLibrary.add(100);
            myLibrary.add(100);
        });
    }

    @Test
    public void myLibraryExceptionMessageWhileAddingDuplicates() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            myLibrary.add(100);
            myLibrary.add(100);
        });
        assertEquals(ex.getMessage(), "Number 100 is already present");
    }

    @Test
    public void myLibrarySizeAfterTryingToAddDuplicates() {
        myLibrary.add(100);
        myLibrary.add(200);
        try {
            myLibrary.add(100);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
        assertEquals(myLibrary.size(), 2);
    }


}
