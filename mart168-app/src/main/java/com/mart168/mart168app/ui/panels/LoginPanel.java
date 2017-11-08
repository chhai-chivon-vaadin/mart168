package com.mart168.mart168app.ui.panels;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

/**
 * @author by chhai.chivon  on 11/8/2017.
 */
@SpringUI(path = "/login")
@Title("LoginPage")
public class LoginPanel extends UI {

    TextField user;
    PasswordField password;
    Button loginButton = new Button("Login");
    private static final String username = "username";
    private static final String passwordValue = "test123";


    @Override
    protected void init(VaadinRequest request) {
        setSizeFull();

        user = new TextField("User:");
        user.setWidth("300px");
        user.setRequiredIndicatorVisible(true);

        password = new PasswordField("Password:");
        password.setWidth("300px");
        user.setRequiredIndicatorVisible(true);
        password.setValue("");

        VerticalLayout fields = new VerticalLayout(user, password, loginButton);
        fields.setCaption("Please login to access the application");
        fields.setSpacing(true);
        fields.setMargin(new MarginInfo(true, true, true, false));
        fields.setSizeUndefined();

        VerticalLayout uiLayout = new VerticalLayout(fields);
        uiLayout.setSizeFull();
        uiLayout.setComponentAlignment(fields, Alignment.MIDDLE_CENTER);

        setFocusedComponent(user);

        setContent(uiLayout);
    }
}
