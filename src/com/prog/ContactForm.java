package com.weronnip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField name, name_car, color_car, speed_car, weight_car, fuel_car;
    JRadioButton Russian_Cars, Foreign_Cars;
    JCheckBox check;

    public ContactForm() {
        //window programm
        super("Created Cars");
        super.setBounds(500, 100, 600, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(12, 2, 2, 10));

        JLabel names = new JLabel("Your name: ");
        name = new JTextField("", 2);

        //TTH car
        JLabel name_cars = new JLabel("Enter name car: ");
        name_car = new JTextField("", 1);

        JLabel color_cars = new JLabel("Enter color car: ");
        color_car = new JTextField("", 1);

        JLabel speed_cars = new JLabel("Enter speed car: ");
        speed_car = new JTextField("", 1);

        JLabel weight_cars = new JLabel("Enter weight car: ");
        weight_car = new JTextField("", 1);

        JLabel fuel_cars = new JLabel("Enter fuel car: ");
        fuel_car = new JTextField("", 1);

        container.add(names);
        container.add(name);


        container.add(name_cars);
        container.add(name_car);

        container.add(color_cars);
        container.add(color_car);

        container.add(speed_cars);
        container.add(speed_car);

        container.add(weight_cars);
        container.add(weight_car);

        container.add(fuel_cars);
        container.add(fuel_car);

        //Button
        Russian_Cars = new JRadioButton("Russian Car?");
        Foreign_Cars = new JRadioButton("Foreign Car?");

        check = new JCheckBox("\n\nDo you agree: ", false);
        JButton send_button = new JButton("Create");

        Russian_Cars.setSelected(true);
        container.add(Russian_Cars);
        container.add(Foreign_Cars);

        ButtonGroup group = new ButtonGroup();
        group.add(Russian_Cars);
        group.add(Foreign_Cars);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String user_name = name.getText();
            String car_name = name_car.getText();
            String car_color = color_car.getText();
            String car_speed = speed_car.getText();
            String car_weight = weight_car.getText();
            String car_fuel = fuel_car.getText();

            String isRus = "Russian Car\n";
            if (!Russian_Cars.isSelected())
                isRus = "Foreign Car\n";

            boolean checkBox = check.isSelected();
            JOptionPane.showMessageDialog(null, "Your Name: " + user_name + "\n\n" +
                    "Name Car: " + car_name + "\n"
                    + "Color car: " + car_color + "\n"
                    + "Speed Car: " + car_speed + " km/h" + "\n"
                    + "Weight Car: " + car_weight + "kg" + "\n"
                    + "Fuel Car: " + car_fuel + "l" + "\n\n" + isRus + "Create car: " +
                    checkBox, "Hello, " + user_name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}

