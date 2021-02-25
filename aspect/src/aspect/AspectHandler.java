package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectHandler {

	@Pointcut("execution(public Object org.apache.felix.service.command.CommandSession.execute(java.lang.CharSequence))")
	public void k() {
	}

	@Before("k()")
	public void myadvice(JoinPoint jp) {
		System.out.println(jp.getArgs()[0]);
	}
}	