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

public class Demotion extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JLabel lblBackup;
    private JLabel lblPromotionGuide;
    private JLabel lblPromotionGuide2;
    private JLabel lblYear;
    private JComboBox ComboYear;
    private JLabel lblBackupFileName;
    private JTextField txtBackupFileName;
    private JLabel lblSelectClass;
    private JComboBox ComboSelectClass;
    private JLabel lblSelectDemotionClass;
    private JComboBox ComboSelectDemotionClass;
    private JLabel lblDemotionYear;
    private JComboBox ComboDemotionYear;
    private JButton btnBackup;
    private JButton btnDemote;
    private JButton btnClose;
    private JButton btnView;
    private JLabel lblRegNum;
    private JTextField txtRegNum;
    private JLabel lblname;
    private JTextField txtname;
    
    public void Demotion() {
        this.panel = new JPanel();
        this.lblBackup = new JLabel("BACKUP:");
        (this.lblPromotionGuide = new JLabel("Note: Demotion us done by 1. Supplying the student ID 2. Click on the view buttton ")).setForeground(Color.red.darker());
        (this.lblPromotionGuide2 = new JLabel(" 3. select the class you wanted to demote the student to then the year and click on Demote button")).setForeground(Color.red.darker());
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
        this.ComboYear.setEditable(false);
        this.lblBackupFileName = new JLabel("BACKUP FILE NAME:");
        this.txtBackupFileName = new JTextField(27);
        this.lblSelectClass = new JLabel("SELECT CLASS:");
        (this.ComboSelectClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelectClass.addItem("SSS1 A");
        this.ComboSelectClass.addItem("SSS2 A");
        this.ComboSelectClass.addItem("SSS3 A");
        this.ComboSelectClass.addItem("SSS1 B");
        this.ComboSelectClass.addItem("SSS2 B");
        this.ComboSelectClass.addItem("SSS3 B");
        this.ComboSelectClass.addItem("JSS I A");
        this.ComboSelectClass.addItem("JSS II A");
        this.ComboSelectClass.addItem("JSS III A");
        this.ComboSelectClass.addItem("JSS I B");
        this.ComboSelectClass.addItem("JSS II B");
        this.ComboSelectClass.addItem("JSS III B");
        this.ComboSelectClass.setEditable(true);
        this.lblSelectDemotionClass = new JLabel("CLASS DEMOTING TO: ");
        (this.ComboSelectDemotionClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelectDemotionClass.addItem("SSS1 A");
        this.ComboSelectDemotionClass.addItem("SSS2 A");
        this.ComboSelectDemotionClass.addItem("SSS3 A");
        this.ComboSelectDemotionClass.addItem("SSS1 B");
        this.ComboSelectDemotionClass.addItem("SSS2 B");
        this.ComboSelectDemotionClass.addItem("SSS3 B");
        this.ComboSelectDemotionClass.addItem("JSS I A");
        this.ComboSelectDemotionClass.addItem("JSS II A");
        this.ComboSelectDemotionClass.addItem("JSS III A");
        this.ComboSelectDemotionClass.addItem("JSS I B");
        this.ComboSelectDemotionClass.addItem("JSS II B");
        this.ComboSelectDemotionClass.addItem("JSS III B");
        this.ComboSelectDemotionClass.setEditable(true);
        this.lblDemotionYear = new JLabel("YEAR:");
        (this.ComboDemotionYear = new JComboBox()).addItem("yy");
        this.ComboDemotionYear.addItem("2013");
        this.ComboDemotionYear.addItem("2014");
        this.ComboDemotionYear.addItem("2015");
        this.ComboDemotionYear.addItem("2016");
        this.ComboDemotionYear.addItem("2017");
        this.ComboDemotionYear.addItem("2018");
        this.ComboDemotionYear.addItem("2019");
        this.ComboDemotionYear.addItem("2020");
        this.ComboDemotionYear.addItem("2021");
        this.ComboDemotionYear.addItem("2022");
        this.ComboDemotionYear.addItem("2023");
        this.ComboDemotionYear.addItem("2024");
        this.ComboDemotionYear.addItem("2025");
        this.ComboDemotionYear.setEditable(true);
        this.btnBackup = new JButton("Backup");
        this.btnDemote = new JButton("Demote");
        this.btnClose = new JButton("Close");
        this.btnView = new JButton("View");
        this.lblRegNum = new JLabel("STUDENT REG. NO: ");
        this.txtRegNum = new JTextField(12);
        this.lblname = new JLabel("STUDENT NAME: ");
        this.txtname = new JTextField(12);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.panel.setLayout(new GridBagLayout());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(400, 270);
        this.setTitle("Demotion Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnBackup.setBackground(Color.red);
        this.btnDemote.setBackground(Color.red);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.white);
        this.btnView.setBackground(Color.black);
        this.btnView.setForeground(Color.white);
        final Box YearBox = Box.createHorizontalBox();
        YearBox.add(this.lblYear);
        YearBox.add(Box.createHorizontalStrut(5));
        YearBox.add(this.ComboYear);
        this.addItem(this.panel, this.lblRegNum, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.txtRegNum, 1, 5, 1, 1, 17);
        this.addItem(this.panel, this.lblSelectClass, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelectClass, 1, 6, 1, 1, 17);
        this.addItem(this.panel, this.lblname, 0, 7, 1, 1, 13);
        this.addItem(this.panel, this.txtname, 1, 7, 1, 1, 17);
        this.addItem(this.panel, this.lblSelectDemotionClass, 0, 8, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelectDemotionClass, 1, 8, 1, 1, 17);
        this.addItem(this.panel, this.lblDemotionYear, 0, 9, 1, 1, 13);
        this.addItem(this.panel, this.ComboDemotionYear, 1, 9, 1, 1, 17);
        final Box DemotionBox = Box.createHorizontalBox();
        DemotionBox.add(this.btnView);
        DemotionBox.add(Box.createHorizontalStrut(5));
        DemotionBox.add(this.btnDemote);
        DemotionBox.add(Box.createHorizontalStrut(5));
        DemotionBox.add(this.btnClose);
        this.addItem(this.panel, DemotionBox, 1, 10, 1, 1, 17);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                Demotion.this.btnCloseMethod(evt1);
            }
        });
        this.btnBackup.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                Demotion.this.btnBackupMethod(evt2);
            }
        });
        this.btnDemote.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                Demotion.this.connectToDB();
                Demotion.this.btnbtnDemoteMethod(evt3);
            }
        });
        this.btnView.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                Demotion.this.connectToDB();
                Demotion.this.btnViewMethod(evt4);
            }
        });
    }
    
    public static void main(final String[] args) {
        new Demotion();
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
            final String URL = "jdbc:mysql://localhost:3306/AcasolVer2";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AcasolVer2", "root", "ash123");
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
    
    public void btnbtnDemoteMethod(final ActionEvent evt3) {
        final String ClassDemotingto = (String)this.ComboSelectDemotionClass.getSelectedItem();
        final String Class = (String)this.ComboSelectClass.getSelectedItem();
        final String DemotionYear = (String)this.ComboDemotionYear.getSelectedItem();
        final String regnum = this.txtRegNum.getText().toString();
        final String name = this.txtname.getTreeLock().toString();
        String DemotedClass = "";
        final String PromotedClassForOtherTables = "";
        if (Class.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select class", "Promotion Window", 0);
        }
        else if (DemotionYear.equals("yy")) {
            JOptionPane.showMessageDialog(null, "Please, select promotion year", "Promotion Year", 0);
        }
        else if (ClassDemotingto.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select class demotingto", "Promotion Year", 0);
        }
        else if (name.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please check, name cant be empty", "demotion Year", 0);
        }
        else if (Class.equals("SSS1 A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS1A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS1A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS2 A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS2A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS2A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS3 A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS3A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS3A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS1 B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS1B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS1B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS2 B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS2B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS2B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS3 B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS3B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS3B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("JSS I A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegJSS1A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegJSS1A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("JSS II A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegJSS2A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegJSS2A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("JSS III A")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegJSS3A SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegJSS3A SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("JSS I B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegJSS1B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegJSS1B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("JSS II B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegJSS2B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegJSS2B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
        else if (Class.equals("SSS III B")) {
            DemotedClass = String.valueOf(String.valueOf(ClassDemotingto)) + " Demoted" + DemotionYear;
            try {
                final String QueryString = "UPDATE\tStudentRegSSS3B SET StdClass =? WHERE StdRegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tStudentRegSSS3B SET StdClass =? WHERE StdRegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been deomoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tdataentry SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Promotion", 1);
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverage SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubj SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamhousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\texamproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaformmastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcahousemastercomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaprincipalcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String QueryString = "UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tcaproprietorcomment SET Class =? WHERE RegNum = ?")).setString(1, DemotedClass);
                this.pstatement.setString(2, regnum);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = String.valueOf(String.valueOf(Class)) + " has been demoted to \n " + "( " + DemotedClass + " )" + " successfully.";
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
        }
    }
    
    public void btnViewMethod(final ActionEvent evt4) {
        this.txtname.setText("");
        final String currentClass = (String)this.ComboSelectClass.getSelectedItem();
        final String year = (String)this.ComboDemotionYear.getSelectedItem();
        final String regnum = this.txtRegNum.getText().toString();
        if (currentClass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "please, select class!", "Error occured", 0);
        }
        if (currentClass.equalsIgnoreCase("SSS1 A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss1a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss1a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("SSS2 A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss2a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss2a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("SSS3 A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss3a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss3a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("SSS1 B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss1B WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss1B WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("SSS2 B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss2B WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss2B WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("SSS3 B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregsss3B WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregsss3B WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS I A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss1a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss1a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS II A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss2a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss2a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS III A")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss3a WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss3a WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS I B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss1B WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss1B WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS II B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss2B WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss2B WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (currentClass.equalsIgnoreCase("JSS III B")) {
            try {
                final String QueryString = "SELECT StdName FROM studentregJss3b WHERE StdRegNum=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM studentregJss3b WHERE StdRegNum=?");
                pstatement.setString(1, regnum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String name = rs.getString(1);
                    this.txtname.setText(name);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
}
