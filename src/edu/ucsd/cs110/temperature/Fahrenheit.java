package edu.ucsd.cs110.temperature;

/**
 * Created by Leo on 2/15/2017.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return null;
    }

    @Override
    public Temperature toFahrenheit() {
        return null;
    }

    public String toString() {
        return "";
    }
}
