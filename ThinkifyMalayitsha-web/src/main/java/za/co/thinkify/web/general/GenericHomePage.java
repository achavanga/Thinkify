/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.general;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import za.co.thinkify.web.app.ThinkifySession;
import za.co.thinkify.web.app.ThinkifyWebApplication;
import za.co.thinkify.web.customer.SenderDashBoard;
import za.co.thinkify.web.customer.SenderInbox;
import za.co.thinkify.web.customer.UserDetails;

/**
 *
 * @author achavanga
 */
public class GenericHomePage extends WebPage {

    public GenericHomePage() {
        add(new AjaxLink("dashboardLink") {

            @Override
            public void onClick(AjaxRequestTarget arg0) {
                setResponsePage(SenderDashBoard.class);
            }
        });
        add(new AjaxLink("userprofileLink") {

            @Override
            public void onClick(AjaxRequestTarget arg0) {
                setResponsePage(UserDetails.class);
            }
        });
        add(new AjaxLink("userInboxLink") {

            @Override
            public void onClick(AjaxRequestTarget arg0) {
                setResponsePage(SenderInbox.class);
            }
        });
        
        add(new AjaxLink("logout") {

            @Override
            public void onClick(AjaxRequestTarget arg0) {

                ThinkifySession.get().clear();
                ThinkifySession.get().invalidate();
                ThinkifyWebApplication webApplication = new ThinkifyWebApplication();
                setResponsePage(webApplication.getHomePage());
            }
        });

    }

    protected ThinkifySession getApplicationSession() {
        return (ThinkifySession) getSession();
    }
}
