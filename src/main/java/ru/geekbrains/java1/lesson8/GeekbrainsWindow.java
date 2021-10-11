package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GeekbrainsWindow extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private static int COUNT = 0;

    public GeekbrainsWindow() {
        this.randomNumber = (int) (Math.random() * 10) + 1; //[1, 10]

        setTitle("Игра: Угадай число");
        setBounds(800, 400, 800, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLayout(new FlowLayot());
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);


        Font font = new Font("Arial", Font.PLAIN, 22);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        buttonsPanel.setBackground(Color.BLUE);
        add(buttonsPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.EAST);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    COUNT++;
                    tryToAnswer(buttonIndex);
                }
            });
            buttonReset(font);

        }
        setVisible(true);
    }

    private void buttonReset(Font font) {
        JButton reset = new JButton("рестарт");
        add(reset);
        reset.setFont(font);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageReset();
            }
        });
    }

    public void tryToAnswer(int answer) {
        if (COUNT == 3) {
            textField.setText("Вы использовали 3 попытки, Вы проиграли!!! Правильное число " + randomNumber);
            reset();
            return;
        }
        if (answer < randomNumber) {
            textField.setText("Не угадали! Загаданное число больше!");
            return;
        }
        if (answer > randomNumber) {
            textField.setText("Не угадали! Загаданное число меньше");
            return;
        }

        textField.setText("Вы угадали!!! Ответ: " + randomNumber);
        reset();
    }

    public void messageReset() {
        textField.setText("Сбросили состояние, давай по новому загадывать число!!!");
        reset();
    }

    public void reset() {
        randomNumber = 0;
        randomNumber = (int) (Math.random() * 10) + 1;
        COUNT = 0;

    }
}
