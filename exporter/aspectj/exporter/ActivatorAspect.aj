package exporter.aspect;

public aspect ActivatorAspect {
	before(): execution(void start(org.osgi.framework.BundleContext))
	{
	    System.out.println("michael 118");    

	}
}