/*
 * ExampleSession.java
 * 
 * Created on Aug 15, 2007, 1:37:46 AM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.app;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;
import za.co.thinking.dto.UserDto;

/**
 *
 * @author Tim Boudreau
 */
public  class ThinkifySession extends WebSession {

    private UserDto currentUser;

    public ThinkifySession(WebApplication app, Request request) {
        super(request);
    }

    public void setCurrentUser(UserDto user) {
        this.currentUser = user;
    }

    public UserDto getCurrentUser() {
        return this.currentUser;
    }

    public boolean isSignedIn() {
        return currentUser != null;
    }
}
