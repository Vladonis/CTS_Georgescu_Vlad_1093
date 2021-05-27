package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import exceptions.WrongAgeException;
import exceptions.WrongNameException;

public class JTestStudent 
{
	static Student student1;
	static ArrayList<Integer> grades;
	static String initialName="John";
	static int initialAge=21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
		
	}

	@Before
	public void setUp() throws Exception 
	{
		student1 = new Student(initialName, initialAge, grades);
		
	}	

	@After
	public void tearDown() throws Exception 
	{
		student1=null;		
	}

	@Ignore
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongAgeException
	{		
		String newName ="John Doe";
		student1.setName(newName);
		assertEquals("Testing iwth a proper name",newName,student1.getName());	
	}
	
	@Test
	public void testSetAgeConformance() 
	{
		int newAge = initialAge+1;
		try 
		{
			student1.setAge(newAge);
			assertEquals("Testing iwth a right values",newAge,student1.getAge());
		} 
		catch (WrongAgeException e) 
		{
			fail("We have an exception");
		}		
	}	
	
	@Test
	public void testSetAgeErrorConditionNegativeValue()
	{
		int newAge = initialAge * -1;
		try 
		{
			student1.setAge(newAge);
			fail("If only I had an exception");
		} 
		catch (WrongAgeException e) 
		{
		assertTrue(true);	
		}		
	}
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException
	{
		String newName = "Io";
		student1.setName(newName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
