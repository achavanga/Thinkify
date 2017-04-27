/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinkify.web.captcha;

/**
 *
 * @author achavanga
 */

import org.apache.wicket.extensions.markup.html.captcha.CaptchaImageResource;
import za.co.thinkify.web.main.LandingPage;

/**
 * A demo form that shows how to use <a href="https://github.com/axet/kaptcha">Kaptcha</a>
 * library
 */
public class KaptchaForm<T> extends AbstractCaptchaForm<T>
{
    private static final long serialVersionUID = 1L;

    /**
     * Construct.
     *
     * @param id
     *          The component id
     */
    public KaptchaForm(String id)
    {
        super(id);
    }

    @Override
    protected CaptchaImageResource createCaptchImageResource()
    {
        return new CaptchaImageResource()
        {
            @Override
            protected byte[] render()
            {
                randomText = LandingPage.randomString(6, 8);
                getChallengeIdModel().setObject(randomText);
                return super.render();
            }
        };
    }
}