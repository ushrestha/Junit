package com.javacodegeeks.junit;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
//import com.eviware.soapui.impl.wsdl.WsdlProject;

//import com.eviware.soapui.model.support.PropertiesMap;

//import com.eviware.soapui.model.testsuite.TestCase;

//import com.eviware.soapui.model.testsuite.TestRunner;

//import com.eviware.soapui.model.testsuite.TestSuite;

//import com.eviware.soapui.model.testsuite.TestRunner.Status;
//import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class JunitFirstTest {

    private ArrayList<String> testList;
	
    @BeforeClass
    public static void onceExecutedBeforeAll() { 
    	System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }
 
    @Before
    public void executedBeforeEach() {
        testList = new ArrayList<String>();
        System.out.println("@Before: executedBeforeEach");
    }
 
    @AfterClass
    public static void onceExecutedAfterAll() {
    	System.out.println("@AfterClass: onceExecutedAfterAll");
    }
   
    @After
    public void executedAfterEach() {
        testList.clear();
        System.out.println("@After: executedAfterEach");
    }
 
    @Test
    public void EmptyCollection() {
        assertTrue(testList.isEmpty());
        System.out.println("@Test: EmptyArrayList");

    }
    
    @Test
    public void OneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test: OneItemArrayList");
    }
    
   
    
}