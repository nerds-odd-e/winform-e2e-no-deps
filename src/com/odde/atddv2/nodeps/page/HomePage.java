package com.odde.atddv2.nodeps.page;

import com.odde.atddv2.nodeps.WinForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;

@Component
public class HomePage {

    @Autowired
    public WinForm winForm;

    public void login(String userName, String password) throws MalformedURLException {
        winForm.inputTextById("textBox_userName", userName);
        winForm.inputTextById("textBox_password", password);
        winForm.clickById("userButton_login");
        System.out.println(winForm.getWindowsDriver().getWindowHandles());
    }

    public void shouldHaveMessage(String message) {
        winForm.shouldHaveText(message);
    }
}
