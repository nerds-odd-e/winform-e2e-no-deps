package com.odde.atddv2.nodeps.ice.spec;

import com.github.leeonky.jfactory.Spec;

public class TimeOfDays {

    public static class TimeOfDay extends Spec<Demo.TimeOfDay> {

        @Override
        public void main() {
            property("serialVersionUID").ignore();
        }
    }
}
