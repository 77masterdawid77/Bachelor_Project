import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class MainFrame extends JFrame {
    private JButton button1;
    private JTextField inputBox1;
    private JPanel mainPanel;
    private JTextField inputBox2;
    private JTextField inputBox3;
    private JTextField inputBox4;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton buttonReset1;
    private JMenuBar MenuBar;
    private JMenu File;
    private JMenuItem fileSave;
    private JMenu Help;
    private JMenuItem About;
    private JMenuItem ResetEverything;
    private JTabbedPane tabbedPane1;
    private JScrollBar scrollBar1;
    private JPanel EasyJPannel;
    private JButton moveToHackableServersButton;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("CTF Platform");
        //setSize(1000,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true); //true fullscreen
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = inputBox1.getText();
                if (input.equals("CTF{101}")) { button1.setText("Correct"); inputBox1.setEnabled(false); };
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input2 = inputBox2.getText();
                if (input2.equals("CTF{4}")) { button2.setText("Correct"); inputBox2.setEnabled(false); };
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input3 = inputBox3.getText();
                if (input3.equals("CTF{6}")) { button3.setText("Correct"); inputBox3.setEnabled(false); };
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input4 = inputBox4.getText();
                if (input4.equals("CTF{8}")) { button4.setText("Correct"); inputBox4.setEnabled(false); };
            }
        });
        buttonReset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button1.setText("Check Answer!");
                button2.setText("Check Answer!");
                button3.setText("Check Answer!");
                button4.setText("Check Answer!");
                inputBox1.setText("");
                inputBox2.setText("");
                inputBox3.setText("");
                inputBox4.setText("");
                inputBox1.setEnabled(true);
                inputBox2.setEnabled(true);
                inputBox3.setEnabled(true);
                inputBox4.setEnabled(true);
            }
        });
        About.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                javax.swing.JOptionPane.showMessageDialog(MainFrame.this, "This is the about page");
            }
        });

        scrollBar1.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
               // mouseWheelMoved();
                }

        });
        moveToHackableServersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                HackableServerFrame j = new HackableServerFrame();
                setContentPane(j.getContentPane());
                setVisible(false);

              //  HackableServerFrame page2 = new HackableServerFrame();
              //  setContentPane(EasyJPannel);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
