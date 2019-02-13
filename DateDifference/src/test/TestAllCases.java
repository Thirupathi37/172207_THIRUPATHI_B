package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class TestAllCases 
{
	int c;

	public DateDifferenceProvider dm ;
	
	@Before
	public void init()
	{
		
		dm=new DateDifferenceProvider();
	}
	@Test
	public void testGetDifferenceCase1()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(06, 04, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(0, differenceValue);
		System.out.println("case:"+c);
		++c;
	}
	
	@Test
	public void testGetDifferenceCase2()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 04, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(12, differenceValue);
		System.out.println("case:"+c);
		c++;
	}
	
	@Test
	public void testGetDifferenceCase3()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 05, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(42, differenceValue);
	}
	
	@Test
	public void testGetDifferenceCase4()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 06, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(73, differenceValue);
	}
	
	@Test
	public void testGetDifferenceCase5()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(256, differenceValue);
	}

	@Test
	public void testGetDifferenceCase6()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2012);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(622, differenceValue);
	}

	@Test
	public void testGetDifferenceCase7()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2013);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(987, differenceValue);
	}

	@Test
	public void testGetDifferenceCase8()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2113);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals( 37511, differenceValue);
	}

	@Test
	public void testGetDifferenceCase9()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2413);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(147084, differenceValue);
	}

	@Test
	public void testGetDifferenceCase10()
	{
		MyDate startDate=new MyDate(06, 04, 2011);
		MyDate endDate=new MyDate(18, 12, 2813);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(293181, differenceValue);
	}

	@Test
	public void testGetDifferenceCase11()
	{
		MyDate startDate=new MyDate(06, 01, 2011);
		MyDate endDate=new MyDate(06, 03, 2011);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(59, differenceValue);
	}

	@Test
	public void testGetDifferenceCase12()
	{
		MyDate startDate=new MyDate(06, 01, 2012);
		MyDate endDate=new MyDate(06, 03, 2012);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(60, differenceValue);
	}

	@Test
	public void testGetDifferenceCase13()
	{
		MyDate startDate=new MyDate(06, 02, 2012);
		MyDate endDate=new MyDate(06, 03, 2012);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(29, differenceValue);
	}

	@Test
	public void testGetDifferenceCase14()
	{
		MyDate startDate=new MyDate(22, 01, 2012);
		MyDate endDate=new MyDate(15, 11, 2012);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(298, differenceValue);
	}
	
	@Test
	public void testGetDifferenceCase15()
	{
		MyDate startDate=new MyDate(6, 2, 2012);
		MyDate endDate=new MyDate(6, 12, 2012);
		long differenceValue=dm.getDateDifference(startDate, endDate);
		assertEquals(304, differenceValue);
	}


}
