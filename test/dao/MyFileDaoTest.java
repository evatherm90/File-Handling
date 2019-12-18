/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelPackage.MyFile;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonis
 */
public class MyFileDaoTest {
    
//    public MyFileDaoTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getById method, of class MyFileDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        MyFileDao instance = new MyFileDao();// object tis class poy thelo na testaro
        //MyFile expResult = null; to result pou perimeno
        MyFile result = instance.getById(id);//tha trexei tin getById alla prepei na toy po poio result einai kalo
                                            //arkei ayto na min einai null
        assertNotNull(result);  //check an einai null
        assertEquals(id, result.getId());//2os tropos
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); ola ta test ta bgazei fail gia na ta ftiaxo
    }
    
}
