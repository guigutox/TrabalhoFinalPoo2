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
public class PassagemBarcoTest {
    
     private PassagemBarco b;
    
    public PassagemBarcoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          b = new PassagemBarco();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemBarco.
     */
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
        PassagemBarco expResult = null;
        Passagem result = b.gerarPassagem(empresa, destino, nome, cpf);
        
        assertNotEquals(expResult, result);
       
    }

    /**
     * Test of calcularTempo method, of class PassagemBarco.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        
        b.calcularTempo(1);
        assertTrue(b.getTempo()==3);
        b.calcularTempo(2);
        assertTrue(b.getTempo()==30);
        b.calcularTempo(3);
        assertTrue(b.getTempo()==18);
    }

    /**
     * Test of calcularPreco method, of class PassagemBarco.
     */
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        
        int empresa = 1;
        
        b.calcularPreco(1, empresa);
        assertTrue(b.getPreco()==632);
        b.calcularPreco(2, empresa);
        assertTrue(b.getPreco()==952);
        b.calcularPreco(3, empresa);
        assertTrue(b.getPreco()==789);
        
        empresa = 2;
        
        b.calcularPreco(1, empresa);
        assertTrue(b.getPreco()==963);
        b.calcularPreco(2, empresa);
        assertTrue(b.getPreco()==510);
        b.calcularPreco(3, empresa);
        assertTrue(b.getPreco()==999);
    }

    /**
     * Test of calcularDistancia method, of class PassagemBarco.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        b.calcularDistancia(1);
        assertTrue(b.getDistancia()==600);
        b.calcularDistancia(2);
        assertTrue(b.getDistancia()==2600);
        b.calcularDistancia(3);
        assertTrue(b.getDistancia()==1400);
        b.calcularDistancia(1);
    }

  
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        PassagemBarco instance = new PassagemBarco();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertNotEquals(expResult, result);
    }
    
}
