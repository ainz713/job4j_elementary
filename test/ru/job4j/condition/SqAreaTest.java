package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp6k2Then2() {
        double expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.03);
    }

    @Test
    public void whenp7k2Then27() {
        double expected = 2.7;
        int p = 7;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.03);
    }
}