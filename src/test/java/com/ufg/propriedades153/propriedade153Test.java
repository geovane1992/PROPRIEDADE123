package com.ufg.propriedades153;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class propriedade153Test {

    @Test
    public void testPropriedade123() {
        System.out.println("propriedade123");
        int n = 1;
        boolean expResult = true;
        boolean result = propriedade153.propriedade123(n);
        assertEquals(expResult, result);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValorIlegal() {
        propriedade153.propriedade123(1000);
    }

  
    
}
