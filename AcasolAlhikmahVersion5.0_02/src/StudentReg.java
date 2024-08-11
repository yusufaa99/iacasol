import java.sql.Blob;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;

import java.util.Date;
import java.util.HashMap;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import java.util.Locale;
import java.util.Map;

import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.Icon;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.border.TitledBorder;

 
import com.itextpdf.text.pdf.codec.Base64.InputStream;

import java.util.HashMap;
import java.util.Map;
 
import javax.swing.ImageIcon;

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

public class StudentReg<StreamedContent> extends JFrame {

	int studRegCounter = 0;
	String filePath = "";
	String pulledClassName_Eng;
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
	private ImageIcon icon;
	private JLabel photo;
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
	private JButton btnPrint;
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

	private int date;
	private System JRXmlLoader;

	public StudentReg() {
		this.pulledClassName_Eng = "";
		this.StudClass = "";
		this.myClass = "";
		this.filePath = "";
	}

	public void StudentReg() {
		final Border TB = new TitledBorder("A. Current Student Registration Information");
		final Border TB2 = new TitledBorder("B. Student and Parent Information");
		this.panel = new JPanel();
		this.panel2 = new JPanel();
		this.panel3 = new JPanel();
		this.panelPic = new JPanel();
		this.panel2.setBorder(TB);
		this.panel3.setBorder(TB2);
		(this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
		this.picker.setDateFormatString("yyyy-MM-dd");
		final Font f = new Font("Arial Unicode MS", 1, 18);
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
		this.txtStudName = new JTextField(17);
		(this.txtStudID = new JTextField(17)).setBackground(Color.GRAY);
		// this.txtStudName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.txtStudRegNum = new JTextField(17);
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
		this.lblNationality = new JLabel("NATIONALITY: ");
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
		this.lblParentNationality = new JLabel("NATIONALITY: ");
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
		this.btnPrint = new JButton("Print");
		this.txtStdNameBio = new JTextField(18);
		this.txtStdRegNumBio = new JTextField(18);
		this.txtDOB = new JTextField(11);
		this.txtPlaceOfBirth = new JTextField(13);
		this.txtStudName.setFont(f);
		this.txtStudID.setFont(f);
		this.txtStudRegNum.setFont(f);
		this.txtDOB.setFont(f);
		this.txtPlaceOfBirth.setFont(f);
		(this.ComboSEX = new JComboBox()).addItem("SELECT SEX");
		this.ComboSEX.addItem("Male");
		this.ComboSEX.addItem("Female");
		this.ComboSEX.setFont(f);
		(this.ComboStateOfOrigin = new JComboBox()).addItem("SELECT STATE");
		this.ComboStateOfOrigin.addItem("ABIA");
		this.ComboStateOfOrigin.addItem("ABUJA");
		this.ComboStateOfOrigin.addItem("ADAMAWA");
		this.ComboStateOfOrigin.addItem("AKWA IBOM");
		this.ComboStateOfOrigin.addItem("ANAMBRA");
		this.ComboStateOfOrigin.addItem("BAUCHI");
		this.ComboStateOfOrigin.addItem("BAYELSA");
		this.ComboStateOfOrigin.addItem("BENUE");
		this.ComboStateOfOrigin.addItem("BORNO");
		this.ComboStateOfOrigin.addItem("CROSS RIVER");
		this.ComboStateOfOrigin.addItem("DELTA");
		this.ComboStateOfOrigin.addItem("EBONYI");
		this.ComboStateOfOrigin.addItem("EDO");
		this.ComboStateOfOrigin.addItem("EKITI");
		this.ComboStateOfOrigin.addItem("ENUGU");
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
		this.ComboStateOfOrigin.addItem("OGUN");
		this.ComboStateOfOrigin.addItem("ONDO");
		this.ComboStateOfOrigin.addItem("OSUN");
		this.ComboStateOfOrigin.addItem("PLATAUE");
		this.ComboStateOfOrigin.addItem("RIVERS");
		this.ComboStateOfOrigin.addItem("SOKOTO");
		this.ComboStateOfOrigin.addItem("TARABA");
		this.ComboStateOfOrigin.addItem("YOBE");
		this.ComboStateOfOrigin.addItem("ZAMFARA");
		this.ComboStateOfOrigin.addItem("");
		this.ComboStateOfOrigin.setEditable(false);
		(this.ComboLGA = new JComboBox()).addItem("SELECT LGA");
		this.ComboLGA.setEditable(true);
		(this.ComboNationality = new JComboBox()).addItem("SELECT NATIONALITY");
		this.ComboNationality.addItem("Nigerian");
		this.ComboNationality.setEditable(true);
		this.ComboNationality.setFont(f);
		this.txtPreviousSchInfo = new JTextField(25);
		this.txtPrimarySch = new JTextField(10);
		this.txtYear = new JTextField(6);
		this.txtYearOfAdmsIntoCIS = new JTextField(10);
		this.txtPresentClass = new JTextField(12);
		this.txtExpectedYearOfGrad = new JTextField(10);
		this.txtParentInfo = new JTextField(25);
		this.txtPresentAddress = new JTextField(8);
		this.txtGSM = new JTextField(18);
		this.txtWorkingPlace = new JTextField(28);
		// this.txtWorkingPlace.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.txtHealthInfo = new JTextField(28);
		this.txtHistoryOfSickness = new JTextField("if any", 28);
		this.txtMedicalHistory = new JTextField(28);
		this.txtBloodGroup = new JTextField(10);
		this.txtGenoType = new JTextField(11);
		this.txtPreviousShool = new JTextField(28);
		this.txtPreviousClass = new JTextField(9);
		this.txtClassSought = new JTextField(9);
		this.txtParentName = new JTextField(10);
		// this.txtParentName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.txtParentNationality = new JTextField(10);
		// txtParentNationality.setText("");
		// txtParentNationality.setEditable(false);
		this.txtParentState = new JTextField(10);
		this.txtParentLGA = new JTextField(10);
		this.txtParentHomeAddress = new JTextField(28);
		this.txtParentOfficeAddress = new JTextField(28);
		this.txtParentOccupation = new JTextField(10);
		// this.txtParentOccupation.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.txtParentGSM = new JTextField(13);
		this.txtAnyOtherSickness = new JTextField("if any", 28);
		this.txtParentName.setFont(f);
		this.txtParentNationality.setFont(f);
		// this.txtParentNationality.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.txtStudName.setFont(f);
		this.txtParentGSM.setFont(f);
		this.txtParentHomeAddress = new JTextField(25);
		this.txtPrincipalRemark = new JTextField(28);
		(this.ComboClass = new JComboBox()).setEditable(false);
		this.ComboClass.addItem("SELECT CLASS");
		this.ComboClass.setEditable(false);
		this.ComboClass.setFont(f);
		((JLabel) this.ComboClass.getRenderer()).setHorizontalAlignment(2);
		this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
		this.setBackground(Color.RED);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(720, 700);
		this.setTitle("Student Registration Window");
		this.add(this.panel);
		this.setDefaultCloseOperation(0);
		this.setLocationRelativeTo(null);
		this.panel.setBackground(Color.orange);
		this.panel2.setBackground(Color.pink.darker());
		this.panel3.setBackground(Color.white);
		this.panel.setLayout(new GridBagLayout());
		this.panel.setBackground(Color.PINK.darker());
		this.panel2.setLayout(new GridBagLayout());
		this.panel3.setLayout(new GridBagLayout());
		this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
		this.addItem(this.panelPic, this.btnGetPicture, 0, 0, 2, 2, 10);
		this.addItem(this.panelPic, this.lblStudPic, 0, 0, 2, 2, 10);
		this.addItem(this.panel, this.lblCenterIcon, 0, 0, 3, 3, 10);
		this.addItem(this.panel, this.panel2, 0, 3, 3, 1, 17);
		this.addItem(this.panel2, this.lblStudName, 0, 0, 1, 1, 13);
		this.addItem(this.panel2, this.txtStudName, 1, 0, 1, 1, 17);
		this.txtStudName.getInputContext().selectInputMethod(new Locale("ar", "SA"));
		this.addItem(this.panel2, this.lblStudID, 0, 1, 1, 1, 13);
		this.addItem(this.panel2, this.txtStudID, 1, 1, 1, 1, 17);
		this.addItem(this.panel2, this.lblStudClass, 0, 2, 1, 1, 13);
		this.addItem(this.panel2, this.ComboClass, 1, 2, 1, 1, 17);
		this.addItem(this.panel2, this.lblStudRegNum, 0, 3, 1, 1, 13);
		this.addItem(this.panel2, this.txtStudRegNum, 1, 3, 1, 1, 17);
		this.addItem(this.panel2, this.panel3, 0, 4, 4, 1, 10);
		this.addItem(this.panel3, this.lblDOB, 0, 2, 1, 1, 13);
		final Box DOBBox = Box.createHorizontalBox();
		DOBBox.add((Component) this.picker);
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
		this.addItem(this.panel3, this.lblParentOccupation, 0, 14, 1, 1, 13);
		final Box ParentOccupationBox = Box.createHorizontalBox();
		ParentOccupationBox.add(this.txtParentOccupation);
		ParentOccupationBox.add(Box.createHorizontalStrut(5));
		ParentOccupationBox.add(this.lblParentGSM);
		ParentOccupationBox.add(Box.createHorizontalStrut(5));
		ParentOccupationBox.add(this.txtParentGSM);
		this.addItem(this.panel3, ParentOccupationBox, 1, 14, 1, 1, 17);
		final Box ButtonBox = Box.createHorizontalBox();
		ButtonBox.add(this.btnSave);
		ButtonBox.add(Box.createHorizontalStrut(3));
		ButtonBox.add(this.btnViewRegNum);
		ButtonBox.add(Box.createHorizontalStrut(3));
		ButtonBox.add(this.btnClear);
		ButtonBox.add(Box.createHorizontalStrut(3));
		ButtonBox.add(this.btnPrint);
		ButtonBox.add(Box.createHorizontalStrut(3));
		ButtonBox.add(this.btnExit);
		ButtonBox.add(Box.createHorizontalStrut(3));
		this.btnExit.setBackground(Color.red);
		this.btnSave.setBackground(Color.GREEN);
		this.txtParentOccupation.setFont(f);
		this.addItem(this.panel3, ButtonBox, 1, 17, 2, 1, 10);
		this.btnExit.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e1) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt1) {
				StudentReg.this.btnExitMethod(evt1);
			}
		});
		this.btnClear.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e2) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt2) {
				StudentReg.this.btnClearMethod(evt2);
			}
		});
		this.btnGetPicture.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e3) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt3) {
				StudentReg.this.btnGetPictureMethod(evt3);
			}
		});
		this.btnSave.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e4) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt4) {
				StudentReg.this.connectToDB();
				StudentReg.this.SaveMethod(evt4);
			}
		});
		this.btnViewRegNum.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e5) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt5) {
				StudentReg.this.connectToDB();
				StudentReg.this.btnViewIDMethod(evt5);
			}
		});
		this.ComboStateOfOrigin.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e6) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt6) {
				StudentReg.this.connectToDB();
				StudentReg.this.ComboStateOfOriginMethod(evt6);
			}
		});
		this.btnPrint.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e7) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt7) {
				StudentReg.this.btnPrintMethod(evt7);
			}
		});
		
		this.ComboClass.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e9) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt9) {
				StudentReg.this.connectToDB();
				StudentReg.this.ComboClassMethod(evt9);
			}
		});
		this.fillComboClass();
	}

	private void addItem(final JPanel p, final JComponent c, final int x, final int y, final int width,
			final int height, final int align) {
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
		final int clouseButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
				"Windows Close Warning", 0);
		if (clouseButton == 0) {
			this.dispose();
		} else {
			this.remove(clouseButton);
		}
	}

	public void btnClearMethod(final ActionEvent e2) {
		this.btnExit.setBackground(Color.RED);
		this.txtStudName.setText("");
		this.txtStudID.setText("");
		this.txtStudClass.setText("");
		this.txtParentPhone.setText("");
		this.txtParentOccupation.setText("");
		this.txtParentGSM.setText("");
		this.txtParentName.setText("");
		this.lblStudPic.setVisible(false);
		this.btnGetPicture.setVisible(true);
		this.photo.setVisible(false);
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
				JOptionPane.showMessageDialog(this.btnGetPicture,
						"please, resize student Picture to a MAX of 15KB only");
			} else if (filesize < 15) {
				this.ImageStudPic = new ImageIcon(PicName);
				this.lblStudPic = new JLabel("", this.ImageStudPic, 0);
				this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
				this.addItem(this.panelPic, this.lblStudPic, 0, 0, 2, 2, 10);
				this.btnGetPicture.setVisible(false);
				this.panel.revalidate();
				this.panel.repaint();
				JOptionPane.showMessageDialog(this.btnGetPicture, "Picture is uploaded successfully!");
			}
		} else if (result == 1) {
			JOptionPane.showMessageDialog(this.btnGetPicture,
					"Picture Upload is Canceled, Click on Clear and try again!");
		} else if (result == -1) {
			JOptionPane.showMessageDialog(this.btnGetPicture,
					"Error in Uploading Picture, Click on Clear and try again!");
		}
	}

	public void connectToDB() {
		try {
			final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
			final String USERNAME = "root";
			final String PASSWORD = "ash123";
			this.connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
					"ash123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException e2) {
			JOptionPane.showMessageDialog(null, "Please, enter parent phone number",
					"database connectivity error\n" + e2.getMessage(), 0);
			e2.printStackTrace();
		} catch (IllegalAccessException e3) {
			JOptionPane.showMessageDialog(null, "Please, enter parent phone number",
					"database connectivity error\n" + e3.getMessage(), 0);
			e3.printStackTrace();
		} catch (ClassNotFoundException e4) {
			JOptionPane.showMessageDialog(null, "Please, enter parent phone number",
					"database connectivity error\n" + e4.getMessage(), 0);
			e4.printStackTrace();
		}
	}
	// generating report method
	public void SaveMethod(final ActionEvent evt3) {
		
		this.pulledCLassName_ENG();
		this.connectToDB();
		final String CLASS = (String) this.ComboClass.getSelectedItem();
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
		final String SEX = (String) this.ComboSEX.getSelectedItem();
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
		final String myParentAddress = "";
		String myDOB = "";
		String myclass = "";
		String myregnum = "";
		int NoOfRegisteredStudents = 0;
		int SpecifiedMAXNoinClass = 0;
		this.btnPrint.setVisible(true);
		try {
			// this is the variable that replace '-' with '_' and remove spaces form the
			// class name selected from student registration window
			String TheModifiedpulledClassname_Eng = this.pulledClassName_Eng.replaceAll("-", "_").replaceAll("\\s", "")
					.toLowerCase();

			final String QueryString = "SELECT StDName,ParentGSM, DOB, StdClass, COUNT(*) StdID,StdRegNum  FROM "
					+ TheModifiedpulledClassname_Eng + " WHERE stdClass =? AND StdRegNum =? GROUP BY stdClass";
			final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
			pstatement.setString(1, CLASS);
			pstatement.setString(2, RegNum);
			final ResultSet rs = pstatement.executeQuery();
			while (rs.next()) {
				myName = rs.getString(1);
				myGSM = rs.getString(2);
				myDOB = rs.getString(3);
				myclass = rs.getString(4);
				final int result = rs.getInt(5);
				myregnum = rs.getString(6);
				NoOfRegisteredStudents = result;
				System.out.println(myregnum);
			}
			rs.close();
			pstatement.close();
		} catch (SQLException a) {
			JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
			a.printStackTrace();
		}
		try {
			final String QueryString = "SELECT maxnoInclass FROM MaxNoinClass";
			final PreparedStatement pstatement = this.connection
					.prepareStatement("SELECT maxnoInclass FROM MaxNoinClass");
			final ResultSet rs = pstatement.executeQuery();
			while (rs.next()) {
				SpecifiedMAXNoinClass = rs.getInt(1);
			}
			rs.close();
			pstatement.close();
		} catch (SQLException a) {
			JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
			a.printStackTrace();
		}
		if (RegNum.equalsIgnoreCase(myregnum)) {
			JOptionPane.showMessageDialog(null,
					"This REGISTRATION NUMBER has been assigned to a another student in " + CLASS, "Error occured", 0);
		} else if (RegNum.equalsIgnoreCase("ACS/NURSERY/") || RegNum.equalsIgnoreCase("ACS/NURSERY/")
				|| RegNum.equalsIgnoreCase("ACS/PRIMARY/") || RegNum.equalsIgnoreCase("ACS/PRIMARY/")
				|| RegNum.equalsIgnoreCase("ACS/JSS/") || RegNum.equalsIgnoreCase("ACS/JSS/")
				|| RegNum.equalsIgnoreCase("ACS/SSS/") || RegNum.equalsIgnoreCase("ACS/SSS/")) {
			JOptionPane.showMessageDialog(null,
					"The registration number entered is incorrect. Pls, check your entries.", "Error occured", 0);
		} else if (ParentGSM.equalsIgnoreCase(myGSM) && DOB.equalsIgnoreCase(myDOB)
				&& ParentHomeAddress.equalsIgnoreCase("") && CLASS.equalsIgnoreCase(myclass)) {
			JOptionPane.showMessageDialog(null,
					"Error; this candidate has been registered, please crosscheck and try again!", "Error occured", 0);
		} else if (CLASS.equals("SELECT CLASS")) {
			JOptionPane.showMessageDialog(null, "Please, enter student class", "Error occured", 0);
		} else if (this.txtStudName.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "Please, enter student name", "Error", 0);
		} else if (DOB.getBytes().toString().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Please, select Date of birth", "Error occured", 0);
		} else if (State.equals("SELECT STATE") || Nationality.equals("SELECT NATIONALITY")
				|| this.txtPlaceOfBirth.getText().toString().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Please, Supply State of Origin OR Nationality", "Error", 0);
		} else if (this.txtParentName.getText().equals("") || this.txtParentNationality.getText().equals("")
				|| this.txtParentOccupation.getText().equals("") || this.txtParentGSM.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please, type in all the required information", "Error", 0);
		} else {
			// this is the variable that replace '-' with '_' and remove spaces form the
			// class name selected from student registration window
			final String TheModifiedpulledClassname_Eng = this.pulledClassName_Eng.replaceAll("-", "_")
					.replaceAll("\\s", "").toLowerCase();

			final String studregno = this.txtStudRegNum.getText().replaceAll("/", "");
			System.out.println("modified reg no is :" + studregno);
			String QrDirectoryOnCDrive = "";
			Object filePath;
			/// QR code Image Creation
	 

			// inserting values into the selected table
			try {
				final String InsertQueryString = "INSERT INTO " + TheModifiedpulledClassname_Eng
						+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
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
				pstatement.setString(11, ParentName);
				pstatement.setString(12, ParentNationality);
				pstatement.setString(13, ParentOccupation);
				pstatement.setString(14, ParentGSM);
				final int numberOfRowsUpdated = pstatement.executeUpdate();
				JOptionPane.showMessageDialog(null,
						String.valueOf(String.valueOf(StudName)) + " \n" + " has been registered into " + "\n" + CLASS);
				final String ID = this.txtStudID.getText().toString();
				this.txtStudID.setText(ID);
				this.panel.repaint();
				pstatement.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,
						String.valueOf(String.valueOf(StudName))
								+ "  not registered: Server Error, check your network cable/connection" + "\n"
								+ e.getMessage());
				e.printStackTrace();
			}
		}
		this.btnViewIDMethod(evt3);
	}

	public void btnViewIDMethod(final ActionEvent evt5) {
		this.txtStudID.setText("");
		final String StudentName = this.txtStudName.getText().toString();
		final String Class = (String) this.ComboClass.getSelectedItem();
		final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		final String FDate;
		final String DOB = FDate = sdf1.format(this.picker.getDate()).toString();
		final String ParentGSM = this.txtParentGSM.getText().toString();
		if (this.txtStudName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please, Enter Student Name", "Class Selection Error", 0);
		} else if (Class.equalsIgnoreCase(ComboClass.getSelectedItem().toString())) {
			try {
				final String TheModifiedcomboclass = ComboClass.getSelectedItem().toString().replaceAll("-", "_")
						.replaceAll("\\s", "").toLowerCase();
				// final String QueryString = "SELECT StdID FROM " + TheModifiedcomboclass + "
				// WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM " + TheModifiedcomboclass + " WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatuladfalb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatuladfalb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatululahalkabeeraa WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatululahalkabeeraa WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatululahalkabeerab WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatululahalkabeerab WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatululahalsagiraha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatululahalsagiraha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatululahalsagirahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatululahalsagirahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsalisaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsalisaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsalisahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsalisahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulrabiaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulrabiaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulrabiahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulrabiahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulkhamisaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulkhamisaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulkhamisahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulkhamisahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsadisaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsadisaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsadisahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsadisahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranululaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranululaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranululahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranululahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsalisaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsalisaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsalisahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsalisahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatulkubraha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatulkubraha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatulkubrahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatulkubrahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u062c")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatulkubrahc WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatulkubrahc WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatulsugraha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatulsugraha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghadanatulsugrahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghadanatulsugrahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatululaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatululaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatululahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatululahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062c")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatululahc WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatululahc WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062f")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatululahD WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatululahD WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u062c")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsaniyahC WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsaniyahC WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0645\u062a\u0648\u0633\u0637\u0629")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsalisahM WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsalisahM WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatulsaniyaha WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatulsaniyahb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulauwalulkabira WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulauwalulkabira WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulauwalulkabirb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulauwalulkabirb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulauwalussagira WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulauwalussagira WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulauwalussagirb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulauwalussagirb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussania WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussania WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussanib WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussanib WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussalisa WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussalisa WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussalisb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussalisb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslurrabiia WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslurrabiia WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslurrabiib WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslurrabiib WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulkhamisa WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulkhamisa WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulkhamisb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulkhamisb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussadisa WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussadisa WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslussadisb WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslussadisb WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase("\u0644\u0623\u0648\u0644 \u0627\u0644\u062a\u0648\u0633\u0637")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAuwalulmutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAuwalulmutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u0645\u062a\u0648\u0633\u0637")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAssanimutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAssanimutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u0645\u062a\u0648\u0633\u0637")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAssalismutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAssalismutawassit WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAuwalussanawi WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAuwalussanawi WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAssanisanawi WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAssanisanawi WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregAssalissanawi WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregAssalissanawi WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatalauwal WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatalauwal WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatassani WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatassani WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatassalis WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatassalis WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatarrabii WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatarrabii WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatalkamis WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatalkamis WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregfaslulummahatassadis WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregfaslulummahatassadis WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class
				.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062f")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregraudatululahD WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregraudatululahD WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u062c")) {
			try {
				final String QueryString = "SELECT StdID FROM studentregriyadulquranulsaniyahC WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentregriyadulquranulsaniyahC WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		} else if (Class.equalsIgnoreCase(
				"\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0645\u062a\u0648\u0633\u0637\u0629")) {
			try {
				final String QueryString = "SELECT StdID FROM studentreghalaqatulsalisahM WHERE StdName =? AND DOB=? AND ParentGSM=?";
				final PreparedStatement pstatement = this.connection.prepareStatement(
						"SELECT StdID FROM studentreghalaqatulsalisahM WHERE StdName =? AND DOB=? AND ParentGSM=?");
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
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
				a.printStackTrace();
			}
		}
	}

	public void ComboStateOfOriginMethod(final ActionEvent evt6) {
		if (evt6.getSource() == this.ComboStateOfOrigin) {
			final String cso = (String) this.ComboStateOfOrigin.getSelectedItem();
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
			} else {
				this.ComboLGA.removeAllItems();
				this.ComboLGA.setSelectedItem("SELECT LGA");
			}
		} else {
			this.ComboLGA.removeAllItems();
			this.ComboLGA.setSelectedItem("SELECT LGA");
		}
		this.panel3.repaint();
		this.panel3.revalidate();
	}

	public void btnPrintMethod(final ActionEvent evt6) {
		final String StudID = this.txtStudID.getText().toString();
		final String StudRegNum = this.txtStudRegNum.getText().toString();
		final String myClass = this.ComboClass.getSelectedItem().toString();
		if (this.txtStudRegNum.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please, enter student Registration Number", "Error Occured", 0);
		} else if (myClass.equalsIgnoreCase("SELECT CLASS")) {
			JOptionPane.showMessageDialog(null, "Please, enter student class", "Error Occured", 0);
		} else if (StudRegNum.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Please, enter student class", "Error Occured", 0);
		} else if (myClass.equalsIgnoreCase("PRIMARY ONE")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary1 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary1 WHERE StdRegNum=? AND StdClass=?");
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
					this.btnGetPicture.setVisible(false);
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY TWO")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary2 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary2 WHERE StdRegNum=? AND StdClass=?");
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
					this.btnGetPicture.setVisible(false);
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY THREE")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary3 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary3 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY FOUR")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary4 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary4 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY FIVE")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary5 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary5 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY SIX")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary6 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary6 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY ONE")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery1 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery1 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY TWO")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery2 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery2 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY THREE")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery3 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery3 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY FOUR")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery4 WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery4 WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary1_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary1_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary2_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary2_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary3_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary3_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary4_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary4_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary5_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary5_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary6_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregprimary6_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery1_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery1_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery2_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery2_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery3_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery3_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (myClass.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
				final String USERNAME = "root";
				final String PASSWORD = "ash123";
				final Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root",
						"ash123");
				final String QueryString = "SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery4_islamiyya WHERE StdRegNum=? AND StdClass=?";
				final PreparedStatement pstatement = con.prepareStatement(
						"SELECT StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,Sex,Nationality,State,PlaceOfBirth,MedicalHistory,BloodGroup,GenoType,PreviousSchool,PreviousClass,ClassSought,ParentName,ParentNationality,ParentState,ParentLGA,ParentHomeAddress,ParentOfficesaddress,ParentOccupation,ParentGSM FROM studentregnursery4_islamiyya WHERE StdRegNum=? AND StdClass=?");
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
					ObjectInputStream ois = null;
					final Blob blob = rs.getBlob("StdPicture");
					ois = new ObjectInputStream(blob.getBinaryStream());
					final ImageIcon image = (ImageIcon) ois.readObject();
					this.photo = new JLabel(image);
					this.addItem(this.panel2, this.panelPic, 2, 0, 3, 3, 17);
					this.addItem(this.panelPic, this.photo, 0, 0, 2, 2, 10);
					this.lblStudPic.setVisible(false);
					this.panelPic.revalidate();
					this.panelPic.repaint();
					this.panel2.revalidate();
					this.panel2.repaint();
					this.panel.revalidate();
					this.panel.repaint();
					this.photo.setVisible(true);
					this.setVisible(true);
					this.panel2.setVisible(true);
					this.panelPic.setVisible(true);
					this.panel.setVisible(true);
					final java.sql.Date DOB = rs.getDate(6);
					this.picker.setDate((Date) DOB);
					final String sex = rs.getString(7);
					this.ComboSEX.setSelectedItem(sex);
					final String Nationality = rs.getString(8);
					this.ComboNationality.setSelectedItem(Nationality);
					final String State = rs.getString(9);
					this.ComboStateOfOrigin.setSelectedItem(State);
					final String PlaceofBirth = rs.getString(10);
					this.txtPlaceOfBirth.setText(PlaceofBirth);
					final String MedicalHistory = rs.getString(11);
					this.txtMedicalHistory.setText(MedicalHistory);
					final String BloodGroup = rs.getString(12);
					this.txtBloodGroup.setText(BloodGroup);
					final String GenoType = rs.getString(13);
					this.txtGenoType.setText(GenoType);
					final String PreviousSchool = rs.getString(14);
					this.txtPreviousShool.setText(PreviousSchool);
					final String PreviousClass = rs.getString(15);
					this.txtPreviousClass.setText(PreviousClass);
					final String CLassSought = rs.getString(16);
					this.txtClassSought.setText(CLassSought);
					final String ParentName = rs.getString(17);
					this.txtParentName.setText(ParentName);
					final String ParentNationality = rs.getString(18);
					this.txtParentNationality.setText(ParentNationality);
					final String ParentState = rs.getString(19);
					this.txtParentState.setText(ParentState);
					final String ParentLGA = rs.getString(20);
					this.txtParentLGA.setText(ParentLGA);
					final String ParentHomeAddress = rs.getString(21);
					this.txtParentHomeAddress.setText(ParentHomeAddress);
					final String ParentOfficeAddress = rs.getString(22);
					this.txtParentOfficeAddress.setText(ParentOfficeAddress);
					final String ParentOccupation = rs.getString(23);
					this.txtParentOccupation.setText(ParentOccupation);
					final String ParentGSM = rs.getString(24);
					this.txtParentGSM.setText(ParentGSM);
					this.panel.validate();
					this.panel.repaint();
				}
				rs.close();
				pstatement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		final J2Printer printer = new J2Printer();
		printer.setSeparatePrintThread(false);
		final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component) this.panel);
		printer.addPageable((Pageable) componentPrinter);
		printer.showPrintPreviewDialog((Component) this.panel);
		this.btnSave.setVisible(true);
		this.btnClear.setVisible(true);
		this.btnExit.setVisible(true);
		this.btnViewRegNum.setVisible(true);
		this.photo.setVisible(true);
		this.btnGetPicture.setVisible(false);
		this.btnViewRegNum.setVisible(true);
	}

	public void ComboClassMethod(final ActionEvent evt9) {
		final String ClassName_Ara = this.ComboClass.getSelectedItem().toString();
		String myClass = "";
		try {
			// final String QueryString = "SELECT Section FROM class_regsitration WHERE
			// Classname_Eng =? ";
			final PreparedStatement pstatement = this.connection
					.prepareStatement("SELECT Section  FROM class_regsitration WHERE Classname_Eng =?");
			pstatement.setString(1, ClassName_Ara);
			final ResultSet rs = pstatement.executeQuery();
			while (rs.next()) {
				myClass = rs.getString(1);
			}
			rs.close();
			pstatement.close();
		} catch (SQLException a) {
			JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
			a.printStackTrace();
		}
		if (evt9.getSource() == this.ComboClass) {
			// get the current date(year) that will be attached to the registration number
			date = LocalDateTime.now().getYear();
			final String subdate = String.valueOf(date).substring(2);
			// System.out.println("current year is : " + subdate);

			final String csc = (String) this.ComboClass.getSelectedItem();
			if (myClass.equalsIgnoreCase("NURSERY SECTION")) {
				this.txtStudRegNum.setText("");
				this.txtStudRegNum.setText("ACS/NURSERY/" + subdate + "/");
				this.txtStudRegNum.setBackground(Color.CYAN);
			} else if (myClass.equalsIgnoreCase("PRIMARY SECTION")) {
				this.txtStudRegNum.setText("");
				this.txtStudRegNum.setText("ACS/PRIMARY/" + subdate + "/");
				this.txtStudRegNum.setBackground(Color.GREEN);
			} else if (myClass.equalsIgnoreCase("JUNIOR SECONDARY SECTION")) {
				this.txtStudRegNum.setText("");
				this.txtStudRegNum.setText("ACS/JSS/" + subdate + "/");
				this.txtStudRegNum.setBackground(Color.RED.brighter());
			} else if (myClass.equalsIgnoreCase("SENIOR SECONDARY SECTION")) {
				this.txtStudRegNum.setText("");
				this.txtStudRegNum.setText("ACS/SSS/" + subdate + "/");
				this.txtStudRegNum.setBackground(Color.PINK);
			}
			this.panel.repaint();
			this.panel.revalidate();
		}
	}

	public void pulledCLassName_ENG() {
		ResultSet rs = null;
		PreparedStatement pstatement = null;
		final String myClassName_Ara = this.ComboClass.getSelectedItem().toString();
		Label_0325: {
			try {
				this.connectToDB();
				// final String QueryString = "SELECT Classname_Eng FROM class_regsitration
				// WHERE Classname_Ara = ? ";
				pstatement = this.connection
						.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
				pstatement.setString(1, myClassName_Ara);
				rs = pstatement.executeQuery();
				while (rs.next()) {
					this.pulledClassName_Eng = rs.getString("Classname_Eng");
					final String TheModifiedpulledClassname_Eng = this.pulledClassName_Eng.replaceAll("-", "_")
							.replaceAll("\\s", "").toLowerCase();
					System.out.println("Modfied pulled Class: " + TheModifiedpulledClassname_Eng);
					System.out.println("pulled Class: " + this.pulledClassName_Eng);
					this.panel.repaint();
					this.panel.revalidate();
				}
				pstatement.close();
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured",
						0);
				a.printStackTrace();
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				break Label_0325;
			} finally {
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			try {
				this.connection.close();
				rs.close();
				pstatement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				this.connection.close();
				rs.close();
				pstatement.close();
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		this.panel.repaint();
		this.panel.revalidate();
	}

	public void fillComboClass() {
		ResultSet rs = null;
		PreparedStatement pstatement = null;
		Label_0281: {
			try {
				this.connectToDB();
				// final String QueryString = "SELECT Classname_Eng FROM class_regsitration ";
				pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration ");
				rs = pstatement.executeQuery();
				while (rs.next()) {
					final String ComboClassName = rs.getString("Classname_Eng");
					this.ComboClass.addItem(ComboClassName);
					this.panel.repaint();
					this.panel.revalidate();
				}
				pstatement.close();
			} catch (SQLException a) {
				JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured",
						0);
				a.printStackTrace();
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				break Label_0281;
			} finally {
				try {
					this.connection.close();
					rs.close();
					pstatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			try {
				this.connection.close();
				rs.close();
				pstatement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				this.connection.close();
				rs.close();
				pstatement.close();
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		this.panel.repaint();
		this.panel.revalidate();
	}
}
