import java.sql.ResultSet;
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
import java.awt.Font;
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

public class Promotion extends JFrame
{
    String TargetPromotingTable;
    int promCounter;
    int promNextClassCounter;
    int sessionCounter;
    String pulledClassName_Arch;
    String pulledClassName_Eng;
    String pulledPromotingToClassName_Eng;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JLabel lblBackup;
    private JLabel lblPromotionGuide;
    private JLabel lblYear;
    private JComboBox ComboYear;
    private JLabel lblSession;
    private JComboBox ComboSession;
    private JLabel lblBackupFileName;
    private JTextField txtBackupFileName;
    private JLabel lblSelectClass;
    private JLabel lblClass_Promoting_TO;
    private JComboBox ComboSelectClass;
    private JComboBox ComboSelectClass_Fromoting_To;
    private JLabel lblPromotionYear;
    private JComboBox ComboPromotionYear;
    private JButton btnBackup;
    private JButton btnPromote;
    private JButton btnClose;
    private JButton btnPromoteIslamiyya;
    private JButton btnPromoteTahfeez;
    private JButton btnPromoteMutawassit;
    
    public Promotion() {
        this.TargetPromotingTable = "";
        this.promCounter = 0;
        this.promNextClassCounter = 0;
        this.sessionCounter = 0;
        this.pulledClassName_Arch = "";
        this.pulledClassName_Eng = "";
        this.pulledPromotingToClassName_Eng = "";
    }
    
