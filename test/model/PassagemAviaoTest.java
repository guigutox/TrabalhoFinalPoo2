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
public class PassagemAviaoTest {
    
    private PassagemAviao a;
    public PassagemAviaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          a = new PassagemAviao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemAviao.
     */
    @Test
    public void testGerarPassagem() {
        
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
    
        PassagemAviao expResult = null;
        PassagemAviao result = a.gerarPassagem(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }

    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        
        a.calcularTempo(1);
        assertTrue(a.getTempo()==1);
        a.calcularTempo(2);
        assertTrue(a.getTempo()==8);
        a.calcularTempo(3);
        assertTrue(a.getTempo()==4);
    }

   
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        int empresa = 1;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==400);
        a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==1140);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==928);
        
        empresa = 2;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==256);
        a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==1300);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==572);
    }

    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        a.calcularDistancia(1);
        assertTrue(a.getDistancia()==434);
        a.calcularDistancia(2);
        assertTrue(a.getDistancia()==2364);
        a.calcularDistancia(3);
        assertTrue(a.getDistancia()==1159);
    }

    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        PassagemAviao instance = new PassagemAviao();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertNotEquals(expResult, result);
    }
    
}
