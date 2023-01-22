/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vanes
 */
public class AluguelCarroTest {
    
    private AluguelCarro a;
    
    public AluguelCarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new AluguelCarro();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTempo() {
        System.out.println("Tempo");
        
        int result = a.Tempo(1);
        assertEquals(1, result);
        result = a.Tempo(2);
        assertEquals(10, result);
        result = a.Tempo(3);
        assertEquals(5, result);
    }

 
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        
        float result = a.calcularDistancia(1);        
        assertTrue(42 == result);
        result = a.calcularDistancia(2);        
        assertTrue(420 == result);
        result = a.calcularDistancia(3);        
        assertTrue(79 == result);
    }

    @Test
    public void testPrecoDaGasolina() {
        System.out.println("precoDaGasolina");
       
        int destino = 1;
        
        float result = a.precoDaGasolina(1);
        assertTrue(210 == result);
        result = a.precoDaGasolina(2);
        assertTrue(2100 == result);
        result = a.precoDaGasolina(3);
        assertTrue(395 == result);
    }

    @Test
    public void testCustoAluguel() {
        System.out.println("custoAluguel");
       
        
        float result = a.custoAluguel(1, 1);
        assertTrue(12 == result);
        result = a.custoAluguel(2, 1);
        assertTrue(120 == result);
         result = a.custoAluguel(3, 1);
        assertTrue(60 == result);
        
        result = a.custoAluguel(1, 2);
        assertTrue(15 == result);
        result = a.custoAluguel(2, 2);
        assertTrue(150 == result);
         result = a.custoAluguel(3, 2);
        assertTrue(75 == result);
        
    }
    
    @Test
    public void testNumeroDeAluguel() {
        System.out.println("numeroDeAluguel");
        
        UUID expResult = null;
        UUID result = a.numeroDeAluguel();
        assertNotEquals(expResult, result);
        
    }
}
