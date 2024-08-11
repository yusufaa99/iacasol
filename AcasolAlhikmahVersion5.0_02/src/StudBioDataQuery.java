import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;
import java.io.OutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class StudBioDataQuery extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panelPic;
    private ImageIcon imIcon;
    private JLabel lblStudName;
    private JLabel lblStudRegNum;
    private JLabel lblStudClass;
    private JLabel lblParentPhone;
    private JButton btnGetPicture;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblHeader3;
    private ImageIcon lblImage;
    private JLabel lblCenterIcon;
    private JTextField txtStudName;
    private JTextField txtStudRegNum;
    private JTextField txtStudClass;
    private JTextField txtParentPhone;
    private JButton btnExit;
    private JButton btnSearch;
    private JButton btnClear;
    private JButton btnViewRegNum;
    private JLabel lblStudPic;
    private JLabel RetrievelblStudPic;
    private JLabel plbl;
    private ImageIcon ImageStudPic;
    private ImageIcon icon;
    Image image;
    private ImageIcon RetrieveImageStudPic;
    ImageIcon OpenIcon;
    private JLabel lblStdNameBio;
    private JLabel lblStdRegNumBio;
    private JLabel lblDOB;
    private JLabel lblPlaceOfBirth;
    private JLabel lblStateOfOrigin;
    private JLabel lblLGA;
    private JLabel lblNationality;
    private JLabel lblPreviousSchInfo;
    private JLabel lblPrimarySch;
    private JLabel lblYear;
    private JLabel lblYearOfAdmsIntoCIS;
    private JLabel lblPresentClass;
    private JLabel lblExpectedYearOfGrad;
    private JLabel lblParentInfo;
    private JLabel lblPresentAddress;
    private JLabel lblGSM;
    private JLabel lblWorkingPlace;
    private JLabel lblHealthInfo;
    private JLabel lblHistoryOfSickness;
    private JLabel lblAnyOtherSickness;
    private JLabel lblOfficialUse;
    private JLabel lblPrincipalRemark;
    private JButton btnExitBio;
    private JButton btnSaveBio;
    private JButton btnClearBio;
    private JButton btnViewRegNumBio;
    private JButton btnPrint;
    private JTextField txtStdNameBio;
    private JTextField txtStdRegNumBio;
    private JTextField txtDOB;
    private JTextField txtPlaceOfBirth;
    private JComboBox ComboStateOfOrigin;
    private JComboBox ComboLGA;
    private JComboBox ComboNationality;
    private JTextField txtPreviousSchInfo;
    private JTextField txtPrimarySch;
    private JTextField txtYear;
    private JTextField txtYearOfAdmsIntoCIS;
    private JTextField txtPresentClass;
    private JTextField txtExpectedYearOfGrad;
    private JTextField txtParentInfo;
    private JTextField txtPresentAddress;
    private JTextField txtGSM;
    private JTextField txtWorkingPlace;
    private JTextField txtHealthInfo;
    private JTextField txtHistoryOfSickness;
    private JTextField txtAnyOtherSickness;
    private JTextField txtOfficialUse;
    private JTextField txtPrincipalRemark;
    private JComboBox ComboClass;
    private JLabel lbltest;
    String StudClass;
    String myClass;
    String StudRegNum;
    
    public StudBioDataQuery() {
        this.StudClass = "";
        this.myClass = "";
        final Border TB = new TitledBorder("A. Current Student Registration Information");
        final Border TB2 = new TitledBorder("B. Student and Parent Information");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.panelPic = new JPanel();
        this.panel2.setBorder(TB);
        this.panel3.setBorder(TB2);
        this.lblStudName = new JLabel("STUDENT NAME:");
        this.lblStudRegNum = new JLabel("REG. NUMBER:");
        this.lblStudClass = new JLabel("STUDENT CLASS:");
        this.lblParentPhone = new JLabel("PARENT PHONE NO:");
        this.lblImage = new ImageIcon("logo.gif");
        this.lblCenterIcon = new JLabel(this.lblImage);
        this.lblHeader1 = new JLabel("ACASSOL SOFT");
        this.lblHeader2 = new JLabel("COMPUTERIZED CONTINUOUS ASSESSMENT");
        this.lblHeader3 = new JLabel("AND REPORTSHEET SYSTEM");
        this.txtStudName = new JTextField(17);
        this.txtStudRegNum = new JTextField(17);
        this.txtStudClass = new JTextField(15);
        this.txtParentPhone = new JTextField(15);
        this.btnGetPicture = new JButton("Photo");
        this.lblStudPic = new JLabel(this.ImageStudPic);
        this.RetrievelblStudPic = new JLabel(this.RetrieveImageStudPic);
        this.plbl = new JLabel();
        this.btnExit = new JButton("Close");
        this.btnSearch = new JButton("Search");
        this.btnClear = new JButton("Clear");
        this.btnViewRegNum = new JButton("View RegNum");
        this.lbltest = new JLabel("test");
        this.lblStdNameBio = new JLabel("STUDENT NAME:");
        this.lblStdRegNumBio = new JLabel("REG. NUMBER:");
        this.lblDOB = new JLabel("DATE OF BIRTH:");
        this.lblPlaceOfBirth = new JLabel("PLACE OF BIRTH");
        this.lblStateOfOrigin = new JLabel("STATE OF ORIGIN:");
        this.lblLGA = new JLabel("L.G.A:");
        this.lblNationality = new JLabel("NATIONATIONAL:");
        this.lblPreviousSchInfo = new JLabel("PREVIOUS SCHOOL INFO:");
        this.lblPrimarySch = new JLabel("PRIMARY SCHOOL ATTENDED:");
        this.lblYear = new JLabel("YEAR GRADUATED:");
        this.lblYearOfAdmsIntoCIS = new JLabel("YEAR OF ADM INTO C.I.S.:");
        this.lblPresentClass = new JLabel("CLASS:");
        this.lblExpectedYearOfGrad = new JLabel("EXPT. YEAR OF GRAD. FROM CIS:");
        this.lblParentInfo = new JLabel("PARENT INFORMATON:");
        this.lblPresentAddress = new JLabel("PRESENT PARENT ADDRESS:");
        this.lblGSM = new JLabel("G.S.M.:");
        this.lblWorkingPlace = new JLabel("WORKING PLACE:");
        this.lblHealthInfo = new JLabel("HEALTH INFORMATION:");
        this.lblHistoryOfSickness = new JLabel("HISTORY OF SICKNESS:");
        this.lblAnyOtherSickness = new JLabel("ANY OTHER SICKNESS:");
        this.lblOfficialUse = new JLabel("FOR OFFICIAL USE:");
        this.lblPrincipalRemark = new JLabel("PRINCIPAL REMARKS:");
        this.btnExitBio = new JButton("Close");
        this.btnSaveBio = new JButton("Submit");
        this.btnClearBio = new JButton("Reset");
        this.btnPrint = new JButton("Print");
        this.txtStdNameBio = new JTextField(18);
        this.txtStdRegNumBio = new JTextField(18);
        this.txtDOB = new JTextField(11);
        this.txtPlaceOfBirth = new JTextField(6);
        (this.ComboStateOfOrigin = new JComboBox()).addItem("SELECT STATE");
        this.ComboStateOfOrigin.addItem("ABUJA");
        this.ComboStateOfOrigin.addItem("ADAMAWA");
        this.ComboStateOfOrigin.addItem("ANAMBRA");
        this.ComboStateOfOrigin.addItem("AKWA IBOM");
        this.ComboStateOfOrigin.addItem("ABIA");
        this.ComboStateOfOrigin.addItem("BAUCHI");
        this.ComboStateOfOrigin.addItem("ENUGU");
        this.ComboStateOfOrigin.addItem("EBONYI");
        this.ComboStateOfOrigin.addItem("EDO");
        this.ComboStateOfOrigin.addItem("EKITI");
        this.ComboStateOfOrigin.addItem("BAYELSA");
        this.ComboStateOfOrigin.addItem("BENUE");
        this.ComboStateOfOrigin.addItem("BORNO");
        this.ComboStateOfOrigin.addItem("CROSS RIVER");
        this.ComboStateOfOrigin.addItem("DELTA");
        this.ComboStateOfOrigin.addItem("GOMBE");
        this.ComboStateOfOrigin.addItem("IMO");
        this.ComboStateOfOrigin.addItem("JIGAWA");
        this.ComboStateOfOrigin.addItem("KADUNA");
        this.ComboStateOfOrigin.addItem("KANO");
        this.ComboStateOfOrigin.addItem("KATSINA");
        this.ComboStateOfOrigin.addItem("KEBBI");
        this.ComboStateOfOrigin.addItem("KOGI");
        this.ComboStateOfOrigin.addItem("KWARA");
        this.ComboStateOfOrigin.addItem("LAGOS");
        this.ComboStateOfOrigin.addItem("NASARAWA");
        this.ComboStateOfOrigin.addItem("NIGER");
        this.ComboStateOfOrigin.addItem("ONDO");
        this.ComboStateOfOrigin.addItem("OGUN");
        this.ComboStateOfOrigin.addItem("OSUN");
        this.ComboStateOfOrigin.addItem("PLATAUE");
        this.ComboStateOfOrigin.addItem("RIVERS");
        this.ComboStateOfOrigin.addItem("SOKOTO");
        this.ComboStateOfOrigin.addItem("TARABA");
        this.ComboStateOfOrigin.addItem("YOBE");
        this.ComboStateOfOrigin.addItem("ZAMFARA");
        this.ComboStateOfOrigin.addItem("");
        this.ComboStateOfOrigin.setEditable(true);
        (this.ComboLGA = new JComboBox()).addItem("SELECT LGA");
        this.ComboLGA.setEditable(true);
        (this.ComboNationality = new JComboBox()).addItem("SELECT NATIONALITY");
        this.ComboNationality.addItem("NIGERIAN");
        this.ComboNationality.setEditable(true);
        this.txtPreviousSchInfo = new JTextField(25);
        this.txtPrimarySch = new JTextField(10);
        this.txtYear = new JTextField(6);
        this.txtYearOfAdmsIntoCIS = new JTextField(10);
        this.txtPresentClass = new JTextField(12);
        this.txtExpectedYearOfGrad = new JTextField(10);
        this.txtParentInfo = new JTextField(25);
        this.txtPresentAddress = new JTextField(8);
        this.txtGSM = new JTextField(15);
        this.txtWorkingPlace = new JTextField(28);
        this.txtHealthInfo = new JTextField(28);
        this.txtHistoryOfSickness = new JTextField("if any", 28);
        this.txtAnyOtherSickness = new JTextField("if any", 28);
        this.txtOfficialUse = new JTextField(25);
        this.txtPrincipalRemark = new JTextField(28);
        (this.ComboClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboClass.addItem("SSS1 C");
        this.ComboClass.addItem("SSS2 C");
        this.ComboClass.addItem("SSS3 C");
        this.ComboClass.addItem("SSS1 D");
        this.ComboClass.addItem("SSS2 D");
        this.ComboClass.addItem("SSS3 D");
        this.ComboClass.addItem("JSS I C");
        this.ComboClass.addItem("JSS II C");
        this.ComboClass.addItem("JSS III C");
        this.ComboClass.addItem("JSS I D");
        this.ComboClass.addItem("JSS II D");
        this.ComboClass.addItem("JSS III D");
        this.ComboClass.setEditable(false);
        this.icon = new ImageIcon();
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(575, 705);
        this.setTitle("Student Biodata Query Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.panel2.setBackground(Color.pink.darker());
        this.panel3.setBackground(Color.white);
        this.btnGetPicture.setBackground(Color.green);
        this.panel.setLayout(new GridBagLayout());
        this.panel.setBackground(Color.LIGHT_GRAY);
        this.panel2.setLayout(new GridBagLayout());
        this.panel3.setLayout(new GridBagLayout());
        this.panelPic.setLayout(new GridBagLayout());
        this.addItem(this.panel, this.lblCenterIcon, 0, 0, 3, 3, 10);
        this.addItem(this.panel, this.panel2, 0, 3, 3, 1, 10);
        this.addItem(this.panel2, this.lblStudRegNum, 0, 0, 1, 1, 13);
        this.addItem(this.panel2, this.txtStudRegNum, 1, 0, 1, 1, 17);
        this.addItem(this.panel2, this.lblStudName, 0, 1, 1, 1, 13);
        this.addItem(this.panel2, this.txtStudName, 1, 1, 1, 1, 17);
        this.addItem(this.panel2, this.lblStudClass, 0, 2, 1, 1, 13);
        this.addItem(this.panel2, this.ComboClass, 1, 2, 1, 1, 17);
        this.addItem(this.panel2, this.panel3, 0, 4, 4, 1, 10);
        this.addItem(this.panel3, this.lblDOB, 0, 2, 1, 1, 13);
        final Box DOBBox = Box.createHorizontalBox();
        DOBBox.add(this.txtDOB);
        DOBBox.add(Box.createHorizontalStrut(5));
        DOBBox.add(this.lblPlaceOfBirth);
        DOBBox.add(Box.createHorizontalStrut(5));
        DOBBox.add(this.txtPlaceOfBirth);
        this.addItem(this.panel3, DOBBox, 1, 2, 1, 1, 17);
        this.addItem(this.panel3, this.lblStateOfOrigin, 0, 4, 1, 1, 13);
        final Box LGABox = Box.createHorizontalBox();
        LGABox.add(this.ComboStateOfOrigin);
        LGABox.add(Box.createHorizontalStrut(5));
        LGABox.add(this.lblLGA);
        LGABox.add(Box.createHorizontalStrut(5));
        LGABox.add(this.ComboLGA);
        this.addItem(this.panel3, LGABox, 1, 4, 1, 1, 17);
        this.addItem(this.panel3, this.lblNationality, 0, 6, 1, 1, 13);
        this.addItem(this.panel3, this.ComboNationality, 1, 6, 1, 1, 17);
        this.addItem(this.panel3, this.lblPrimarySch, 0, 7, 1, 1, 13);
        final Box YEARBox = Box.createHorizontalBox();
        YEARBox.add(this.txtPrimarySch);
        YEARBox.add(Box.createHorizontalStrut(5));
        YEARBox.add(this.lblYear);
        YEARBox.add(Box.createHorizontalStrut(5));
        YEARBox.add(this.txtYear);
        this.addItem(this.panel3, YEARBox, 1, 7, 1, 1, 17);
        this.addItem(this.panel3, this.lblYearOfAdmsIntoCIS, 0, 9, 1, 1, 13);
        final Box YearOfAdmsBox = Box.createHorizontalBox();
        YearOfAdmsBox.add(this.txtYearOfAdmsIntoCIS);
        YearOfAdmsBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel3, YearOfAdmsBox, 1, 9, 1, 1, 17);
        this.addItem(this.panel3, this.lblExpectedYearOfGrad, 0, 11, 2, 1, 17);
        this.addItem(this.panel3, this.txtExpectedYearOfGrad, 1, 11, 1, 1, 17);
        this.addItem(this.panel3, this.lblPresentAddress, 0, 12, 2, 1, 17);
        final Box GSMBox = Box.createHorizontalBox();
        GSMBox.add(this.txtPresentAddress);
        GSMBox.add(Box.createHorizontalStrut(5));
        GSMBox.add(this.lblGSM);
        GSMBox.add(Box.createHorizontalStrut(5));
        GSMBox.add(this.txtGSM);
        this.addItem(this.panel3, GSMBox, 1, 12, 1, 1, 17);
        this.addItem(this.panel3, this.lblWorkingPlace, 0, 13, 1, 1, 13);
        this.addItem(this.panel3, this.txtWorkingPlace, 1, 13, 1, 1, 17);
        this.addItem(this.panel3, this.lblHistoryOfSickness, 0, 14, 1, 1, 13);
        this.addItem(this.panel3, this.txtHistoryOfSickness, 1, 14, 1, 1, 17);
        this.addItem(this.panel3, this.lblAnyOtherSickness, 0, 15, 1, 1, 13);
        this.addItem(this.panel3, this.txtAnyOtherSickness, 1, 15, 1, 1, 17);
        final Box ButtonBox = Box.createHorizontalBox();
        ButtonBox.add(this.btnSearch);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnPrint);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnExit);
        ButtonBox.add(Box.createHorizontalStrut(3));
        this.addItem(this.panel3, this.lblPrincipalRemark, 0, 16, 1, 1, 13);
        this.addItem(this.panel3, this.txtPrincipalRemark, 1, 16, 1, 1, 17);
        this.addItem(this.panel3, ButtonBox, 0, 17, 2, 1, 13);
        this.btnExit.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                StudBioDataQuery.this.btnExitMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                StudBioDataQuery.this.btnClearMethod(evt2);
            }
        });
        this.btnGetPicture.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                StudBioDataQuery.this.btnGetPictureMethod(evt3);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                StudBioDataQuery.this.connectToDB();
                StudBioDataQuery.this.SearchMethod(evt4);
            }
        });
        this.btnViewRegNum.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                StudBioDataQuery.this.connectToDB();
                StudBioDataQuery.this.btnViewIDMethod(evt5);
            }
        });
        this.ComboStateOfOrigin.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                StudBioDataQuery.this.connectToDB();
                StudBioDataQuery.this.ComboStateOfOriginMethod(evt6);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                StudBioDataQuery.this.btnPrintMethod(evt7);
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
        this.txtStudName.setText("");
        this.txtStudRegNum.setText("");
        this.txtStudClass.setText("");
        this.txtParentPhone.setText("");
        this.lblStudPic.setVisible(false);
        this.btnGetPicture.setVisible(true);
        this.txtDOB.setText("");
        this.txtPlaceOfBirth.setText("");
        this.ComboStateOfOrigin.setSelectedItem("SELECT STATE");
        this.ComboLGA.setSelectedItem("SELECT LGA");
        this.ComboNationality.setSelectedItem("SELECT NATIONALITY");
        this.txtPrimarySch.setText("");
        this.txtYear.setText("");
        this.txtYearOfAdmsIntoCIS.setText("");
        this.txtExpectedYearOfGrad.setText("");
        this.txtPresentAddress.setText("");
        this.txtGSM.setText("");
        this.txtWorkingPlace.setText("");
        this.txtHistoryOfSickness.setText("");
        this.txtAnyOtherSickness.setText("");
        this.txtPrincipalRemark.setText("");
        this.panel.revalidate();
        this.panel.repaint();
    }
    
    public void btnGetPictureMethod(final ActionEvent e3) {
        final JFileChooser fc = new JFileChooser();
        final int result = fc.showOpenDialog(null);
        File file = null;
        if (result == 0) {
            file = fc.getSelectedFile();
            final String PicName = file.getName();
            this.ImageStudPic = new ImageIcon(PicName);
            this.RetrievelblStudPic = new JLabel("", this.ImageStudPic, 0);
            this.btnGetPicture.setVisible(false);
            this.panel.revalidate();
            this.panel.repaint();
            JOptionPane.showMessageDialog(this.btnGetPicture, "Uploaded successfully !");
        }
        else if (result == 1) {
            JOptionPane.showMessageDialog(this.btnGetPicture, "Picture Upload is Canceled, Click on Clear and try again!");
        }
        else if (result == -1) {
            JOptionPane.showMessageDialog(this.btnGetPicture, "Error in Uploading Picture, Click on Clear and try again!");
        }
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/AcasolCIS";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AcasolCIS", "root", "ash123");
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
    
    public void SearchMethod(final ActionEvent evt4) {
        this.connectToDB();
        final String RegNum = this.txtStudRegNum.getText().toString();
        final String CLASS = this.ComboClass.getSelectedItem().toString();
        final String StudName = this.txtStudName.getText().toString();
        final String DOB = this.txtDOB.getText().toString();
        final String PlaceOfBith = this.txtPlaceOfBirth.getText().toString();
        final String State = this.ComboStateOfOrigin.getSelectedItem().toString();
        final String LGA = this.ComboLGA.getSelectedItem().toString();
        final String Nationality = this.ComboNationality.getSelectedItem().toString();
        final String PrimarySch = this.txtPrimarySch.getText().toString();
        final String YearGraduated = this.txtYear.getText().toString();
        final String YearOfAdmsIntoCIS = this.txtYearOfAdmsIntoCIS.getText().toString();
        final String ExpectedYearOfGrad = this.txtExpectedYearOfGrad.getText().toString();
        final String PresentAddress = this.txtPresentAddress.getText().toString();
        final String GSM = this.txtGSM.getText().toString();
        final String WorkingPlace = this.txtWorkingPlace.getText().toString();
        final String HistoryOfSickness = this.txtHistoryOfSickness.getText().toString();
        final String AnyOtherSickness = this.txtAnyOtherSickness.getText().toString();
        final String PrincipalRemark = this.txtPrincipalRemark.getText().toString();
        try {
            final String QueryString = "SELECT StdName,StdClass,DOB,PlaceOfBirth,State,LGA,Nationality,PrimarySch,YearOfGrad,YearOfAdmsIntoCIS,ExpYearOfGrad,ParentAddress,GSM,WorkingPlace,HistoryOfSickness,AnyOtherSickness,PrincipalRemarks,StdPicture FROM alcaresreg WHERE StdRegNum =?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName,StdClass,DOB,PlaceOfBirth,State,LGA,Nationality,PrimarySch,YearOfGrad,YearOfAdmsIntoCIS,ExpYearOfGrad,ParentAddress,GSM,WorkingPlace,HistoryOfSickness,AnyOtherSickness,PrincipalRemarks,StdPicture FROM alcaresreg WHERE StdRegNum =?");
            pstatement.setString(1, RegNum);
            final ResultSet rs = pstatement.executeQuery();
            final int i = 0;
            while (rs.next()) {
                final String StdName = rs.getString(1);
                final String Class = rs.getString(2);
                final String myDOB = rs.getString(3);
                final String POB = rs.getString(4);
                final String myState = rs.getString(5);
                final String myLGA = rs.getString(6);
                final String Nation = rs.getString(7);
                final String PrimarySchool = rs.getString(8);
                final String Year = rs.getString(9);
                final String YearOfAdmIntoCIS = rs.getString(10);
                final String ExpYeaOfGrad = rs.getString(11);
                final String ParentAdd = rs.getString(12);
                final String myGSM = rs.getString(13);
                final String WorkPalce = rs.getString(14);
                final String HistoryOfSicknes = rs.getString(15);
                final String AnyOtherSicknes = rs.getString(16);
                final String PrincipalRemk = rs.getString(17);
                final Blob aBlob = rs.getBlob("StdPicture");
                final InputStream is = aBlob.getBinaryStream(1L, aBlob.length());
                final Image image;
                final BufferedImage imag = (BufferedImage)(image = ImageIO.read(is));
                final ImageIcon iconn = new ImageIcon(image);
                final OutputStream f = new FileOutputStream(new File("StdPicture0.png"));
                final Blob blob = rs.getBlob("StdPicture");
                this.txtStudName.setText(StdName);
                this.ComboClass.setSelectedItem(Class);
                this.txtDOB.setText(myDOB);
                this.txtPlaceOfBirth.setText(POB);
                this.ComboStateOfOrigin.setSelectedItem(myState);
                this.ComboLGA.setSelectedItem(myLGA);
                this.ComboNationality.setSelectedItem(Nation);
                this.txtPrimarySch.setText(PrimarySchool);
                this.txtYear.setText(Year);
                this.txtYearOfAdmsIntoCIS.setText(YearOfAdmIntoCIS);
                this.txtExpectedYearOfGrad.setText(ExpYeaOfGrad);
                this.txtPresentAddress.setText(ParentAdd);
                this.txtGSM.setText(myGSM);
                this.txtWorkingPlace.setText(WorkPalce);
                this.txtHistoryOfSickness.setText(HistoryOfSicknes);
                this.txtAnyOtherSickness.setText(AnyOtherSicknes);
                this.txtPrincipalRemark.setText(PrincipalRemk);
                this.RetrievelblStudPic = new JLabel();
                this.panel2.setBackground(Color.white);
                this.panel.repaint();
                this.panel2.revalidate();
                this.panel2.repaint();
                this.lblStudPic.setIcon(iconn);
                this.repaint();
                this.lblStudPic.repaint();
                this.addItem(this.panel2, this.lblStudPic, 2, 0, 2, 2, 13);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void btnViewIDMethod(final ActionEvent evt5) {
        this.txtStudRegNum.setText("");
        final String StudentName = this.txtStudName.getText().toString();
        final String DOB = this.txtDOB.getText().toString();
        final String Class = (String)this.ComboClass.getSelectedItem();
        if (this.txtStudName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, Enter Student Name", "Class Selection Error", 0);
        }
        try {
            final String QueryString = "SELECT StdRegNum FROM alcaresreg WHERE StdName =? AND DOB =?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum FROM alcaresreg WHERE StdName =? AND DOB =?");
            pstatement.setString(1, StudentName);
            pstatement.setString(2, DOB);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final int RegNum = rs.getInt(1);
                this.txtStudRegNum.setText(String.format("%04d", RegNum));
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
    
    public void ComboStateOfOriginMethod(final ActionEvent evt6) {
        if (evt6.getSource() == this.ComboStateOfOrigin) {
            final String cso = (String)this.ComboStateOfOrigin.getSelectedItem();
            if (cso.equals("ZAMFARA")) {
                this.ComboLGA.removeAllItems();
                this.ComboLGA.addItem("SELECT LGA");
                this.ComboLGA.addItem("ANKA");
                this.ComboLGA.addItem("BAKURA");
                this.ComboLGA.addItem("BUNGUDU");
                this.ComboLGA.addItem("BUKKUYUM");
                this.ComboLGA.addItem("BIRNIN MAGAJI");
                this.ComboLGA.addItem("GUSAU");
                this.ComboLGA.addItem("GUMMI");
                this.ComboLGA.addItem("MARU");
                this.ComboLGA.addItem("KAURA NAMODA");
                this.ComboLGA.addItem("TALATA MAFARA");
                this.ComboLGA.addItem("MARADUN");
                this.ComboLGA.addItem("TSAFE");
                this.ComboLGA.addItem("SHINKAFI");
                this.ComboLGA.addItem("ZURMI");
            }
        }
        else {
            this.ComboLGA.removeAllItems();
            this.ComboLGA.setSelectedItem("SELECT LGA");
        }
        this.panel3.repaint();
        this.panel3.revalidate();
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        this.btnSearch.setVisible(false);
        this.btnClear.setVisible(false);
        this.btnExit.setVisible(false);
        this.btnPrint.setVisible(false);
        this.btnViewRegNum.setVisible(false);
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.panel);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.panel);
        this.btnSearch.setVisible(true);
        this.btnClear.setVisible(true);
        this.btnExit.setVisible(true);
        this.btnPrint.setVisible(true);
        this.btnViewRegNum.setVisible(true);
    }
    
    public static void main(final String[] args) {
        new StudBioDataQuery();
    }
}
