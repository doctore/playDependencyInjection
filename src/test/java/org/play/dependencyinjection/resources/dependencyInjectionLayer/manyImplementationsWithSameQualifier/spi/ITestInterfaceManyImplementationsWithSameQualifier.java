package org.play.dependencyinjection.resources.dependencyInjectionLayer.manyImplementationsWithSameQualifier.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface ITestInterfaceManyImplementationsWithSameQualifier extends IInterfaceManyImplementationsWithSameQualifier {

	public String testInterfaceManyImplementationsWithSameQualifier();

}