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
public class PassagemOnibusTest {
    
    private PassagemOnibus o;
    
    public PassagemOnibusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        o = new PassagemOnibus();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemOnibus.
     */
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
        PassagemOnibus expResult = null;
        PassagemOnibus result = o.gerarPassagem(empresa, destino, nome, cpf);
        
        assertNotEquals(expResult, result);
    }

    /**
     * Test of calcularTempo method, of class PassagemOnibus.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
     
        o.calcularTempo(1);
        assertTrue(o.getTempo()==5);
        o.calcularTempo(2);
        assertTrue(o.getTempo()==52);
        o.calcularTempo(3);
        assertTrue(o.getTempo()==24);
    }

    /**
     * Test of calcularPreco method, of class PassagemOnibus.
     */
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");

        int empresa = 1;
        
        o.calcularPreco(1, empresa);
        assertTrue(o.getPreco()==200.00);
        o.calcularPreco(2, empresa);
        assertTrue(o.getPreco()==950.00);
        o.calcularPreco(3, empresa);
        assertTrue(o.getPreco()==774);
        
        empresa = 2;
        
        o.calcularPreco(1, empresa);
        assertTrue(o.getPreco()==195);
        o.calcularPreco(2, empresa);
        assertTrue(o.getPreco()==950.00);
        o.calcularPreco(3, empresa);
        assertTrue(o.getPreco()==720);
        // TODO review the generated test code and remove the default call to fail.
        
    }

 
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        
        o.calcularDistancia(1);
        assertTrue(o.getDistancia()==434);
        o.calcularDistancia(2);
        assertTrue(o.getDistancia()==2900);
        o.calcularDistancia(3);
        assertTrue(o.getDistancia()==1230);
        o.calcularDistancia(1);
    }

    
    
    public void testGerarId() {
        System.out.println("gerarId");
        
        UUID expResult = null;
        UUID result = o.gerarId();
        assertNotEquals(expResult, result);
    }
}
