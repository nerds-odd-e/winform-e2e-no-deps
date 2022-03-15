package com.odde.atddv2.nodeps.page;

import com.odde.atddv2.nodeps.WinForm;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WelcomePage {
    @Autowired
    WinForm winForm;

    @SneakyThrows
    public void open() {
        winForm.newPage();
    }

    public void loginUserShouldBe(String userName) {
        winForm.shouldHaveText("Welcome " + userName);
    }
}
