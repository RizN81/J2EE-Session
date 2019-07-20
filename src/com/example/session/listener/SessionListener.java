
package com.example.session.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	public SessionListener() {
	}

	@Override
	public void sessionCreated(HttpSessionEvent event) {

		System.out.println("Session Created For " + event.getSession().getAttribute("name"));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Session Destroyed Of " + event.getSession().getAttribute("name"));
	}

}
