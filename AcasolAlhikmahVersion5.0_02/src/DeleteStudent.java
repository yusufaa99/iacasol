import java.util.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
import java.awt.Component;
import java.awt.Color;
import javax.swing.Icon;
import java.util.Calendar;
import java.awt.Font;
import javax.swing.border.TitledBorder;
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

public class DeleteStudent<StreamedContent> extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panelPic;
    private JLabel lblStudName;
    private JLabel lblStudID;
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
    private JTextField txtStudID;
    private JTextField txtStudRegNum;
    private JTextField txtStudClass;
    private JTextField txtParentPhone;
    private JButton btnExit;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnViewRegNum;
    private JLabel lblStudPic;
    private ImageIcon ImageStudPic;
    String pulledClassName_Eng;
    ImageIcon OpenIcon;
    private JLabel lblStdNameBio;
    private JLabel lblStdRegNumBio;
    private JLabel lblDOB;
    private JLabel lblSEX;
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
    private JLabel lblMedicalHistory;
    private JLabel lblBloodGroup;
    private JLabel lblGenoType;
    private JLabel lblPreviousShool;
    private JLabel lblPreviousClass;
    private JLabel lblClassSought;
    private JLabel lblParentName;
    private JLabel lblParentNationality;
    private JLabel lblParentState;
    private JLabel lblParentLGA;
    private JLabel lblParentHomeAddress;
    private JLabel lblParentOfficeAddress;
    private JLabel lblParentOccupation;
    private JLabel lblParentGSM;
    private JLabel lblAnyOtherSickness;
    private JLabel lblOfficialUse;
    private JLabel lblPrincipalRemark;
    private JButton btnExitBio;
    private JButton btnSaveBio;
    private JButton btnClearBio;
    private JButton btnViewRegNumBio;
    private JButton btnViewInfo;
    private JButton btnDelete;
    private JTextField txtStdNameBio;
    private JTextField txtStdRegNumBio;
    private JTextField txtDOB;
    private JTextField txtSEX;
    private JTextField txtPlaceOfBirth;
    private JComboBox ComboStateOfOrigin;
    private JComboBox ComboSEX;
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
    private JTextField txtMedicalHistory;
    private JTextField txtBloodGroup;
    private JTextField txtGenoType;
    private JTextField txtPreviousShool;
    private JTextField txtPreviousClass;
    private JTextField txtClassSought;
    private JTextField txtParentName;
    private JTextField txtParentNationality;
    private JTextField txtParentState;
    private JTextField txtParentLGA;
    private JTextField txtParentHomeAddress;
    private JTextField txtParentOfficeAddress;
    private JTextField txtParentOccupation;
    private JTextField txtParentGSM;
    private JTextField txtAnyOtherSickness;
    private JTextField txtOfficialUse;
    private JTextField txtPrincipalRemark;
    private JComboBox ComboClass;
    private JLabel lbltest;
    String StudClass;
    String myClass;
    String StudID;
    private StreamedContent myImage;
    private JDateChooser picker;
    
    public DeleteStudent() {
        this.pulledClassName_Eng = "";
        this.StudClass = "";
        this.myClass = "";
    }
    
    public void DeleteStudent() {
        final Border TB = new TitledBorder("A. Current Student Registration Information");
        final Border TB2 = new TitledBorder("B. Student and Parent Information");
        final Font f = new Font(null, 1, 20);
        final Font f2 = new Font("Arial Unicode MS", 1, 18);
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.panelPic = new JPanel();
        this.panel2.setBorder(TB);
        this.panel3.setBorder(TB2);
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.lblStudName = new JLabel("STUDENT NAME:");
        this.lblStudID = new JLabel("STUDENT ID:");
        this.lblStudRegNum = new JLabel("REG. NUMBER:");
        this.lblStudClass = new JLabel("STUDENT CLASS:");
        this.lblParentPhone = new JLabel("PARENT PHONE NO:");
        this.lblImage = new ImageIcon("logo2.jpg");
        this.lblCenterIcon = new JLabel(this.lblImage);
        this.lblHeader1 = new JLabel("ACASSOL SOFT");
        this.lblHeader2 = new JLabel("COMPUTERIZED CONTINUOUS ASSESSMENT");
        this.lblHeader3 = new JLabel("AND REPORTSHEET SYSTEM");
        (this.txtStudName = new JTextField(17)).setFont(f2);
        (this.txtStudID = new JTextField(17)).setBackground(Color.GRAY);
        this.txtStudID.setFont(f2);
        (this.txtStudRegNum = new JTextField("BIRIA/", 17)).setFont(f2);
        this.txtStudClass = new JTextField(15);
        this.txtParentPhone = new JTextField(15);
        (this.btnGetPicture = new JButton("15 kb")).setBackground(Color.RED);
        this.btnGetPicture.setForeground(Color.WHITE);
        this.lblStudPic = new JLabel(this.ImageStudPic);
        this.btnExit = new JButton("Close");
        this.btnSave = new JButton("Submit");
        this.btnClear = new JButton("Clear");
        this.btnViewRegNum = new JButton("View RegNum");
        this.lbltest = new JLabel("test");
        this.lblStdNameBio = new JLabel("STUDENT NAME:");
        this.lblStdRegNumBio = new JLabel("REG. NUMBER:");
        this.lblDOB = new JLabel("DATE OF BIRTH:");
        this.lblSEX = new JLabel("SEX:");
        this.lblPlaceOfBirth = new JLabel("PLACE OF BIRTH");
        this.lblStateOfOrigin = new JLabel("STATE OF ORIGIN:");
        this.lblLGA = new JLabel("L.G.A:");
        this.lblNationality = new JLabel("NATIONATIONAL:");
        this.lblPreviousSchInfo = new JLabel("PREVIOUS SCHOOL INFO:");
        this.lblPrimarySch = new JLabel("PRIMARY SCHOOL ATTENDED:");
        this.lblYear = new JLabel("YEAR GRADUATED:");
        this.lblYearOfAdmsIntoCIS = new JLabel("YEAR OF ADM INTO F.I.S:");
        this.lblPresentClass = new JLabel("CLASS:");
        this.lblExpectedYearOfGrad = new JLabel("EXPT. YEAR OF GRAD. FROM FIS:");
        this.lblParentInfo = new JLabel("PARENT INFORMATON:");
        this.lblPresentAddress = new JLabel("PRESENT PARENT ADDRESS:");
        this.lblGSM = new JLabel("G.S.M.:");
        this.lblWorkingPlace = new JLabel("WORKING PLACE:");
        this.lblHealthInfo = new JLabel("HEALTH INFORMATION:");
        this.lblHistoryOfSickness = new JLabel("HISTORY OF SICKNESS:");
        this.lblMedicalHistory = new JLabel("MEDICAL HOSTORY:");
        this.lblBloodGroup = new JLabel("BLOOD GROUP:");
        this.lblGenoType = new JLabel("GENOTYPE:");
        this.lblPreviousShool = new JLabel("PREVIOUS SCHOOL: ");
        this.lblPreviousClass = new JLabel("PREVIOUS CLASS: ");
        this.lblClassSought = new JLabel("CLASS SOUGHT: ");
        this.lblParentName = new JLabel("PARENT NAME:");
        this.lblParentNationality = new JLabel("NATIONALITY:");
        this.lblParentState = new JLabel("PARENT STATE: ");
        this.lblParentLGA = new JLabel("PARENT LGA: ");
        this.lblParentHomeAddress = new JLabel("HOME ADDRESS: ");
        this.lblParentOfficeAddress = new JLabel("OFFICE ADDRESS: ");
        this.lblParentOccupation = new JLabel("OCCUPATION: ");
        this.lblParentGSM = new JLabel("GSM: ");
        this.lblAnyOtherSickness = new JLabel("ANY OTHER SICKNESS:");
        this.lblOfficialUse = new JLabel("FOR OFFICIAL USE:");
        this.lblPrincipalRemark = new JLabel("PRINCIPAL REMARKS:");
        this.btnExitBio = new JButton("Close");
        this.btnSaveBio = new JButton("Submit");
        this.btnClearBio = new JButton("Reset");
        this.btnViewInfo = new JButton("View Info");
        this.btnDelete = new JButton("Delete");
        this.txtStdNameBio = new JTextField(18);
        this.txtStdRegNumBio = new JTextField(18);
        (this.txtDOB = new JTextField(11)).setFont(f2);
        (this.txtPlaceOfBirth = new JTextField(8)).setFont(f2);
        (this.ComboSEX = new JComboBox()).addItem("SELECT SEX");
        this.ComboSEX.addItem("MALE");
        this.ComboSEX.addItem("FEMALE");
        this.ComboSEX.setFont(f2);
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
        this.ComboStateOfOrigin.setFont(f2);
        this.ComboStateOfOrigin.setEditable(false);
        (this.ComboLGA = new JComboBox()).addItem("SELECT LGA");
        this.ComboLGA.setEditable(true);
        (this.ComboNationality = new JComboBox()).addItem("SELECT NATIONALITY");
        this.ComboNationality.addItem("NIGERIAN");
        this.ComboNationality.setEditable(true);
        this.ComboNationality.setFont(f2);
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
        this.txtMedicalHistory = new JTextField(28);
        this.txtBloodGroup = new JTextField(10);
        this.txtGenoType = new JTextField(11);
        this.txtPreviousShool = new JTextField(28);
        this.txtPreviousClass = new JTextField(9);
        this.txtClassSought = new JTextField(9);
        (this.txtParentName = new JTextField(14)).setFont(f2);
        (this.txtParentNationality = new JTextField(6)).setFont(f2);
        this.txtParentState = new JTextField(10);
        this.txtParentLGA = new JTextField(10);
        this.txtParentHomeAddress = new JTextField(28);
        this.txtParentOfficeAddress = new JTextField(28);
        (this.txtParentOccupation = new JTextField(15)).setFont(f2);
        (this.txtParentGSM = new JTextField(8)).setFont(f2);
        this.txtAnyOtherSickness = new JTextField("if any", 28);
        this.txtOfficialUse = new JTextField(25);
        this.txtPrincipalRemark = new JTextField(28);
        (this.ComboClass = new JComboBox()).addItem("Select Class");
        this.ComboClass.setFont(f2);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setBackground(Color.RED);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(710, 725);
        this.setTitle("Delete Student");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.DARK_GRAY);
        this.panel2.setBackground(Color.pink.darker());
        this.panel3.setBackground(Color.cyan.darker());
        this.panel.setLayout(new GridBagLayout());
        this.panel.setBackground(Color.PINK.darker());
        this.panel2.setLayout(new GridBagLayout());
        this.panel3.setLayout(new GridBagLayout());
        this.btnDelete.setBackground(Color.RED);
        this.btnDelete.setForeground(Color.WHITE);
        this.btnViewInfo.setBackground(Color.RED);
        this.btnViewInfo.setForeground(Color.WHITE);
        this.btnExit.setBackground(Color.RED);
        this.btnExit.setForeground(Color.WHITE);
        this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
        this.addItem(this.panelPic, this.btnGetPicture, 0, 0, 2, 2, 10);
        this.addItem(this.panelPic, this.lblStudPic, 0, 0, 2, 2, 10);
        this.addItem(this.panel, this.lblCenterIcon, 0, 0, 3, 3, 17);
        this.addItem(this.panel, this.panel2, 0, 3, 3, 1, 17);
        this.addItem(this.panel2, this.lblStudName, 0, 0, 1, 1, 13);
        this.addItem(this.panel2, this.txtStudName, 1, 0, 1, 1, 17);
        this.addItem(this.panel2, this.lblStudID, 0, 1, 1, 1, 13);
        this.addItem(this.panel2, this.txtStudID, 1, 1, 1, 1, 17);
        this.addItem(this.panel2, this.lblStudRegNum, 0, 2, 1, 1, 13);
        this.addItem(this.panel2, this.txtStudRegNum, 1, 2, 1, 1, 17);
        this.addItem(this.panel2, this.lblStudClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel2, this.ComboClass, 1, 3, 1, 1, 17);
        this.addItem(this.panel2, this.panel3, 0, 4, 4, 1, 10);
        this.addItem(this.panel3, this.lblDOB, 0, 2, 1, 1, 13);
        final Box DOBBox = Box.createHorizontalBox();
        DOBBox.add((Component)this.picker);
        DOBBox.add(Box.createHorizontalStrut(5));
        DOBBox.add(this.lblSEX);
        DOBBox.add(Box.createHorizontalStrut(5));
        DOBBox.add(this.ComboSEX);
        this.addItem(this.panel3, DOBBox, 1, 2, 1, 1, 17);
        this.addItem(this.panel3, this.lblNationality, 0, 4, 1, 1, 13);
        this.addItem(this.panel3, this.ComboNationality, 1, 4, 1, 1, 17);
        this.addItem(this.panel3, this.lblStateOfOrigin, 0, 5, 1, 1, 13);
        final Box STATEBox = Box.createHorizontalBox();
        STATEBox.add(this.ComboStateOfOrigin);
        STATEBox.add(Box.createHorizontalStrut(5));
        STATEBox.add(this.lblPlaceOfBirth);
        STATEBox.add(Box.createHorizontalStrut(5));
        STATEBox.add(this.txtPlaceOfBirth);
        STATEBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel3, STATEBox, 1, 5, 1, 1, 17);
        final Box BloodGBox = Box.createHorizontalBox();
        BloodGBox.add(this.txtBloodGroup);
        BloodGBox.add(Box.createHorizontalStrut(5));
        BloodGBox.add(this.lblGenoType);
        BloodGBox.add(Box.createHorizontalStrut(5));
        BloodGBox.add(this.txtGenoType);
        BloodGBox.add(Box.createHorizontalStrut(5));
        final Box preClassBox = Box.createHorizontalBox();
        preClassBox.add(this.txtPreviousClass);
        preClassBox.add(Box.createHorizontalStrut(5));
        preClassBox.add(this.lblClassSought);
        preClassBox.add(Box.createHorizontalStrut(5));
        preClassBox.add(this.txtClassSought);
        this.addItem(this.panel3, this.lblParentName, 0, 10, 1, 1, 13);
        final Box ParentGSMBox = Box.createHorizontalBox();
        ParentGSMBox.add(this.txtParentName);
        ParentGSMBox.add(Box.createHorizontalStrut(5));
        ParentGSMBox.add(this.lblParentNationality);
        ParentGSMBox.add(Box.createHorizontalStrut(5));
        ParentGSMBox.add(this.txtParentNationality);
        this.addItem(this.panel3, ParentGSMBox, 1, 10, 1, 1, 17);
        final Box ParentLGABox = Box.createHorizontalBox();
        ParentLGABox.add(this.txtParentState);
        ParentLGABox.add(Box.createHorizontalStrut(5));
        ParentLGABox.add(this.lblParentLGA);
        ParentLGABox.add(Box.createHorizontalStrut(5));
        ParentLGABox.add(this.txtParentLGA);
        final Box ParentOccupationBox = Box.createHorizontalBox();
        ParentOccupationBox.add(this.txtParentOccupation);
        ParentOccupationBox.add(Box.createHorizontalStrut(5));
        ParentOccupationBox.add(this.lblParentGSM);
        ParentOccupationBox.add(Box.createHorizontalStrut(5));
        ParentOccupationBox.add(this.txtParentGSM);
        this.addItem(this.panel3, ParentOccupationBox, 1, 14, 1, 1, 17);
        final Box ButtonBox = Box.createHorizontalBox();
        ButtonBox.add(this.btnViewInfo);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnDelete);
        ButtonBox.add(Box.createHorizontalStrut(3));
        ButtonBox.add(this.btnExit);
        ButtonBox.add(Box.createHorizontalStrut(3));
        this.addItem(this.panel3, ButtonBox, 0, 17, 2, 1, 13);
        this.btnExit.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                DeleteStudent.this.btnExitMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                DeleteStudent.this.btnClearMethod(evt2);
            }
        });
        this.btnGetPicture.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                DeleteStudent.this.btnGetPictureMethod(evt3);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                DeleteStudent.this.connectToDB();
                DeleteStudent.this.SaveMethod(evt4);
            }
        });
        this.btnViewRegNum.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                DeleteStudent.this.connectToDB();
                DeleteStudent.this.btnViewIDMethod(evt5);
            }
        });
        this.ComboStateOfOrigin.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                DeleteStudent.this.connectToDB();
                DeleteStudent.this.ComboStateOfOriginMethod(evt6);
            }
        });
        this.btnViewInfo.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                DeleteStudent.this.btnViewInfoMethod(evt7);
            }
        });
        this.btnDelete.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                DeleteStudent.this.connectToDB();
                DeleteStudent.this.btnDeleteMethod(evt8);
            }
        });
        this.fillCoboSelectClass();
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
        this.txtStudID.setText("");
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
        this.ComboSEX.setSelectedItem("SELECT SEX");
        this.txtPlaceOfBirth.setText("");
        this.txtMedicalHistory.setText("");
        this.txtBloodGroup.setText("");
        this.txtGenoType.setText("");
        this.txtPreviousShool.setText("");
        this.txtPreviousClass.setText("");
        this.txtClassSought.setText("");
        this.txtParentName.setText("");
        this.txtParentNationality.setText("");
        this.txtParentState.setText("");
        this.txtParentLGA.setText("");
        this.txtParentHomeAddress.setText("");
        this.txtParentOfficeAddress.setText("");
        this.txtParentOccupation.setText("");
        this.txtParentGSM.setText("");
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
            final int filesize = PicName.length();
            if (filesize > 15) {
                JOptionPane.showMessageDialog(this.btnGetPicture, "please, resize student Picture to a MAX of 18KB only");
            }
            else if (filesize < 15) {
                this.ImageStudPic = new ImageIcon(PicName);
                this.lblStudPic = new JLabel("", this.ImageStudPic, 0);
                this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
                this.addItem(this.panelPic, this.lblStudPic, 0, 0, 2, 2, 10);
                this.btnGetPicture.setVisible(false);
                this.panel.revalidate();
                this.panel.repaint();
                JOptionPane.showMessageDialog(this.btnGetPicture, "Picture is uploaded successfully!");
            }
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
        final String CLASS = (String)this.ComboClass.getSelectedItem();
        final String StudName = this.txtStudName.getText().toString();
        this.StudID = null;
        final String RegNum = this.txtStudRegNum.getText().toString();
        final ImageIcon imag = this.ImageStudPic;
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String DOB = FDate = sdf1.format(this.picker.getDate()).toString();
        final String PlaceOfBith = this.txtPlaceOfBirth.getText().toString();
        final String State = this.ComboStateOfOrigin.getSelectedItem().toString();
        final String LGA = this.ComboLGA.getSelectedItem().toString();
        final String Nationality = this.ComboNationality.getSelectedItem().toString();
        final String PrimarySch = this.txtPrimarySch.getText().toString();
        final String YearGraduated = this.txtYear.getText().toString();
        final String YearOfAdmsIntoCIS = this.txtYearOfAdmsIntoCIS.getText().toString();
        final String ExpectedYearOfGrad = this.txtExpectedYearOfGrad.getText().toString();
        final String PresentAddress = this.txtParentHomeAddress.getText().toString();
        final String GSM = this.txtGSM.getText().toString();
        final String WorkingPlace = this.txtWorkingPlace.getText().toString();
        final String HistoryOfSickness = this.txtHistoryOfSickness.getText().toString();
        final String AnyOtherSickness = this.txtAnyOtherSickness.getText().toString();
        final String PrincipalRemark = this.txtPrincipalRemark.getText().toString();
        final String SEX = (String)this.ComboSEX.getSelectedItem();
        final String medicalHistory = this.txtMedicalHistory.getText().toString();
        final String BloodGroup = this.txtBloodGroup.getText().toString();
        final String GenoType = this.txtGenoType.getText().toString();
        final String PreviousSch = this.txtPreviousShool.getText().toString();
        final String PreviousClass = this.txtPreviousClass.getText().toString();
        final String ClassSought = this.txtClassSought.getText().toString();
        final String ParentName = this.txtParentName.getText().toString();
        final String ParentNationality = this.txtParentNationality.getText().toString();
        final String ParentState = this.txtParentState.getText().toString();
        final String ParentLGA = this.txtParentLGA.getText().toString();
        final String ParentHomeAddress = this.txtParentHomeAddress.getText().toString();
        final String ParentOfficeAddress = this.txtParentOfficeAddress.getText().toString();
        final String ParentOccupation = this.txtParentOccupation.getText().toString();
        final String ParentGSM = this.txtParentGSM.getText().toString();
        String myName = "";
        String myGSM = "";
        String myParentAddress = "";
        String myDOB = "";
        String myclass = "";
        String myregnum = "";
        int NoOfRegisteredStudents = 0;
        int SpecifiedMAXNoinClass = 0;
        if (CLASS.equalsIgnoreCase("PRIMARY ONE")) {
            try {
                final String QueryString = "SELECT StDName,ParentGSM,ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary1 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName,ParentGSM,ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary1 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.println(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY TWO")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary2 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary2 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY THREE")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary3 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary3 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FOUR")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary4 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary4 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FIVE")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary5 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary5 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY SIX")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary6 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary6 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        if (CLASS.equalsIgnoreCase("NURSERY ONE")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY TWO")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery2 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery2 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY THREE")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery3 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery3 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY FOUR")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery4 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery4 WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName,ParentGSM,ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName,ParentGSM,ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.println(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary2_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary2_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary3_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary3_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary4_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary4_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary5_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary5_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary6_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregprimary6_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        if (CLASS.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery2_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery2_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery3_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery3_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StDName, ParentGSM, ParentHomeAddress, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM studentregnursery1_islamiyya WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass");
                pstatement.setString(1, CLASS);
                pstatement.setString(2, RegNum);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myName = rs.getString(1);
                    myGSM = rs.getString(2);
                    myParentAddress = rs.getString(3);
                    myDOB = rs.getString(4);
                    myclass = rs.getString(5);
                    final int result = rs.getInt(6);
                    myregnum = rs.getString(7);
                    NoOfRegisteredStudents = result;
                    System.out.print(myregnum);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        try {
            final String QueryString = "SELECT maxnoInclass FROM MaxNoinClass";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT maxnoInclass FROM MaxNoinClass");
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                SpecifiedMAXNoinClass = rs.getInt(1);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (NoOfRegisteredStudents > SpecifiedMAXNoinClass - 1) {
            JOptionPane.showMessageDialog(null, "ATTENTION: sorry, you cannot register morethan " + SpecifiedMAXNoinClass + " in a class ", "Error occured", 0);
        }
        else if (RegNum.equalsIgnoreCase(myregnum)) {
            JOptionPane.showMessageDialog(null, "This registration number has been assigned to a another student in " + CLASS, "Error occured", 0);
        }
        else if (ParentGSM.equalsIgnoreCase(myGSM) && DOB.equalsIgnoreCase(myDOB) && ParentHomeAddress.equalsIgnoreCase(myParentAddress) && CLASS.equalsIgnoreCase(myclass)) {
            JOptionPane.showMessageDialog(null, "Error; this candidate has been registered, please crosscheck and try again!", "Error occured", 0);
        }
        else if (CLASS.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, enter student class", "Error occured", 0);
        }
        else if (this.txtStudName.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter student name", "Error", 0);
        }
        else if (DOB.getBytes().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, select Date of birth", "Error occured", 0);
        }
        else if (State.equals("SELECT STATE") || Nationality.equals("SELECT NATIONALITY") || this.txtPlaceOfBirth.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, Supply Nationality, State OR Place of Birth", "Error", 0);
        }
        else if (this.txtMedicalHistory.getText().equals("") || this.txtBloodGroup.getText().equals("") || this.txtGenoType.getText().equals("") || this.txtPreviousShool.getText().equals("") || this.txtPreviousClass.getText().equals("") || this.txtClassSought.getText().equals("") || this.txtParentName.getText().equals("") || this.txtParentNationality.getText().equals("") || this.txtParentState.getText().equals("") || this.txtParentLGA.getText().equals("") || this.txtParentHomeAddress.getText().equals("") || this.txtParentOfficeAddress.getText().equals("") || this.txtParentOccupation.getText().equals("") || this.txtParentGSM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, type in all the required information", "Error", 0);
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY ONE")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY TWO")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY THREE")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FOUR")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FIVE")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary5 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary5 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY SIX")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary6 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary6 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY ONE")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into" + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY TWO")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection " + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY THREE")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY FOUR")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary1_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary1_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary2_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary2_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary3_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary3_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary4_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary4_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary5_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary5_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregprimary6_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregprimary6_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery1_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery1_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into" + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery2_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery2_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection " + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery3_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery3_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        else if (CLASS.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
            try {
                final String InsertQueryString = "INSERT INTO studentregnursery4_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentregnursery4_islamiyya VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, StudName);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, this.StudID);
                pstatement.setString(4, CLASS);
                pstatement.setObject(5, imag);
                pstatement.setString(6, DOB);
                pstatement.setString(7, SEX);
                pstatement.setString(8, Nationality);
                pstatement.setString(9, State);
                pstatement.setString(10, PlaceOfBith);
                pstatement.setString(11, medicalHistory);
                pstatement.setString(12, BloodGroup);
                pstatement.setString(13, GenoType);
                pstatement.setString(14, PreviousSch);
                pstatement.setString(15, PreviousClass);
                pstatement.setString(16, ClassSought);
                pstatement.setString(17, ParentName);
                pstatement.setString(18, ParentNationality);
                pstatement.setString(19, ParentState);
                pstatement.setString(20, ParentLGA);
                pstatement.setString(21, ParentHomeAddress);
                pstatement.setString(22, ParentOfficeAddress);
                pstatement.setString(23, ParentOccupation);
                pstatement.setString(24, ParentGSM);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, String.valueOf(String.valueOf(StudName)) + "  has been registered into " + CLASS);
                final String ID = this.txtStudID.getText().toString();
                this.txtStudID.setText(ID);
                this.panel.repaint();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StudName)) + "  not registered: Server Error, check your network cable/connection" + "\n" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public void btnViewIDMethod(final ActionEvent evt5) {
        this.txtStudID.setText("");
        final String StudentName = this.txtStudName.getText().toString();
        final String Class = (String)this.ComboClass.getSelectedItem();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String DOB = FDate = sdf1.format(this.picker.getDate()).toString();
        final String ParentGSM = this.txtParentGSM.getText().toString();
        if (this.txtStudName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, Enter Student Name", "Class Selection Error", 0);
        }
        else if (Class.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregfaslulummahatassadis WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregfaslulummahatassadis WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY TWO")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary2 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary2 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY THREE")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary3 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary3 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY FOUR")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary4 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary4 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY FIVE")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary5 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary5 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY SIX")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary6 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary6 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY ONE")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery1 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery1 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY TWO")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery2 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery2 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY THREE")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery3 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery3 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY FOUR")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery4 WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery4 WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary1_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary1_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary2_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary2_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary3_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary3_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary4_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary4_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary5_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary5_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregprimary6_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregprimary6_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery1_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery1_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery2_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery2_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery3_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery3_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
        else if (Class.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdID FROM studentregnursery4_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID FROM studentregnursery4_islamiyya WHERE StdName =? AND DOB=? AND ParentGSM=?");
                pstatement.setString(1, StudentName);
                pstatement.setString(2, DOB);
                pstatement.setString(3, ParentGSM);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final int ID = rs.getInt(1);
                    this.txtStudID.setText(String.format("%04d", ID));
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
            else {
                this.ComboLGA.removeAllItems();
                this.ComboLGA.setSelectedItem("SELECT LGA");
            }
        }
        else {
            this.ComboLGA.removeAllItems();
            this.ComboLGA.setSelectedItem("SELECT LGA");
        }
        this.panel3.repaint();
        this.panel3.revalidate();
    }
    
    public void btnDeleteMethod(final ActionEvent evt8) {
        final String StudID = this.txtStudID.getText().toString();
        final String StudRegNum = this.txtStudRegNum.getText().toString();
        final String myClass = this.ComboClass.getSelectedItem().toString();
        final String ClassName_Eng = this.pulledClassName_Eng;
        if (this.txtStudID.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter student ID", "Error Occured", 0);
        }
        else if (this.txtStudRegNum.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter student Registration Number", "Error Occured", 0);
        }
        else if (myClass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, enter student class", "Error Occured", 0);
        }
        else {
            try {
                final String QueryString = "DELETE FROM " + ClassName_Eng + " WHERE StdID=? AND StdRegNum=? AND StdClass=?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, StudID);
                pstatement.setString(2, StudRegNum);
                pstatement.setString(3, myClass);
                pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "A student with : " + StudRegNum + "  is been deleted.");
                pstatement.close();
            }
            catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error Occured", "Error Occured", 0);
                e.printStackTrace();
            }
        }
    }
    
    public void btnViewInfoMethod(final ActionEvent evt6) {
        this.pulledCLassName_ENG();
        final String StudID = this.txtStudID.getText().toString();
        final String StudRegNum = this.txtStudRegNum.getText().toString();
        final String myClass = this.ComboClass.getSelectedItem().toString();
        final String ClassName_Eng = this.pulledClassName_Eng;
        this.ComboNationality.setSelectedItem("SELECT Nationality");
        this.ComboSEX.setSelectedItem("SELECT SEX");
        this.txtPlaceOfBirth.setText("");
        this.txtMedicalHistory.setText("");
        this.txtBloodGroup.setText("");
        this.txtGenoType.setText("");
        this.txtPreviousShool.setText("");
        this.txtPreviousClass.setText("");
        this.txtClassSought.setText("");
        this.txtParentName.setText("");
        this.txtParentNationality.setText("");
        this.txtParentState.setText("");
        this.txtParentLGA.setText("");
        this.txtParentHomeAddress.setText("");
        this.txtParentOfficeAddress.setText("");
        this.txtParentOccupation.setText("");
        this.txtParentGSM.setText("");
        this.txtStudName.setText("");
        this.txtParentGSM.setText("");
        this.txtPlaceOfBirth.setText("");
        if (this.txtStudRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter student Registration Number", "Error Occured", 0);
        }
        else if (myClass.equalsIgnoreCase("Select Class")) {
            JOptionPane.showMessageDialog(null, "Please, enter student class", "Error Occured", 0);
        }
        else {
            try {
                this.connectToDB();
                final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM " + ClassName_Eng + " WHERE StdRegNum=? AND StdClass=?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, StudRegNum);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Name = rs.getString(1);
                    this.txtStudName.setText(Name);
                    final String RegNum = rs.getString(2);
                    this.txtStudRegNum.setText(RegNum);
                    final int id = rs.getInt(3);
                    this.txtStudID.setText(String.format("%04d", id));
                    final String myclass = rs.getString(4);
                    this.ComboClass.setSelectedItem(myclass);
                    final java.sql.Date DOB = rs.getDate(6);
                    this.picker.setDate((Date)DOB);
                    final String sex = rs.getString(7);
                    this.ComboSEX.setSelectedItem(sex);
                    System.out.println(sex);
                    final String Nationality = rs.getString(8);
                    this.ComboNationality.setSelectedItem(Nationality);
                    final String State = rs.getString(9);
                    this.ComboStateOfOrigin.setSelectedItem(State);
                    final String PlaceofBirth = rs.getString(10);
                    this.txtPlaceOfBirth.setText(PlaceofBirth);
                    final String ParentName = rs.getString(11);
                    this.txtParentName.setText(ParentName);
                    final String ParentNationality = rs.getString(12);
                    this.txtParentNationality.setText(ParentNationality);
                    final String ParentOccupation = rs.getString(13);
                    this.txtParentOccupation.setText(ParentOccupation);
                    final String ParentGSM = rs.getString(14);
                    this.txtParentGSM.setText(ParentGSM);
                    this.panel.validate();
                    this.panel.repaint();
                }
                rs.close();
                pstatement.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Occured " + e.getMessage(), "Error Occured!", 0);
                e.printStackTrace();
            }
        }
    }
    
    public void fillCoboSelectClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0281: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString("Classname_Ara");
                    this.ComboClass.addItem(ComboClassName);
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
    
    public void pulledCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassName_Ara = this.ComboClass.getSelectedItem().toString();
        Label_0257: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString("Classname_Eng");
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
}
