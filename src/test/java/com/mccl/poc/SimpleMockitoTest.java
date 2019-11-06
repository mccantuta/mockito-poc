package com.mccl.poc;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class SimpleMockitoTest {

    @Test
    public void simpleListTest() {
        List mockedList = Mockito.mock(List.class);
        mockedList.add("first");
        mockedList.clear();
        Mockito.verify(mockedList).add("first");
        Mockito.verify(mockedList).clear();
    }

    @Test
    public void simpleConcreteClassTest() {
        ArrayList list = Mockito.mock(ArrayList.class);
        Mockito.when(list.get(0)).thenReturn("firstElement");

        Assert.assertNotNull(list.get(0));
    }

    @Test(expected = RuntimeException.class)
    public void throwExceptionVoidMethod() {
        List list = Mockito.mock(List.class);
        Mockito.doThrow(RuntimeException.class).when(list).clear();
        list.clear();
    }
}
