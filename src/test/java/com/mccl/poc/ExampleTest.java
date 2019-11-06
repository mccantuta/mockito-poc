package com.mccl.poc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ExampleTest {

    @Mock
    private Item item;

    @Mock
    private Price price;

    @InjectMocks
    private Example example;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testExampleMock() {
        Assert.assertNull(example.getItem().getDescription());
    }
}
