package mx.iteso.temperatureTest;



import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CelsiusTest {
    CelsiusReporter celsius;
    @Before
    public void setUp(){
        celsius= new CelsiusReporter();
    }

    @Test
    public void setTemperatureInCelsiusTest(){
        celsius.setTemperatureInCelsius(30.0);
        assertEquals(celsius.getTemperatureInCelsius(),30.0);
    }
}