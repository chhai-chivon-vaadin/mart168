package com.mart168.mart168app.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * @author by chhai.chivon  on 10/28/2017.
 */
@SpringUI
public class MainUI extends UI{
    

    @Override
    protected void init(VaadinRequest vaadinRequest) {


        Label label = new Label();
        label.setValue("APP UI");

        setContent(label);
    }
}
