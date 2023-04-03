package com.herbalife;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MyLibraryUsingMocksTest {
    @Mock
    private List<Integer> numbers;

    @InjectMocks
    private MyLibrary myLibrary;

    @Test
    public void testSetup() {
        assertNotNull(numbers);
        assertNotNull(myLibrary);
    }

    @Test
    public void addNumberAndTestSize() {
        when(numbers.add(10)).thenReturn(true);
        when(numbers.size()).thenReturn(1);
        myLibrary.add(10);
        assertEquals(myLibrary.size(), 1);
    }

    @Test
    public void verifyAddition() {
        myLibrary.add(1);
        verify(numbers, times(1)).add(1);
    }

    @Test
    public void verifyAdditionOfMultipleNumbers() {
        myLibrary.add(10);
        myLibrary.add(20);
        verify(numbers, times(2)).add(anyInt());
        verify(numbers, times(2)).contains(anyInt());
    }
}
