/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.customer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import za.co.thinkify.web.general.GenericHomePage;

/**
 *
 * @author achavanga
 */
public class HomePage extends GenericHomePage {

    public HomePage() {
        //homeUserProfileLink
        add(new AjaxLink("homeUserProfileLink") {

            @Override
            public void onClick(AjaxRequestTarget arg0) {
                setResponsePage(UserDetails.class);
            }
        });
        if (getApplicationSession().getCurrentUser() != null) {
            add(new Label("name", "Hi " + getApplicationSession().getCurrentUser().getUserName().toUpperCase()));
        }
    }

}
