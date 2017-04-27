/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.customer;

import org.apache.wicket.markup.html.basic.Label;
import za.co.thinkify.web.general.GenericHomePage;

/**
 *
 * @author achavanga
 */
public class UserDetails extends GenericHomePage {

    public UserDetails() {
        if (getApplicationSession().getCurrentUser() != null) {
            add(new Label("name", "Hi "+ getApplicationSession().getCurrentUser().getUserName().toUpperCase()));
        }

    }

    
}
