/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.main;

import java.util.Date;
import javax.inject.Inject;
import org.apache.wicket.RestartResponseException;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import za.co.thinkify.web.app.ThinkifySession;
import za.co.thinkify.web.customer.SenderDashBoard;
import za.co.thinking.dto.AuthenticateUser;
import za.co.thinking.dto.PersonDto;
import za.co.thinking.dto.UserDto;
import za.co.thinking.model.security.User;
import za.co.thinking.security.service.IUserService;

/**
 *
 * @author achavanga
 */
@SuppressWarnings("serial")
public class LandingPage extends WebPage {

    private static final long serialVersionUID = 1L;
    private AuthenticateUser authenticateUser;
    @Inject
    private IUserService userService;
//    protected CompoundPropertyModel<User> user;
    private Form<User> loginForm;
    private Form<User> signUpForm;
    private String username;
    private String password;
    private String confirmpassword;
    private boolean rememberMe;

    public LandingPage() {

        loginForm = new Form<User>("loginForm") {
            @Override
            protected void onSubmit() {
                System.out.println(".onSubmit()");
//                setResponsePage(index.class);
                UserDto userDto = userService.logIn(username, password);
////                if (getSessionUser() != null && userDto.getUserName().equals(getSessionUser().getUserName())) {
////                    WebSession.get().clear();
////                    WebSession.get().invalidate();
////                }
                if (userDto != null) {
                    setSessionUser(userDto);

                    continueToOriginalDestination();
                    throw new RestartResponseException(SenderDashBoard.class);//(getApplication().getHomePage());
                } else {
                    error(getString("login.invalid"));
                }
            }
        };

        loginForm.add(new FeedbackPanel("loginFeedbackError"));
        loginForm.add(new RequiredTextField<>("username", new PropertyModel<>(this, "username")));
        loginForm.add(new PasswordTextField("password", new PropertyModel<>(this, "password")));
        loginForm.add(new CheckBox("rememberMe", new PropertyModel<>(this, "rememberMe"))); // this line
//        add(new KaptchaForm<Object>("kaptcha"));
        add(loginForm);

        //Signup Page
        signUpForm = new Form<User>("signUpForm") {
            @Override
            protected void onSubmit() {
                System.out.println(".onSubmit() signup");
                if (!password.equals(confirmpassword)) {
                    return;
                }

                PersonDto person = new PersonDto();
                person.setName(username);
                UserDto userToPersist = new UserDto(username, password, new Date(), "", person);

                userService.saveUser(userToPersist);
            }
        };
        signUpForm.add(new RequiredTextField<>("signupUserName", new PropertyModel<>(this, "username")));
        signUpForm.add(new PasswordTextField("signupPassword", new PropertyModel<>(this, "password")));
        signUpForm.add(new PasswordTextField("confirmpassword", new PropertyModel<>(this, "confirmpassword")));
        add(signUpForm);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    protected ThinkifySession getApplicationSession() {
        return (ThinkifySession) getSession();
    }

    public void setSessionUser(UserDto user) {
        getApplicationSession().setCurrentUser(user);
    }

    static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String randomString(int min, int max) {
        int num = randomInt(min, max);
        byte b[] = new byte[num];
        for (int i = 0; i < num; i++) {
            b[i] = (byte) randomInt('a', 'z');
        }
        return new String(b);
    }
}
