/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebasunitarias;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class MatricadNGTest {

    public MatricadNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    //@Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        Matricad instance = null;
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    //@Test
    public void testGetCantidadCadenasQueEmpiezanConMatVacia() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        Matricad instance = null;
        String[] buida = {};
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    // @Test
    public void testGetCantidadCadenasQueEmpiezanConMatPrueba() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        String[] prueba = {"hola", "que", "tal", "como", "estas", "hola"};
        Matricad instance = "";
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    //@Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 'h';
        String[] prueba = {"hola", "que", "tal", "como", "estas", "hola"};
        Matricad instance = null;
        boolean expResult = true;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    //@Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = null;
        String expResult = "";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    //@Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "";
        Matricad instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
