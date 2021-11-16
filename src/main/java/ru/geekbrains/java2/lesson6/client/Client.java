package ru.geekbrains.java2.lesson6.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static ru.geekbrains.java2.lesson7.constans.Constants.*;

public class Client extends JFrame {
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public Client() {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    String messageFromServer = dataInputStream.readUTF();
                    if (messageFromServer.equals(END_COMMAND)) {
                        break;
                    }
                          }
                closeConnection();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }

    private void sendMessage(){
    }




    private void closeConnection() {
        try {
            dataOutputStream.close();
        } catch (Exception ex) {

        }
        try {
            dataInputStream.close();
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Client::new);
    }
}
