package za.co.thinkify.web.app;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.cdi.CdiConfiguration;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import za.co.thinkify.web.customer.SenderDashBoard;
import za.co.thinkify.web.customer.UserDetails;
import za.co.thinkify.web.main.LandingPage;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 *
 * @see za.co.wicket.Start#main(String[])
 */
@SuppressWarnings("serial")
public class ThinkifyWebApplication extends WebApplication {

    private CookieService cookieService = new CookieService();

    @Override
    public Session newSession(Request request, Response response) {
        return new ThinkifySession(ThinkifyWebApplication.this, request);
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return LandingPage.class;
    }

    @Override
    protected void init() {
        super.init();
        // Configure CDI, disabling Conversations as we aren't using them
        new CdiConfiguration().configure(this);
        getDebugSettings().setAjaxDebugModeEnabled(false);
        mountPage("home", LandingPage.class);
        mountPage("sender/main", SenderDashBoard.class);
        mountPage("sender/userview", UserDetails.class);
    }

}
