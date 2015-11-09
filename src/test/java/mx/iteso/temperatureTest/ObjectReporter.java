package mx.iteso.temperatureTest;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ObjectReporter {
    TemperatureObjectReporter tReporter;
    @Before
    public void setUp(){
        tReporter= new TemperatureObjectReporter();
    }
    @Test
    public void fTocTest(){
        tReporter.setTemperatureInFahrenheit(200.0);
        assertEquals(tReporter.getTemperatureInCelsius(), 93.33333333333333);
    }
    @Test
    public void cTofTest(){
        tReporter.setTemperatureInCelsius(100.0);
        assertEquals(tReporter.getTemperatureInFahrenheit(), 212.0);
    }
}