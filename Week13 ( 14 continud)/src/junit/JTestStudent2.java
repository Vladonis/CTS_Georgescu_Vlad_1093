package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import exceptions.WrongAgeException;
import exceptions.WrongGradeException;

public class JTestStudent2 {
	
	//text fixture
	static Student student1;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoGrades;



	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		initialName = "John Doe";
		initialAge = Student.MIN_AGE + 1;
		initialNoGrades = 3;
		grades = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < initialNoGrades;i++)
		{
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeMaxValue() throws WrongAgeException
	{
		int newAge = Integer.MAX_VALUE;
		student1.setAge(newAge);		
	}
	
	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException
	{
		int newAge = 200;
		student1.setAge(newAge);		
	}
	
	@Test
	public void testSetAgeBoundryLowLimit() throws WrongAgeException
	{
		int newAge = Student.MIN_AGE;
		student1.setAge(newAge);	
		assertEquals(newAge, student1.getAge());
	}
	
	@Test
	public void testSetAgeBoundryUpperLimit() throws WrongAgeException
	{
		int newAge = Student.MAX_AGE;
		student1.setAge(newAge);	
		assertEquals(newAge, student1.getAge());
	}
	
	@Test
	public void testSetGradesReferenceDeepCopy() throws WrongGradeException
	{
		int [] grades = new int[]{9,9,10};
		ArrayList<Integer> refGrades = (ArrayList<Integer>) Arrays.asList(9,9,10);
		
		student1.setGrades(refGrades);
		refGrades.set(0, 5);
		
		int[] studentGrades = new int[student1.getNoGrades()];
		for(int i = 0;i<student1.getNoGrades();i++)
		{
			try {
				studentGrades[i]=student1.getGrade(i);
			} catch (WrongGradeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		assertArrayEquals(grades, studentGrades);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
