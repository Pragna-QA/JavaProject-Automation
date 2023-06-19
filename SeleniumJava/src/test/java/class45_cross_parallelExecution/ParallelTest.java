package class45_cross_parallelExecution;

import org.testng.annotations.Test;

public class ParallelTest 
{
	
	/*
	 *
	 *Parallel  - Methods 
	 * 			- Classes
	 * 			- tests
	 * Parallel Execution - Only When we want to reduce the execution time and it's not mandatory, it only based on our requirement.
	 */
	
	@Test
	public void loginApplication()
	{
		
		//Thread.currentThread();
		System.out.println("****************");
		System.out.println("Thread ID is: "+ Thread.currentThread().getId());
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
		System.out.println("Thread Priority is :"+ Thread.currentThread().getPriority());
		System.out.println("****************");
	}
	
	@Test
	public void addCourse()
	{
		System.out.println("****************");
		//Thread.currentThread();
		System.out.println("Thread ID is: "+ Thread.currentThread().getId());
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
		System.out.println("Thread Priority is :"+ Thread.currentThread().getPriority());
		System.out.println("****************");
	}
	
	@Test
	public void deleteCourse()
	{
		
		//Thread.currentThread();
		System.out.println("****************");
		System.out.println("Thread ID is: "+ Thread.currentThread().getId());
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
		System.out.println("Thread Priority is :"+ Thread.currentThread().getPriority());
		System.out.println("****************");
	}
	
	@Test
	public void logoutfromApplication()
	{
		
		//Thread.currentThread();
		System.out.println("****************");
		System.out.println("Thread ID is: "+ Thread.currentThread().getId());
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
		System.out.println("Thread Priority is :"+ Thread.currentThread().getPriority());
		System.out.println("****************");
	}

}
