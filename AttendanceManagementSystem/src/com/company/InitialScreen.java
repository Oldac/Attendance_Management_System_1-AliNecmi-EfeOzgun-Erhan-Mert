package com.company;

import javax.swing.*;
import java.awt.*;

public class InitialScreen extends JFrame {

    public InitialScreen() {
        setSize(300,500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Attendance Management System");
        label.setBounds(50,20,300,100);

        JButton studentLogin = new JButton("Student Login");
        JButton lecturerLogin = new JButton("Lecturer Login");
        JButton adminLogin = new JButton("Admin Login");

        studentLogin.setBounds(getSize().width/3,100,100,50);
        lecturerLogin.setBounds(getSize().width/3,200,100,50);
        adminLogin.setBounds(getSize().width/3,300,100,50);

        studentLogin.addActionListener(e -> {
            setVisible(false);
            new LoginScreen("Student");
        });

        lecturerLogin.addActionListener(e -> {
            setVisible(false);
            new LoginScreen("Lecturer");
        });

        adminLogin.addActionListener(e -> {
            setVisible(false);
            new LoginScreen("Admin");
        });

        add(label);
        add(studentLogin);
        add(lecturerLogin);
        add(adminLogin);

        setVisible(true);


    }

}
