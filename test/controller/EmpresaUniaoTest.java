/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Passagem;
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
public class EmpresaUniaoTest {
    
    private EmpresaUniao u;
    
    public EmpresaUniaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        u = new EmpresaUniao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarPassagemOnibus method, of class EmpresaUniao.
     */
    @Test
    public void testCriarPassagemOnibus() {
        System.out.println("criarPassagemOnibus");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
       
        Passagem expResult = null;
        Passagem result = u.criarPassagemOnibus(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }

  
    @Test
    public void testCriarPassagemAviao() {
        System.out.println("criarPassagemAviao");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
      
        Passagem expResult = null;
        Passagem result = u.criarPassagemAviao(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of criarPassagemBarco method, of class EmpresaUniao.
     */
    @Test
    public void testCriarPassagemBarco() {
        System.out.println("criarPassagemBarco");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
       
        Passagem expResult = null;
        Passagem result = u.criarPassagemBarco(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
      
    }
    
}
