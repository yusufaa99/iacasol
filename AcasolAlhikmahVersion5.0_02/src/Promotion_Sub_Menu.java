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
import java.awt.Font;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Promotion_Sub_Menu extends JFrame
{
    Font f2;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JButton btnPayroll;
    private JButton btnGraduatingClassList;
    private JButton btnPromote;
    private JButton btnSubjectReg;
    private JButton btnArchive;
    private JButton btnStudRegPreview;
    private JButton btnAccessControl;
    private JButton btnHWorkAndCWorkDataEntry;
    private JButton btnFirstDataEntry;
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
    private JButton btnEditStaffInfo;
    private JButton btnSchoolHeadInfo;
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
    
    public Promotion_Sub_Menu() {
        this.f2 = new Font("Arial Unicode MS", 1, 18);
    }
    
    public void Promotion_Sub_Menu() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.btnPayroll = new JButton("STAFF PAYROLL");
        this.btnGraduatingClassList = new JButton("Graduating_Class_List");
        this.btnPromote = new JButton("PROMOTION");
        this.btnArchive = new JButton("ARCHIVED RESULT");
        this.btnStudRegPreview = new JButton("STUD. REG. PREVIEW");
        this.btnAccessControl = new JButton("ACCESS CONTROL");
        this.btnEditStaffInfo = new JButton("EDIT STAFF INFO");
        this.btnSchoolHeadInfo = new JButton("SCHOOL HEAD DATA ENTRY");
        this.btnSubjectReg = new JButton("SUBJECT REGISTRATION");
        this.btnHWorkAndCWorkDataEntry = new JButton("H/C Work Data Entry  ");
        this.btnFirstDataEntry = new JButton(" 1ST Test Data Entry");
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
        this.lblResultAndReport = new JLabel("RESULT/REPORT PROCESSING:");
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblRegNum = new JLabel("REGISTRATION NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblTerm = new JLabel("SELECT TERM:");
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
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("FIRST");
        this.ComboTerm.addItem("SECOND");
        this.ComboTerm.addItem("THIRD");
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
        this.lblQueryAllSelecTerm = new JLabel("SELECT TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
        this.ComboQueryAllSelectSubj.addItem("Qur\ufffdan");
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
        this.setSize(320, 205);
        this.setTitle("Promotion_Sub_Menu");
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
        this.btnPayroll.setBackground(Color.black);
        this.btnPayroll.setForeground(Color.WHITE);
        this.btnGraduatingClassList.setBackground(Color.RED.darker());
        this.btnGraduatingClassList.setForeground(Color.BLACK);
        this.btnGraduatingClassList.setFont(this.f2);
        this.btnStudRegPreview.setBackground(Color.BLACK);
        this.btnStudRegPreview.setForeground(Color.WHITE);
        this.btnAccessControl.setBackground(Color.GREEN.brighter());
        this.btnAccessControl.setForeground(Color.BLACK);
        this.btnSubjectReg.setBackground(Color.BLACK);
        this.btnSubjectReg.setForeground(Color.WHITE);
        this.btnPromote.setBackground(Color.GREEN.brighter());
        this.btnPromote.setForeground(Color.BLACK);
        this.btnPromote.setFont(this.f2);
        this.btnEditStaffInfo.setBackground(Color.BLACK);
        this.btnEditStaffInfo.setForeground(Color.WHITE);
        this.btnArchive.setBackground(Color.GREEN);
        this.btnArchive.setForeground(Color.BLACK);
        this.btnSchoolHeadInfo.setBackground(Color.RED.darker());
        this.btnSchoolHeadInfo.setForeground(Color.WHITE);
        this.btnHWorkAndCWorkDataEntry.setBackground(Color.black);
        this.btnHWorkAndCWorkDataEntry.setForeground(Color.magenta);
        this.btnFirstDataEntry.setBackground(Color.black);
        this.btnFirstDataEntry.setForeground(Color.magenta);
        this.btnSecondDataEntry.setBackground(Color.black);
        this.btnSecondDataEntry.setForeground(Color.magenta);
        this.btnThirdDataEntry.setBackground(Color.black);
        this.btnThirdDataEntry.setForeground(Color.magenta);
        this.btnExamsDataEntry.setBackground(Color.black);
        this.btnExamsDataEntry.setForeground(Color.magenta);
        this.btnCommentDataEntry.setBackground(Color.black);
        this.btnCommentDataEntry.setForeground(Color.magenta);
        this.btnCAResultComputation.setBackground(Color.black);
        this.btnCAResultComputation.setForeground(Color.magenta);
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
        this.btnclose.setBackground(Color.black.brighter());
        this.btnclose.setForeground(Color.magenta);
        final Box SDT_REG = Box.createHorizontalBox();
        SDT_REG.add(this.btnGraduatingClassList);
        SDT_REG.setBorder(BorderFactory.createTitledBorder("STUDENT REGISTRATION:"));
        this.addItem(this.panel, SDT_REG, 0, 1, 1, 1, 10);
        final Box assgSubjToClass = Box.createVerticalBox();
        assgSubjToClass.add(this.btnPromote);
        assgSubjToClass.setBorder(BorderFactory.createTitledBorder("ASSIGN_SUBJ_TO_CLASS:"));
        this.addItem(this.panel, assgSubjToClass, 0, 3, 1, 1, 10);
        final Box prBox = Box.createHorizontalBox();
        prBox.add(this.btnPayroll);
        prBox.setBorder(BorderFactory.createTitledBorder("STAFF PAYROLL: "));
        final Box SchoolHeadInfoBox = Box.createVerticalBox();
        SchoolHeadInfoBox.add(this.btnSchoolHeadInfo);
        SchoolHeadInfoBox.setBorder(BorderFactory.createTitledBorder("SCHOOL HEAD DATA ENTRY:"));
        final Box StaffEditBox = Box.createVerticalBox();
        StaffEditBox.add(this.btnEditStaffInfo);
        StaffEditBox.setBorder(BorderFactory.createTitledBorder("EDIT STAFF INFO:"));
        final Box btnArchiveBox = Box.createVerticalBox();
        btnArchiveBox.add(this.btnArchive);
        btnArchiveBox.setBorder(BorderFactory.createTitledBorder("ARCHIVE RESULTS"));
        final Box SrQp = Box.createHorizontalBox();
        SrQp.add(this.btnStudRegPreview);
        SrQp.setBorder(BorderFactory.createTitledBorder("STUDENT REG. PREVIEW"));
        final Box accessControl = Box.createHorizontalBox();
        accessControl.add(this.btnAccessControl);
        accessControl.setBorder(BorderFactory.createTitledBorder("ACCESS CONTROL"));
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
        this.btnclose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                Promotion_Sub_Menu.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                Promotion_Sub_Menu.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                Promotion_Sub_Menu.this.connectToDB();
                Promotion_Sub_Menu.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                Promotion_Sub_Menu.this.connectToDB();
                Promotion_Sub_Menu.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                Promotion_Sub_Menu.this.connectToDB();
                Promotion_Sub_Menu.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                Promotion_Sub_Menu.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                Promotion_Sub_Menu.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGraduatingClassList.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                Promotion_Sub_Menu.this.btnGraduatingClassListMethod(evt8);
            }
        });
        this.btnPromote.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                Promotion_Sub_Menu.this.btnPromoteMethod(evt9);
            }
        });
        this.btnHWorkAndCWorkDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                Promotion_Sub_Menu.this.btnHWorkAndCWorkDataEntryMethod(evt10);
            }
        });
        this.btnFirstDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                Promotion_Sub_Menu.this.btnFirstDataEntryMethod(evt11);
            }
        });
        this.btnSecondDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                Promotion_Sub_Menu.this.btnSecondDataEntryMethod(evt12);
            }
        });
        this.btnThirdDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                Promotion_Sub_Menu.this.btnThirdDataEntryMethod(evt13);
            }
        });
        this.btnExamsDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                Promotion_Sub_Menu.this.btnExamsDataEntryMethod(evt14);
            }
        });
        this.btnCommentDataEntry.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                Promotion_Sub_Menu.this.btnCommentDataEntryMethod(evt15);
            }
        });
        this.btnPayroll.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                Promotion_Sub_Menu.this.btnPayrollMethod(evt16);
            }
        });
        this.btnSchoolHeadInfo.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                Promotion_Sub_Menu.this.btnSchoolHeadInfoMethod(evt18);
            }
        });
        this.btnSubjectReg.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e19) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt19) {
                Promotion_Sub_Menu.this.btnSubjectRegMethod(evt19);
            }
        });
        this.btnArchive.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e20) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt20) {
                Promotion_Sub_Menu.this.btnArchiveMethod(evt20);
            }
        });
        this.btnStudRegPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e21) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt21) {
                Promotion_Sub_Menu.this.btnStudRegPreviewMethod(evt21);
            }
        });
        this.btnAccessControl.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e22) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt22) {
                Promotion_Sub_Menu.this.btnAccessControlMethod(evt22);
            }
        });
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5", "root", "ash123");
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
            this.TextArea.append("ACASSOL SOFT:\n----------------------------------------------------------------------------\n MAIN WINDOW SLIP\n----------------------------------------------------------------------------\n\nWEEK NUMBER: " + wknumber + "\n" + "NAME OF STUDENT:" + "  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclass + "\n" + "TERM:" + " " + term + "\n" + "FORM:" + "  " + form + "\n" + "SUBJECT:" + "  " + subj + "\n" + "DATE:" + "  " + Date + "\n" + "TEST:" + "  " + test + "\n" + "TEST SCORE:" + "  " + TestScore + "\n" + "\n");
            this.TextArea.setEditable(true);
        }
    }
    
    public void btnGraduatingClassListMethod(final ActionEvent evt8) {
        final Graduating_Class_List gsl = new Graduating_Class_List();
        gsl.Graduating_Class_List();
    }
    
    public void btnPromoteMethod(final ActionEvent evt9) {
        final Promotion p = new Promotion();
        p.Promotion();
    }
    
    public void btnHWorkAndCWorkDataEntryMethod(final ActionEvent evt10) {
        final EvaAndContForSec eva = new EvaAndContForSec();
        eva.EvaAndContForSec();
    }
    
    public void btnFirstDataEntryMethod(final ActionEvent evt11) {
        final DataEntryForm TDE = new DataEntryForm();
        TDE.TestDataEntryForm();
    }
    
    public void btnSecondDataEntryMethod(final ActionEvent evt12) {
    }
    
    public void btnThirdDataEntryMethod(final ActionEvent evt13) {
    }
    
    public void btnExamsDataEntryMethod(final ActionEvent evt14) {
    }
    
    public void btnCommentDataEntryMethod(final ActionEvent evt15) {
        final CommentMainWindow CMW = new CommentMainWindow();
        CMW.CommentMainWindow();
    }
    
    public void btnPayrollMethod(final ActionEvent evt16) {
        final Payroll prl = new Payroll();
        prl.Payroll();
    }
    
    public void btnEditStaffInfoMethod(final ActionEvent evt17) {
        final editStaffInfo esi = new editStaffInfo();
        esi.editStaffInfo();
    }
    
    public void btnSchoolHeadInfoMethod(final ActionEvent evt18) {
        final SchoolHead sc = new SchoolHead();
        sc.SchoolHead();
    }
    
    public void btnSubjectRegMethod(final ActionEvent evt19) {
        final SubjectRegistration SubReg = new SubjectRegistration();
        SubReg.SubjectRegistration();
    }
    
    public void btnArchiveMethod(final ActionEvent evt20) {
        final SubArchivedResults arch = new SubArchivedResults();
        arch.SubArchivedResults();
    }
    
    public void btnStudRegPreviewMethod(final ActionEvent evt21) {
        final studregQueryAdmin sqA = new studregQueryAdmin();
        sqA.studregQueryAdmin();
    }
    
    public void btnAccessControlMethod(final ActionEvent evt22) {
        final AccessControl accsContol = new AccessControl();
        accsContol.AccessControl();
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
