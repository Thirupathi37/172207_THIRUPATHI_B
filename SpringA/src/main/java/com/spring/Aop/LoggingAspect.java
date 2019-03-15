package com.spring.Aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
//
//	@Before("allGetters()")
//	public void loggingAdvice()
//	{
//		System.out.println("Before Execution of  method");
//	}
//	
//	@Before("allGetters()")
//	public void secondAdvice()
//	{
//		System.out.println("second Execution of  method");
//	}
//	
//	@Pointcut("execution(* get*())")
//	public void allGetters()
//	{
//	}
	
	@Around("@annotation(com.spring.Aop.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object returnValue=null;
	//final Logger logger = LoggerFactory.getLogger(Circle.class);
	
		try
		{
			//logger.info("Going to Advice");
			System.out.println("Before Advice");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		}
		catch(Throwable e)
		{
			System.out.println("After Throwing");
			//logger.warning("Exception");
		}
		
		System.out.println("After Finally");
		return returnValue;
	}
	
	
	
}
