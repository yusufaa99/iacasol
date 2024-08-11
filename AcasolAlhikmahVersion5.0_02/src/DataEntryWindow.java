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
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class DataEntryWindow extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JButton btnSchFeesManagement;
    private JButton btnStudentDataCapture;
    private JButton btnStaffDataCapture;
    private JButton btnStudentBehaviour;
    private JButton btnAttendance;
    private JButton btnHWorkAndCWorkDataEntry;
    private JButton btnDataEntry;
    private JButton btnCheckForDataEntry;
    private JButton btnCheckForBehaviours;
    private JButton btnCheckForAttendance;
    private JButton btnSpecifyMAXnoINclass;
    private JButton btnSecondDataEntry;
    private JButton btnThirdDataEntry;
    private JButton btnExamsDataEntry;
    private JButton btnCommentDataEntry;
    private JButton btnCAResultComputation;
    private JButton btnOverallTotalAndAverageComputation;
    private JButton btnRankingAndGrading;
    private JButton btnPrintingOfReportSheet;
    private JButton btnPrintingOfCASheet;
    private JButton btnReportSheetReport;
    private JButton btnCASheetReport;
    private JButton btnQueryReport;
    private JButton btnTermInformation;
    private JButton btnFeesSpec;
    private JButton btnFeesManagement;
    private JLabel lblResultAndReport;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblTerm;
    private JLabel lblForm;
    private JLabel lblSubject;
    private JLabel lbldate;
    private JLabel lblDay;
    private JLabel lblMonth;
    private JLabel lblYear;
    private JLabel lblTest;
    private JLabel lblHomeWork;
    private JLabel lblSelectTest;
    private JLabel lblTestMarks;
    private JLabel lblOutput;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtTestMarks;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox comboTest;
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
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JButton btnclose;
    private JTextField txtmyclass;
    
    public void DataEntryWindow() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.btnSchFeesManagement = new JButton("Sch. Fees Management");
        this.btnStudentDataCapture = new JButton("Student Data Capture");
        this.btnStaffDataCapture = new JButton("Staff Data Capture Tab ");
        this.btnStudentBehaviour = new JButton("Student Behaviour");
        this.btnStudentBehaviour = new JButton("Student Behavior");
        this.btnAttendance = new JButton("Attendance Management");
        this.btnHWorkAndCWorkDataEntry = new JButton("Home Work Data Entry  ");
        this.btnDataEntry = new JButton(" Data Entry ");
        this.btnCheckForDataEntry = new JButton(" Check Data Entry ");
        this.btnCheckForBehaviours = new JButton(" Check Behaviour ");
        this.btnCheckForAttendance = new JButton(" Check Attendance ");
        this.btnSpecifyMAXnoINclass = new JButton(" SpecifyMAXnoINclass ");
        this.btnSecondDataEntry = new JButton("2ND Test Data Entry");
        this.btnThirdDataEntry = new JButton("3RD Test Data Entry");
        this.btnExamsDataEntry = new JButton("Exams Data Entry");
        this.btnCommentDataEntry = new JButton("Comment/Report");
        this.btnCAResultComputation = new JButton("C.A. Result Computation");
        this.btnOverallTotalAndAverageComputation = new JButton("OverallTotal&Average");
        this.btnRankingAndGrading = new JButton("Ranking&Grading");
        this.btnPrintingOfReportSheet = new JButton("ReportSheet Prrinting");
        this.btnPrintingOfCASheet = new JButton("C.A.Sheet Printing");
        this.btnReportSheetReport = new JButton("ReportSheet Report");
        this.btnCASheetReport = new JButton("C.A. Report");
        this.btnQueryReport = new JButton("Query Report");
        this.btnTermInformation = new JButton("Term Information");
        this.btnFeesSpec = new JButton("Fee Specification");
        this.btnFeesManagement = new JButton("Fee Management");
        this.lblResultAndReport = new JLabel("RESULT/REPORT PROCESSING:");
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblRegNum = new JLabel("REGISTRATION NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblTerm = new JLabel("TERM:");
        this.lblForm = new JLabel("FORM:");
        this.lblSubject = new JLabel("SUBJECT:");
        this.lbldate = new JLabel("DATE:");
        this.lblDay = new JLabel("DAY:");
        this.lblMonth = new JLabel("MONTH");
        this.lblYear = new JLabel("YEAR:");
        this.lblTest = new JLabel("TEST:");
        this.lblHomeWork = new JLabel("HOMEWORK:");
        this.lblSelectTest = new JLabel("SELECT TEST:");
        this.lblTestMarks = new JLabel("TEST SCORE");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.txtRegNum = new JTextField(7);
        this.txtName = new JTextField(35);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtTestMarks = new JTextField(5);
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.addItem("SSS1 A");
        this.ComboSelecClass.addItem("SSS2 A");
        this.ComboSelecClass.addItem("SSS3 A");
        this.ComboSelecClass.addItem("SSS1 B");
        this.ComboSelecClass.addItem("SSS2 B");
        this.ComboSelecClass.addItem("SSS3 B");
        this.ComboSelecClass.addItem("JSS I A");
        this.ComboSelecClass.addItem("JSS II A");
        this.ComboSelecClass.addItem("JSS III A");
        this.ComboSelecClass.addItem("JSS I B");
        this.ComboSelecClass.addItem("JSS II B");
        this.ComboSelecClass.addItem("JSS III B");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("FIRST TERM");
        this.ComboTerm.addItem("SECOND TERM");
        this.ComboTerm.addItem("THIRD TERM");
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        (this.ComboSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
        this.ComboSelectSubj.addItem("Quran");
        this.ComboSelectSubj.addItem("Arabic Language");
        this.ComboSelectSubj.addItem("Biology");
        this.ComboSelectSubj.addItem("Chemistry");
        this.ComboSelectSubj.addItem("Computer Science");
        this.ComboSelectSubj.addItem("Economics");
        this.ComboSelectSubj.addItem("English Language");
        this.ComboSelectSubj.addItem("Foods and Nutrition");
        this.ComboSelectSubj.addItem("Further Mathematics");
        this.ComboSelectSubj.addItem("Geography");
        this.ComboSelectSubj.addItem("Government");
        this.ComboSelectSubj.addItem("Hausa");
        this.ComboSelectSubj.addItem("History");
        this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
        this.ComboSelectSubj.addItem("Literature in English");
        this.ComboSelectSubj.addItem("Mathematics");
        this.ComboSelectSubj.addItem("Physics");
        this.ComboSelectSubj.addItem("ENGLISHjss");
        this.ComboSelectSubj.addItem("MATHSjss");
        this.ComboSelectSubj.addItem("IRSjss");
        this.ComboSelectSubj.addItem("ARABICjss");
        this.ComboSelectSubj.addItem("HOME ECONOMICjss");
        this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCEjss");
        this.ComboSelectSubj.addItem("PHEjss");
        this.ComboSelectSubj.addItem("BASIC SCIENCEjss");
        this.ComboSelectSubj.addItem("CIVIC EDUCATIONjss");
        this.ComboSelectSubj.addItem("LITERATURE IN ENGLISHjss");
        this.ComboSelectSubj.addItem("QURANjss");
        this.ComboSelectSubj.addItem("HAUSAjss");
        this.ComboSelectSubj.addItem("COMPUTER SCIENCEjss");
        this.ComboSelectSubj.addItem("BASIC TECHNOLOGYjss");
        this.ComboSelectSubj.addItem("CCAjss");
        this.ComboSelectSubj.addItem("SOCIAL STUDIES");
        this.ComboSelectSubj.addItem("INTEGRATED SCIENCEjss");
        this.ComboSelectSubj.addItem("INTRO TECHNOLOGYjss");
        this.ComboSelectSubj.addItem("BUSINESS STUDIESjss");
        this.ComboSelectSubj.addItem("QURAN & TAJWEEDjss");
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
        this.ComboYear.setEditable(true);
        (this.comboTest = new JComboBox()).addItem("1ST TEST");
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
        this.btnPreview = new JButton("Preview");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REGISTRATION NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Quran");
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
        this.lblQueryAllSelecTerm = new JLabel("SELECT TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
        this.ComboQueryAllSelectSubj.addItem("Quran");
        this.ComboQueryAllSelectSubj.addItem("Arabic Language");
        this.ComboQueryAllSelectSubj.addItem("Biology");
        this.ComboQueryAllSelectSubj.addItem("Chemistry");
        this.ComboQueryAllSelectSubj.addItem("Computer science");
        this.ComboQueryAllSelectSubj.addItem("Economics");
        this.ComboQueryAllSelectSubj.addItem("English Language");
        this.ComboQueryAllSelectSubj.addItem("Foods and Nutrition");
        this.ComboQueryAllSelectSubj.addItem("Further mathematics ");
        this.ComboQueryAllSelectSubj.addItem("Geography");
        this.ComboQueryAllSelectSubj.addItem("Government");
        this.ComboQueryAllSelectSubj.addItem("Hausa");
        this.ComboQueryAllSelectSubj.addItem("History ");
        this.ComboQueryAllSelectSubj.addItem("Islamic Religion Knowledge ");
        this.ComboQueryAllSelectSubj.addItem("Literature in English");
        this.ComboQueryAllSelectSubj.addItem("Mathematics");
        this.ComboQueryAllSelectSubj.addItem("Physics");
        (this.ComboQueryAllSelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQueryAllSelectTerm.addItem("SECOND TERM");
        this.ComboQueryAllSelectTerm.addItem("THIRD TERM");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.btnclose = new JButton("Close");
        this.TextArea = new JTextArea(8, 40);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
        this.txtmyclass = new JTextField();
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(270, 450);
        this.setTitle("Data Entry Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnDataEntry.setBackground(Color.GREEN);
        this.btnDataEntry.setForeground(Color.BLACK);
        this.btnCheckForDataEntry.setBackground(Color.BLACK);
        this.btnCheckForDataEntry.setForeground(Color.white);
        this.btnCheckForBehaviours.setBackground(Color.BLACK);
        this.btnCheckForBehaviours.setForeground(Color.white);
        this.btnCheckForAttendance.setBackground(Color.BLACK);
        this.btnCheckForAttendance.setForeground(Color.white);
        this.btnAttendance.setBackground(Color.GREEN);
        this.btnAttendance.setForeground(Color.BLACK);
        this.btnStudentBehaviour.setBackground(Color.GREEN);
        this.btnStudentBehaviour.setForeground(Color.BLACK);
        this.btnSpecifyMAXnoINclass.setBackground(Color.GREEN);
        this.btnSpecifyMAXnoINclass.setForeground(Color.BLACK);
        this.btnCommentDataEntry.setBackground(Color.GREEN);
        this.btnCommentDataEntry.setForeground(Color.BLACK);
        this.btnStudentDataCapture.setBackground(Color.GREEN);
        this.btnStudentDataCapture.setForeground(Color.BLACK);
        this.btnSchFeesManagement.setBackground(Color.GREEN);
        this.btnSchFeesManagement.setForeground(Color.BLACK);
        this.btnCommentDataEntry.setBackground(Color.GREEN);
        this.btnCommentDataEntry.setForeground(Color.BLACK);
        this.btnTermInformation.setBackground(Color.GREEN);
        this.btnTermInformation.setForeground(Color.BLACK);
        this.btnFeesSpec.setBackground(Color.GREEN);
        this.btnFeesSpec.setForeground(Color.GRAY);
        this.btnFeesManagement.setBackground(Color.GREEN);
        this.btnFeesManagement.setForeground(Color.RED);
        this.btnclose.setForeground(Color.white);
        this.btnCAResultComputation.setBackground(Color.black);
        this.btnCAResultComputation.setForeground(Color.red);
        this.btnOverallTotalAndAverageComputation.setBackground(Color.red);
        this.btnOverallTotalAndAverageComputation.setForeground(Color.magenta);
        this.btnRankingAndGrading.setBackground(Color.black);
        this.btnRankingAndGrading.setForeground(Color.magenta);
        this.btnPrintingOfReportSheet.setBackground(Color.black);
        this.btnPrintingOfReportSheet.setForeground(Color.magenta);
        this.btnPrintingOfCASheet.setBackground(Color.black);
        this.btnPrintingOfCASheet.setForeground(Color.magenta);
        this.btnReportSheetReport.setBackground(Color.black);
        this.btnReportSheetReport.setForeground(Color.magenta);
        this.btnCASheetReport.setBackground(Color.black);
        this.btnCASheetReport.setForeground(Color.magenta);
        this.btnQueryReport.setBackground(Color.black);
        this.btnQueryReport.setForeground(Color.magenta);
        this.btnclose.setBackground(Color.red);
        this.btnclose.setForeground(Color.black);
        final Box SDC = Box.createHorizontalBox();
        SDC.add(this.btnStudentDataCapture);
        SDC.setBorder(BorderFactory.createTitledBorder("STUDENT DATA CAPTURE:"));
        final Box behaviour = Box.createHorizontalBox();
        behaviour.add(this.btnStudentBehaviour);
        behaviour.setBorder(BorderFactory.createTitledBorder("STUDENT'S BEHAVIOUR:"));
        this.addItem(this.panel, behaviour, 0, 3, 1, 1, 10);
        final Box feesMgnt = Box.createHorizontalBox();
        feesMgnt.add(this.btnSchFeesManagement);
        feesMgnt.setBorder(BorderFactory.createTitledBorder("SCH. FEES MANAGEMENT:"));
        final Box DataentryBox = Box.createVerticalBox();
        DataentryBox.add(this.btnDataEntry);
        DataentryBox.add(Box.createVerticalStrut(4));
        DataentryBox.setBorder(BorderFactory.createTitledBorder("DATA ENTRY:"));
        this.addItem(this.panel, DataentryBox, 0, 5, 1, 1, 10);
        final Box Attendancebehaviour = Box.createHorizontalBox();
        Attendancebehaviour.add(this.btnAttendance);
        Attendancebehaviour.setBorder(BorderFactory.createTitledBorder("ATTENDANCE MANAGEMENT:"));
        this.addItem(this.panel, Attendancebehaviour, 0, 6, 1, 1, 10);
        final Box DataEntryChecks = Box.createHorizontalBox();
        DataEntryChecks.add(this.btnCheckForDataEntry);
        DataEntryChecks.setBorder(BorderFactory.createTitledBorder("DATA ENTRY CHECKS:"));
        this.addItem(this.panel, DataEntryChecks, 0, 7, 1, 1, 10);
        final Box DataAttendaceChecks = Box.createHorizontalBox();
        DataAttendaceChecks.add(this.btnCheckForAttendance);
        DataAttendaceChecks.setBorder(BorderFactory.createTitledBorder("ATTENDANCE CHECKS:"));
        this.addItem(this.panel, DataAttendaceChecks, 0, 8, 1, 1, 10);
        final Box btnCheckForBehavioursChecks = Box.createHorizontalBox();
        btnCheckForBehavioursChecks.add(this.btnCheckForBehaviours);
        btnCheckForBehavioursChecks.setBorder(BorderFactory.createTitledBorder("BEHAVIOURS CHECKS:"));
        this.addItem(this.panel, btnCheckForBehavioursChecks, 0, 9, 1, 1, 10);
        final Box feesSpec = Box.createHorizontalBox();
        feesSpec.add(Box.createVerticalStrut(4));
        feesSpec.add(this.btnFeesManagement);
        feesSpec.setBorder(BorderFactory.createTitledBorder("FEES MANAGEMENT:"));
        final Box CommentBox = Box.createHorizontalBox();
        CommentBox.add(this.btnCommentDataEntry);
        CommentBox.setBorder(BorderFactory.createTitledBorder("COMMENT/REPORT:"));
        this.addItem(this.panel, this.btnclose, 0, 10, 1, 1, 10);
        final Box CABox = Box.createHorizontalBox();
        CABox.add(this.btnCAResultComputation);
        CABox.setBorder(BorderFactory.createTitledBorder("C.A. RESULT PROCESSING:"));
        final Box ExamResultPro = Box.createVerticalBox();
        ExamResultPro.add(this.btnOverallTotalAndAverageComputation);
        ExamResultPro.add(Box.createVerticalStrut(4));
        ExamResultPro.add(this.btnRankingAndGrading);
        ExamResultPro.add(Box.createVerticalStrut(4));
        ExamResultPro.setBorder(BorderFactory.createEtchedBorder(1));
        final Box GenReportBox = Box.createVerticalBox();
        GenReportBox.add(this.btnReportSheetReport);
        GenReportBox.add(Box.createVerticalStrut(4));
        GenReportBox.add(this.btnCASheetReport);
        GenReportBox.add(Box.createVerticalStrut(4));
        GenReportBox.add(this.btnQueryReport);
        GenReportBox.add(Box.createVerticalStrut(4));
        GenReportBox.setBorder(BorderFactory.createTitledBorder("GENERAL REPORTS:"));
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSearch);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClear);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        this.btnclose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                DataEntryWindow.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                DataEntryWindow.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                DataEntryWindow.this.connectToDB();
                DataEntryWindow.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                DataEntryWindow.this.connectToDB();
                DataEntryWindow.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                DataEntryWindow.this.connectToDB();
                DataEntryWindow.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                DataEntryWindow.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                DataEntryWindow.this.btnPreviewMethod(evt7);
            }
        });
        this.btnStudentDataCapture.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                DataEntryWindow.this.btnStudentDataCaptureMethod(evt8);
            }
        });
        this.btnStaffDataCapture.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                DataEntryWindow.this.btnStaffDataCaptureMethod(evt9);
            }
        });
        this.btnHWorkAndCWorkDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                DataEntryWindow.this.btnHWorkAndCWorkDataEntryMethod(evt10);
            }
        });
        this.btnDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                DataEntryWindow.this.btnDataEntryMethodMethod(evt11);
            }
        });
        this.btnCheckForDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                DataEntryWindow.this.btnCheckForDataEntryMethod(evt12);
            }
        });
        this.btnCheckForAttendance.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                DataEntryWindow.this.btnCheckForAttendanceMethod(evt13);
            }
        });
        this.btnCheckForBehaviours.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                DataEntryWindow.this.btnCheckForBehavioursMethod(evt14);
            }
        });
        this.btnCommentDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                DataEntryWindow.this.btnCommentDataEntryMethod(evt15);
            }
        });
        this.btnTermInformation.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                DataEntryWindow.this.btnTermInformationMethod(evt16);
            }
        });
        this.btnStudentBehaviour.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e17) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt17) {
                DataEntryWindow.this.btnStudentBehaviourMethod(evt17);
            }
        });
        this.btnSchFeesManagement.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                DataEntryWindow.this.btnSchFeesManagementMethod(evt18);
            }
        });
        this.btnAttendance.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e19) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt19) {
                DataEntryWindow.this.btnAttendanceMethod(evt19);
            }
        });
        this.btnFeesSpec.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e21) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt21) {
                DataEntryWindow.this.btnFeesSpecMethod(evt21);
            }
        });
        this.btnFeesManagement.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e22) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt22) {
                DataEntryWindow.this.btnFeesManagementMethod(evt22);
            }
        });
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/AcasolCis";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AcasolCis", "root", "ash123");
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
        this.txtRegNum.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtTestMarks.setText("");
        this.TextArea.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        final String RegNumber = this.txtRegNum.getText().toString();
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
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            System.out.print(R);
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
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String Test = (String)this.comboTest.getSelectedItem();
        final String TestScore = this.txtTestMarks.getText().toString();
        final String wkcombo = (String)this.ComboWeekNumber.getSelectedItem();
        final double testscore = Double.parseDouble(TestScore);
        if (this.ComboWeekNumber.getSelectedItem().toString().equals("SELECT WEEK")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Please, select week!", "Error Occured", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS") || subj.equals("SELECT SUBJECT") || this.comboTest.equals("SELECT TEST")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (this.txtTestMarks.getText().equals("") || this.txtName.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnSave, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (day.equals("dd") || month.equals("mm") || year.equals("yy")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter day, month or year!", "Error in date", 0);
        }
        else if (testscore > 10.0 || testscore < 0.0) {
            JOptionPane.showMessageDialog(this.btnSave, "you cannot enter marks > ten (10) or < one (1) for Test score !", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO TestDataEntry VALUES (?,?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO TestDataEntry VALUES (?,?,?,?,?,?,?,?,?,?)");
                pstatement.setString(1, wkcombo);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, Name);
                pstatement.setString(4, myclass);
                pstatement.setString(5, term);
                pstatement.setString(6, form);
                pstatement.setString(7, subj);
                pstatement.setString(8, Date);
                pstatement.setString(9, Test);
                pstatement.setDouble(10, testscore);
                System.out.println(wkcombo);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                JOptionPane.showMessageDialog(this.btnSave, "  theb " + Test + " Score = " + testscore + " for " + term + " Term, " + wkcombo + " has been stored for " + Name);
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
        final int myRegNum = Integer.parseInt(this.txtRegNum.getText().toString());
        final String RegNum = String.format("%05d", myRegNum);
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String test = (String)this.comboTest.getSelectedItem();
        final String TestScore = this.txtTestMarks.getText().toString();
        final String wknumber = (String)this.ComboWeekNumber.getSelectedItem();
        if (this.txtTestMarks.getText().equals("") || this.txtName.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Some textboxes are empty, check and fill the required data", "Error in Evaluations & Cont Assmng", 0);
        }
        else if (this.ComboWeekNumber.getSelectedItem().toString().equals("SELECT WEEK")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Please, select week!", "Error Occured", 0);
        }
        else {
            this.TextArea.append("ACASOL SOFT:\n----------------------------------------------------------------------------\n MAIN WINDOW SLIP\n----------------------------------------------------------------------------\n\nNAME OF STUDENT:  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclass + "\n" + "TERM:" + " " + term + "\n" + "FORM:" + "  " + form + "\n" + "SUBJECT:" + "  " + subj + "\n" + "DATE:" + "  " + Date + "\n" + "TEST:" + "  " + test + "\n" + "TEST SCORE:" + "  " + TestScore + "\n" + "\n");
            this.TextArea.setEditable(true);
        }
    }
    
    public void btnStudentDataCaptureMethod(final ActionEvent evt8) {
        final StudentReg SR = new StudentReg();
        SR.StudentReg();
    }
    
    public void btnStaffDataCaptureMethod(final ActionEvent evt9) {
        final StaffMiniDataCapture SMSC = new StaffMiniDataCapture();
        SMSC.StaffMiniDataCapture();
    }
    
    public void btnHWorkAndCWorkDataEntryMethod(final ActionEvent evt10) {
        final EvaAndContForSec eva = new EvaAndContForSec();
        eva.EvaAndContForSec();
    }
    
    public void btnDataEntryMethodMethod(final ActionEvent evt11) {
        final DataEntryForm TDE = new DataEntryForm();
        TDE.TestDataEntryForm();
    }
    
    public void btnCheckForDataEntryMethod(final ActionEvent evt12) {
        final CheckForCorrectnessOfDataEntry cd = new CheckForCorrectnessOfDataEntry();
        cd.CheckForCorrectnessOfDataEntry();
    }
    
    public void btnCheckForAttendanceMethod(final ActionEvent evt13) {
        final CheckForAttendance ca = new CheckForAttendance();
        ca.CheckForAttendance();
    }
    
    public void btnCheckForBehavioursMethod(final ActionEvent evt14) {
        final CheckForBehaviours cb = new CheckForBehaviours();
        cb.CheckForBehaviours();
    }
    
    public void btnCommentDataEntryMethod(final ActionEvent evt15) {
        final CommentMainWindow CMW = new CommentMainWindow();
        CMW.CommentMainWindow();
    }
    
    public void btnTermInformationMethod(final ActionEvent evt16) {
        final TermInformation TI = new TermInformation();
        TI.TermInformation();
    }
    
    public void btnStudentBehaviourMethod(final ActionEvent evt17) {
        final Behaviour b = new Behaviour();
        b.Behaviour();
    }
    
    public void btnAttendanceMethod(final ActionEvent evt19) {
        final Attendance a = new Attendance();
        a.Attendance();
    }
    
    public void btnSchFeesManagementMethod(final ActionEvent evt18) {
        final PaymentTransact fm = new PaymentTransact();
        fm.PaymentTransact();
    }
    
    public void btnFeesSpecMethod(final ActionEvent evt21) {
        final SchoolFeesSpecification a = new SchoolFeesSpecification();
        a.SchoolFeesSpecification();
    }
    
    public void btnFeesManagementMethod(final ActionEvent evt22) {
        final subFeesManagement s = new subFeesManagement();
        s.subFeesManagement();
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
}
