import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class ChatBot {
    private JFrame frame;
    private JTextField searchField;
    private JTextArea chatArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatBot chatBot = new ChatBot();
            chatBot.createAndShowGUI();
        });
    }

    @SuppressWarnings("Convert2Lambda")
    void createAndShowGUI() {
        frame = new JFrame("ChatBot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        searchField = new JTextField(20);
        topPanel.add(searchField, BorderLayout.CENTER);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            @SuppressWarnings("CallToPrintStackTrace")
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText().trim(); // Trim to remove leading and trailing spaces
                if (!searchTerm.isEmpty()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" + searchTerm.replace(" ", "+")));
                    } catch (URISyntaxException | IOException ex) {
                        ex.printStackTrace();
                        chatArea.append("Error: Could not open the web page.\n");
                    }
                }
            }
        });
        topPanel.add(searchButton, BorderLayout.EAST);

        frame.add(topPanel, BorderLayout.NORTH);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}