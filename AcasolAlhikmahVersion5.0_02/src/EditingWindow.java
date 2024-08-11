import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class EditingWindow extends JFrame
{
    String pulledClassName_Eng;
    String pulledEditiViewTable;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel3;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
    private JLabel lblIDEditRegNum;
    private JLabel lblRegnum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblTerm;
    private JLabel lblForm;
    private JLabel lblSubject;
    private JLabel lblWhatAreYouEditing;
    private JLabel lblEditingStaffPostion;
    private JLabel lblDay;
    private JLabel lblMonth;
    private JLabel lblYear;
    private JLabel lblClassWorkNo;
    private JLabel lblHomeWorkNo;
    private JLabel lblClassWorkMarks;
    private JLabel lblHomeWorkMarks;
    private JLabel lblOutput;
    private JTextField txtID;
    private JTextField txtIDEditRegNum;
    private JTextField txtIDEditNewRegNum;
    private JTextField txtRegnum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtClassWorkMarks;
    private JTextField txtHomeWorkMarks;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox ComboCWorkNo;
    private JComboBox ComboHWorkNo;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JLabel lblQuerySection;
    private JLabel lblSearchingARecord;
    private JLabel lblEnterRegNum;
    private JLabel lblQuerySelectSubj;
    private JLabel lblQuerySelectForm;
    private JTextField txtEnterRegNum;
    private JLabel lblQuerySelecTerm;
    private JButton btnSearchARecord;
    private JComboBox ComboQuerySelectSubj;
    private JComboBox ComboQuerySelectForm;
    private JComboBox ComboQuerySelectTerm;
    private JLabel lblSearchingAllRecord;
    private JLabel lblQueryAllSelectSubj;
    private JLabel lblQueryAllSelectForm;
    private JLabel lblQueryAllSelecTerm;
    private JButton btnSearchAllRecord;
    private JComboBox ComboQueryAllSelectForm;
    private JComboBox ComboQueryAllSelectTerm;
    private JButton btnClose;
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtmyclass;
    private JLabel lblStudentName;
    private JLabel lblRegNo;
    private JLabel lblCurrentName;
    private JLabel lblEnterNewName;
    private JLabel lblEnterNewRegNum;
    private JTextField txtRegNo;
    private JTextField txtCurrentName;
    private JTextField txtNewName;
    private JTextField txtEnterNewName;
    private JButton btnViewForName;
    private JButton btnEditForName;
    private JButton btnEditTermInformation;
    private JLabel lblStudentClass;
    private JLabel lblRegNoClass;
    private JLabel lblCurrentClass;
    private JLabel lblEnterNewClass;
    private JTextField txtRegNoClass;
    private JTextField txtCurrentClass;
    private JComboBox ComboSelectNewClass;
    private JButton btnViewForClass;
    private JButton btnEditForclass;
    private JLabel lblStudentGender;
    private JLabel lblRegNo_forGender;
    private JLabel lblCurrentGender;
    private JLabel lblCurrentRegNum;
    private JLabel lblEnterNewGender;
    private JTextField txtEterNewGender;
    private JTextField txtRegNo_forGender;
    private JTextField txtCurrentGender;
    private JTextField txtCurrentRegNum;
    private JButton btnViewForGender;
    private JButton btnViewForRegNum;
    private JButton btnEditForGender;
    private JButton btnEditForEditRegNum;
    private JLabel lblStudentHomeWork;
    private JLabel lblRegNoHomeWork;
    private JLabel lblNameNoHomeWork;
    private JLabel lblSelectHwNo;
    private JLabel lblMarksHomeWork;
    private JLabel lblEnterNewMarksHomeWork;
    private JTextField txtRegNoClassHomeWork;
    private JTextField txtNameHomeWork;
    private JComboBox ComboSelectHomeWorkNo;
    private JTextField txtMarksHomeWork;
    private JTextField txtNewMarksHomeWork;
    private JButton btnEditForHomeWork;
    private JButton btnViewForHomeWork;
    private JLabel lblStudentClassWork;
    private JLabel lblRegNoClassWork;
    private JLabel lblNameNoClassWork;
    private JLabel lblSelectCwNo;
    private JLabel lblMarksClassWork;
    private JLabel lblEnterNewMarksClassWork;
    private JTextField txtRegNoClassClassWork;
    private JTextField txtNameClassWork;
    private JComboBox ComboSelectClassWorkNo;
    private JTextField txtMarksClassWork;
    private JTextField txtNewMarksClassWork;
    private JButton btnEditForClassWork;
    private JButton btnViewForClassWork;
    private JLabel lblStudentCATest;
    private JLabel lblRegNoCATest;
    private JLabel lblNameNoCATest;
    private JLabel lblSelectCATest;
    private JLabel lblCATestMarks;
    private JLabel lblEnterNewMarksCATest;
    private JTextField txtRegNoCATest;
    private JTextField txtNameCATest;
    private JComboBox ComboSelectCATestNo;
    private JTextField txtMarksCATest;
    private JTextField txtNewMarksCATest;
    private JButton btnViewForCATest;
    private JButton btnEditForCATest;
    private JLabel lblStudentExamination;
    private JLabel lblRegNoExamination;
    private JLabel lblNameExamination;
    private JLabel lblSelectExaminationSubject;
    private JLabel lblExaminationMarks;
    private JLabel lblEnterNewMarksExamination;
    private JTextField txtRegNoExamination;
    private JTextField txtNameExamination;
    private JComboBox ComboSelectExaminationSubject;
    private JTextField txtMarksExamination;
    private JTextField txtNewMarksExamination;
    private JButton btnViewForExamination;
    private JButton btnEditForExamination;
    private JLabel lblTermInformation;
    private JLabel lblStaffPosition;
    private JButton btnViewTermEnds;
    private JButton btnEditTermEnds;
    private JButton btnViewTermBegins;
    private JButton btnEditTermBegins;
    private JLabel lblTermEnd;
    private JLabel lblNextTermBegins;
    private JLabel lblTermMonth;
    private JLabel lblTermYear;
    private JLabel lblTermNewDate;
    private JLabel lblTermNewDateBegins;
    private JTextField txtTermEnds;
    private JTextField txtNextTermBegins;
    private JComboBox CombomyMonth;
    private JTextField txtTermYear;
    private JTextField txtNewTermEnds;
    private JTextField txtNewTermBegins;
    private JComboBox CombolblStaffRank;
    private JLabel lblselectposition;
    private JTextField txtstaffPositionName;
    private JTextField txtstaffPositionID;
    private JLabel lblstaffPositionID;
    private JLabel blstaffPositionName;
    private JTextField txtstaffPositionNewName;
    private JLabel lblstaffPositionNewName;
    private JButton btnStaffPosition;
    private JButton btnEditstaffPosition;
    String EditiViewTable;
    String myclasses;
    String StudClassRegTableName;
    
    public EditingWindow() {
        this.pulledClassName_Eng = "";
        this.pulledEditiViewTable = "";
        this.EditiViewTable = "";
        this.myclasses = "";
        this.StudClassRegTableName = "";
    }
    
    public void EditingWindow() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        final Font f = new Font(null, 1, 20);
        final Font f2 = new Font("Arial Unicode MS", 1, 18);
        this.lblID = new JLabel("STD. ID:");
        this.lblIDEditRegNum = new JLabel("STD. ID:");
        this.lblRegnum = new JLabel("STD. NAME:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblTerm = new JLabel("TERM:");
        this.lblForm = new JLabel("FORM:");
        this.lblSubject = new JLabel("SUBJECT:");
        (this.lblWhatAreYouEditing = new JLabel("WHAT ARE YOU EDITING ?")).setForeground(Color.red);
        this.lblDay = new JLabel("DAY:");
        this.lblMonth = new JLabel("MONTH");
        this.lblYear = new JLabel("YEAR:");
        this.lblClassWorkNo = new JLabel("CLASSWORK NO:");
        this.lblHomeWorkNo = new JLabel("HOMEWORK NO:");
        this.lblClassWorkMarks = new JLabel("CLASSWORK MARK:");
        this.lblHomeWorkMarks = new JLabel("HOMEWORK MARKS");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        (this.txtID = new JTextField(7)).setFont(f);
        (this.txtIDEditRegNum = new JTextField(7)).setFont(f);
        (this.txtIDEditNewRegNum = new JTextField(7)).setFont(f);
        (this.txtRegnum = new JTextField(7)).setFont(f);
        (this.txtName = new JTextField(25)).setFont(f);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtClassWorkMarks = new JTextField(5);
        this.txtHomeWorkMarks = new JTextField(5);
        (this.ComboSelecClass = new JComboBox()).setFont(f);
        this.ComboSelecClass.addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        (this.ComboTerm = new JComboBox()).setFont(f2);
        this.ComboTerm.addItem("SELECT TERM");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0623\u0648\u0644\u0649");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629");
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        this.ComboSelecClass.setEditable(false);
        this.ComboSelecClass.setFont(f2);
        this.ComboSelectSubj = new JComboBox();
        (this.ComboDay = new JComboBox()).addItem("dd");
        this.ComboDay.addItem("01");
        this.ComboDay.addItem("02");
        this.ComboDay.addItem("03");
        this.ComboDay.addItem("04");
        this.ComboDay.addItem("05");
        this.ComboDay.addItem("06");
        this.ComboDay.addItem("07");
        this.ComboDay.addItem("08");
        this.ComboDay.addItem("09");
        this.ComboDay.addItem("10");
        this.ComboDay.addItem("11");
        this.ComboDay.addItem("12");
        this.ComboDay.addItem("13");
        this.ComboDay.addItem("14");
        this.ComboDay.addItem("15");
        this.ComboDay.addItem("16");
        this.ComboDay.addItem("17");
        this.ComboDay.addItem("18");
        this.ComboDay.addItem("19");
        this.ComboDay.addItem("20");
        this.ComboDay.addItem("21");
        this.ComboDay.addItem("22");
        this.ComboDay.addItem("23");
        this.ComboDay.addItem("24");
        this.ComboDay.addItem("25");
        this.ComboDay.addItem("26");
        this.ComboDay.addItem("27");
        this.ComboDay.addItem("28");
        this.ComboDay.addItem("29");
        this.ComboDay.addItem("30");
        this.ComboDay.addItem("31");
        (this.ComboMonth = new JComboBox()).addItem("mm");
        this.ComboMonth.addItem("01");
        this.ComboMonth.addItem("02");
        this.ComboMonth.addItem("03");
        this.ComboMonth.addItem("04");
        this.ComboMonth.addItem("05");
        this.ComboMonth.addItem("06");
        this.ComboMonth.addItem("07");
        this.ComboMonth.addItem("08");
        this.ComboMonth.addItem("09");
        this.ComboMonth.addItem("10");
        this.ComboMonth.addItem("11");
        this.ComboMonth.addItem("12");
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
        (this.ComboWeekNumber = new JComboBox()).addItem("SELECT WEEK");
        this.ComboWeekNumber.addItem("WEEK ONE");
        this.ComboWeekNumber.addItem("WEEK TWO");
        this.ComboWeekNumber.addItem("WEEK THREE");
        this.ComboWeekNumber.addItem("WEEK FOUR");
        this.ComboWeekNumber.addItem("WEEK FIVE");
        this.ComboWeekNumber.addItem("WEEK SIX");
        this.ComboWeekNumber.addItem("WEEK SEVEN");
        this.ComboWeekNumber.addItem("WEEK EIGHT");
        this.ComboWeekNumber.addItem("WEEK NINE");
        this.ComboWeekNumber.addItem("WEEK TEN");
        this.ComboWeekNumber.addItem("WEEK ELEVEN");
        this.ComboWeekNumber.addItem("WEEK TWELVE");
        this.ComboWeekNumber.addItem("WEEK THIRTEEN");
        this.ComboWeekNumber.addItem("WEEK FOURTEEN");
        this.ComboWeekNumber.addItem("WEEK FIFTEEN");
        (this.ComboCWorkNo = new JComboBox()).addItem("SELECT C_WORK NO");
        this.ComboCWorkNo.addItem("1ST C_WORK");
        this.ComboCWorkNo.addItem("2ND C_WORK");
        this.ComboCWorkNo.addItem("3RD C_WORK");
        this.ComboCWorkNo.addItem("4TH C_WORK");
        this.ComboCWorkNo.addItem("5TH C_WORK");
        this.ComboCWorkNo.addItem("6TH C_WORK");
        this.ComboCWorkNo.addItem("7TH C_WORK");
        this.ComboCWorkNo.addItem("8TH C_WORK");
        this.ComboCWorkNo.addItem("9TH C_WORK");
        this.ComboCWorkNo.addItem("10TH C_WORK");
        this.ComboCWorkNo.addItem("11TH C_WORK");
        this.ComboCWorkNo.addItem("12TH C_WORK");
        this.ComboCWorkNo.addItem("13TH C_WORK");
        this.ComboCWorkNo.addItem("14TH C_WORK");
        this.ComboCWorkNo.addItem("15TH C_WORK");
        (this.ComboHWorkNo = new JComboBox()).addItem("SELECT H_WORK NO");
        this.ComboHWorkNo.addItem("1ST H_WORK");
        this.ComboHWorkNo.addItem("2ND H_WORK");
        this.ComboHWorkNo.addItem("3RD H_WORK");
        this.ComboHWorkNo.addItem("4TH H_WORK");
        this.ComboHWorkNo.addItem("5TH H_WORK");
        this.ComboHWorkNo.addItem("6TH H_WORK");
        this.ComboHWorkNo.addItem("7TH H_WORK");
        this.ComboHWorkNo.addItem("8TH H_WORK");
        this.ComboHWorkNo.addItem("9TH H_WORK");
        this.ComboHWorkNo.addItem("10TH H_WORK");
        this.ComboHWorkNo.addItem("11TH H_WORK");
        this.ComboHWorkNo.addItem("12TH H_WORK");
        this.ComboHWorkNo.addItem("13TH H_WORK");
        this.ComboHWorkNo.addItem("14TH H_WORK");
        this.ComboHWorkNo.addItem("15TH H_WORK");
        (this.CombolblStaffRank = new JComboBox()).addItem("SELECT POSITION");
        this.CombolblStaffRank.addItem("PROPRIETOR");
        this.CombolblStaffRank.addItem("DIRECTOR");
        this.CombolblStaffRank.addItem("PROPRIETRESS");
        this.CombolblStaffRank.addItem("PRINCIPAL");
        this.CombolblStaffRank.addItem("SCHOOL MOTHER");
        this.CombolblStaffRank.addItem("HOUSE MASTER");
        this.CombolblStaffRank.addItem("HOUSE MASTER");
        this.CombolblStaffRank.addItem("HOUSE MSSTRESS");
        this.CombolblStaffRank.addItem("FORM MASTER");
        this.CombolblStaffRank.addItem("SUBJECT TEACHER");
        this.CombolblStaffRank.addItem("CLASS TEACHER");
        this.CombolblStaffRank.addItem("SOFTWARE DEVELOPER");
        this.CombolblStaffRank.addItem("DATABASE ADMINISTRATOR");
        this.CombolblStaffRank.addItem("OTHERS");
        this.CombolblStaffRank.setEditable(true);
        this.lblStudentName = new JLabel("STUDENT'S NAME & OTHER INFO:");
        this.lblRegNo = new JLabel("STD. ID: ");
        this.lblCurrentName = new JLabel("NAME:");
        this.lblEnterNewName = new JLabel("ENTER NAME:");
        this.lblEnterNewRegNum = new JLabel("ENTER NEW REGNUM:");
        this.txtRegNo = new JTextField(4);
        (this.txtCurrentName = new JTextField(12)).setFont(f);
        (this.txtNewName = new JTextField(12)).setFont(f);
        (this.txtEnterNewName = new JTextField(12)).setFont(f);
        this.btnViewForName = new JButton("View Name");
        this.btnEditForName = new JButton("Edit");
        (this.btnEditTermInformation = new JButton("Edit TermInformation")).setFocusPainted(false);
        this.btnEditTermInformation.setBackground(new Color(120, 87, 182));
        this.lblStudentClass = new JLabel("STUDENT'S CLASS:");
        this.lblRegNoClass = new JLabel("STD. ID: ");
        this.lblCurrentClass = new JLabel("CLASS:");
        this.lblEnterNewClass = new JLabel("ENTER CLASS:");
        this.txtRegNoClass = new JTextField(4);
        this.txtCurrentClass = new JTextField(12);
        this.ComboSelectNewClass = new JComboBox();
        this.lblStudentGender = new JLabel("STUDENT'S GENDER:");
        this.lblRegNo_forGender = new JLabel("STD. ID: ");
        this.lblCurrentGender = new JLabel("GENDER: ");
        this.lblCurrentRegNum = new JLabel("RegNum: ");
        this.lblEnterNewGender = new JLabel("ENTER GENDER:");
        this.txtRegNo_forGender = new JTextField(4);
        this.txtCurrentGender = new JTextField(12);
        this.txtCurrentRegNum = new JTextField(12);
        this.txtEterNewGender = new JTextField(12);
        this.btnViewForGender = new JButton("View G");
        this.btnViewForRegNum = new JButton("View RegNum");
        this.btnEditForGender = new JButton("Edit");
        this.btnEditForEditRegNum = new JButton("EditReg");
        this.txtEterNewGender.setFont(f);
        this.txtCurrentGender.setFont(f);
        this.ComboSelectNewClass.addItem("SELECT CLASS");
        this.ComboSelectNewClass.addItem("SSS1 A");
        this.ComboSelectNewClass.addItem("SSS2 A");
        this.ComboSelectNewClass.addItem("SSS3 A");
        this.ComboSelectNewClass.addItem("SSS1 B");
        this.ComboSelectNewClass.addItem("SSS2 B");
        this.ComboSelectNewClass.addItem("SSS3 B");
        this.ComboSelectNewClass.addItem("JSS I A");
        this.ComboSelectNewClass.addItem("JSS II A");
        this.ComboSelectNewClass.addItem("JSS III A");
        this.ComboSelectNewClass.addItem("JSS I B");
        this.ComboSelectNewClass.addItem("JSS II B");
        this.ComboSelectNewClass.addItem("JSS III B");
        this.ComboSelectNewClass.setEditable(false);
        this.btnViewForClass = new JButton("View");
        this.btnEditForclass = new JButton("Edit");
        this.lblStudentHomeWork = new JLabel("HOME WORK:");
        this.lblRegNoHomeWork = new JLabel("REG. NO:");
        this.lblNameNoHomeWork = new JLabel("NAME:");
        this.lblSelectHwNo = new JLabel("HW-NO:");
        this.lblMarksHomeWork = new JLabel("MARKS:");
        this.lblEnterNewMarksHomeWork = new JLabel("NEW MARKS:");
        this.txtRegNoClassHomeWork = new JTextField(4);
        this.txtNameHomeWork = new JTextField(12);
        (this.ComboSelectHomeWorkNo = new JComboBox()).addItem("SELECT H_WORK NO");
        this.ComboSelectHomeWorkNo.addItem("1ST H_WORK");
        this.ComboSelectHomeWorkNo.addItem("2ND H_WORK");
        this.ComboSelectHomeWorkNo.addItem("3RD H_WORK");
        this.ComboSelectHomeWorkNo.addItem("4TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("5TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("6TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("7TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("8TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("9TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("10TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("11TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("12TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("13TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("14TH H_WORK");
        this.ComboSelectHomeWorkNo.addItem("15TH H_WORK");
        this.txtMarksHomeWork = new JTextField(4);
        this.txtNewMarksHomeWork = new JTextField(4);
        this.btnEditForHomeWork = new JButton("Edit");
        this.btnViewForHomeWork = new JButton("View");
        this.lblStudentClassWork = new JLabel("CLASS WORK:");
        this.lblRegNoClassWork = new JLabel("REG. NO:");
        this.lblNameNoClassWork = new JLabel("NAME:");
        this.lblSelectCwNo = new JLabel("CW-NO:");
        this.lblMarksClassWork = new JLabel("MARKS:");
        this.lblEnterNewMarksClassWork = new JLabel("NEW MARKS:");
        this.txtRegNoClassClassWork = new JTextField(4);
        this.txtNameClassWork = new JTextField(12);
        this.btnViewForClassWork = new JButton("View");
        (this.ComboSelectClassWorkNo = new JComboBox()).addItem("SELECT C_WORK NO");
        this.ComboSelectClassWorkNo.addItem("1ST C_WORK");
        this.ComboSelectClassWorkNo.addItem("2ND C_WORK");
        this.ComboSelectClassWorkNo.addItem("3RD C_WORK");
        this.ComboSelectClassWorkNo.addItem("4TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("5TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("6TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("7TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("8TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("9TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("10TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("11TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("12TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("13TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("14TH C_WORK");
        this.ComboSelectClassWorkNo.addItem("15TH C_WORK");
        this.txtMarksClassWork = new JTextField(4);
        this.txtNewMarksClassWork = new JTextField(4);
        this.btnEditForClassWork = new JButton("Edit");
        this.lblStudentCATest = new JLabel("C.A. TEST:");
        this.lblRegNoCATest = new JLabel("REG. NO:");
        this.lblNameNoCATest = new JLabel("NAME:");
        this.lblSelectCATest = new JLabel("TEST NO:");
        this.lblCATestMarks = new JLabel("MARKS:");
        this.lblEnterNewMarksCATest = new JLabel("ENTER MARKS:");
        this.txtRegNoCATest = new JTextField(4);
        this.txtNameCATest = new JTextField(12);
        (this.ComboSelectCATestNo = new JComboBox()).addItem("1ST TEST");
        this.ComboSelectCATestNo.addItem("2ND TEST");
        this.ComboSelectCATestNo.addItem("3RD TEST");
        this.txtMarksCATest = new JTextField(4);
        this.txtNewMarksCATest = new JTextField(4);
        this.btnEditForCATest = new JButton("Edit");
        this.btnViewForCATest = new JButton("View");
        this.lblStudentExamination = new JLabel("EXAMINATION:");
        this.lblRegNoExamination = new JLabel("REG. NO:");
        this.lblNameExamination = new JLabel("NAME:");
        this.lblSelectExaminationSubject = new JLabel("SUBJECT:");
        this.lblExaminationMarks = new JLabel("MARKS:");
        this.lblEnterNewMarksExamination = new JLabel("ENTER MARKS:");
        this.txtRegNoExamination = new JTextField(4);
        this.txtNameExamination = new JTextField(12);
        this.txtMarksExamination = new JTextField(4);
        this.txtNewMarksExamination = new JTextField(4);
        this.btnEditForExamination = new JButton("Edit");
        this.btnViewForExamination = new JButton("View");
        this.btnPreview = new JButton("Preview");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REG. NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Qur\ufffdan");
        this.ComboQuerySelectSubj.addItem("Arabic Language");
        this.ComboQuerySelectSubj.addItem("Biology");
        this.ComboQuerySelectSubj.addItem("Chemistry");
        this.ComboQuerySelectSubj.addItem("Computer science");
        this.ComboQuerySelectSubj.addItem("Economics");
        this.ComboQuerySelectSubj.addItem("English Language");
        this.ComboQuerySelectSubj.addItem("Foods and Nutrition");
        this.ComboQuerySelectSubj.addItem("Further mathematics ");
        this.ComboQuerySelectSubj.addItem("Geography");
        this.ComboQuerySelectSubj.addItem("Government");
        this.ComboQuerySelectSubj.addItem("Hausa");
        this.ComboQuerySelectSubj.addItem("History ");
        this.ComboQuerySelectSubj.addItem("Islamic Religion Knowledge ");
        this.ComboQuerySelectSubj.addItem("Literature in English");
        this.ComboQuerySelectSubj.addItem("Mathematics");
        this.ComboQuerySelectSubj.addItem("Physics");
        (this.ComboQuerySelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQuerySelectTerm.addItem("SECOND TERM");
        this.ComboQuerySelectTerm.addItem("THIRD TERM");
        this.lblQueryAllSelectForm = new JLabel("FORM:");
        (this.ComboQueryAllSelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQueryAllSelectForm.addItem("FORM TWO");
        this.ComboQueryAllSelectForm.addItem("FORM THREE");
        this.lblSearchingAllRecord = new JLabel("SEARCH ALL RECORD");
        this.lblQueryAllSelectSubj = new JLabel("SELECT SUBJECT:");
        this.lblQueryAllSelecTerm = new JLabel("TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQueryAllSelectTerm.addItem("SECOND TERM");
        this.ComboQueryAllSelectTerm.addItem("THIRD TERM");
        this.btnClose = new JButton("Close");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.TextArea = new JTextArea(8, 40);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
        this.txtmyclass = new JTextField();
        (this.lblTermInformation = new JLabel("TERM INFORMATION:")).setForeground(Color.blue);
        (this.lblStaffPosition = new JLabel("STAFF INFO:")).setForeground(Color.blue);
        this.txtNewTermEnds = new JTextField(10);
        this.txtNewTermBegins = new JTextField(10);
        this.btnViewTermBegins = new JButton("View");
        this.btnEditTermBegins = new JButton("Edit");
        this.btnViewTermEnds = new JButton("View");
        this.btnEditTermEnds = new JButton("Edit");
        this.lblTermEnd = new JLabel("TERM ENDS:");
        this.lblNextTermBegins = new JLabel("NEXT TERM BEGINS:");
        this.lblTermMonth = new JLabel("MONTH:");
        this.lblTermYear = new JLabel("YEAR:");
        this.lblTermNewDate = new JLabel("ENTER NEW DATE:");
        this.lblTermNewDateBegins = new JLabel("ENTER NEW DATE:");
        this.lblselectposition = new JLabel("SELECT POSITION:");
        this.blstaffPositionName = new JLabel("NAME:");
        this.txtstaffPositionName = new JTextField(12);
        this.txtstaffPositionID = new JTextField(12);
        this.lblstaffPositionID = new JLabel("STAFF ID:");
        this.lblstaffPositionNewName = new JLabel("NEW NAME:");
        this.txtstaffPositionNewName = new JTextField(12);
        this.btnStaffPosition = new JButton("View");
        this.btnEditstaffPosition = new JButton("Edit");
        this.txtTermEnds = new JTextField(10);
        this.txtNextTermBegins = new JTextField(10);
        (this.CombomyMonth = new JComboBox()).addItem("SELECT MONTH");
        this.CombomyMonth.addItem("JANUARY");
        this.CombomyMonth.addItem("FEBRUARY");
        this.CombomyMonth.addItem("MARCH");
        this.CombomyMonth.addItem("APRIL");
        this.CombomyMonth.addItem("MAY");
        this.CombomyMonth.addItem("JUNE");
        this.CombomyMonth.addItem("JULY");
        this.CombomyMonth.addItem("AUGUST");
        this.CombomyMonth.addItem("SEPTEMBER");
        this.CombomyMonth.addItem("OCTOBER");
        this.CombomyMonth.addItem("NOVEMBER");
        this.CombomyMonth.addItem("DECEMBER");
        this.txtTermYear = new JTextField(5);
        this.panel.setLayout(new GridBagLayout());
        this.panel3.setLayout(new GridBagLayout());
        this.panel2 = new JPanel();
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(1200, 480);
        this.setTitle("Editing Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.panel3.setBackground(Color.GREEN);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnPrevious.setBackground(Color.green);
        final Box CLassBox = Box.createHorizontalBox();
        this.addItem(this.panel, this.panel3, 0, 1, 1, 1, 17);
        this.addItem(this.panel3, this.lblClass, 0, 1, 1, 1, 13);
        this.addItem(this.panel3, this.ComboSelecClass, 1, 1, 1, 1, 17);
        this.addItem(this.panel3, this.lblTerm, 0, 2, 1, 1, 13);
        this.addItem(this.panel3, this.ComboTerm, 1, 2, 2, 1, 17);
        this.addItem(this.panel, this.lblWhatAreYouEditing, 0, 7, 2, 1, 17);
        this.addItem(this.panel, this.lblStudentName, 0, 8, 1, 1, 17);
        this.lblStudentName.setForeground(Color.blue);
        final Box StudNameBox = Box.createHorizontalBox();
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.lblRegNo);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.txtRegNo);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.lblCurrentName);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.txtCurrentName);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.btnViewForName);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.lblEnterNewName);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.txtEnterNewName);
        StudNameBox.add(Box.createHorizontalStrut(3));
        StudNameBox.add(this.btnEditForName);
        this.addItem(this.panel, StudNameBox, 0, 9, 3, 1, 17);
        final Box StudGenderBox = Box.createHorizontalBox();
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.lblRegNo_forGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.txtRegNo_forGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.lblCurrentGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.txtCurrentGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.btnViewForGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.lblEnterNewGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.txtEterNewGender);
        StudGenderBox.add(Box.createHorizontalStrut(3));
        StudGenderBox.add(this.btnEditForGender);
        this.addItem(this.panel, StudGenderBox, 0, 10, 3, 1, 17);
        final Box StudRegNumBox = Box.createHorizontalBox();
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.lblIDEditRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.txtIDEditRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.lblCurrentRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.txtCurrentRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.btnViewForRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.lblEnterNewRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.txtIDEditNewRegNum);
        StudRegNumBox.add(Box.createHorizontalStrut(3));
        StudRegNumBox.add(this.btnEditForEditRegNum);
        this.addItem(this.panel, StudRegNumBox, 0, 11, 3, 1, 17);
        this.lblStudentClass.setForeground(Color.blue);
        final Box StudHworkBox = Box.createHorizontalBox();
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.lblRegNoHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.txtRegNoClassHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.lblNameNoHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.txtNameHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.lblMarksHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.txtMarksHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.btnViewForHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.lblEnterNewMarksHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.txtNewMarksHomeWork);
        StudHworkBox.add(Box.createHorizontalStrut(3));
        StudHworkBox.add(this.btnEditForHomeWork);
        this.lblStudentHomeWork.setForeground(Color.blue);
        final Box StudCworkBox = Box.createHorizontalBox();
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.lblRegNoClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.txtRegNoClassClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.lblNameNoClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.txtNameClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.lblSelectCwNo);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.ComboSelectClassWorkNo);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.lblMarksClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.txtMarksClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.btnViewForClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.lblEnterNewMarksClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.txtNewMarksClassWork);
        StudCworkBox.add(Box.createHorizontalStrut(3));
        StudCworkBox.add(this.btnEditForClassWork);
        final Box StudCATestBox = Box.createHorizontalBox();
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.lblRegNoCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.txtRegNoCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.lblNameNoCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.txtNameCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.lblSelectCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.ComboSelectCATestNo);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.lblCATestMarks);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.txtMarksCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.btnViewForCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.lblEnterNewMarksCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.txtNewMarksCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        StudCATestBox.add(this.btnEditForCATest);
        StudCATestBox.add(Box.createHorizontalStrut(3));
        this.lblStudentCATest.setForeground(Color.blue);
        final Box StudExamBox = Box.createHorizontalBox();
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.lblRegNoExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.txtRegNoExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.lblNameExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.txtNameExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.lblExaminationMarks);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.txtMarksExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.btnViewForExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.lblEnterNewMarksExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.txtNewMarksExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        StudExamBox.add(this.btnEditForExamination);
        StudExamBox.add(Box.createHorizontalStrut(3));
        this.lblStudentExamination.setForeground(Color.blue);
        this.addItem(this.panel, this.lblTermInformation, 0, 20, 1, 1, 17);
        final Box lblTermEndBox = Box.createHorizontalBox();
        lblTermEndBox.add(this.btnEditTermInformation);
        lblTermEndBox.add(Box.createHorizontalStrut(3));
        this.addItem(this.panel, lblTermEndBox, 0, 21, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffPosition, 0, 23, 1, 1, 17);
        final Box StaffPositionBox = Box.createHorizontalBox();
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.lblstaffPositionID);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.txtstaffPositionID);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.blstaffPositionName);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.txtstaffPositionName);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.btnStaffPosition);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.lblstaffPositionNewName);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.txtstaffPositionNewName);
        StaffPositionBox.add(Box.createHorizontalStrut(3));
        StaffPositionBox.add(this.btnEditstaffPosition);
        this.addItem(this.panel, StaffPositionBox, 0, 24, 1, 1, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 0, 25, 3, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                EditingWindow.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                EditingWindow.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                EditingWindow.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                EditingWindow.this.btnPreviewMethod(evt7);
            }
        });
        this.ComboWeekNumber.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.ComboWeekNumberMethod(evt8);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnPreviousMethod(evt9);
            }
        });
        this.btnViewForName.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForNameMethod(evt10);
            }
        });
        this.btnEditForName.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForNameMethod(evt11);
            }
        });
        this.btnEditForEditRegNum.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e32) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt32) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForEditRegNumMethod(evt32);
            }
        });
        this.btnViewForGender.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e30) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt30) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForGenderMethod(evt30);
            }
        });
        this.btnViewForRegNum.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e31) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt31) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForRegNumMethod(evt31);
            }
        });
        this.btnEditForGender.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e31) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt31) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForGenderMethod(evt31);
            }
        });
        this.btnEditForclass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForclassMethod(evt13);
            }
        });
        this.btnViewForHomeWork.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForHomeWorkMethod(evt14);
            }
        });
        this.btnEditForHomeWork.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForHomeWorkMethod(evt15);
            }
        });
        this.btnViewForClassWork.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForClassWorkMethod(evt16);
            }
        });
        this.btnEditForClassWork.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForClassWorkMethod(evt16);
            }
        });
        this.btnViewForCATest.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e17) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt17) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForCATestMethod(evt17);
            }
        });
        this.btnEditForCATest.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForCATestMethod(evt18);
            }
        });
        this.btnViewForExamination.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e19) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt19) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewForExaminationMethod(evt19);
            }
        });
        this.btnEditForExamination.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e20) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt20) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditForExaminationMethod(evt20);
            }
        });
        this.btnViewTermEnds.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e21) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt21) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewTermEndsMethod(evt21);
            }
        });
        this.btnEditTermEnds.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e22) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt22) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditTermEndsMethod(evt22);
            }
        });
        this.btnViewTermBegins.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e23) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt23) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnViewTermBeginsMethod(evt23);
            }
        });
        this.btnEditTermBegins.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e24) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt24) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditTermBeginsMethod(evt24);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e25) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt25) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.ComboSelecClassMethod(evt25);
            }
        });
        this.btnStaffPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e26) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt26) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnStaffPositionMethod(evt26);
            }
        });
        this.btnEditstaffPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e27) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt27) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditstaffPositionMethod(evt27);
            }
        });
        this.btnEditTermInformation.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e28) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt28) {
                EditingWindow.this.connectToDB();
                EditingWindow.this.btnEditTermInformationMethod(evt28);
            }
        });
        this.fillCoboSelectClass();
    }
    
    public static void main(final String[] args) {
        new EditingWindow();
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
    
    public void btnCloseMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.txtID.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.TextArea.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        final String RegNumber = this.txtID.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int RegNum = rs.getInt(1);
                    Integer.toString(RegNum);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtID.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtID.setText(R);
            final String RegNumber = this.txtID.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String Name = rs.getObject(2).toString();
                this.txtName.setText(Name);
                final String Class = rs.getObject(3).toString();
                this.txtClass.setText(Class);
                this.panel.repaint();
                rs.close();
                this.connection.close();
                pstatement.close();
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtID.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String ClassWork = this.txtClassWorkMarks.getText().toString();
        final String HomeWork = this.txtHomeWorkMarks.getText().toString();
        final String WkNumber = (String)this.ComboWeekNumber.getSelectedItem();
        final String CWorkNo = (String)this.ComboCWorkNo.getSelectedItem();
        final String HWorkNo = (String)this.ComboHWorkNo.getSelectedItem();
        final double cwork = Double.parseDouble(ClassWork);
        final double hwork = Double.parseDouble(HomeWork);
        if (this.ComboWeekNumber.getSelectedItem().toString().equals("SELECT WEEK")) {
            JOptionPane.showMessageDialog(null, "Please, select week!", "Error Occured", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS") || subj.equals("SELECT SUBJECT") || CWorkNo.equals("SELECT C_WORK NO") || HWorkNo.equals("SELECT H_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, select term, form, class,subject, class_work_no or home_work_no!", "Error occured", 0);
        }
        else if (day.equals("dd") || month.equals("mm") || year.equals("yy")) {
            JOptionPane.showMessageDialog(null, "Please, enter day, month or year!", "Error in date", 0);
        }
        else if (RegNum.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, search for Student name!", "Error in student name", 0);
        }
        else if (this.txtClassWorkMarks.getText().toString().equals("") || this.txtHomeWorkMarks.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter scores for classwork or homework!", "Error in class/home work scores entry", 0);
        }
        else if (cwork > 10.0 || hwork > 10.0) {
            JOptionPane.showMessageDialog(null, "you cannot enter marks greater than ten (10) for classwork/homework scores !", "Error in class/home work scores entry", 0);
        }
        else if (this.ComboCWorkNo.getSelectedItem().toString().equals("SELECT C_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Classwork Number", "Error occured", 0);
        }
        else if (this.ComboHWorkNo.getSelectedItem().toString().equals("SELECT C_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Homework Number", "Error occured", 0);
        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO EVACA VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO EVACA VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, WkNumber);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, Name);
                pstatement.setString(4, myclass);
                pstatement.setString(5, term);
                pstatement.setString(6, form);
                pstatement.setString(7, subj);
                pstatement.setString(8, Date);
                pstatement.setString(9, CWorkNo);
                pstatement.setDouble(10, cwork);
                pstatement.setString(11, HWorkNo);
                pstatement.setDouble(12, hwork);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(CWorkNo)) + " Scores = " + ClassWork + " and " + HWorkNo + " Scores = " + HomeWork + " are stored for " + Name);
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final MessageFormat header = new MessageFormat("AcaSoft Evaluations & Cont. Assmng PrintoutPage - {0}");
        final MessageFormat footer = new MessageFormat("AcaSoft Evaluations & Continuous Assessment Data Entry Form");
        try {
            final boolean complete = this.TextArea.print(header, footer);
            if (complete) {
                final String message_for_SuccessfulPrint = "printing is successfully done, thank you.";
                JOptionPane.showMessageDialog(this.btnPrint, "printing is successfully done, thank you.", "Successful Ptinting", 1);
            }
            else {
                final String message_for_NonSuccessfulPrint = "Printer error, check your printer and try again";
                JOptionPane.showMessageDialog(this.btnPrint, "Printer error, check your printer and try again", "Error in Ptinting", 1);
            }
        }
        catch (PrinterException printerE) {
            final String message_for_NonSuccessfulPrint = "Sorry, a printer error occurred";
            JOptionPane.showMessageDialog(this.btnPrint, "Sorry, a printer error occurred", "Error in Printing", 1);
            printerE.printStackTrace();
        }
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        this.TextArea.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final int myRegNum = Integer.parseInt(this.txtID.getText().toString());
        final String RegNum = String.format("%05d", myRegNum);
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String ClassWork = this.txtClassWorkMarks.getText().toString();
        final String HomeWork = this.txtHomeWorkMarks.getText().toString();
        final String WkNumber = (String)this.ComboWeekNumber.getSelectedItem();
        final String CWorkNo = (String)this.ComboCWorkNo.getSelectedItem();
        final String HWorkNo = (String)this.ComboHWorkNo.getSelectedItem();
        if (this.ComboWeekNumber.getSelectedItem().toString().equals("SELECT WEEK")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Please, select week!", "Error Occured", 0);
        }
        else if (this.txtClassWorkMarks.getText().equals("") || this.txtHomeWorkMarks.getText().equals("") || this.txtName.getText().equals("") || this.txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Some textboxes are empty, check and fill the required data", "Error in Evaluations & Cont Assmng", 0);
        }
        else if (this.ComboCWorkNo.getSelectedItem().toString().equals("SELECT C_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Classwork Number", "Error occured", 0);
        }
        else if (this.ComboHWorkNo.getSelectedItem().toString().equals("SELECT H_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Homework Number", "Error occured", 0);
        }
        else {
            this.TextArea.append("ACASSOL SOFT:\n--------------------------------------------------------------\nCOMPUTERIZED EVALUATION AND CONT. ASSESSMENT SLIP\n----------------------------------------------------------------------------------------\n\nWEEK NUMBER: " + WkNumber + "\n" + "NAME OF STUDENT:" + "  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclass + "\n" + "TERM:" + " " + term + "\n" + "FORM:" + "  " + form + "\n" + "SUBJECT:" + "  " + subj + "\n" + "DATE:" + "  " + Date + "\n" + "CLASSWORK NUMBER:  " + CWorkNo + "\n" + "CLASSWORK: " + "  " + ClassWork + "\n" + "HOMEWORK NUMBER:  " + HWorkNo + "\n" + "HOMEWORK:" + "  " + HomeWork + "\n" + "\n");
            this.TextArea.setEditable(true);
        }
    }
    
    public void ComboWeekNumberMethod(final ActionEvent evt8) {
        if (evt8.getSource() == this.ComboWeekNumber) {
            final String cwn = (String)this.ComboWeekNumber.getSelectedItem();
            if (cwn.equals("WEEK ONE")) {
                this.ComboCWorkNo.setSelectedItem("1ST C_WORK");
                this.ComboHWorkNo.setSelectedItem("1ST H_WORK");
            }
            else if (cwn.equals("WEEK TWO")) {
                this.ComboCWorkNo.setSelectedItem("2ND C_WORK");
                this.ComboHWorkNo.setSelectedItem("2ND H_WORK");
            }
            else if (cwn.equals("WEEK THREE")) {
                this.ComboCWorkNo.setSelectedItem("3RD C_WORK");
                this.ComboHWorkNo.setSelectedItem("3RD H_WORK");
            }
            else if (cwn.equals("WEEK FOUR")) {
                this.ComboCWorkNo.setSelectedItem("4TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("4TH H_WORK");
            }
            else if (cwn.equals("WEEK FIVE")) {
                this.ComboCWorkNo.setSelectedItem("5TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("5TH H_WORK");
            }
            else if (cwn.equals("WEEK SIX")) {
                this.ComboCWorkNo.setSelectedItem("6TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("6TH H_WORK");
            }
            else if (cwn.equals("WEEK SEVEN")) {
                this.ComboCWorkNo.setSelectedItem("7TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("7TH H_WORK");
            }
            else if (cwn.equals("WEEK EIGHT")) {
                this.ComboCWorkNo.setSelectedItem("8TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("8TH H_WORK");
            }
            else if (cwn.equals("WEEK NINE")) {
                this.ComboCWorkNo.setSelectedItem("9TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("9TH H_WORK");
            }
            else if (cwn.equals("WEEK TEN")) {
                this.ComboCWorkNo.setSelectedItem("10TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("10TH H_WORK");
            }
            else if (cwn.equals("WEEK ELEVEN")) {
                this.ComboCWorkNo.setSelectedItem("11TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("11TH H_WORK");
            }
            else if (cwn.equals("WEEK TWELVE")) {
                this.ComboCWorkNo.setSelectedItem("12TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("12TH H_WORK");
            }
            else if (cwn.equals("WEEK THIRTEEN")) {
                this.ComboCWorkNo.setSelectedItem("13TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("13TH H_WORK");
            }
            else if (cwn.equals("WEEK FOURTEEN")) {
                this.ComboCWorkNo.setSelectedItem("14TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("14TH H_WORK");
            }
            else if (cwn.equals("WEEK FIFTEEN")) {
                this.ComboCWorkNo.setSelectedItem("15TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("15TH H_WORK");
            }
            this.panel.repaint();
            this.panel.revalidate();
        }
    }
    
    public void btnPreviousMethod(final ActionEvent e9) {
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtID.getText().toString());
            final String R = Integer.toString(--Reg);
            this.txtID.setText(R);
            final String RegNumber = this.txtID.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String Name = rs.getObject(2).toString();
                this.txtName.setText(Name);
                final String Class = rs.getObject(3).toString();
                this.txtClass.setText(Class);
                this.panel.repaint();
                rs.close();
                this.connection.close();
                pstatement.close();
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
    }
    
    public void btnViewForNameMethod(final ActionEvent e10) {
        this.txtEnterNewName.setText("");
        this.txtCurrentName.setText("");
        final String myid = this.txtRegNo.getText().toString();
        final String myclasses = (String)this.ComboSelecClass.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final int ID = Integer.parseInt(this.txtRegNo.getText().toString());
        if (myid.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, supply Student ID!", "Error occured", 0);
        }
        else if (myid.equalsIgnoreCase("Select Class")) {
            JOptionPane.showMessageDialog(null, "please, supply Student ID!", "Error occured", 0);
        }
        else if (this.txtRegNo.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, supply Student ID!", "Error occured", 0);
        }
        else {
            this.pulledCLassName_ENG();
            this.StudClassRegTableName = this.pulledClassName_Eng;
            try {
                final String QueryString = "SELECT StdName,SEX FROM " + this.StudClassRegTableName + " WHERE StdClass=? AND StdID=?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, myclasses);
                pstatement.setInt(2, ID);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String CurrentName = rs.getString(1);
                    final String CurrentSex = rs.getString(2);
                    this.txtCurrentName.setText(CurrentName);
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
    
    public void btnViewForRegNumMethod(final ActionEvent e31) {
        final String myid = this.txtIDEditRegNum.getText().toString();
        final String myClassForEditing = (String)this.ComboSelecClass.getSelectedItem();
        this.txtCurrentRegNum.setText("");
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String myclasses = (String)this.ComboSelecClass.getSelectedItem();
        final int ID = Integer.parseInt(this.txtIDEditRegNum.getText().toString());
        if (myclass.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, Select Class!", "Error occured", 0);
        }
        else if (myclass.equalsIgnoreCase("Select Class")) {
            JOptionPane.showMessageDialog(null, "please, Select Class!", "Error occured", 0);
        }
        else if (this.txtIDEditRegNum.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, supply Student ID!", "Error occured", 0);
        }
        else if (myclass.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, Select Class!", "Error occured", 0);
        }
        else {
            this.pulledCLassName_ENG();
            this.StudClassRegTableName = this.pulledClassName_Eng;
            try {
                final String QueryString = "SELECT StdName,SEX,StdRegNum  FROM " + this.StudClassRegTableName + " WHERE StdClass=? AND StdID=?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, myclasses);
                pstatement.setInt(2, ID);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String CurrentName = rs.getString(1);
                    final String CurrentSex = rs.getString(2);
                    final String CurrentRegNum = rs.getString(3);
                    this.txtCurrentGender.setText(CurrentSex);
                    this.txtCurrentName.setText(CurrentName);
                    this.txtCurrentRegNum.setText(CurrentRegNum);
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
    
    public void btnViewForGenderMethod(final ActionEvent e30) {
        this.txtEterNewGender.setText("");
        this.txtCurrentGender.setText("");
        final String myid = this.txtRegNo_forGender.getText().toString();
        final String myClassForEditing = (String)this.ComboSelecClass.getSelectedItem();
        final int ID = Integer.parseInt(this.txtRegNo_forGender.getText().toString());
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClassForEditing.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class!", "Class Selection Error", 0);
        }
        else if (this.txtRegNo_forGender.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, the student regnum!", "Registration Number Error", 0);
        }
        else if (myClassForEditing.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class!", "Class Selection Error", 0);
        }
        else if (myid.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, supply Student ID!", "Error occured", 0);
        }
        else {
            final String myclasses = (String)this.ComboSelecClass.getSelectedItem();
            this.pulledCLassName_ENG();
            this.StudClassRegTableName = this.pulledClassName_Eng;
            try {
                final String QueryString = "SELECT StdName,SEX FROM " + this.StudClassRegTableName + " WHERE StdClass=? AND StdID=?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, myclasses);
                pstatement.setInt(2, ID);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String CurrentName = rs.getString(1);
                    final String CurrentSex = rs.getString(2);
                    this.txtCurrentName.setText(CurrentName);
                    this.txtCurrentGender.setText(CurrentSex);
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
    
    public void btnEditForGenderMethod(final ActionEvent e31) {
        final String NewName = this.txtEnterNewName.getText().toString();
        final String NewGender = this.txtEterNewGender.getText().toString();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String myClassForEditing = (String)this.ComboSelecClass.getSelectedItem();
        final int ID = Integer.parseInt(this.txtRegNo_forGender.getText().toString());
        final String NewRegNum = this.txtIDEditNewRegNum.getText().toString();
        if (this.txtEterNewGender.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, supply a New Gender\n", "Error occured", 0);
        }
        else {
            this.pulledCLassName_ENG();
            this.EditiViewTable = this.pulledEditiViewTable;
            try {
                final String QueryString = "UPDATE " + this.EditiViewTable + " SET Sex =? WHERE StdID = ? AND StdClass=? ";
                (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, NewGender);
                this.pstatement.setInt(2, ID);
                this.pstatement.setString(3, myClassForEditing);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = "\n student name has been modified to ( " + NewName + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e32) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e32.getMessage(), "Error occured", 0);
                e32.printStackTrace();
            }
        }
    }
    
    public void btnEditForEditRegNumMethod(final ActionEvent e32) {
        int mycounter = 0;
        final String NewRegNum = this.txtIDEditNewRegNum.getText().toString();
        final int ID = Integer.parseInt(this.txtIDEditRegNum.getText().toString());
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String myClassForEditing = (String)this.ComboSelecClass.getSelectedItem();
        this.pulledCLassName_ENG();
        this.EditiViewTable = this.pulledEditiViewTable;
        try {
            final String QueryString = "SELECT StdRegNum FROM " + this.EditiViewTable + " WHERE StdRegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
            pstatement.setString(1, NewRegNum);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String Regnumber = rs.getString(1);
                JOptionPane.showMessageDialog(null, "This registration number: " + Regnumber + " Already exists", "Thank you", 0);
                System.out.println("Regnum replacement NOT POSSIBLE");
                ++mycounter;
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (mycounter > 0) {
            System.out.println("u can not edit");
        }
        else if (NewRegNum.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "New RegNum can not be null\n", "Error occured", 0);
        }
        else {
            System.out.println("u can edit");
            try {
                final String QueryString = "UPDATE " + this.EditiViewTable + " SET StdRegNum =? WHERE StdID=?";
                (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, NewRegNum);
                this.pstatement.setInt(2, ID);
                this.pstatement.executeUpdate();
                System.out.println(ID);
                final String message_for_SuccessfulModification = "\n student regnum has been modified to ( " + NewRegNum + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                final int numberOfRowsUpdated = this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e33) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e33.getMessage(), "Error occured", 0);
                e33.printStackTrace();
            }
        }
    }
    
    public void btnEditForNameMethod(final ActionEvent e11) {
        final String NewName = this.txtEnterNewName.getText().toString();
        final String NewGender = this.txtEterNewGender.getText().toString();
        final int ID = Integer.parseInt(this.txtRegNo.getText().toString());
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String myClassForEditing = (String)this.ComboSelecClass.getSelectedItem();
        final String NewRegNum = this.txtIDEditNewRegNum.getText().toString();
        if (this.txtEnterNewName.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, supply a New Student Name\n", "Error occured", 0);
        }
        else {
            this.pulledCLassName_ENG();
            this.EditiViewTable = this.pulledEditiViewTable;
            try {
                final String QueryString = "UPDATE " + this.EditiViewTable + " SET StdName =? WHERE StdID = ? AND StdClass=? ";
                (this.pstatement = this.connection.prepareStatement(QueryString)).setString(1, NewName);
                this.pstatement.setInt(2, ID);
                this.pstatement.setString(3, myClassForEditing);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = "\n student name has been modified to ( " + NewName + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                final int numberOfRowsUpdated = this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e12) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e12.getMessage(), "Error occured", 0);
                e12.printStackTrace();
            }
        }
    }
    
    public void btnEditForclassMethod(final ActionEvent e13) {
    }
    
    public void btnViewForHomeWorkMethod(final ActionEvent e14) {
        this.txtNewMarksHomeWork.setText("");
        this.txtMarksHomeWork.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNoClassHomeWork.getText().toString();
        final String HwkNo = (String)this.ComboSelectHomeWorkNo.getSelectedItem();
        try {
            final String QueryString = "SELECT StdName FROM StudentReg where StdRegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM StudentReg where StdRegNum=?");
            pstatement.setString(1, RegNumber);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String CurrentName = rs.getString(1);
                this.txtNameHomeWork.setText(CurrentName);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        try {
            final String QueryString = "SELECT HomeWork FROM dataentry where RegNum=? and Form=? and Class=? and Term=? and Subject=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT HomeWork FROM dataentry where RegNum=? and Form=? and Class=? and Term=? and Subject=?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, subj);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String myCurrentHWMarks = rs.getString(1);
                this.txtMarksHomeWork.setText(myCurrentHWMarks);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnEditForHomeWorkMethod(final ActionEvent e15) {
        final String NewHwMarks = this.txtNewMarksHomeWork.getText().toString();
        final double Hwmarks = Double.parseDouble(NewHwMarks);
        final String RegNumber = this.txtRegNoClassHomeWork.getText().toString();
        try {
            final String QueryString = "UPDATE\tdataentry SET HomeWork =? WHERE RegNum = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentry SET HomeWork =? WHERE RegNum = ?")).setDouble(1, Hwmarks);
            this.pstatement.setString(2, RegNumber);
            this.pstatement.executeUpdate();
            final String message_for_SuccessfulModification = "\n student's Hw_Marks has been modified to ( " + NewHwMarks + " )" + " successfully.";
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
            final int numberOfRowsUpdated = this.pstatement.executeUpdate();
            this.connection.close();
            this.pstatement.close();
        }
        catch (SQLException e16) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e16.getMessage(), "Error occured", 0);
            e16.printStackTrace();
        }
    }
    
    public void btnViewForClassWorkMethod(final ActionEvent e14) {
        this.txtNewMarksClassWork.setText("");
        this.txtMarksClassWork.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNoClassClassWork.getText().toString();
        final String CwkNo = (String)this.ComboSelectClassWorkNo.getSelectedItem();
        try {
            final String QueryString = "SELECT StdName FROM StudentReg where StdRegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM StudentReg where StdRegNum=?");
            pstatement.setString(1, RegNumber);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String CurrentName = rs.getString(1);
                this.txtNameClassWork.setText(CurrentName);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnEditForClassWorkMethod(final ActionEvent e16) {
        final String NewCwMarks = this.txtNewMarksClassWork.getText().toString();
        final double Cwmarks = Double.parseDouble(NewCwMarks);
        final String RegNumber = this.txtRegNoClassClassWork.getText().toString();
    }
    
    public void btnViewForCATestMethod(final ActionEvent e17) {
        this.txtNewMarksCATest.setText("");
        this.txtMarksCATest.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNoCATest.getText().toString();
        final String TestNo = (String)this.ComboSelectCATestNo.getSelectedItem();
        try {
            final String QueryString = "SELECT StdName FROM StudentReg where StdRegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM StudentReg where StdRegNum=?");
            pstatement.setString(1, RegNumber);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String CurrentName = rs.getString(1);
                this.txtNameCATest.setText(CurrentName);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (TestNo.equals("1ST TEST")) {
            try {
                final String QueryString = "SELECT Test1 FROM dataentry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Test1 FROM dataentry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, form);
                pstatement.setString(3, myclass);
                pstatement.setString(4, term);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String TestScores = rs.getString(1);
                    this.txtMarksCATest.setText(TestScores);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (TestNo.equals("2ND TEST")) {
            try {
                final String QueryString = "SELECT Test2 FROM dataentry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Test2 FROM dataentry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, form);
                pstatement.setString(3, myclass);
                pstatement.setString(4, term);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String TestScores = rs.getString(1);
                    this.txtMarksCATest.setText(TestScores);
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
    
    public void btnEditForCATestMethod(final ActionEvent e18) {
        final String NewtTestMarks = this.txtNewMarksCATest.getText().toString();
        final double CATestmarks = Double.parseDouble(NewtTestMarks);
        final String RegNumber = this.txtRegNoCATest.getText().toString();
        final String TestNo = (String)this.ComboSelectCATestNo.getSelectedItem();
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        if (TestNo.equals("1ST TEST")) {
            try {
                final String QueryString = "UPDATE\tDataEntry SET Test1 =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tDataEntry SET Test1 =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?")).setDouble(1, CATestmarks);
                this.pstatement.setString(2, RegNumber);
                this.pstatement.setString(3, form);
                this.pstatement.setString(4, myclass);
                this.pstatement.setString(5, term);
                this.pstatement.setString(6, subj);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = "\n student's Test Score  has been modified to ( " + CATestmarks + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                final int numberOfRowsUpdated = this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e19) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e19.getMessage(), "Error occured", 0);
                e19.printStackTrace();
            }
        }
        else if (TestNo.equals("2ND TEST")) {
            try {
                final String QueryString = "UPDATE\tDataEntry SET Test2 =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tDataEntry SET Test2 =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?")).setDouble(1, CATestmarks);
                this.pstatement.setString(2, RegNumber);
                this.pstatement.setString(3, form);
                this.pstatement.setString(4, myclass);
                this.pstatement.setString(5, term);
                this.pstatement.setString(6, subj);
                this.pstatement.executeUpdate();
                final String message_for_SuccessfulModification = "\n student's Test Score has been modified to ( " + CATestmarks + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                final int numberOfRowsUpdated = this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e19) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e19.getMessage(), "Error occured", 0);
                e19.printStackTrace();
            }
        }
    }
    
    public void btnViewForExaminationMethod(final ActionEvent e19) {
        this.txtNewMarksExamination.setText("");
        this.txtMarksExamination.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNoExamination.getText().toString();
        try {
            final String QueryString = "SELECT StdName FROM StudentReg where StdRegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName FROM StudentReg where StdRegNum=?");
            pstatement.setString(1, RegNumber);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String CurrentName = rs.getString(1);
                this.txtNameExamination.setText(CurrentName);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        try {
            final String QueryString = "SELECT Exam FROM DataEntry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Exam FROM DataEntry WHERE RegNum=? and Form=? and Class=? and Term=? and Subject=?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, subj);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String ExamScores = rs.getString(1);
                this.txtMarksExamination.setText(ExamScores);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnEditForExaminationMethod(final ActionEvent e20) {
        final String NewtTestMarks = this.txtNewMarksExamination.getText().toString();
        final double CATestmarks = Double.parseDouble(NewtTestMarks);
        final String RegNumber = this.txtRegNoExamination.getText().toString();
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        try {
            final String QueryString = "UPDATE DataEntry SET Exam =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?";
            (this.pstatement = this.connection.prepareStatement("UPDATE DataEntry SET Exam =? WHERE RegNum = ? and  Form=? and Class=? and Term=? and Subject=?")).setDouble(1, CATestmarks);
            this.pstatement.setString(2, RegNumber);
            this.pstatement.setString(3, form);
            this.pstatement.setString(4, myclass);
            this.pstatement.setString(5, term);
            this.pstatement.setString(6, subj);
            this.pstatement.executeUpdate();
            final String message_for_SuccessfulModification = "\n student's Test Score  has been modified to ( " + CATestmarks + " )" + " successfully.";
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
            final int numberOfRowsUpdated = this.pstatement.executeUpdate();
            this.connection.close();
            this.pstatement.close();
        }
        catch (SQLException e21) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e21.getMessage(), "Error occured", 0);
            e21.printStackTrace();
        }
    }
    
    public void btnViewTermEndsMethod(final ActionEvent e21) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        try {
            final String QueryString = "SELECT TermEnds FROM TermInformation where Term=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT TermEnds FROM TermInformation where Term=?");
            pstatement.setString(1, term);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String TermEnds = rs.getString(1);
                this.txtTermEnds.setText(TermEnds);
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
    
    public void btnEditTermEndsMethod(final ActionEvent e22) {
        final String NewDate = this.txtNewTermEnds.getText().toString();
        final String term = (String)this.ComboTerm.getSelectedItem();
        try {
            final String QueryString = "UPDATE\tTermInformation SET TermEnds =? WHERE Term = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tTermInformation SET TermEnds =? WHERE Term = ?")).setString(1, NewDate);
            this.pstatement.setString(2, term);
            this.pstatement.executeUpdate();
            final String message_for_SuccessfulModification = "\n 'Term Ends' has been modified to: ( " + NewDate + " )" + " successfully.";
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
            final int numberOfRowsUpdated = this.pstatement.executeUpdate();
            this.connection.close();
            this.pstatement.close();
        }
        catch (SQLException e23) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e23.getMessage(), "Error occured", 0);
            e23.printStackTrace();
        }
    }
    
    public void btnViewTermBeginsMethod(final ActionEvent e23) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        try {
            final String QueryString = "SELECT NxtTermBegins FROM TermInformation where Term=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT NxtTermBegins FROM TermInformation where Term=?");
            pstatement.setString(1, term);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String NextTermBegins = rs.getString(1);
                this.txtNextTermBegins.setText(NextTermBegins);
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
    
    public void btnEditTermBeginsMethod(final ActionEvent e24) {
        final String NewDate = this.txtNewTermBegins.getText().toString();
        final String term = (String)this.ComboTerm.getSelectedItem();
        try {
            final String QueryString = "UPDATE\tTermInformation SET NxtTermBegins=? WHERE Term = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tTermInformation SET NxtTermBegins=? WHERE Term = ?")).setString(1, NewDate);
            this.pstatement.setString(2, term);
            this.pstatement.executeUpdate();
            final String message_for_SuccessfulModification = "\n 'Next Term Begins' has been modified to: ( " + NewDate + " )" + " successfully.";
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
            final int numberOfRowsUpdated = this.pstatement.executeUpdate();
            this.connection.close();
            this.pstatement.close();
        }
        catch (SQLException e25) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e25.getMessage(), "Error occured", 0);
            e25.printStackTrace();
        }
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt25) {
        if (evt25.getSource() == this.ComboSelecClass) {
            final String csc = (String)this.ComboSelecClass.getSelectedItem();
            if (csc.equals("PRIMARY ONE") || csc.equals("PRIMARY TWO") || csc.equals("PRIMARY THREE") || csc.equals("PRIMARY FOUR") || csc.equals("PRIMARY FIVE") || csc.equals("PRIMARY SIX")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("QUANTITATIVE REASONING");
                this.ComboSelectSubj.addItem("VERBAL REASONING");
                this.ComboSelectSubj.addItem("HEALTH EDUCATION");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("QURAN");
                this.ComboSelectSubj.addItem("I.R.K.");
                this.ComboSelectSubj.addItem("HAND WRITING");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("BASIC SCIENCE");
                this.ComboSelectSubj.addItem("CIVIC EDUCATION");
                this.ComboSelectSubj.addItem("ARABIC");
                this.ComboSelectSubj.addItem("PHONICS");
                this.ComboSelectSubj.addItem("CREATIVE ART");
                this.ComboSelectSubj.addItem("FRENCH");
                this.ComboSelectSubj.addItem("HAUSA");
            }
            else if (csc.equals("NURSERY ONE") || csc.equals("NURSERY TWO") || csc.equals("NURSERY THREE") || csc.equals("NURSERY FOUR")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("QUANTITATIVE REASONING");
                this.ComboSelectSubj.addItem("VERBAL REASONING");
                this.ComboSelectSubj.addItem("HEALTH EDUCATION");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("QURAN");
                this.ComboSelectSubj.addItem("I.R.K.");
                this.ComboSelectSubj.addItem("HAND WRITING");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("BASIC SCIENCE");
                this.ComboSelectSubj.addItem("CIVIC EDUCATION");
                this.ComboSelectSubj.addItem("ARABIC");
                this.ComboSelectSubj.addItem("PHONICS");
                this.ComboSelectSubj.addItem("CREATIVE ART");
                this.ComboSelectSubj.addItem("FRENCH");
                this.ComboSelectSubj.addItem("HAUSA");
            }
            else if (csc.equals("PRIMARY ONE-ISLAMIYYA") || csc.equals("PRIMARY TWO-ISLAMIYYA") || csc.equals("PRIMARY THREE-ISLAMIYYA") || csc.equals("PRIMARY FOUR-ISLAMIYYA") || csc.equals("PRIMARY FIVE-ISLAMIYYA") || csc.equals("PRIMARY SIX-ISLAMIYYA")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("AL-QURAN");
                this.ComboSelectSubj.addItem("AL-AZKAR");
                this.ComboSelectSubj.addItem("AL-HURUF");
                this.ComboSelectSubj.addItem("AL-ULUM");
                this.ComboSelectSubj.addItem("AT-TAUHEED");
                this.ComboSelectSubj.addItem("AL-ARABIYYA");
                this.ComboSelectSubj.addItem("AL-HADITH");
                this.ComboSelectSubj.addItem("AL-KHADDU");
                this.ComboSelectSubj.addItem("AT-TAJWEED");
                this.ComboSelectSubj.addItem("AL-FIQHU WASSULUQ");
                this.ComboSelectSubj.addItem("AL-WARAQAH AL'AMMAH");
                this.ComboSelectSubj.addItem("AS-SIRA");
            }
            else if (csc.equals("NURSERY ONE-ISLAMIYYA") || (csc.equals("NURSERY TWO-ISLAMIYYA") | csc.equals("NURSERY THREE-ISLAMIYYA") | csc.equals("NURSERY FOUR-ISLAMIYYA"))) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("AL-QURAN");
                this.ComboSelectSubj.addItem("AL-AZKAR");
                this.ComboSelectSubj.addItem("AL-HURUF");
                this.ComboSelectSubj.addItem("AL-ULUM");
                this.ComboSelectSubj.addItem("AT-TAUHEED");
                this.ComboSelectSubj.addItem("AL-ARABIYYA");
                this.ComboSelectSubj.addItem("AL-HADITH");
                this.ComboSelectSubj.addItem("AL-KHADDU");
                this.ComboSelectSubj.addItem("AT-TAJWEED");
                this.ComboSelectSubj.addItem("AL-FIQHU WASSULUQ");
                this.ComboSelectSubj.addItem("AL-WARAQAH AL'AMMAH");
                this.ComboSelectSubj.addItem("AS-SIRA");
            }
            else {
                this.ComboSelectSubj.setSelectedItem("SELECT SUBJECT");
            }
            this.panel.repaint();
            this.panel.revalidate();
        }
    }
    
    public void btnStaffPositionMethod(final ActionEvent e26) {
        this.txtstaffPositionName.setText("");
        final String StaffPosition = (String)this.CombolblStaffRank.getSelectedItem();
        final int StaffID = Integer.parseInt(this.txtstaffPositionID.getText().toString());
        if (this.txtstaffPositionID.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "please, supply staff ID ", "Error occured", 0);
        }
        else {
            try {
                final String QueryString = "SELECT staffName FROM staffdatacapture WHERE StaffID=?";
                (this.pstatement = this.connection.prepareStatement("SELECT staffName FROM staffdatacapture WHERE StaffID=?")).setInt(1, StaffID);
                final ResultSet rs = this.pstatement.executeQuery();
                while (rs.next()) {
                    final String position = rs.getString(1);
                    this.txtstaffPositionName.setText(position);
                }
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e27) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e27.getMessage(), "Error occured", 0);
                e27.printStackTrace();
            }
        }
    }
    
    public void btnEditstaffPositionMethod(final ActionEvent e27) {
        final String Newname = this.txtstaffPositionNewName.getText().toString();
        final int StaffID = Integer.parseInt(this.txtstaffPositionID.getText().toString());
        try {
            final String QueryString = "UPDATE\tstaffdatacapture SET StaffName=? WHERE StaffID = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tstaffdatacapture SET StaffName=? WHERE StaffID = ?")).setString(1, Newname);
            this.pstatement.setInt(2, StaffID);
            this.pstatement.executeUpdate();
            final String ID = String.format("%04d", StaffID);
            final String message_for_SuccessfulModification = "\n Staff name with " + ID + "  has been modified to: " + "( " + Newname + " )" + " successfully.";
            JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
            final int numberOfRowsUpdated = this.pstatement.executeUpdate();
            this.connection.close();
            this.pstatement.close();
        }
        catch (SQLException e28) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + e28.getMessage(), "Error occured", 0);
            e28.printStackTrace();
        }
    }
    
    public void btnEditTermInformationMethod(final ActionEvent e28) {
        final editTerminformation eti = new editTerminformation();
        eti.editTerminformation();
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
                    this.ComboSelecClass.addItem(ComboClassName);
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
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        Label_0231: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString("Classname_Eng");
                    this.pulledEditiViewTable = rs.getString("Classname_Eng");
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
                break Label_0231;
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
