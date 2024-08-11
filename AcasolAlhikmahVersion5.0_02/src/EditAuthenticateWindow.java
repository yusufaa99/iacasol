import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.border.Border;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.sql.Connection;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class EditAuthenticateWindow extends JFrame
{
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JLabel lblSupplyDataBaseInformation;
    private JLabel lblUserName;
    private JLabel lblPassword;
    private JButton btnAuthenticateAndStateApplication;
    private JButton btnCancel;
    private JButton btnOk;
    private JButton btnClear;
    private JTextArea textarea;
    private JScrollPane scrollpane;
    private JPanel panel;
    private Connection connection;
    private int verification;
    
    public EditAuthenticateWindow() {
        this.verification = 0;
    }
    
    public void EditAuthenticateWindow() {
        this.panel = new JPanel();
        this.txtUserName = new JTextField(15);
        this.txtPassword = new JPasswordField(15);
        this.lblSupplyDataBaseInformation = new JLabel("Supply Data Base Information for Authentication");
        this.lblUserName = new JLabel("Enter UserName");
        this.lblPassword = new JLabel("Enter Password");
        this.btnAuthenticateAndStateApplication = new JButton("Authenticate");
        this.btnCancel = new JButton("Exit");
        this.btnOk = new JButton("OK");
        this.btnClear = new JButton("Clear");
        this.textarea = new JTextArea(5, 30);
        this.scrollpane = new JScrollPane(this.textarea, 20, 32);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        final Border TB = new TitledBorder("Edit Authentication Window");
        this.panel.setBackground(Color.cyan.darker());
        this.btnAuthenticateAndStateApplication.setBackground(Color.black);
        this.btnAuthenticateAndStateApplication.setForeground(Color.white);
        this.btnCancel.setBackground(Color.black);
        this.btnCancel.setForeground(Color.white);
        this.btnOk.setBackground(Color.black);
        this.btnOk.setForeground(Color.white);
        this.btnClear.setBackground(Color.black);
        this.panel.setBorder(TB);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(400, 250);
        this.setTitle("Edit Authentication Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setLayout(new GridBagLayout());
        this.addItem(this.panel, this.lblUserName, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.txtUserName, 2, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblPassword, 1, 2, 1, 1, 17);
        this.addItem(this.panel, this.txtPassword, 2, 2, 1, 1, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnOk);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnCancel);
        this.addItem(this.panel, ButtonsBox, 1, 4, 2, 1, 13);
        this.btnCancel.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                EditAuthenticateWindow.this.btnCancelMethod(evt1);
            }
        });
        this.btnAuthenticateAndStateApplication.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                EditAuthenticateWindow.this.btnAuthenticateAndStateApplication(evt2);
            }
        });
        this.btnOk.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                EditAuthenticateWindow.this.btnOkMethod(evt3);
            }
        });
        this.txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    EditAuthenticateWindow.this.btnOk.doClick();
                }
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                EditAuthenticateWindow.this.btnClearMethod(evt4);
            }
        });
    }
    
    private void addItem(final JPanel p, final JComponent c, final int x, final int y, final int width, final int height, final int align) {
        final GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = width;
        gc.gridheight = height;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = 0;
        p.add(c, gc);
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
            final String USERNAME = this.txtUserName.getText();
            final String PASSWORD = this.txtPassword.getText();
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", USERNAME, PASSWORD);
            this.textarea.setText("");
            final String Message = "you are an authentic user! click ok";
            JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, "you are an authentic user! click ok", "error in Authentication", 1);
            final EditingWindow ew = new EditingWindow();
            ew.EditingWindow();
        }
        catch (SQLException e) {
            e.printStackTrace();
            this.textarea.setText("");
            final String AuthenticationMsg = "invalid username or password\n";
            this.textarea.append("invalid username or password\n");
            final String Message2 = "invalid username or password";
            JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, "invalid username or password", "error in Authentication", 0);
            this.dispose();
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
        }
        catch (InstantiationException e2) {
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        catch (ClassNotFoundException e4) {
            e4.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        new EditAuthenticateWindow();
    }
    
    public void btnCancelMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnAuthenticateAndStateApplication(final ActionEvent e2) {
        this.connectToDB();
    }
    
    public void btnOkMethod(final ActionEvent e3) {
        this.connectToDB();
    }
    
    public void btnClearMethod(final ActionEvent e4) {
        this.textarea.setText("");
        this.txtUserName.setText("");
        this.txtPassword.setText("");
    }
}
