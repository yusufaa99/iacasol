import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Box;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class PasswordEditing extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JLabel lblBackup;
    private JLabel lblPromotionGuide;
    private JLabel lblYear;
    private JComboBox ComboYear;
    private JLabel lblBackupFileName;
    private JTextField txtBackupFileName;
    private JLabel lblEnterUserName;
    private JTextField txtEnterUserName;
    private JButton btnEditUser;
    private JLabel lblEnterPassword;
    private JTextField txtEnterPassword;
    private JComboBox ComboSelectClass;
    private JLabel lblPromotionYear;
    private JComboBox ComboPromotionYear;
    private JButton btnBackup;
    private JButton btnPromote;
    private JButton btnClose;
    
    public void PasswordEditing() {
        this.panel = new JPanel();
        this.lblBackup = new JLabel("BACKUP:");
        (this.lblPromotionGuide = new JLabel("Note: Promotion is done by selecting individual classes, promotion year followed by clicking the promote button")).setForeground(Color.red.darker());
        this.lblYear = new JLabel("YEAR:");
        (this.ComboYear = new JComboBox()).addItem("yy");
        this.ComboYear.addItem("2013");
        this.ComboYear.addItem("2014");
        this.ComboYear.addItem("2015");
        this.ComboYear.addItem("2016");
        this.ComboYear.addItem("2017");
        this.ComboYear.addItem("2018");
        this.ComboYear.addItem("2019");
        this.ComboYear.addItem("2020");
        this.ComboYear.addItem("2021");
        this.ComboYear.addItem("2022");
        this.ComboYear.addItem("2023");
        this.ComboYear.addItem("2024");
        this.ComboYear.addItem("2025");
        this.lblBackupFileName = new JLabel("BACKUP FILE NAME:");
        this.txtBackupFileName = new JTextField(27);
        this.lblEnterUserName = new JLabel("ENTER USERNAME:");
        this.txtEnterUserName = new JTextField(13);
        this.lblEnterUserName.setForeground(Color.white);
        this.lblEnterPassword = new JLabel("NEW PASSWORD:");
        this.txtEnterPassword = new JTextField(14);
        this.lblEnterPassword.setForeground(Color.white);
        this.btnEditUser = new JButton("Edit Password");
        this.lblPromotionYear = new JLabel("PROMOTION YEAR:");
        (this.ComboPromotionYear = new JComboBox()).addItem("yy");
        this.ComboPromotionYear.addItem("2013");
        this.ComboPromotionYear.addItem("2014");
        this.ComboPromotionYear.addItem("2015");
        this.ComboPromotionYear.addItem("2016");
        this.ComboPromotionYear.addItem("2017");
        this.ComboPromotionYear.addItem("2018");
        this.ComboPromotionYear.addItem("2019");
        this.ComboPromotionYear.addItem("2020");
        this.ComboPromotionYear.addItem("2021");
        this.ComboPromotionYear.addItem("2022");
        this.ComboPromotionYear.addItem("2023");
        this.ComboPromotionYear.addItem("2024");
        this.ComboPromotionYear.addItem("2025");
        this.btnBackup = new JButton("Backup");
        this.btnPromote = new JButton("Promote");
        this.btnClose = new JButton("Close");
        this.setIconImage(new ImageIcon("CompanyLogo.jpg").getImage());
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(550, 150);
        this.setTitle("Password Editing Windows");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.cyan.darker());
        this.btnBackup.setBackground(Color.red);
        this.btnPromote.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnClose.setForeground(Color.white);
        final Box YearBox = Box.createHorizontalBox();
        YearBox.add(this.lblYear);
        YearBox.add(Box.createHorizontalStrut(5));
        YearBox.add(this.ComboYear);
        final Box BackupBox = Box.createHorizontalBox();
        BackupBox.add(this.lblBackupFileName);
        BackupBox.add(Box.createHorizontalStrut(5));
        BackupBox.add(this.txtBackupFileName);
        BackupBox.add(Box.createHorizontalStrut(5));
        BackupBox.add(this.btnBackup);
        final Box EnterUsrNameBox = Box.createHorizontalBox();
        EnterUsrNameBox.add(this.lblEnterUserName);
        EnterUsrNameBox.add(Box.createHorizontalStrut(5));
        EnterUsrNameBox.add(this.txtEnterUserName);
        this.addItem(this.panel, EnterUsrNameBox, 0, 5, 1, 1, 17);
        final Box EnterPasswordBox = Box.createHorizontalBox();
        EnterPasswordBox.add(this.lblEnterPassword);
        EnterPasswordBox.add(Box.createHorizontalStrut(5));
        EnterPasswordBox.add(this.txtEnterPassword);
        this.addItem(this.panel, EnterPasswordBox, 0, 7, 1, 1, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(this.btnEditUser);
        this.btnEditUser.setBackground(Color.red);
        this.btnEditUser.setForeground(Color.white);
        ButtonsBox.add(Box.createHorizontalStrut(5));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 4, 7, 1, 1, 17);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                PasswordEditing.this.btnCloseMethod(evt1);
            }
        });
        this.btnEditUser.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                PasswordEditing.this.connectToDB();
                PasswordEditing.this.btnbtnEditUserMethod(evt2);
            }
        });
    }
    
    public static void main(final String[] args) {
        new PasswordEditing();
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
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
        }
        catch (InstantiationException e2) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e2.getMessage(), 0);
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e3.getMessage(), 0);
            e3.printStackTrace();
        }
        catch (ClassNotFoundException e4) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e4.getMessage(), 0);
            e4.printStackTrace();
        }
    }
    
    public void btnCloseMethod(final ActionEvent evt1) {
        this.dispose();
    }
    
    public void btnbtnEditUserMethod(final ActionEvent evt2) {
        final String username = this.txtEnterUserName.getText().toString();
        final String password = this.txtEnterPassword.getText().toString().trim();
        System.out.print(password);
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "please check, enter username or password", "Error occured", 0);
        }
        try {
            final String QueryString = " UPDATE users SET Password= ? WHERE username=?";
            (this.pstatement = this.connection.prepareStatement(" UPDATE users SET Password= ? WHERE username=?")).setString(1, password);
            this.pstatement.setString(2, username);
            this.pstatement.execute();
            final String message_for_SuccessfulModification = "User: " + username + "'s  password has been changed \n " + "to : " + password;
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful password modification", 1);
            this.pstatement.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
            e.printStackTrace();
        }
    }
}
