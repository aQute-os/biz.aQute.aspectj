package exporter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import aspect.SomeAnn;

public class Account implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("start");
	}

	@SomeAnn(foo = "x")
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("stop");
	}
}