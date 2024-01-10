
package university.management.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class About extends JFrame  {
     About() {
        
        // Set JFrame properties
        setTitle("About University Management System");
        setSize(750, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.cyan);

        // Create and set layout for the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        // Add heading JLabel
        JLabel headingLabel = new JLabel("<html><h1 style='text-align: center;'>University Management System</h1></html>");
        contentPane.add(headingLabel, BorderLayout.NORTH);

        // Add an image JLabel
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(350, 0, 300, 200);
        contentPane.add(imageLabel, BorderLayout.CENTER);

        // Add a JLabel with about information
        JLabel aboutLabel = new JLabel("<html><div style='font-size: 16px; text-align: center;'>The University Management System project is designed to streamline administrative tasks within a university.<br>"
                + "It facilitates efficient management of student information, course details, faculty records, and other academic processes,<br>"
                + "enhancing overall organizational effectiveness and information accessibility.</div></html>");
        contentPane.add(aboutLabel, BorderLayout.SOUTH);

        // Set content pane for the JFrame
        setContentPane(contentPane);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);

        // Set the JFrame to be visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
