package hdfc;

import org.apache.wicket.Application;
import org.apache.wicket.IInitializer;
import org.orienteer.core.OrienteerWebApplication;

/**
 * {@link IInitializer} for 'jar1' module
 */
public class Initializer implements IInitializer
{
	@Override
	public void init(Application application) {
		OrienteerWebApplication app = (OrienteerWebApplication)application;
		app.registerModule(Module.class);
	}

	@Override
	public void destroy(Application application) {
		OrienteerWebApplication app = (OrienteerWebApplication)application;
	}
	
}