    public void Promotion() {
        final Font f = new Font(null, 1, 22);
        final Font f2 = new Font("Arial Unicode MS", 1, 18);
        this.panel = new JPanel();
        this.lblBackup = new JLabel("BACKUP:");
        (this.lblPromotionGuide = new JLabel("Note: Promotion is done by selecting individual classes, promotion year followed by clicking the promote button")).setForeground(Color.red.darker());
        this.lblYear = new JLabel("YEAR:");
        (this.ComboYear = new JComboBox()).addItem("yy");
        this.ComboYear.addItem("2017");
        this.ComboYear.addItem("2018");
        this.ComboYear.addItem("2019");
        this.ComboYear.addItem("2020");
        this.ComboYear.addItem("2021");
        this.ComboYear.addItem("2022");
        this.ComboYear.addItem("2023");
        this.ComboYear.addItem("2024");
        this.ComboYear.addItem("2025");
        this.ComboYear.setFont(f2);
        this.ComboYear.setEditable(true);
        this.lblSession = new JLabel("SESSION:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(f2);
        this.lblBackupFileName = new JLabel("BACKUP FILE NAME:");
        this.txtBackupFileName = new JTextField(27);
        this.lblSelectClass = new JLabel("CLASS:");
        this.lblClass_Promoting_TO = new JLabel("CLASS PROMOTING TO:");
        (this.ComboSelectClass = new JComboBox()).addItem("Class Class");
        this.ComboSelectClass.setFont(f2);
        this.ComboSelectClass.setEditable(false);
        ((JLabel)this.ComboSelectClass.getRenderer()).setHorizontalAlignment(4);
        (this.ComboSelectClass_Fromoting_To = new JComboBox()).addItem("Select Class Promoting To");
        this.ComboSelectClass_Fromoting_To.setFont(f2);
        this.ComboSelectClass_Fromoting_To.setEditable(false);
        ((JLabel)this.ComboSelectClass_Fromoting_To.getRenderer()).setHorizontalAlignment(4);
        this.lblPromotionYear = new JLabel("PROMOTION YEAR:");
        (this.ComboPromotionYear = new JComboBox()).setFont(f);
        this.ComboPromotionYear.addItem("yy");
        this.ComboPromotionYear.addItem("2017");
        this.ComboPromotionYear.addItem("2018");
        this.ComboPromotionYear.addItem("2019");
        this.ComboPromotionYear.addItem("2020");
        this.ComboPromotionYear.addItem("2021");
        this.ComboPromotionYear.addItem("2022");
        this.ComboPromotionYear.addItem("2023");
        this.ComboPromotionYear.addItem("2024");
        this.ComboPromotionYear.addItem("2025");
        this.ComboPromotionYear.setEditable(true);
        this.btnBackup = new JButton("Backup");
        this.btnPromote = new JButton("Promote");
        (this.btnPromoteIslamiyya = new JButton("Promote Islamiyya")).setFont(f);
        (this.btnPromoteTahfeez = new JButton("Promote Tahfeez")).setFont(f);
        this.btnPromote.setFont(f);
        (this.btnPromoteMutawassit = new JButton("Promote Tahfeez")).setFont(f);
        (this.btnClose = new JButton("Close")).setFont(f2);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.panel.setLayout(new GridBagLayout());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(830, 150);
        this.setTitle("Promotion Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnBackup.setBackground(Color.red);
        this.btnPromote.setBackground(Color.red);
        this.btnPromoteIslamiyya.setBackground(Color.red);
        this.btnPromoteTahfeez.setBackground(Color.red);
        this.btnPromoteMutawassit.setBackground(Color.red);
        this.btnClose.setBackground(Color.black);
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
        this.addItem(this.panel, this.lblPromotionGuide, 0, 4, 1, 1, 17);
        final Box SessionAndYearBox = Box.createHorizontalBox();
        SessionAndYearBox.add(this.lblSession);
        SessionAndYearBox.add(Box.createHorizontalStrut(5));
        SessionAndYearBox.add(this.ComboSession);
        SessionAndYearBox.add(Box.createHorizontalStrut(5));
        SessionAndYearBox.add(this.lblPromotionYear);
        SessionAndYearBox.add(Box.createHorizontalStrut(5));
        SessionAndYearBox.add(this.ComboPromotionYear);
        SessionAndYearBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, SessionAndYearBox, 0, 5, 1, 1, 17);
        final Box PromotionBox = Box.createHorizontalBox();
        PromotionBox.add(this.lblSelectClass);
        PromotionBox.add(Box.createHorizontalStrut(5));
        PromotionBox.add(this.ComboSelectClass);
        PromotionBox.add(Box.createHorizontalStrut(5));
        PromotionBox.add(this.lblClass_Promoting_TO);
        PromotionBox.add(Box.createHorizontalStrut(5));
        PromotionBox.add(this.ComboSelectClass_Fromoting_To);
        PromotionBox.add(Box.createHorizontalStrut(5));
        PromotionBox.add(this.btnPromote);
        PromotionBox.add(Box.createHorizontalStrut(15));
        PromotionBox.add(this.btnClose);
        this.addItem(this.panel, PromotionBox, 0, 6, 1, 1, 17);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                Promotion.this.btnCloseMethod(evt1);
            }
        });
        this.btnBackup.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                Promotion.this.btnBackupMethod(evt2);
            }
        });
        this.btnPromote.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                Promotion.this.connectToDB();
                Promotion.this.btnPromoteMethod(evt3);
            }
        });
        this.btnPromoteIslamiyya.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                Promotion.this.connectToDB();
            }
        });
        this.btnPromoteTahfeez.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                Promotion.this.connectToDB();
            }
        });
        this.btnPromoteMutawassit.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                Promotion.this.connectToDB();
            }
        });
        this.fillCoboSelectClass();
        this.fillComboSession();
    }
    
    public static void main(final String[] args) {
        new Promotion();
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
    
    public void btnBackupMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void checkingForErrorFreePromotion() {
        final String myPromotingClass = (String)this.ComboSelectClass.getSelectedItem();
        final String PromotionYear = (String)this.ComboPromotionYear.getSelectedItem();
        final String myPromotionSession = (String)this.ComboSession.getSelectedItem();
        String TheClassName_Arabic = "";
        String StudClassRegTableName = "";
        final String PromotedClass = "";
        final String myclass = (String)this.ComboSelectClass.getSelectedItem();
        String classProtingsTo = "";
        String archivedTable = "";
        String nextClassTable = "";
        StudClassRegTableName = this.pulledClassName_Eng;
        classProtingsTo = (String)this.ComboSelectClass_Fromoting_To.getSelectedItem();
        archivedTable = this.pulledClassName_Arch;
        nextClassTable = this.pulledPromotingToClassName_Eng;
        int GradNextclassCounter = 0;
        final String graduatedClass = String.valueOf(String.valueOf(myPromotingClass)) + " graduated" + PromotionYear;
        final String promotedClass = String.valueOf(String.valueOf(myPromotingClass)) + " Promoted" + PromotionYear;
        this.promCounter = 0;
        this.promNextClassCounter = 0;
        try {
            final String QueryString = "SELECT StdClass FROM " + archivedTable + " WHERE StdClass = ? OR StdClass = ? ";
            final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
            pstatement.setString(1, graduatedClass);
            pstatement.setString(2, promotedClass);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            if (rs.next()) {
                final String Class = rs.getObject(1).toString();
                this.promCounter = 1;
                System.out.println("testing Class " + Class + " " + this.promCounter);
                System.out.println("protYear: " + graduatedClass);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        try {
            this.connectToDB();
            final String QueryString = "SELECT Classname_Ara FROM Graduating_class WHERE Classname_Ara =? AND Session =? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM Graduating_class WHERE Classname_Ara =? AND Session =? ");
            pstatement.setString(1, myclass);
            pstatement.setString(2, myPromotionSession);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                TheClassName_Arabic = rs.getString(1);
                ++GradNextclassCounter;
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (!myclass.equalsIgnoreCase(TheClassName_Arabic)) {
            try {
                final String QueryString = "SELECT * FROM " + nextClassTable;
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                if (rs.next()) {
                    this.promNextClassCounter = 1;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnPromoteMethod(final ActionEvent evt3) {
        this.pulledCLassName_ENG();
        this.pulledPromotingToCLassName_ENG();
        this.checkingForErrorFreePromotion();
        final int PromoteButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to Promote?", "Promotion Confirmation Window", 0);
        if (PromoteButton == 0) {
            final String Class = (String)this.ComboSelectClass.getSelectedItem();
            final String PromotionYear = (String)this.ComboPromotionYear.getSelectedItem();
            final String myPromotionSession = (String)this.ComboSession.getSelectedItem();
            String StudClassRegTableName = "";
            String PromotedClass = "";
            final String myclass = (String)this.ComboSelectClass.getSelectedItem();
            String classProtingsTo = "";
            String archivedTable = "";
            String nextClassTable = "";
            int gradcounter = 0;
            StudClassRegTableName = this.pulledClassName_Eng;
            classProtingsTo = (String)this.ComboSelectClass_Fromoting_To.getSelectedItem();
            archivedTable = this.pulledClassName_Arch;
            nextClassTable = this.pulledPromotingToClassName_Eng;
            if (Class.equals("SELECT CLASS")) {
                JOptionPane.showMessageDialog(null, "Please, class", "Promotion Window", 0);
            }
            else if (classProtingsTo.equals("Select Class Promoting To")) {
                JOptionPane.showMessageDialog(null, "Please, Select Class Promoting To", "Promotion Window", 0);
            }
            else if (PromotionYear.equals("yy")) {
                JOptionPane.showMessageDialog(null, "Please, select promotion year", "Promotion Year", 0);
            }
            else if (myPromotionSession.equals("Select Session")) {
                JOptionPane.showMessageDialog(null, "Please, select promotion session", "Promotion Year", 0);
            }
            else if (this.promCounter > 0) {
                JOptionPane.showMessageDialog(null, "Sorry, this class has been promoted for the said year: " + PromotionYear, "Error in Promotion", 0);
            }
            else if (this.promNextClassCounter > 0) {
                JOptionPane.showMessageDialog(null, "Sorry, the class NEXT to this class has NOT been promoted yet, Pls check! ", "Error in Promotion", 0);
            }
            else if (this.sessionCounter > 0) {
                JOptionPane.showMessageDialog(null, "Sorry, this class has been promoted for the said Academic Session: " + myPromotionSession, "Error in Promotion", 0);
            }
            else {
                final String TheClassName_Eng = "";
                String TheClassName_Arabic = "";
                try {
                    this.connectToDB();
                    final String QueryString = "SELECT Classname_Ara FROM Graduating_class WHERE Classname_Ara =? AND Session =? ";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM Graduating_class WHERE Classname_Ara =? AND Session =? ");
                    pstatement.setString(1, Class);
                    pstatement.setString(2, myPromotionSession);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        TheClassName_Arabic = rs.getString(1);
                        ++gradcounter;
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
                if (TheClassName_Arabic.equalsIgnoreCase(Class)) {
                    PromotedClass = String.valueOf(String.valueOf(myclass)) + " graduated" + PromotionYear;
                    try {
                        final String QueryString = "UPDATE " + StudClassRegTableName + " SET StdClass =?" + " WHERE StdClass = ?";
                        (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, PromotedClass);
                        this.pstatement.setString(2, Class);
                        this.pstatement.executeUpdate();
                        final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
                        JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                    try {
                        final String QueryString = "INSERT " + archivedTable + " SELECT * FROM " + StudClassRegTableName;
                        (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                    try {
                        final String QueryString = "TRUNCATE " + StudClassRegTableName;
                        (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                }
                else {
                    PromotedClass = classProtingsTo;
                    try {
                        final String QueryString = "UPDATE " + StudClassRegTableName + " SET StdClass =?" + " WHERE StdClass = ?";
                        (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, PromotedClass);
                        this.pstatement.setString(2, Class);
                        this.pstatement.executeUpdate();
                        final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
                        JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                    try {
                        final String InsertQueryString = "INSERT INTO " + nextClassTable + " (StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) " + "SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM " + StudClassRegTableName + " WHERE StdClass=?";
                        final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                        pstatement.setString(1, PromotedClass);
                        pstatement.executeUpdate();
                        pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                        e.printStackTrace();
                    }
                    PromotedClass = String.valueOf(String.valueOf(Class)) + " Promoted" + PromotionYear;
                    try {
                        final String QueryString = "UPDATE " + StudClassRegTableName + " SET StdClass =?" + " WHERE StdClass = ?";
                        (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, PromotedClass);
                        this.pstatement.setString(2, classProtingsTo);
                        this.pstatement.executeUpdate();
                        final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
                        JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                    try {
                        final String QueryString = "INSERT " + archivedTable + " SELECT * FROM " + StudClassRegTableName;
                        (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                    try {
                        final String QueryString = "TRUNCATE " + StudClassRegTableName;
                        (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                        this.pstatement.close();
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
    public void fillCoboSelectClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0290: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString("Classname_Ara");
                    this.ComboSelectClass.addItem(ComboClassName);
                    this.ComboSelectClass_Fromoting_To.addItem(ComboClassName);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0290;
            }
            finally {
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void pulledCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassName_Ara = this.ComboSelectClass.getSelectedItem().toString();
        Label_0296: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng,Classname_Arch FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng,Classname_Arch FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng,Classname_Arch FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString("Classname_Eng");
                    System.out.println("pulled Class: " + this.pulledClassName_Eng);
                    this.pulledClassName_Arch = rs.getString("Classname_Arch");
                    System.out.println("pulled Class_Arch : " + this.pulledClassName_Arch);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0296;
            }
            finally {
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void pulledPromotingToCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassNamePromotingTo_Ara = this.ComboSelectClass_Fromoting_To.getSelectedItem().toString();
        Label_0257: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassNamePromotingTo_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledPromotingToClassName_Eng = rs.getString("Classname_Eng");
                    System.out.println("pulled Class: " + this.pulledClassName_Eng);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0257;
            }
            finally {
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void fillComboSession() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0281: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT distinct Session FROM terminformation order by Session Asc";
                pstatement = this.connection.prepareStatement("SELECT distinct Session FROM terminformation order by Session Asc");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString("Session");
                    this.ComboSession.addItem(Combosuject_Ara);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0281;
            }
            finally {
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
}
