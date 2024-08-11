import java.sql.ResultSet;
import java.sql.PreparedStatement;
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
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class AuthenticationWindow extends JFrame
{
    int accControlCounter;
    private JComboBox ComboSelectClass;
    public static JTextField txtUserName;
    private JPasswordField txtPassword;
    private JLabel lblSupplyDataBaseInformation;
    private JLabel lblUserName;
    private JLabel lblPassword;
    private JLabel lblClass;
    private JButton btnAuthenticateAndStateApplication;
    private JButton btnCancel;
    private JButton btnStartApplication;
    private JButton btnClear;
    private JTextArea textarea;
    private JScrollPane scrollpane;
    private ImageIcon lblImage;
    private JLabel lblCenterIcon;
    private JLabel lblUpdateIcon;
    private ImageIcon lblUpdateImage;
    private JPanel panel;
    private JPanel panel2;
    private JPanel mainpanel;
    private Connection connection;
    private int verification;
    private JComboBox ComboSelectUserType;
    private JLabel lblEnterUserType;
    private String myCurrentUser;
    
    public String getMyCurrentUser() {
		return myCurrentUser;
	}

	public void setMyCurrentUser(String myCurrentUser) {
		this.myCurrentUser = myCurrentUser;
	}

	public AuthenticationWindow() {
    	
        this.accControlCounter = 0;
        this.verification = 0;
        this.mainpanel = new JPanel();
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        final Font f2 = new Font("Arial Unicode MS", 1, 18);
        final Font f3 = new Font("Arial Unicode MS", 1, 14);
        (this.ComboSelectClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelectClass.setFont(f2);
        this.ComboSelectClass.setEditable(false);
        ((JLabel)this.ComboSelectClass.getRenderer()).setHorizontalAlignment(4);
        this.ComboSelectClass.setForeground(Color.BLACK.darker());
        (AuthenticationWindow.txtUserName = new JTextField(15)).setFont(f3);
    	myCurrentUser = txtUserName.getText().toString();
    	
        (this.txtPassword = new JPasswordField(15)).setFont(f3);
        this.lblSupplyDataBaseInformation = new JLabel("Supply Data Base Information for Authentication");
        (this.lblUserName = new JLabel("Enter UserName: ")).setForeground(Color.gray.brighter());
        this.lblUserName.setFont(f3);
        (this.lblPassword = new JLabel("Enter Password: ")).setForeground(Color.gray.brighter());
        this.lblPassword.setFont(f3);
        (this.lblClass = new JLabel("Class: ")).setForeground(Color.gray.brighter());
        this.lblClass.setFont(f3);
        (this.lblEnterUserType = new JLabel("Select User Typer:")).setForeground(Color.gray.brighter());
        this.lblEnterUserType.setFont(f3);
        (this.ComboSelectUserType = new JComboBox()).addItem("SELECT USER");
        this.ComboSelectUserType.addItem("Class Teacher");
        this.ComboSelectUserType.addItem("Accountant");
        
        this.ComboSelectUserType.setFont(f2);
        this.ComboSelectUserType.setForeground(Color.BLACK.brighter());
        this.ComboSelectUserType.setEditable(false);
        this.lblImage = new ImageIcon("LoginLogo1.jpg");
        this.lblUpdateImage = new ImageIcon("updateMessage.jpg");
        this.lblCenterIcon = new JLabel(this.lblImage);
        this.lblUpdateIcon = new JLabel(this.lblImage);
        this.btnCancel = new JButton("Exit");
        this.btnStartApplication = new JButton("StartApplication");
        this.btnAuthenticateAndStateApplication = new JButton("StartApplication");
        this.btnClear = new JButton("Clear");
        this.textarea = new JTextArea(5, 30);
        this.scrollpane = new JScrollPane(this.textarea, 20, 32);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        final Border TB = new TitledBorder("User Login Window");
        this.panel.setBackground(Color.red.darker());
        this.panel2.setBackground(Color.white);
        this.mainpanel.setBackground(Color.red.brighter());
        this.btnAuthenticateAndStateApplication.setBackground(Color.black);
        this.btnAuthenticateAndStateApplication.setForeground(Color.white);
        this.btnCancel.setBackground(Color.black);
        this.btnCancel.setForeground(Color.white);
        this.btnStartApplication.setBackground(Color.black);
        this.btnStartApplication.setForeground(Color.white);
        this.btnClear.setBackground(Color.black);
        this.panel.setBorder(TB);
        this.btnCancel.setFocusPainted(false);
        this.btnCancel.setBackground(new Color(120, 87, 182));
        this.btnAuthenticateAndStateApplication.setFocusPainted(false);
        this.btnAuthenticateAndStateApplication.setBackground(new Color(120, 87, 182));
        this.btnStartApplication.setFocusPainted(false);
        this.btnStartApplication.setBackground(new Color(120, 87, 182));
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(690, 290);
        this.setTitle("[AcasolV5.0_02] User  Login Screen");
        this.add(this.mainpanel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.mainpanel.setLayout(new GridBagLayout());
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.addItem(this.panel2, this.lblCenterIcon, 0, 0, 3, 1, 13);
        this.addItem(this.mainpanel, this.panel2, 0, 0, 1, 1, 13);
        this.addItem(this.mainpanel, this.panel, 2, 0, 4, 4, 17);
        this.addItem(this.panel, this.lblUserName, 1, 1, 1, 1, 17);
        this.addItem(this.panel, AuthenticationWindow.txtUserName, 2, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblPassword, 1, 2, 1, 1, 17);
        this.addItem(this.panel, this.txtPassword, 2, 2, 1, 1, 17);
        this.addItem(this.panel, this.lblEnterUserType, 1, 3, 1, 1, 17);
        this.addItem(this.panel, this.ComboSelectUserType, 2, 3, 1, 1, 17);
        this.addItem(this.panel, this.lblClass, 1, 4, 1, 1, 17);
        this.addItem(this.panel, this.ComboSelectClass, 2, 4, 1, 1, 17);
        this.addItem(this.panel, this.btnAuthenticateAndStateApplication, 1, 5, 1, 1, 17);
        this.addItem(this.panel, this.btnCancel, 3, 5, 1, 1, 17);
        this.btnCancel.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                AuthenticationWindow.this.btnCancelMethod(evt1);
            }
        });
        this.btnAuthenticateAndStateApplication.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                try {
                    AuthenticationWindow.this.btnAuthenticateAndStateApplication(evt2);
                }
                catch (InstantiationException e) {
                    e.printStackTrace();
                }
                catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                catch (ClassNotFoundException e3) {
                    e3.printStackTrace();
                }
            }
        });
        this.btnStartApplication.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                AuthenticationWindow.this.btnStartApplicationMethod(evt3);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                AuthenticationWindow.this.btnClearMethod(evt4);
            }
        });
        this.txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    AuthenticationWindow.this.btnAuthenticateAndStateApplication.doClick();
                }
            }
        });
        this.ComboSelectClass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    AuthenticationWindow.this.btnAuthenticateAndStateApplication.doClick();
                }
            }
        });
        this.fillCoboSelectClass();
    }
    
    public static JTextField getTxtUserName() {
		return txtUserName;
	}

	public static void setTxtUserName(JTextField txtUserName) {
		AuthenticationWindow.txtUserName = txtUserName;
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
            final String USERNAME = AuthenticationWindow.txtUserName.getText();
            final String PASSWORD = this.txtPassword.getText();
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", USERNAME, PASSWORD);
            final String Message = "you are an authentic user! click on startAppl.";
            JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, "you are an authentic user! click on startAppl.", "User Authentication", 1);
            ++this.verification;
        }
        catch (SQLException e) {
            e.printStackTrace();
            this.textarea.setText("");
            final String AuthenticationMsg = "invalid username or password\n";
            this.textarea.append("invalid username or password\n");
            final String Message2 = " invalid username or password. Please, check your Server/router connectivity. \n you may cantact 09065306495 or cloudsoftconsultingltd@gmail.com , " + e;
            JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, Message2, "error in Authentication", 0);
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
        new AuthenticationWindow();
     }
    
    public void btnCancelMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnAuthenticateAndStateApplication(final ActionEvent e2) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String LoginTest = AuthenticationWindow.txtUserName.getText();
        final String SubLoginCharTest = LoginTest.substring(0, 4);
        final String myusername = AuthenticationWindow.txtUserName.getText().toString();
        final String mypassword = this.txtPassword.getText().toString().trim();
        final String userType = (String)this.ComboSelectUserType.getSelectedItem();
        final String myClass = (String)this.ComboSelectClass.getSelectedItem();
        if (!myusername.equalsIgnoreCase("admin")) {
            try {
            	System.out.println("This is a testing string on CLASS+ :"+ myClass);
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final PreparedStatement pstatement = con.prepareStatement("SELECT * FROM accssControl WHERE userName = ? AND class=? ");
                pstatement.setString(1, myusername);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (rs.next()) {
                    ++this.accControlCounter;
                }
                else {
                    this.accControlCounter = 0;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        if (myusername.equals("") || mypassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, supply username or password", "Error occured", 0);
        }
        else if (SubLoginCharTest.equalsIgnoreCase("root")) {
            try {
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = AuthenticationWindow.txtUserName.getText();
                final String PASSWORD = this.txtPassword.getText();
                this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", USERNAME, PASSWORD);
                JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, "You are an authentic user! click on ok!", "User Authentication", 1);
                final SubMainWindowForAdmin swa = new SubMainWindowForAdmin();
                swa.SubMainWindowForAdmin();
                this.dispose();
            }
            catch (SQLException e3) {
                JOptionPane.showMessageDialog(this.btnAuthenticateAndStateApplication, "invalid username or password. Please, check your Server/router connectivity. \n you may cantact 09065306495 or cloudsoftconsultingltd@gmail.com, \n" + e3, "error in Authentication", 0);
                this.dispose();
            }
        }
        else if (userType.equalsIgnoreCase("Accountant")) {
        	
        	 if (userType.equalsIgnoreCase("SELECT USER")) {
                JOptionPane.showMessageDialog(null, "please, enter user_type!", "Error occured", 0);
            }else {
            	//Authenticating the Accountant Type
            
            	try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                    final String USERNAME = "root";
                    final String PASSWORD = "ash123";
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                    final PreparedStatement st = con.prepareStatement("SELECT username,password,userType  FROM users WHERE BINARY username=? AND BINARY password=? AND userType =?");
                    st.setString(1, myusername);
                    st.setString(2, mypassword);
                    st.setString(3, userType);
                    final ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                    	final subFeesManagement acnt = new subFeesManagement();
                        acnt.subFeesManagement();
                        this.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password ", "Error occured", 0);
                    }
                }
                catch (Exception e4) {
                    JOptionPane.showMessageDialog(null, "Invalid username or password " + e4.getMessage(), "Error occured", 0);
                }
            	
            }//
            
        }
        else if (SubLoginCharTest.equalsIgnoreCase("saif")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final PreparedStatement st = con.prepareStatement("SELECT username,password,userType  FROM users WHERE BINARY username=? AND BINARY password=? AND userType =?");
                st.setString(1, myusername);
                st.setString(2, mypassword);
                st.setString(3, userType);
                final ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    final SubMainWindowForFormMaster swfm = new SubMainWindowForFormMaster();
                    swfm.SubMainWindowForFormMaster();
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password ", "Error occured", 0);
                }
            }
            catch (Exception e4) {
                JOptionPane.showMessageDialog(null, "Invalid username or password " + e4.getMessage(), "Error occured", 0);
            }
        }
        else if (myusername.equals("") || mypassword.equals("")) {
            JOptionPane.showMessageDialog(null, "please check, enter username or password", "Error occured", 0);
        }
        else if (userType.equalsIgnoreCase("SELECT USER")) {
            JOptionPane.showMessageDialog(null, "please, enter user_type!", "Error occured", 0);
        }
        else if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class!", "Class Selection Error", 0);
        }
        else if (this.accControlCounter <= 0) {
            JOptionPane.showMessageDialog(null, "USERNAME:  ' " + myusername.toUpperCase() + " ' " + " NOT Enabled for the Class: " + myClass, "Error occured", 0);
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final PreparedStatement st = con.prepareStatement("SELECT username,password,userType  FROM users WHERE BINARY username=? AND BINARY password=? AND userType =?");
                st.setString(1, myusername);
                st.setString(2, mypassword);
                st.setString(3, userType);
                final ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    if (userType.equalsIgnoreCase("Class Teacher")) {
                        final SubMainWindowForFormMaster swfm = new SubMainWindowForFormMaster();
                        swfm.SubMainWindowForFormMaster();
                        this.dispose();
                        
                    }
                    else if (userType.equalsIgnoreCase("Accountant")) {
                        final subFeesManagement acnt = new subFeesManagement();
                        acnt.subFeesManagement();
                        this.dispose();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password ", "Error occured", 0);
                }
            }
            catch (Exception e4) {
                JOptionPane.showMessageDialog(null, "Invalid username or password " + e4, "Error occured", 0);
            }
        }
    }
    
    public void btnStartApplicationMethod(final ActionEvent e3) {
        final String LoginTest = AuthenticationWindow.txtUserName.getText();
        final String SubLoginCharTest = LoginTest.substring(0, 4);
        if (this.verification <= 0) {
            this.textarea.setText("");
            final String Message = "invalid auhenticaition details";
            JOptionPane.showMessageDialog(this.btnStartApplication, "invalid auhenticaition details", "error in Authentication", 0);
            this.textarea.append("you are not authenticated yet,\nsupply your authentication details and try again");
        }
        else if (this.verification >= 1) {
            int mycounter = 0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = AuthenticationWindow.txtUserName.getText();
                final String PASSWORD = this.txtPassword.getText();
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", USERNAME, PASSWORD);
                final String QueryString = "SELECT * FROM expirydate";
                final PreparedStatement pstatement = con.prepareStatement("SELECT * FROM expirydate");
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    ++mycounter;
                }
                rs.close();
                pstatement.close();
            }
            catch (Exception e4) {
                System.out.println(e4);
            }
            if (mycounter <= 0 && mycounter <= 0) {
                try {
                    final String InsertQueryString = "INSERT INTO expirydate VALUES(Now(),DATE_ADD(NOW(),INTERVAL 365 Day),0)";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("INSERT INTO expirydate VALUES(Now(),DATE_ADD(NOW(),INTERVAL 365 Day),0)");
                    final int numberOfRowsUpdated = pstatement2.executeUpdate();
                    pstatement2.close();
                }
                catch (SQLException e5) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                    e5.printStackTrace();
                }
            }
            int myExpcounter = 0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL2 = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME2 = AuthenticationWindow.txtUserName.getText();
                final String PASSWORD2 = this.txtPassword.getText();
                final Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", USERNAME2, PASSWORD2);
                final String QueryString2 = "select startDate,ExpiryDate,MyStatus, DATEDIFF(ExpiryDate,Now()) from expirydate where DATEDIFF(ExpiryDate,Now()) <= 0";
                final PreparedStatement pstatement3 = con2.prepareStatement("select startDate,ExpiryDate,MyStatus, DATEDIFF(ExpiryDate,Now()) from expirydate where DATEDIFF(ExpiryDate,Now()) <= 0");
                final ResultSet rs2 = pstatement3.executeQuery();
                while (rs2.next()) {
                    ++myExpcounter;
                }
                rs2.close();
                pstatement3.close();
            }
            catch (Exception e6) {
                System.out.println(e6);
            }
            int mystatus = 0;
            try {
                final String QueryString3 = "SELECT MyStatus FROM expirydate";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT MyStatus FROM expirydate");
                final ResultSet rs3 = pstatement4.executeQuery();
                while (rs3.next()) {
                    mystatus = rs3.getInt(1);
                }
                rs3.close();
                pstatement4.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            if (myExpcounter > 0 || mystatus > 0) {
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                JOptionPane.showMessageDialog(null, "Attention, this software needs maintenance. Pls, contact +2348050390221, +234 9065306495", "Liciense Renewal Message", 0);
                try {
                    final String InsertQueryString2 = "UPDATE expirydate SET MyStatus = 1";
                    final PreparedStatement pstatement4 = this.connection.prepareStatement("UPDATE expirydate SET MyStatus = 1");
                    final int numberOfRowsUpdated2 = pstatement4.executeUpdate();
                    pstatement4.close();
                }
                catch (SQLException e7) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e7.getMessage());
                    e7.printStackTrace();
                }
            }
            if (SubLoginCharTest.equalsIgnoreCase("root")) {
                final SubMainWindowForAdmin swa = new SubMainWindowForAdmin();
                swa.SubMainWindowForAdmin();
            }
            if (SubLoginCharTest.equalsIgnoreCase("subj")) {
                final SubMainWindowForSubjectTeacher swst = new SubMainWindowForSubjectTeacher();
                swst.SubMainWindowForSubjectTeacher();
            }
            if (SubLoginCharTest.equalsIgnoreCase("form")) {
                final SubMainWindowForFormMaster swfm = new SubMainWindowForFormMaster();
                swfm.SubMainWindowForFormMaster();
            }
            if (SubLoginCharTest.equalsIgnoreCase("root")) {
                final subFeesManagement acnt = new subFeesManagement();
                acnt.subFeesManagement();
            }
            else {
                this.textarea.append("you are not authenticated yet,\nsupply your authentication details and try again");
            }
            this.dispose();
        }
    }
    
    public void btnClearMethod(final ActionEvent e4) {
        this.textarea.setText("");
        AuthenticationWindow.txtUserName.setText("");
        this.txtPassword.setText("");
    }
    
    public void fillCoboSelectClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Connection con = null;
        Label_0484: {
            try {
                try {
                    final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                    final String USERNAME = "root";
                    final String PASSWORD = "ash123";
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error Occured: \n" + e.getMessage(), "Error occured", 0);
                    e.printStackTrace();
                }
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = con.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString("Classname_Ara");
                    this.ComboSelectClass.addItem(ComboClassName);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    con.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    JOptionPane.showConfirmDialog(null, "Error Occured " + e2.getMessage(), "Error Occured", 0);
                    e2.printStackTrace();
                }
                try {
                    con.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e3) {
                    JOptionPane.showConfirmDialog(null, "Error Occured " + e3.getMessage(), "Error Occured", 0);
                    e3.printStackTrace();
                }
                break Label_0484;
            }
            finally {
                try {
                    con.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e3) {
                    JOptionPane.showConfirmDialog(null, "Error Occured " + e3.getMessage(), "Error Occured", 0);
                    e3.printStackTrace();
                }
            }
            try {
                con.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                JOptionPane.showConfirmDialog(null, "Error Occured " + e3.getMessage(), "Error Occured", 0);
                e3.printStackTrace();
            }
            try {
                con.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e4) {
                JOptionPane.showConfirmDialog(null, "Error Occured " + e4.getMessage(), "Error Occured", 0);
                e4.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
}
