package org.play.dependencyinjection.resources.dependencyInjectionLayer.manyImplementationsWithSameQualifier.impl;

import org.play.dependencyinjection.annotations.DependencyInjectionQualifier;
import org.play.dependencyinjection.resources.dependencyInjectionLayer.manyImplementationsWithSameQualifier.spi.ITestInterfaceManyImplementationsWithSameQualifier;

@DependencyInjectionQualifier("sameQualifier")
public class ImplementationManyImplementationsWithSameQualifierTwo implements ITestInterfaceManyImplementationsWithSameQualifier {


	@Override
	public String testInterfaceManyImplementationsWithSameQualifier() {

		return "testManyImplementationsWithSameQualifierInterface Two";
	}

}