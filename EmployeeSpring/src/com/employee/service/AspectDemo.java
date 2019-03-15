package com.employee.service;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

@Aspect
public class AspectDemo {
   
	@Before("execution(* getAll(..))")
	public void beforeAdvice( )
	{
		  //public final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
		//  logger.info("getAll() called");
	}
}
