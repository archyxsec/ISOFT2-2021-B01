package es.uclm.esi.isoft2b01.iteracion1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AsignarMesaTest1.class, AsignarMesaTest12.class, AsignarMesaTest16.class, AsignarMesaTest2.class,
		AsignarMesaTest3.class })

/**
 * Unit test for simple App.
 * 

 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
