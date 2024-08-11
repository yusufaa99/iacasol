import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Color;
import javax.swing.Icon;
import java.util.Calendar;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class StaffMiniDataCapture extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblStaffName;
    private JLabel lblStaffCategory;
    private JLabel lblStaffNo;
    private JLabel lblStaffSalary;
    private JLabel lblStaffId;
    private JLabel lblStaffRank;
    private JLabel lblParentPhone;
    private JButton btnGetSignature;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblHeader3;
    private ImageIcon lblImage;
    private JLabel lblCenterIcon;
    private JTextField txtStaffName;
    private JTextField txtStaffID;
    private JComboBox ComboStaffCategory;
    private JTextField txtStaffNo;
    private JTextField txtStaffSalary;
    private JTextField txtStudClass;
    private JTextField txtParentPhone;
    private JButton btnExit;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnViewID;
    private JLabel lblStaffSign;
    private ImageIcon ImageStaffSignature;
    private JButton btnStudentDataCapture;
    ImageIcon OpenIcon;
    private JComboBox CombolblStaffRank;
    private JLabel lbltest;
    String StudClass;
    String myClass;
    private JDateChooser picker;
    private JLabel lblDateofEmployment;
    
    public StaffMiniDataCapture() {
        this.StudClass = "";
        this.myClass = "";
    }
    
    public void StaffMiniDataCapture() {
        final Font f = new Font(null, 1, 18);
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.lblStaffName = new JLabel("STAFF NAME:");
        this.lblStaffId = new JLabel("STAFF ID:");
        this.lblStaffNo = new JLabel("STAFF NO:");
        this.lblStaffSalary = new JLabel("STAFF SALARY: N");
        this.lblStaffCategory = new JLabel("STAFF CATEGORY:");
        this.lblStaffRank = new JLabel("STAFF POSITION:");
        this.lblParentPhone = new JLabel("Parent Phone No:");
        this.lblImage = new ImageIcon("logo.gif");
        this.lblCenterIcon = new JLabel(this.lblImage);
        this.lblHeader1 = new JLabel("ACASSOL SOFT");
        this.lblHeader2 = new JLabel("AUTOMATED CONTINUOUS ASSESSMENT");
        this.lblHeader3 = new JLabel("AND REPORTSHEET SYSTEM");
        this.btnStudentDataCapture = new JButton("Student Data Capture");
        (this.txtStaffName = new JTextField(25)).setFont(f);
        (this.txtStaffID = new JTextField(15)).setFont(f);
        (this.txtStaffNo = new JTextField(15)).setFont(f);
        (this.txtStaffSalary = new JTextField(15)).setFont(f);
        this.txtStaffSalary.setForeground(Color.RED);
        this.txtStaffID.setEditable(false);
        this.txtStudClass = new JTextField(15);
        this.txtParentPhone = new JTextField(15);
        this.btnGetSignature = new JButton("Append Signature");
        this.lblStaffSign = new JLabel(this.ImageStaffSignature);
        this.lblDateofEmployment = new JLabel("DATE OF EMPLOYMENT: ");
        this.btnExit = new JButton("Exit");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnViewID = new JButton("View Staff ID");
        this.lbltest = new JLabel("test");
        (this.ComboStaffCategory = new JComboBox()).setFont(f);
        this.ComboStaffCategory.addItem("SELECT CATEGORY");
        this.ComboStaffCategory.addItem("TEACHING STAFF");
        this.ComboStaffCategory.addItem("NONE TEACHING STAFF");
        this.ComboStaffCategory.setEditable(true);
        (this.CombolblStaffRank = new JComboBox()).setFont(f);
        this.CombolblStaffRank.addItem("SELECT POSITION");
        this.CombolblStaffRank.addItem("PROPRIETOR");
        this.CombolblStaffRank.addItem("DIRECTOR");
        this.CombolblStaffRank.addItem("PROPRIETRESS");
        this.CombolblStaffRank.addItem("PRINCIPAL");
        this.CombolblStaffRank.addItem("CLASS TEACHER");
        this.CombolblStaffRank.addItem("HEAD TEACHER");
        this.CombolblStaffRank.addItem("SCHOOL MOTHER");
        this.CombolblStaffRank.addItem("HOUSE MASTER");
        this.CombolblStaffRank.addItem("HOUSE MASTER");
        this.CombolblStaffRank.addItem("HOUSE MSSTRESS");
        this.CombolblStaffRank.addItem("FORM MASTER");
        this.CombolblStaffRank.addItem("SUBJECT TEACHER");
        this.CombolblStaffRank.addItem("CLASS TEACHER");
        this.CombolblStaffRank.addItem("SOFTWARE DEVELOPER");
        this.CombolblStaffRank.addItem("DATABASE ADMINISTRATOR");
        this.CombolblStaffRank.addItem("NANNY");
        this.CombolblStaffRank.addItem("SECURITY");
        this.CombolblStaffRank.addItem("OTHERS");
        this.CombolblStaffRank.setEditable(true);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(620, 380);
        this.setTitle("Staff Data Capture Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnExit.setBackground(Color.red);
        this.btnGetSignature.setBackground(Color.green);
        this.btnViewID.setBackground(Color.red);
        this.btnStudentDataCapture.setBackground(Color.black);
        this.btnStudentDataCapture.setForeground(Color.WHITE);
        this.panel.setLayout(new GridBagLayout());
        final Box SDC = Box.createHorizontalBox();
        SDC.add(this.btnStudentDataCapture);
        SDC.setBorder(BorderFactory.createTitledBorder("STUDENT DATA CAPTURE:"));
        this.addItem(this.panel, this.lblStaffName, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffName, 1, 6, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffId, 0, 7, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffID, 1, 7, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffCategory, 0, 8, 1, 1, 13);
        this.addItem(this.panel, this.ComboStaffCategory, 1, 8, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffNo, 0, 9, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffNo, 1, 9, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffRank, 0, 10, 1, 1, 13);
        this.addItem(this.panel, this.CombolblStaffRank, 1, 10, 1, 1, 17);
        this.addItem(this.panel, this.lblDateofEmployment, 0, 11, 1, 1, 13);
        this.addItem(this.panel, (JComponent)this.picker, 1, 11, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffSalary, 0, 12, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffSalary, 1, 12, 1, 1, 17);
        final Box ButtonBox = Box.createHorizontalBox();
        ButtonBox.add(this.btnViewID);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnSave);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnClear);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnExit);
        ButtonBox.add(Box.createHorizontalStrut(3));
        this.addItem(this.panel, ButtonBox, 1, 14, 2, 1, 13);
        this.addItem(this.panel, this.lblStaffSign, 0, 13, 3, 3, 13);
        this.btnExit.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                StaffMiniDataCapture.this.btnExitMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                StaffMiniDataCapture.this.btnClearMethod(evt2);
            }
        });
        this.btnGetSignature.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                StaffMiniDataCapture.this.btnGetSignatureMethod(evt3);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                StaffMiniDataCapture.this.connectToDB();
                StaffMiniDataCapture.this.SaveMethod(evt4);
            }
        });
        this.btnViewID.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                StaffMiniDataCapture.this.connectToDB();
                StaffMiniDataCapture.this.btnViewIDMethod(evt5);
            }
        });
        this.ComboStaffCategory.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                StaffMiniDataCapture.this.connectToDB();
                StaffMiniDataCapture.this.ComboStaffCategoryMethod(evt6);
            }
        });
        this.btnStudentDataCapture.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                StaffMiniDataCapture.this.btnStudentDataCaptureMethod(evt8);
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
    
    public void btnExitMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.txtStaffName.setText("");
        this.txtStaffID.setText("");
        this.txtStudClass.setText("");
        this.txtParentPhone.setText("");
        this.lblStaffSign.setVisible(false);
        this.btnGetSignature.setVisible(true);
    }
    
    public void btnGetSignatureMethod(final ActionEvent e3) {
        final JFileChooser fc = new JFileChooser();
        final int result = fc.showOpenDialog(null);
        File file = null;
        if (result == 0) {
            file = fc.getSelectedFile();
            final String PicName = file.getName();
            this.ImageStaffSignature = new ImageIcon(PicName);
            this.lblStaffSign = new JLabel("", this.ImageStaffSignature, 0);
            this.addItem(this.panel, this.lblStaffSign, 1, 4, 2, 2, 13);
            this.btnGetSignature.setVisible(false);
            this.panel.revalidate();
            this.panel.repaint();
            JOptionPane.showMessageDialog(this.btnGetSignature, "Uploaded successfully !");
        }
        else if (result == 1) {
            JOptionPane.showMessageDialog(this.btnGetSignature, "Picture Upload is Canceled, Click on Clear and try again!");
        }
        else if (result == -1) {
            JOptionPane.showMessageDialog(this.btnGetSignature, "Error in Uploading Picture, Click on Clear and try again!");
        }
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
    
    public void SaveMethod(final ActionEvent evt3) {
        this.connectToDB();
        final String StaffName = this.txtStaffName.getText().toString();
        final String StaffNo = this.txtStaffNo.getText().toString();
        final String staffID = null;
        final String category = (String)this.ComboStaffCategory.getSelectedItem();
        final String StaffPosition = (String)this.CombolblStaffRank.getSelectedItem();
        final ImageIcon imag = this.ImageStaffSignature;
        final Double StaffSalary = Double.parseDouble(this.txtStaffSalary.getText().toString());
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        String mystaffNo = "";
        String mystaffcategory = "";
        try {
            final String QueryString = "SELECT StaffNo,StaffCategory  FROM staffdatacapture WHERE StaffNo =? AND StaffCategory=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StaffNo,StaffCategory  FROM staffdatacapture WHERE StaffNo =? AND StaffCategory=?");
            pstatement.setString(1, StaffNo);
            pstatement.setString(2, category);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                mystaffNo = rs.getString(1);
                mystaffcategory = rs.getString(2);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (StaffNo.equalsIgnoreCase(mystaffNo) && category.equalsIgnoreCase(mystaffcategory)) {
            JOptionPane.showMessageDialog(null, "Please, this Staff No. has been assigned to a different staff", "Error", 0);
        }
        else if (category.equals("SELECT CATEGORY")) {
            JOptionPane.showMessageDialog(null, "Please, select CATEGORY", "Error", 0);
        }
        else if (StaffName.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter staff name", "Error", 0);
        }
        else if (StaffPosition.equalsIgnoreCase("SELECT POSITION")) {
            JOptionPane.showMessageDialog(null, "Please, select position", "Error", 0);
        }
        else if (StaffSalary.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter staff salary", "Error", 0);
        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO staffdatacapture VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE StaffName=VALUES(StaffName),StaffCategory=VALUES(StaffCategory),StaffPosition=VALUES(StaffPosition),StaffSalary=VALUES(StaffSalary)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO staffdatacapture VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE StaffName=VALUES(StaffName),StaffCategory=VALUES(StaffCategory),StaffPosition=VALUES(StaffPosition),StaffSalary=VALUES(StaffSalary)");
                pstatement.setString(1, StaffName);
                pstatement.setString(2, staffID);
                pstatement.setString(3, category);
                pstatement.setString(4, StaffNo);
                pstatement.setString(5, StaffPosition);
                pstatement.setString(6, Date);
                pstatement.setDouble(7, StaffSalary);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StaffName)) + "  is registered with Staff No: " + StaffNo + " and Salary: " + StaffSalary);
                final String RegNu = this.txtStaffID.getText().toString();
                this.txtStaffID.setText(RegNu);
                this.panel.repaint();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StaffName)) + "  not registered: Server Error," + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        this.btnViewIDMethod(evt3);
    }
    
    public void btnViewIDMethod(final ActionEvent evt5) {
        this.txtStaffID.setText("");
        final String StaffName = this.txtStaffName.getText().toString();
        final String StaffNo = this.txtStaffNo.getText().toString();
        final String Position = (String)this.CombolblStaffRank.getSelectedItem();
        if (this.txtStaffNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, Enter Staff No.", "Class Selection Error", 0);
        }
        else if (Position.equals("SELECT POSITION")) {
            JOptionPane.showMessageDialog(null, "Please, Enter Staff No.", "Class Selection Error", 0);
        }
        try {
            final String QueryString = "SELECT StaffID FROM staffdatacapture WHERE StaffNo =? AND StaffPosition =?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StaffID FROM staffdatacapture WHERE StaffNo =? AND StaffPosition =?");
            pstatement.setString(1, StaffNo);
            pstatement.setString(2, Position);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final int RegNum = rs.getInt(1);
                this.txtStaffID.setText(String.format("%04d", RegNum));
                this.panel.repaint();
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ComboStaffCategoryMethod(final ActionEvent evt9) {
        String staffnumberInitials = "";
        if (evt9.getSource() == this.ComboStaffCategory) {
            final String csc = (String)this.ComboStaffCategory.getSelectedItem();
            if (csc.equals("TEACHING STAFF")) {
                staffnumberInitials = "BIRIA/TS/";
                this.txtStaffNo.setText(staffnumberInitials);
            }
            else if (csc.equals("NONE TEACHING STAFF")) {
                staffnumberInitials = "BIRIA/NTS/";
                this.txtStaffNo.setText(staffnumberInitials);
            }
        }
    }
    
    public void btnStudentDataCaptureMethod(final ActionEvent evt8) {
        final StudentReg SR = new StudentReg();
        SR.StudentReg();
    }
}
