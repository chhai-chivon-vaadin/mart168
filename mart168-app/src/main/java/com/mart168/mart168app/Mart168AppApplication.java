package com.mart168.mart168app;

import com.mart168.mart168app.ui.panels.LoginPanel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mart168AppApplication {


	LoginPanel  loginPanel  = new LoginPanel();

	public static void main(String[] args) {
		SpringApplication.run(Mart168AppApplication.class, args);


	}

}
