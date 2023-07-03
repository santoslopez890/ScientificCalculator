package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificTest {



    @Test
    public void sine(){

        Scientific razzle = new Scientific();
        double expected = 0.17364817766693033;

        double loaf = razzle.sine(10, true);

        assertEquals(expected, loaf);

    }
    @Test
    public void cosine() {

        Scientific razzle = new Scientific();
        double expected = 0.984807753012208;

        double loaf = razzle.cosine(10, true);

        assertEquals(expected, loaf);
    }

    @Test
    public void tan() {

        Scientific razzle = new Scientific();
        double expected = 0.17632698070846498;

        double loaf = razzle.tan(10, true);

        assertEquals(expected, loaf);
    }

    @Test
    public void inverseSine() {

        Scientific razzle = new Scientific();
        double expected = 0.17543139267904395;

        double loaf = razzle.inverseSine(10, true);

        assertEquals(expected, loaf);
    }
    @Test
    public void inverseCosine() {

        Scientific razzle = new Scientific();
        double expected = 1.3953649341158527;

        double loaf = razzle.inverseCosine(10, true);

        assertEquals(expected, loaf);
    }
    @Test
    public void inverseTan() {

        Scientific razzle = new Scientific();
        double expected = 0.1727924348551592;

        double loaf = razzle.inverseTan(10, true);

        assertEquals(expected, loaf);
    }

    @Test
    public void log() {

        Scientific razzle = new Scientific();
        double expected = 1.0;

        double loaf = razzle.log(10);

        assertEquals(expected, loaf);
    }

    @Test
    public void inverseLog() {

        Scientific razzle = new Scientific();
        double expected = 10.000000000000002;

        double loaf = razzle.inverseLog(10);

        assertEquals(expected, loaf);
    }

    @Test
    public void inverseNaturalLog() {

        Scientific razzle = new Scientific();
        double expected = 10.000000000000002;

        double loaf = razzle.inverseNaturalLog(10);

        assertEquals(expected, loaf);
    }

    @Test
    public void ln() {

        Scientific razzle = new Scientific();
        double expected = 1.0;

        double loaf = razzle.ln(10);

        assertEquals(expected, loaf);
    }

    @Test
    public void factorial() {

        Scientific razzle = new Scientific();
        double expected = 3628800.0;

        double loaf = razzle.factorial(10);

        assertEquals(expected, loaf);
    }

}