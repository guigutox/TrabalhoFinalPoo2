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
public class AdapterAluguelTest {
    
    public AdapterAluguel a;
    
    public AdapterAluguelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new AdapterAluguel();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
      
        Passagem expResult = null;
        Passagem result = a.gerarPassagem(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }
    
    
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");

        a.calcularTempo(1);
        assertTrue(a.getTempo()==1);
        a.calcularTempo(2);
        assertTrue(a.getTempo()==10);
        a.calcularTempo(3);
        assertTrue(a.getTempo()==5);
    }

    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");

        a.calcularDistancia(1);        
        assertTrue(42 == a.getDistancia());
        a.calcularDistancia(2);        
        assertTrue(420 == a.getDistancia());
        a.calcularDistancia(3);        
        assertTrue(79 == a.getDistancia());
    }
    
    @Test
    public void testCalcularPreco() {
        System.out.println("gerarPassagem");

        a.calcularPreco(1, 1);
        assertTrue(222==a.getPreco());
        a.calcularPreco(2, 1);
        assertTrue(2220==a.getPreco());
        a.calcularPreco(3, 1);
        assertTrue(455==a.getPreco());
        
        a.calcularPreco(1, 2);
        assertTrue(225==a.getPreco());
        a.calcularPreco(2, 2);
        assertTrue(2250==a.getPreco());
        a.calcularPreco(3, 2);
        assertTrue(470==a.getPreco());
        
    }

   @Test
    public void testGerarId() {
        System.out.println("gerarId");
        AdapterAluguel instance = new AdapterAluguel();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertNotEquals(expResult, result);
      
    } 
}
