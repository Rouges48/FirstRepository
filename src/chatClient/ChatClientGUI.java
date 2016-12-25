package chatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Admin on 25.12.2016.
 */
public class ChatClientGUI {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        ChatClientGUI chatClient = new ChatClientGUI();
        chatClient.go();
    }

    public void go() {
        JFrame chatWindow = new JFrame("Simple Chat");
        JPanel mainPanal = new JPanel();
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(incoming);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new
                                             ActionListener() {
                                                 @Override
                                                 public void actionPerformed(ActionEvent e) {

                                                 }
                                             });
        mainPanal.add(scrollPane);
        mainPanal.add(outgoing);
        mainPanal.add(sendButton);
        chatWindow.getContentPane().add(BorderLayout.CENTER, mainPanal);
        chatWindow.setSize(400, 500);
        chatWindow.setVisible(true);
    }
}
