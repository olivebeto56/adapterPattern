package mx.iteso.temperatureTest;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ClassReporter {
    TemperatureClassReporter tReporter;
    @Before
    public void setUp(){
        tReporter= new TemperatureClassReporter();
    }

    @Test
    public void FToCTest(){
        tReporter.setTemperatureInFahrenheit(90.0);
        assertEquals(tReporter.getTemperatureInCelsius(), 32.22222222222222);
    }
    @Test
    public void CtoFTest(){
        tReporter.setTemperatureInCelsius(40.0);
        assertEquals(tReporter.getTemperatureInFahrenheit(), 104.0);
    }
}