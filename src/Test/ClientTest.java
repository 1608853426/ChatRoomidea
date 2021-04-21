package Test;

import client.DataBuffer;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import client.ui.LoginFrame;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import static client.ClientMain.connection;

public class ClientTest {
    public static void main(String[] args) {
        connection(); //连接到服务器

        //设置外观感觉
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(lookAndFeel);

        } catch (Exception e) {
            e.printStackTrace();
        }

        new LoginFrame();  //启动登录窗体
    }}

