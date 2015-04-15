package com.orapoveras.edu.eduapp008manager;

import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class EduApp008ManagerTest {

    @Test
    public void testLoadAndSort() throws Exception {
        String[] actual = EduApp008Manager.loadAndSort(new StringReader("b\na\nc"));
        String [] expected = {"a", "b", "c"};
        assertArrayEquals(actual, expected);
    }
}