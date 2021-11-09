import javax.swing.*;

public class HackableServerFrame extends MainFrame {
    private JTextField cUsersUserTextField;
    private JTextArea CTFPlatformVersion0TextArea;
    private JTextArea notesCanBeWrittenTextArea;
    private JPanel HackMainFrame;


    public HackableServerFrame(){
        setContentPane(HackMainFrame);
        setTitle("CTF Platform page 2");
        //setSize(1000,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true); //true fullscreen
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

}


}
