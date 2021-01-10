package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculate.X2;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenmanWeight187Then100() {
        short a = 187;
        double expected = 100.05;

        double rsl = Fit.manWeight(a);
        Assert.assertEquals(expected, rsl, 0.05);
    }

    @Test
    public void whenwomanWeight187Then88() {
        short a = 187;
        double expected = 88.55;

        double rsl = Fit.womanWeight(a);
        Assert.assertEquals(expected, rsl, 0.05);
    }
}