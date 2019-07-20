
package com.example.session.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
	//	The listener is something sitting there and wait for specified event happened, then “hijack” the event and run its own event.
	//
	//	Problem
	//	You want to initialize a database connection pool before the web application is started, is there a “main ()” method in the web application environment?
	//
	//	Solution
	//	The ServletContextListener is what you want, it will run your code before the web application is started.
	public ContextListener() {
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("ServletContextListener destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();

		//		reconstructedURL = new URL(request.getScheme(), request.getServerName(), request.getServerPort(), "/" + Constants.PROFILE_FOLDER_PARAM + "/");
		System.out.println("ServletContextListener started");
	}

}
