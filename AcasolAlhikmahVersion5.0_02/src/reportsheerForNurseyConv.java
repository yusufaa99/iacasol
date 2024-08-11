import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.sql.ResultSetMetaData;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Color;
import javax.swing.table.TableModel;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import java.awt.print.PrinterJob;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.JLabel;
import com.wildcrest.j2printerworks.J2Printer;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class reportsheerForNurseyConv extends JFrame
{
    static J2Printer printer;
    public static boolean onScreen;
    static JFrame frame;
    static JLabel status;
    Vector columnNames;
    Vector data;
    Vector columnNames2;
    Vector data2;
    Vector columnNames3;
    Vector data3;
    Vector columnNames4;
    Vector data4;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
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
    private JLabel lblOverallTotal;
    private JLabel lblCHTotal;
    private JLabel lblAverage;
    private JLabel lblNoInClass;
    private JLabel lblSubjectTotal;
    private JLabel lblRemark;
    private JLabel lblOutput;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JLabel lblID;
    private JTextField txtID;
    private JTextField txtCHTotal;
    private JTextField txtOverallTotal;
    private JTextField txtAverage;
    private JTextField txtNoInClass;
    private JTextField txtSubjectTotal;
    private JTextField txtSubjectGrading;
    private JTextField txtRemark;
    private JLabel lblSubjectGrading;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JButton btnGetAverage;
    private JButton btnGetNoInClass;
    private JButton btnSubjectTotal;
    private JButton btnOverallTotal;
    private JButton btnCOmputeCHTotal;
    private JButton btnGenerateClassTermAnd;
    private JButton btnSubjectGrading;
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
    private JScrollPane ScrollPane2;
    private JScrollPane ScrollPane3;
    private JScrollPane ScrollPane4;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtmyclass;
    private JButton OverallTotal;
    private JTextField txtoverallTotal;
    private JLabel lbloverallTotal;
    double Hwork;
    double Cwork;
    double CworkRowCount;
    double HworkRowCount;
    double FirstTestCount;
    double SecondTestCount;
    double ThirdTestCount;
    double SujectRowCount;
    double ExamScoreGlobalVar;
    private JLabel lblmyClass;
    private JLabel lblmyterm;
    private JLabel lblmydate;
    private JLabel lblmyNoinClass;
    private JTextField txtmyClass;
    private JTextField txtmyterm;
    private JTextField txtmydate;
    private JTextField txtmyNoinClass;
    private JLabel lblmyCA;
    private JLabel lblmyExamMarks;
    private JLabel lblmyTotal;
    private JLabel lblmyGrade;
    private JLabel lblmySubjPosition;
    private JLabel lblmyRemarks;
    private JTextField txtmyCA;
    private JTextField txtmyExamMarks;
    private JTextField txtmyTotal;
    private JTextField txtmyGrade;
    private JTextField txtmySubjPosition;
    private JTextField txtmyRemarks;
    private JLabel lblmyOverallTotal;
    private JLabel lblmyAverage;
    private JLabel lblmyActualPosition;
    private JTextField txtmyOverallTotal;
    private JTextField txtmyAverage;
    private JTextField txtmyActualPosition;
    private JButton btnGenerateCAandExamsandTotal;
    private JButton btnGenerateGradePositionAndRemarks;
    private JButton btnGenerateTatalAverageAndActualPosition;
    private JTable table;
    private JTable table2;
    private JTable table3;
    private JTable table4;
    private JScrollPane myreportJSP;
    private JTextPane myreportJTP;
    private StyleContext Styledcontext;
    private DefaultStyledDocument defaultstyleddocument;
    private JScrollPane Scroll;
    private JTextArea queryArea;
    private DefaultTableModel tableModel1;
    private DefaultTableModel tableModel2;
    private DefaultTableModel tableModel3;
    private DefaultTableModel tableModel4;
    private JLabel lblReportName;
    private JLabel lblReportClass;
    private JLabel lblReportTerm;
    private JLabel lblReportYear;
    private JLabel lblReportNoInClass;
    private JLabel lblReportTermOf;
    private JLabel lblReportTermSchool;
    private JLabel lblReportSex;
    private JLabel lblReportHouse;
    private JLabel lblReportAttendance;
    private JLabel lblReportDaysOutof;
    private JLabel lblReportScoresObtainable;
    private JLabel lblReportScoresObtained;
    private JLabel lblReportID;
    private JLabel lblReportRegNum;
    private JLabel lblReportTatal;
    private JLabel lblReportAverage;
    private JLabel lblReportClassPosition;
    private JLabel lblReportOutOf;
    private JLabel lblReportNextTermBegins;
    private JLabel lblReportTermEnds;
    private JLabel lblReportHouseMasterReport;
    private JLabel lblReportHouseMasterSignature;
    private JLabel lblReportHouseMasterSignatureIcon;
    private JLabel lblReportExamOffrReport;
    private JLabel lblReportSchFeesBalance;
    private JLabel lblReportSchFeesBalanceTerm;
    private JLabel lblReportNextTermSchFees;
    private JLabel lblReportFormMasterReport;
    private JLabel lblRemarks;
    private JLabel lblReportFormMasterSignature;
    private JLabel lblReportFormMasterSignatureIcon;
    private JLabel lblReportPrincipalReport;
    private JLabel lblReportPrincipalSignature;
    private JLabel lblReportPrincipalSignatureIcon;
    private JLabel lblReportProprietorReport;
    private JLabel lblReportProprietorSignature;
    private JLabel lblReportProprietorSignatureIcon;
    private JTextField txtReportNextTermSchFees;
    private JTextField txtReportSchFeesBalance;
    private JTextField txtReportSchFeesBalanceTerm;
    private JTextField txtReportTermOf;
    private JTextField txtReportName;
    private JTextField txtReportClass;
    private JTextField txtReportTerm;
    private JTextField txtReportYear;
    private JTextField txtReportNoInClass;
    private JTextField txtReportSex;
    private JTextField txtReportScoresObtainable;
    private JTextField txtReportScoresObtained;
    private JTextField txtReportHouse;
    private JTextField txtReportAttendance;
    private JTextField txtReportDaysOutof;
    private JTextField txtReportTatal;
    private JTextField txtReportAverage;
    private JTextField txtReportClassPosition;
    private JTextField txtReportOutOf;
    private JTextField txtReportNextTermBegins;
    private JTextField txtReportTermEnds;
    private JTextField txtReportID;
    private JTextField txtReportRegNum;
    private JTextField txtReportHouseMasterReport;
    private JLabel lblReportHouseMasterSignature1;
    private JLabel lblReportHouseMasterSignatureIcon1;
    private JTextField txtReportFormMasterReport;
    private JTextField txtReportExamOffrReport;
    private JTextField txtRemarks;
    private JTextField txtBlankSpaceForRemarks;
    private JTextField txtBlankSpaceForHeading;
    private JLabel lblReportFormMasterSignature2;
    private JLabel lblReportFormMasterSignatureIcon2;
    private JTextField txtReportPrincipalDate;
    private JTextField txtReportPrincipalReport;
    private JLabel lblReportPrincipalSignature3;
    private JLabel lblReportExamOfficerSignature;
    private JLabel lblReportPrincipalSignatureIcon3;
    private JTextField txtReportProprietorReport;
    private JLabel lblReportProprietorSignature4;
    private JLabel lblReportProprietorSignatureIcon4;
    private JLabel lblReportPrincipalDate;
    private JTextField txtReportFORM;
    private JLabel lblReportForm;
    private JTextField txtblankSpace;
    private JTextField txtblankSpace1;
    private JTextField txtblankSpace2;
    private JTextField txtblankSpace3;
    private JTextField txtblankSpace4;
    private JTextField txtblankSpace5;
    private JTextPane textPane;
    private JTextPane textPane2;
    private JScrollPane paneScrollPane;
    private JScrollPane paneScrollPane2;
    private PrinterJob job;
    private JDateChooser picker;
    private JLabel txtReportOverallTotal;
    String year;
    
    static {
        reportsheerForNurseyConv.printer = new J2Printer("");
    }
    
    public reportsheerForNurseyConv() {
        this.columnNames = new Vector();
        this.data = new Vector();
        this.columnNames2 = new Vector();
        this.data2 = new Vector();
        this.columnNames3 = new Vector();
        this.data3 = new Vector();
        this.columnNames4 = new Vector();
        this.data4 = new Vector();
        this.Hwork = 0.0;
        this.Cwork = 0.0;
        this.CworkRowCount = 0.0;
        this.HworkRowCount = 0.0;
        this.FirstTestCount = 0.0;
        this.SecondTestCount = 0.0;
        this.ThirdTestCount = 0.0;
        this.ExamScoreGlobalVar = 0.0;
    }
    
    public static void setOnScreen(final boolean val) {
        reportsheerForNurseyConv.onScreen = val;
    }
    
    public void reportsheerForNurseyConv() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblRegNum = new JLabel("REG. NO:");
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
        this.lblOverallTotal = new JLabel("OVERALL TOTAL:");
        this.lblCHTotal = new JLabel("(Cwork&Hwork TOTAL):");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.lblAverage = new JLabel("AVERAGE:");
        this.lblNoInClass = new JLabel("NO. IN CLASS:");
        this.lblSubjectTotal = new JLabel("TOTAL(100%):");
        this.lblSubjectGrading = new JLabel("SUBJECT GRADE:");
        this.lblID = new JLabel("STD. ID:");
        this.txtID = new JTextField(7);
        this.txtRegNum = new JTextField(7);
        this.txtName = new JTextField(35);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtCHTotal = new JTextField(5);
        this.txtOverallTotal = new JTextField(5);
        this.txtAverage = new JTextField(5);
        this.txtNoInClass = new JTextField(5);
        this.txtSubjectTotal = new JTextField(5);
        this.txtSubjectGrading = new JTextField(5);
        this.txtRemark = new JTextField(7);
        this.OverallTotal = new JButton("OverallTotal");
        this.txtoverallTotal = new JTextField(5);
        this.lbloverallTotal = new JLabel("OverallTotal");
        this.lblRemark = new JLabel("REMARK:");
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.addItem("PRIMARY ONE");
        this.ComboSelecClass.addItem("PRIMARY TWO");
        this.ComboSelecClass.addItem("PRIMARY THREE");
        this.ComboSelecClass.addItem("PRIMARY FOUR");
        this.ComboSelecClass.addItem("PRIMARY FIVE");
        this.ComboSelecClass.addItem("PRIMARY SIX");
        this.ComboSelecClass.addItem("NURSERY ONE");
        this.ComboSelecClass.addItem("NURSERY TWO");
        this.ComboSelecClass.addItem("NURSERY THREE");
        this.ComboSelecClass.addItem("NURSERY FOUR");
        this.ComboSelecClass.addItem("PRIMARY ONE-ISLAMIYYA");
        this.ComboSelecClass.addItem("PRIMARY TWO-ISLAMIYYA");
        this.ComboSelecClass.addItem("PRIMARY THREE-ISLAMIYYA");
        this.ComboSelecClass.addItem("PRIMARY FOUR-ISLAMIYYA");
        this.ComboSelecClass.addItem("PRIMARY FIVE-ISLAMIYYA");
        this.ComboSelecClass.addItem("PRIMARY SIX-ISLAMIYYA");
        this.ComboSelecClass.addItem("NURSERY ONE-ISLAMIYYA");
        this.ComboSelecClass.addItem("NURSERY TWO-ISLAMIYYA");
        this.ComboSelecClass.addItem("NURSERY THREE-ISLAMIYYA");
        this.ComboSelecClass.addItem("NURSERY FOUR-ISLAMIYYA");
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
        this.ComboSelectSubj.addItem("Quran & Tajweed");
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
        this.ComboSelectSubj.addItem("Home Management");
        this.ComboSelectSubj.addItem("History");
        this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
        this.ComboSelectSubj.addItem("Literature in English");
        this.ComboSelectSubj.addItem("Mathematics");
        this.ComboSelectSubj.addItem("Physics");
        this.ComboSelectSubj.addItem("SELECT SUBJECT");
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
        this.btnPreview = new JButton("Preview");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnGetAverage = new JButton("Compute Average");
        this.btnGetNoInClass = new JButton("Get No. InClass");
        this.btnSubjectTotal = new JButton("Compute 100% Total");
        this.btnOverallTotal = new JButton("Compute Overall Total");
        this.btnCOmputeCHTotal = new JButton("GetCwrk&Hwrkotal");
        this.btnSubjectGrading = new JButton("Compute Grade&Remarks");
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REG. NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
        this.btnGenerateClassTermAnd = new JButton("Generate..");
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Qur\ufffdan");
        this.ComboQuerySelectSubj.addItem("Arabic Language");
        this.ComboQuerySelectSubj.addItem("Biology");
        this.ComboQuerySelectSubj.addItem("Chemistry");
        this.ComboQuerySelectSubj.addItem("Computer science");
        this.ComboQuerySelectSubj.addItem("Economics");
        this.ComboQuerySelectSubj.addItem("English Language");
        this.ComboQuerySelectSubj.addItem("Foods and Nutrition");
        this.ComboQuerySelectSubj.addItem("Further mathematics");
        this.ComboQuerySelectSubj.addItem("Geography");
        this.ComboQuerySelectSubj.addItem("Government");
        this.ComboQuerySelectSubj.addItem("Hausa");
        this.ComboQuerySelectSubj.addItem("History");
        this.ComboQuerySelectSubj.addItem("Islamic Religion Knowledge");
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
        this.ComboQueryAllSelectSubj.addItem("Further mathematics");
        this.ComboQueryAllSelectSubj.addItem("Geography");
        this.ComboQueryAllSelectSubj.addItem("Government");
        this.ComboQueryAllSelectSubj.addItem("Hausa");
        this.ComboQueryAllSelectSubj.addItem("History");
        this.ComboQueryAllSelectSubj.addItem("Islamic Religion Knowledge");
        this.ComboQueryAllSelectSubj.addItem("Literature in English");
        this.ComboQueryAllSelectSubj.addItem("Mathematics");
        this.ComboQueryAllSelectSubj.addItem("Physics");
        (this.ComboQueryAllSelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQueryAllSelectTerm.addItem("SECOND TERM");
        this.ComboQueryAllSelectTerm.addItem("THIRD TERM");
        this.btnClose = new JButton("Close");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.TextArea = new JTextArea(6, 40);
        this.txtmyclass = new JTextField();
        this.panel.setLayout(new GridBagLayout());
        this.lblmyClass = new JLabel("CLASS:");
        this.lblmyterm = new JLabel("TERM:");
        this.lblmydate = new JLabel("DATE:");
        this.lblmyNoinClass = new JLabel("NO[C]:");
        this.txtmyClass = new JTextField(8);
        this.txtmyterm = new JTextField(8);
        this.txtmydate = new JTextField(8);
        this.txtmyNoinClass = new JTextField(8);
        this.lblmyCA = new JLabel("30%CA:");
        this.lblmyExamMarks = new JLabel("EXAM:");
        this.lblmyTotal = new JLabel("TOTAL:");
        this.lblmyGrade = new JLabel("GRADE:");
        this.lblmySubjPosition = new JLabel("PSTN:");
        this.lblmyRemarks = new JLabel("REMK:");
        this.txtmyCA = new JTextField(8);
        this.txtmyExamMarks = new JTextField(8);
        this.txtmyTotal = new JTextField(8);
        this.txtmyGrade = new JTextField(8);
        this.txtmySubjPosition = new JTextField(8);
        this.txtmyRemarks = new JTextField(8);
        this.lblmyOverallTotal = new JLabel("OVRLL. TOTAL:");
        this.lblmyAverage = new JLabel("AVERAGE:");
        this.lblmyActualPosition = new JLabel("ACTUAL POSITION");
        this.txtmyOverallTotal = new JTextField(5);
        this.txtmyAverage = new JTextField(5);
        this.txtmyActualPosition = new JTextField(5);
        this.btnGenerateCAandExamsandTotal = new JButton("Generate..");
        this.btnGenerateGradePositionAndRemarks = new JButton("Generate..");
        this.btnGenerateTatalAverageAndActualPosition = new JButton("Generate..");
        this.tableModel1 = new DefaultTableModel(0, 0);
        final JTable table = new JTable(this.tableModel1);
        this.tableModel2 = new DefaultTableModel(0, 0);
        final JTable table2 = new JTable(this.tableModel2);
        this.tableModel3 = new DefaultTableModel(0, 0);
        final JTable table3 = new JTable(this.tableModel3);
        this.tableModel4 = new DefaultTableModel(0, 0);
        final JTable table4 = new JTable(this.tableModel4);
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.black);
        table.setForeground(Color.black);
        table2.setAutoCreateRowSorter(true);
        table2.setShowGrid(true);
        table2.setShowHorizontalLines(true);
        table2.setShowVerticalLines(true);
        table2.setBackground(Color.white);
        table2.setGridColor(Color.black);
        table2.setForeground(Color.black);
        table3.setAutoCreateRowSorter(true);
        table3.setShowGrid(true);
        table3.setShowHorizontalLines(true);
        table3.setShowVerticalLines(true);
        table3.setBackground(Color.white);
        table3.setGridColor(Color.black);
        table4.setAutoCreateRowSorter(true);
        table4.setShowGrid(true);
        table4.setShowHorizontalLines(true);
        table4.setShowVerticalLines(true);
        table4.setBackground(Color.white);
        table4.setGridColor(Color.black);
        (this.ScrollPane = new JScrollPane(table, 21, 31)).setPreferredSize(new Dimension(600, 290));
        (this.ScrollPane3 = new JScrollPane(table3, 21, 31)).setPreferredSize(new Dimension(70, 100));
        this.ScrollPane.setEnabled(true);
        this.ScrollPane.setVisible(true);
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        this.paneScrollPane = new JScrollPane(this.textPane);
        this.textPane2 = this.createTextPane();
        this.paneScrollPane2 = new JScrollPane(this.textPane2);
        this.panel.validate();
        this.panel.repaint();
        this.paneScrollPane.setVerticalScrollBarPolicy(22);
        this.paneScrollPane.setHorizontalScrollBarPolicy(32);
        this.paneScrollPane.setPreferredSize(new Dimension(590, 320));
        this.textPane.insertIcon(new ImageIcon("RS2logo.jpg"));
        (this.txtBlankSpaceForHeading = new JTextField(50)).setEditable(false);
        this.txtBlankSpaceForHeading.setVisible(true);
        this.txtBlankSpaceForHeading.setBackground(Color.GRAY.darker());
        this.textPane.insertComponent(this.txtBlankSpaceForHeading);
        final Font f = new Font(null, 1, 10);
        (this.lblReportTerm = new JLabel("REPORT FOR: ")).setAlignmentY(0.5f);
        this.lblReportTerm.setAlignmentX(0.5f);
        this.lblReportTerm.setFont(f);
        this.textPane.insertComponent(this.lblReportTerm);
        (this.txtReportTerm = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportTerm.setAlignmentX(0.1f);
        this.txtReportTerm.setFont(f);
        this.textPane.insertComponent(this.txtReportTerm);
        (this.lblReportTermOf = new JLabel("TERM OF: ")).setAlignmentY(0.5f);
        this.lblReportTermOf.setAlignmentX(0.1f);
        this.lblReportTermOf.setFont(f);
        this.textPane.insertComponent(this.lblReportTermOf);
        (this.txtReportTermOf = new JTextField(9)).setAlignmentY(0.5f);
        this.txtReportTermOf.setAlignmentX(0.1f);
        this.txtReportTermOf.setFont(f);
        this.textPane.insertComponent(this.txtReportTermOf);
        (this.lblReportTermSchool = new JLabel("SCHOOL/YEAR ")).setAlignmentY(0.5f);
        this.lblReportTermSchool.setAlignmentX(0.1f);
        this.lblReportTermSchool.setFont(f);
        this.textPane.insertComponent(this.lblReportTermSchool);
        (this.lblReportRegNum = new JLabel("  ADM. NO:")).setAlignmentY(0.5f);
        this.lblReportRegNum.setAlignmentX(0.1f);
        this.lblReportRegNum.setFont(f);
        this.textPane.insertComponent(this.lblReportRegNum);
        (this.txtReportRegNum = new JTextField(12)).setAlignmentY(0.5f);
        this.txtReportRegNum.setAlignmentX(0.1f);
        this.txtReportRegNum.setFont(f);
        this.textPane.insertComponent(this.txtReportRegNum);
        this.txtReportRegNum.setBackground(Color.GRAY.brighter());
        (this.lblReportName = new JLabel("NAME OF PUPIL: ")).setFont(f);
        this.lblReportName.setAlignmentY(0.5f);
        this.lblReportName.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportName);
        (this.txtReportName = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportName.setAlignmentX(0.1f);
        this.txtReportName.setFont(f);
        this.textPane.insertComponent(this.txtReportName);
        (this.lblReportID = new JLabel("ID: ")).setAlignmentY(0.5f);
        this.lblReportID.setAlignmentX(0.1f);
        this.lblReportID.setFont(f);
        this.textPane.insertComponent(this.lblReportID);
        (this.txtReportID = new JTextField(4)).setAlignmentY(0.5f);
        this.txtReportID.setAlignmentX(0.1f);
        this.txtReportID.setFont(f);
        this.textPane.insertComponent(this.txtReportID);
        this.txtReportID.setBackground(Color.GRAY.brighter());
        (this.lblReportSex = new JLabel("SEX:")).setAlignmentY(0.5f);
        this.lblReportSex.setAlignmentX(0.1f);
        this.lblReportSex.setFont(f);
        this.textPane.insertComponent(this.lblReportSex);
        (this.txtReportSex = new JTextField(6)).setAlignmentY(0.6f);
        this.txtReportSex.setAlignmentX(0.1f);
        this.txtReportSex.setFont(f);
        this.textPane.insertComponent(this.txtReportSex);
        (this.lblReportHouse = new JLabel("HOUSE: ")).setAlignmentY(0.5f);
        this.lblReportHouse.setAlignmentX(0.1f);
        this.lblReportHouse.setFont(f);
        this.textPane.insertComponent(this.lblReportHouse);
        (this.txtReportHouse = new JTextField(10)).setAlignmentY(0.6f);
        this.txtReportHouse.setAlignmentX(0.1f);
        this.txtReportHouse.setFont(f);
        this.textPane.insertComponent(this.txtReportHouse);
        (this.lblReportClass = new JLabel("CLASS: ")).setAlignmentY(0.5f);
        this.lblReportClass.setAlignmentX(0.1f);
        this.lblReportClass.setFont(f);
        this.textPane.insertComponent(this.lblReportClass);
        (this.txtReportClass = new JTextField(23)).setAlignmentY(0.6f);
        this.txtReportClass.setAlignmentX(0.1f);
        this.txtReportClass.setFont(f);
        this.textPane.insertComponent(this.txtReportClass);
        (this.lblReportAttendance = new JLabel("ATTENDANCE : ")).setAlignmentY(0.5f);
        this.lblReportAttendance.setAlignmentX(0.1f);
        this.lblReportAttendance.setFont(f);
        this.textPane.insertComponent(this.lblReportAttendance);
        (this.txtReportAttendance = new JTextField(7)).setAlignmentY(0.5f);
        this.txtReportAttendance.setAlignmentX(0.1f);
        this.txtReportAttendance.setFont(f);
        this.textPane.insertComponent(this.txtReportAttendance);
        (this.lblReportDaysOutof = new JLabel("DAYS OUT OF : ")).setAlignmentY(0.5f);
        this.lblReportDaysOutof.setAlignmentX(0.1f);
        this.lblReportDaysOutof.setFont(f);
        this.textPane.insertComponent(this.lblReportDaysOutof);
        (this.txtReportDaysOutof = new JTextField(7)).setAlignmentY(0.5f);
        this.txtReportDaysOutof.setAlignmentX(0.1f);
        this.txtReportDaysOutof.setFont(f);
        this.textPane.insertComponent(this.txtReportDaysOutof);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.textPane.insertComponent(this.ScrollPane);
        (this.txtBlankSpaceForHeading = new JTextField(50)).setEditable(false);
        this.txtBlankSpaceForHeading.setVisible(true);
        this.txtBlankSpaceForHeading.setBackground(Color.GRAY);
        this.textPane.insertComponent(this.txtBlankSpaceForHeading);
        (this.lblReportScoresObtainable = new JLabel("SCORES OBTAINABLE : ")).setAlignmentY(0.5f);
        this.lblReportScoresObtainable.setAlignmentX(0.1f);
        this.lblReportScoresObtainable.setFont(f);
        this.textPane.insertComponent(this.lblReportScoresObtainable);
        (this.txtReportScoresObtainable = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportScoresObtainable.setAlignmentX(0.1f);
        this.txtReportScoresObtainable.setFont(f);
        this.textPane.insertComponent(this.txtReportScoresObtainable);
        (this.lblReportScoresObtained = new JLabel("SCORES OBTAINED : ")).setAlignmentY(0.5f);
        this.lblReportScoresObtained.setAlignmentX(0.1f);
        this.lblReportScoresObtained.setFont(f);
        this.textPane.insertComponent(this.lblReportScoresObtained);
        (this.txtReportScoresObtained = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportScoresObtained.setAlignmentX(0.1f);
        this.txtReportScoresObtained.setFont(f);
        this.textPane.insertComponent(this.txtReportScoresObtained);
        (this.lblReportAverage = new JLabel("AVERAGE: ")).setAlignmentY(0.5f);
        this.lblReportAverage.setAlignmentX(0.1f);
        this.lblReportAverage.setFont(f);
        this.textPane.insertComponent(this.lblReportAverage);
        (this.txtReportAverage = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportAverage.setAlignmentX(0.1f);
        this.txtReportAverage.setFont(f);
        this.textPane.insertComponent(this.txtReportAverage);
        (this.lblReportNoInClass = new JLabel("NO. IN CLASS: ")).setAlignmentY(0.5f);
        this.lblReportNoInClass.setAlignmentX(0.1f);
        this.lblReportNoInClass.setFont(f);
        this.textPane.insertComponent(this.lblReportNoInClass);
        (this.txtReportNoInClass = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportNoInClass.setAlignmentX(0.1f);
        this.txtReportNoInClass.setFont(f);
        this.textPane.insertComponent(this.txtReportNoInClass);
        (this.lblReportClassPosition = new JLabel("CLASS POSITION: ")).setAlignmentY(0.5f);
        this.lblReportClassPosition.setAlignmentX(0.1f);
        this.lblReportClassPosition.setFont(f);
        (this.txtReportClassPosition = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportClassPosition.setAlignmentX(0.1f);
        this.txtReportClassPosition.setFont(f);
        this.txtReportClassPosition.setBackground(Color.white);
        this.txtReportClassPosition.setForeground(Color.white);
        (this.lblReportFormMasterReport = new JLabel("CLASS TEACHER'S COMMENT: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterReport.setAlignmentX(0.1f);
        this.lblReportFormMasterReport.setFont(f);
        this.textPane.insertComponent(this.lblReportFormMasterReport);
        (this.txtReportFormMasterReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportFormMasterReport.setAlignmentX(0.1f);
        this.txtReportFormMasterReport.setFont(f);
        this.textPane.insertComponent(this.txtReportFormMasterReport);
        (this.lblReportPrincipalReport = new JLabel("HEAD TEACHER'S COMMENT:    ")).setAlignmentY(0.5f);
        this.lblReportPrincipalReport.setAlignmentX(0.1f);
        this.lblReportPrincipalReport.setFont(f);
        this.textPane.insertComponent(this.lblReportPrincipalReport);
        (this.txtReportPrincipalReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportPrincipalReport.setAlignmentX(0.1f);
        this.txtReportPrincipalReport.setFont(f);
        this.textPane.insertComponent(this.txtReportPrincipalReport);
        (this.lblReportNextTermBegins = new JLabel("RESUMPTION DATE: ")).setAlignmentY(0.5f);
        this.lblReportNextTermBegins.setAlignmentX(0.1f);
        this.lblReportNextTermBegins.setFont(f);
        this.textPane.insertComponent(this.lblReportNextTermBegins);
        (this.txtReportNextTermBegins = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportNextTermBegins.setAlignmentX(0.1f);
        this.txtReportNextTermBegins.setFont(f);
        this.textPane.insertComponent(this.txtReportNextTermBegins);
        (this.lblReportSchFeesBalance = new JLabel("OUTSTANDING FEE: ")).setAlignmentY(0.5f);
        this.lblReportSchFeesBalance.setAlignmentX(0.1f);
        this.lblReportSchFeesBalance.setFont(f);
        this.textPane.insertComponent(this.lblReportSchFeesBalance);
        (this.txtReportSchFeesBalance = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportSchFeesBalance.setAlignmentX(0.1f);
        this.txtReportSchFeesBalance.setFont(f);
        this.textPane.insertComponent(this.txtReportSchFeesBalance);
        (this.lblReportSchFeesBalanceTerm = new JLabel("TERM: ")).setAlignmentY(0.5f);
        this.lblReportSchFeesBalanceTerm.setAlignmentX(0.1f);
        this.lblReportSchFeesBalanceTerm.setFont(f);
        this.textPane.insertComponent(this.lblReportSchFeesBalanceTerm);
        (this.txtReportSchFeesBalanceTerm = new JTextField(15)).setAlignmentY(0.5f);
        this.txtReportSchFeesBalanceTerm.setAlignmentX(0.1f);
        this.txtReportSchFeesBalanceTerm.setFont(f);
        this.textPane.insertComponent(this.txtReportSchFeesBalanceTerm);
        (this.lblReportPrincipalSignature3 = new JLabel("SIGNATURE: ")).setAlignmentY(0.99f);
        this.lblReportPrincipalSignature3.setAlignmentX(-0.1f);
        this.lblReportPrincipalSignature3.setFont(f);
        this.textPane.insertComponent(this.lblReportPrincipalSignature3);
        this.textPane.insertIcon(new ImageIcon("principal.jpg"));
        (this.lblReportPrincipalDate = new JLabel("DATE: ")).setAlignmentY(0.5f);
        this.lblReportPrincipalDate.setAlignmentX(-0.1f);
        this.lblReportPrincipalDate.setFont(f);
        this.textPane.insertComponent(this.lblReportPrincipalDate);
        (this.txtReportPrincipalDate = new JTextField(2)).setAlignmentY(0.5f);
        this.txtReportPrincipalDate.setAlignmentX(0.1f);
        this.txtReportPrincipalDate.setFont(f);
        this.txtReportPrincipalDate.setText(this.year);
        this.textPane.insertComponent(this.txtReportPrincipalDate);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(690, 590);
        this.setTitle("Report Sheet [Nursery - Conventional] Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnPrevious.setBackground(Color.green);
        this.btnGenerateClassTermAnd.setBackground(Color.green);
        this.btnGenerateCAandExamsandTotal.setBackground(Color.green);
        this.btnGenerateGradePositionAndRemarks.setBackground(Color.green);
        this.btnGenerateTatalAverageAndActualPosition.setBackground(Color.green);
        this.addItem(this.panel, this.lblID, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.txtID, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblName, 0, 2, 1, 1, 13);
        this.addItem(this.panel, this.txtName, 1, 2, 2, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 3, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lbldate, 0, 7, 1, 1, 13);
        this.addItem(this.panel, (JComponent)this.picker, 1, 7, 1, 1, 17);
        final Box GenerateCLassTermAndBox = Box.createHorizontalBox();
        GenerateCLassTermAndBox.add(this.txtmyClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(8));
        GenerateCLassTermAndBox.add(this.lblmyterm);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.txtmyterm);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.lblmyNoinClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.txtmyNoinClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(16));
        GenerateCLassTermAndBox.add(this.btnGenerateClassTermAnd);
        final Box GeneradePositionAdnRemarksBox = Box.createHorizontalBox();
        GeneradePositionAdnRemarksBox.add(this.txtmyGrade);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(8));
        GeneradePositionAdnRemarksBox.add(this.lblmySubjPosition);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.txtmySubjPosition);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.lblmyRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.txtmyRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(16));
        GeneradePositionAdnRemarksBox.add(this.btnGenerateGradePositionAndRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        final Box GenerateCAandExams = Box.createHorizontalBox();
        GenerateCAandExams.add(this.txtmyCA);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.lblmyExamMarks);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.txtmyExamMarks);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.lblmyTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.txtmyTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(12));
        GenerateCAandExams.add(this.btnGenerateCAandExamsandTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        final Box OveralltotaAverageAndPositionBox = Box.createHorizontalBox();
        OveralltotaAverageAndPositionBox.add(this.txtmyOverallTotal);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.lblmyAverage);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.txtmyAverage);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.lblmyActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.txtmyActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(24));
        OveralltotaAverageAndPositionBox.add(this.btnGenerateTatalAverageAndActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        final Box SecondTestBox = Box.createHorizontalBox();
        SecondTestBox.add(this.txtNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        SecondTestBox.add(this.btnGetNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        final Box OverallTotalBox = Box.createHorizontalBox();
        OverallTotalBox.add(this.txtoverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        OverallTotalBox.add(this.OverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, this.paneScrollPane, 1, 15, 4, 3, 17);
        this.panel.validate();
        this.panel.repaint();
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrevious);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSearch);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClear);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 1, 22, 2, 2, 17);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                reportsheerForNurseyConv.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                reportsheerForNurseyConv.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                reportsheerForNurseyConv.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGenerateGradePositionAndRemarks.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnGenerateGradePositionAndRemarksMethod(evt9);
            }
        });
        this.btnGenerateCAandExamsandTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnGenerateCAandExamsandTotal(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnGenerateTatalAverageAndActualPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnGenerateTatalAverageAndActualPositionMethod(evt13);
            }
        });
        this.btnGenerateClassTermAnd.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnGenerateClassTermAndMethod(evt14);
            }
        });
        this.btnSubjectGrading.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnSubjectGaringMethod(evt15);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.ComboSelecClassMethod(evt16);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                reportsheerForNurseyConv.this.connectToDB();
                reportsheerForNurseyConv.this.btnPreviousMethod(evt18);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 1, 10);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(155);
                final TableColumn column2 = table.getColumnModel().getColumn(1);
                column2.setPreferredWidth(29);
                final TableColumn column3 = table.getColumnModel().getColumn(2);
                column3.setPreferredWidth(33);
                final TableColumn column4 = table.getColumnModel().getColumn(3);
                column4.setPreferredWidth(45);
                final TableColumn column5 = table.getColumnModel().getColumn(4);
                column5.setPreferredWidth(31);
                final TableColumn column6 = table.getColumnModel().getColumn(5);
                column6.setPreferredWidth(33);
                final TableColumn column7 = table.getColumnModel().getColumn(6);
                column7.setPreferredWidth(36);
                if (table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("POOR") || table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("E")) {
                    this.setForeground(Color.RED);
                }
                else {
                    this.setForeground(Color.BLACK);
                }
                final DefaultTableModel model = (DefaultTableModel)table.getModel();
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("1")) {
                    final String myvalue = "1ST";
                    model.setValueAt("1ST", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("2")) {
                    final String myvalue = "2ND";
                    model.setValueAt("2ND", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("3")) {
                    final String myvalue = "3RD";
                    model.setValueAt("3RD", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("4")) {
                    final String myvalue = "4TH";
                    model.setValueAt("4TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("5")) {
                    final String myvalue = "5TH";
                    model.setValueAt("5TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("6")) {
                    final String myvalue = "6TH";
                    model.setValueAt("6TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("7")) {
                    final String myvalue = "7TH";
                    model.setValueAt("7TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("8")) {
                    final String myvalue = "8TH";
                    model.setValueAt("8TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("9")) {
                    final String myvalue = "9TH";
                    model.setValueAt("9TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("10")) {
                    final String myvalue = "10TH";
                    model.setValueAt("10TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("11")) {
                    final String myvalue = "11TH";
                    model.setValueAt("11TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("12")) {
                    final String myvalue = "12TH";
                    model.setValueAt("12TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("13")) {
                    final String myvalue = "13TH";
                    model.setValueAt("13TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("14")) {
                    final String myvalue = "14TH";
                    model.setValueAt("14TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("15")) {
                    final String myvalue = "15TH";
                    model.setValueAt("15TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("16")) {
                    final String myvalue = "16TH";
                    model.setValueAt("16TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("17")) {
                    final String myvalue = "17TH";
                    model.setValueAt("17TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("18")) {
                    final String myvalue = "18TH";
                    model.setValueAt("18TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("19")) {
                    final String myvalue = "19TH";
                    model.setValueAt("19TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("20")) {
                    final String myvalue = "20TH";
                    model.setValueAt("20TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("21")) {
                    final String myvalue = "21ST";
                    model.setValueAt("21ST", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("22")) {
                    final String myvalue = "22ND";
                    model.setValueAt("22ND", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("23")) {
                    final String myvalue = "23RD";
                    model.setValueAt("23RD", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("24")) {
                    final String myvalue = "24TH";
                    model.setValueAt("24TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("25")) {
                    final String myvalue = "25TH";
                    model.setValueAt("25TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("26")) {
                    final String myvalue = "26TH";
                    model.setValueAt("26TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("27")) {
                    final String myvalue = "27TH";
                    model.setValueAt("27TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("28")) {
                    final String myvalue = "28TH";
                    model.setValueAt("28TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("29")) {
                    final String myvalue = "29TH";
                    model.setValueAt("29TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("30")) {
                    final String myvalue = "30TH";
                    model.setValueAt("30TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("31")) {
                    final String myvalue = "31ST";
                    model.setValueAt("31ST", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("32")) {
                    final String myvalue = "32ND";
                    model.setValueAt("32ND", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("33")) {
                    final String myvalue = "33RD";
                    model.setValueAt("33RD", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("34")) {
                    final String myvalue = "34TH";
                    model.setValueAt("34TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("35")) {
                    final String myvalue = "35TH";
                    model.setValueAt("35TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("36")) {
                    final String myvalue = "36TH";
                    model.setValueAt("36TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("37")) {
                    final String myvalue = "37TH";
                    model.setValueAt("37TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("38")) {
                    final String myvalue = "38TH";
                    model.setValueAt("38TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("39")) {
                    final String myvalue = "39TH";
                    model.setValueAt("39TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("40")) {
                    final String myvalue = "40TH";
                    model.setValueAt("40TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("41")) {
                    final String myvalue = "41ST";
                    model.setValueAt("41ST", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("42")) {
                    final String myvalue = "42ND";
                    model.setValueAt("42ND", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("43")) {
                    final String myvalue = "43RD";
                    model.setValueAt("43RD", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("44")) {
                    final String myvalue = "44TH";
                    model.setValueAt("44TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("45")) {
                    final String myvalue = "45TH";
                    model.setValueAt("45TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("46")) {
                    final String myvalue = "46TH";
                    model.setValueAt("46TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("47")) {
                    final String myvalue = "47TH";
                    model.setValueAt("47TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("48")) {
                    final String myvalue = "48TH";
                    model.setValueAt("48TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("49")) {
                    final String myvalue = "49TH";
                    model.setValueAt("49TH", row, 6);
                }
                if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("50")) {
                    final String myvalue = "50TH";
                    model.setValueAt("50TH", row, 6);
                }
                return this;
            }
        });
        table2.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table2, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table2, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 0, 10);
                table2.setFont(d);
                final TableColumn column = table2.getColumnModel().getColumn(0);
                column.setPreferredWidth(305);
                final TableColumn column2 = table2.getColumnModel().getColumn(1);
                column2.setPreferredWidth(22);
                final TableColumn column3 = table2.getColumnModel().getColumn(2);
                column3.setPreferredWidth(22);
                final TableColumn column4 = table2.getColumnModel().getColumn(3);
                column4.setPreferredWidth(22);
                final TableColumn column5 = table2.getColumnModel().getColumn(4);
                column5.setPreferredWidth(22);
                return this;
            }
        });
        table3.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table3, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table3, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 0, 10);
                table3.setFont(d);
                final TableColumn column = table3.getColumnModel().getColumn(0);
                column.setPreferredWidth(10);
                final TableColumn column2 = table3.getColumnModel().getColumn(1);
                column2.setPreferredWidth(10);
                final TableColumn column3 = table3.getColumnModel().getColumn(2);
                column3.setPreferredWidth(10);
                return this;
            }
        });
        table4.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table4, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table4, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 0, 11);
                table4.setFont(d);
                final TableColumn column = table4.getColumnModel().getColumn(0);
                column.setPreferredWidth(40);
                final TableColumn column2 = table4.getColumnModel().getColumn(1);
                column2.setPreferredWidth(70);
                return this;
            }
        });
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
    
    public void btnCloseMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.data2.setSize(0);
        this.columnNames2.setSize(0);
        this.tableModel2.setRowCount(0);
        this.tableModel2.fireTableDataChanged();
        this.table.repaint();
        this.txtSubjectGrading.setText("");
        this.txtRemark.setText("");
        this.txtOverallTotal.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtCHTotal.setText("");
        this.TextArea.setText("");
        this.txtCHTotal.setText("");
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
        this.txtNoInClass.setText("");
        this.txtSubjectTotal.setText("");
        this.txtoverallTotal.setText("");
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportName.setText("");
        this.txtReportTerm.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportFORM.setText("");
        this.txtReportYear.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportAverage.setText("");
        this.txtReportOutOf.setText("");
        this.txtReportNextTermBegins.setText("");
        this.txtReportTermEnds.setText("");
        this.txtReportID.setText("");
        this.txtReportOutOf.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        this.txtRegNum.setText("");
        this.txtReportSex.setText("");
        final String ID = this.txtID.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS") || myClass.equals("SELECT TERM") || myClass.equals("SELECT FORM")) {
            JOptionPane.showMessageDialog(null, "Please, select a class, term or form", "Class Selection Error", 0);
        }
        else if (myClass.equalsIgnoreCase("PRIMARY ONE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY TWO")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY THREE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY FOUR")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY FIVE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY SIX")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY ONE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY TWO")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY THREE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY FOUR")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        else if (myClass.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
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
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.txtName.setText("");
        this.txtRegNum.setText("");
        this.txtReportSex.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            ID = Integer.parseInt(this.txtID.getText().toString());
            final String R = Integer.toString(++ID);
            this.txtID.setText(R);
            final String IDNumber = this.txtID.getText().toString();
            if (myClass.equalsIgnoreCase("PRIMARY ONE")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY TWO")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY THREE")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY FOUR")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY FIVE")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY SIX")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY ONE")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY TWO")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY THREE")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY FOUR")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
        this.txtID.requestFocus();
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
        this.txtNoInClass.setText("");
        this.txtSubjectTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtoverallTotal.setText("");
        this.txtRemark.setText("");
        this.txtSubjectGrading.setText("");
        this.TextArea.setText("");
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.btnPreviewMethod(e4);
        this.panel.repaint();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate = sdf1.format(this.picker.getDate()).toString();
        final String Date;
        final String year = Date = FDate;
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String mySubjectTotal = this.txtSubjectTotal.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        final String myCA = this.txtmyCA.getText().toString();
        final double CA = Double.parseDouble(myCA);
        final String myExam = this.txtmyExamMarks.getText().toString();
        final double Exam = Double.parseDouble(myExam);
        final String mytotal = this.txtmyTotal.getText().toString();
        final double total = Double.parseDouble(mytotal);
        if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (this.txtName.getText().equals("") || this.txtmyRemarks.getText().equals("") || this.txtmySubjPosition.getText().equals("") || this.txtmyNoinClass.getText().equals("") || this.txtRegNum.getText().equals("") || this.txtRegNum.getText().equals("") || this.txtmyTotal.getText().equals("") || this.txtmyCA.getText().equals("") || this.txtmyExamMarks.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnSave, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (day.equals("dd") || month.equals("mm") || year.equals("yy")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter day, month or year!", "Error in date", 0);
        }
        try {
            final String InsertQueryString = "INSERT INTO CompiledReportSheet VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO CompiledReportSheet VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, form);
            pstatement.setString(4, subj);
            pstatement.setString(5, Date);
            pstatement.setString(6, myclasses);
            pstatement.setString(7, myterm);
            pstatement.setString(8, myNoInClass);
            pstatement.setString(9, myGrade);
            pstatement.setString(10, position);
            pstatement.setString(11, myremarks);
            pstatement.setDouble(12, CA);
            pstatement.setDouble(13, Exam);
            pstatement.setDouble(14, total);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "The Exams compiled result have been stored for Subject: " + subj + ", for " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.data2.setSize(0);
        this.columnNames2.setSize(0);
        this.tableModel2.setRowCount(0);
        this.tableModel2.fireTableDataChanged();
        this.data3.setSize(0);
        this.columnNames3.setSize(0);
        this.tableModel4.setRowCount(0);
        this.tableModel3.fireTableDataChanged();
        this.data4.setSize(0);
        this.columnNames4.setSize(0);
        this.tableModel4.setRowCount(0);
        this.tableModel4.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportPrincipalReport.setText("");
        this.txtReportID.setText("");
        this.txtReportFormMasterReport.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportAverage.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportRegNum.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String myregnum = this.txtRegNum.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        final String FDate = sdf1.format(this.picker.getDate()).toString();
        final String Date;
        final String year = Date = FDate;
        this.txtReportPrincipalDate.setText(year);
        final String RegNumber = this.txtRegNum.getText().toString();
        final String ID = this.txtID.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        if (this.txtRegNum.getText().equals("") || myclass.equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (this.txtName.getText().equals("") || this.txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (term.equals("SELECT TERM")) {
            JOptionPane.showMessageDialog(null, "pls, select term", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                final String QueryString = "SELECT SUBJECT,1ST_CA,2ND_CA,EXAMS_60,TOTAL,GRADE,POSITION,REMARKS FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUBJECT,1ST_CA,2ND_CA,EXAMS_60,TOTAL,GRADE,POSITION,REMARKS FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ");
                pstatement.setString(1, ID);
                pstatement.setString(2, myclass);
                pstatement.setString(3, term);
                final ResultSet rs = pstatement.executeQuery();
                final ResultSetMetaData md = rs.getMetaData();
                final int columns = md.getColumnCount();
                for (int i = 1; i <= columns; ++i) {
                    this.columnNames.addElement(md.getColumnName(i));
                }
                while (rs.next()) {
                    final Vector row = new Vector(columns);
                    for (int j = 1; j <= columns; ++j) {
                        row.addElement(rs.getObject(j));
                    }
                    this.data.addElement(row);
                }
                rs.close();
                pstatement.close();
            }
            catch (Exception e) {
                System.out.println(e);
            }
            this.tableModel1.setDataVector(this.data, this.columnNames);
            this.table = new JTable(this.tableModel1);
            for (int k = 0; k < this.table.getColumnCount(); ++k) {
                this.table.getColumnModel().getColumn(k);
            }
            this.txtReportName.setText(this.txtName.getText().toString());
            this.txtReportTerm.setText(term);
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString2 = "SELECT COUNT(*) Subject FROM compiledreportsheetNurPry WHERE ID = ? AND Term =? AND RegNum=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT COUNT(*) Subject FROM compiledreportsheetNurPry WHERE ID = ? AND Term =? AND RegNum=?");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, term);
                pstatement2.setString(3, myregnum);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final double result = rs2.getDouble(1);
                    this.SujectRowCount = result;
                    final double OutOf = this.SujectRowCount * 100.0;
                    this.txtReportScoresObtainable.setText(Double.toString(OutOf));
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT TermEnds,NxtTermBegins,Session FROM TermInformation WHERE Term =?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT TermEnds,NxtTermBegins,Session FROM TermInformation WHERE Term =?");
                pstatement2.setString(1, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final String TermEnd = rs2.getString(1);
                    final String NextTerm = rs2.getString(2);
                    final String mySession = rs2.getString(3);
                    this.txtReportNextTermBegins.setText(NextTerm);
                    this.txtReportTermOf.setText(mySession);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT Class FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? and RegNum=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Class FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? and RegNum=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                pstatement2.setString(4, myregnum);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final String meclass = rs2.getString(1);
                    this.txtReportClass.setText(meclass);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            this.txtReportSex.setText("");
            if (myclass.equalsIgnoreCase("PRIMARY ONE")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary1 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary1 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY TWO")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary2 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary2 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY THREE")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary3 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary3 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY FOUR")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary4 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary4 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY FIVE")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary5 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary5 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY SIX")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary6 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary6 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY ONE")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery1 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery1 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY TWO")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery2 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery2 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY THREE")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery3 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery3 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY FOUR")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery4 WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery4 WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary1_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary1_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary2_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary2_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary3_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary3_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary4_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary4_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary5_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary5_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregprimary6_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregprimary6_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery1_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery1_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery2_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery2_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery3_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery3_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
                try {
                    final String QueryString2 = "SELECT SEX FROM studentregnursery4_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery4_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement2.setString(1, ID);
                    pstatement2.setString(2, myregnum);
                    final ResultSet rs2 = pstatement2.executeQuery();
                    final int Reg = 0;
                    while (rs2.next()) {
                        final String meclass = rs2.getString(1);
                        this.txtReportSex.setText(meclass);
                    }
                    rs2.close();
                    pstatement2.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            try {
                final String QueryString2 = "SELECT NoInClass,Class FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT NoInClass,Class FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final double NoInClass = rs2.getDouble(1);
                    this.txtReportNoInClass.setText(Double.toString(NoInClass));
                    final String meclass2 = rs2.getString(2);
                    this.txtReportClass.setText(meclass2);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT OvrllTotal FROM overalltotalandaverageNurPry WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT OvrllTotal FROM overalltotalandaverageNurPry WHERE ID=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final String total = rs2.getString(1);
                    this.txtReportScoresObtained.setText(total);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT Average FROM overalltotalandaverageNurPry WHERE ID = ? AND Term =? AND Class=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Average FROM overalltotalandaverageNurPry WHERE ID = ? AND Term =? AND Class=?");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, term);
                pstatement2.setString(3, myclass);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final double avg = rs2.getDouble(1);
                    this.txtReportAverage.setText(String.format("%.2f", avg));
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT Balance,Term FROM PaymentTransact_Primary WHERE ID=? and Class=? and Term=? and RegNum=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Balance,Term FROM PaymentTransact_Primary WHERE ID=? and Class=? and Term=? and RegNum=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                pstatement2.setString(4, myregnum);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final double bal = rs2.getDouble(1);
                    this.txtReportSchFeesBalance.setText(Double.toString(bal));
                    final String feesTerm = rs2.getString(2);
                    this.txtReportSchFeesBalanceTerm.setText(feesTerm);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT ID,RegNum FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT ID,RegNum FROM compiledreportsheetNurPry WHERE ID=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final int id = rs2.getInt(1);
                    final String myID = String.format("%04d", id);
                    this.txtReportID.setText(myID);
                    final String myRegnum = rs2.getString(2);
                    this.txtReportRegNum.setText(myRegnum);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT DaysAttended,MaxNoOfDays,House FROM Attendance WHERE ID=? and Class=? and Term=? and RegNum=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT DaysAttended,MaxNoOfDays,House FROM Attendance WHERE ID=? and Class=? and Term=? and RegNum=?");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                pstatement2.setString(4, myregnum);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final int attdn = rs2.getInt(1);
                    this.txtReportAttendance.setText(Integer.toString(attdn));
                    final int maxdays = rs2.getInt(2);
                    this.txtReportDaysOutof.setText(Integer.toString(maxdays));
                    final String myHouse = rs2.getString(3);
                    this.txtReportHouse.setText(myHouse);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "DELETE FROM GradingSystemNurPry";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("DELETE FROM GradingSystemNurPry");
                pstatement2.executeUpdate();
                pstatement2.close();
            }
            catch (Exception e2) {
                System.out.println(e2);
            }
            try {
                final String InsertQueryString = "INSERT INTO GradingSystemNurPry(Marks,Grades,Remarks)VALUES ('0-39','E','POOR'),('40-49','D','FAIR'),('50-59','C','GOOD'),('60-69','B','V.GOOD'),('70-100','A','EXCELLENT')";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("INSERT INTO GradingSystemNurPry(Marks,Grades,Remarks)VALUES ('0-39','E','POOR'),('40-49','D','FAIR'),('50-59','C','GOOD'),('60-69','B','V.GOOD'),('70-100','A','EXCELLENT')");
                final int numberOfRowsUpdated = pstatement2.executeUpdate();
                pstatement2.close();
            }
            catch (SQLException e3) {
                JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e3.getMessage());
                e3.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT * FROM GradingSystemNurPry ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT * FROM GradingSystemNurPry ");
                final ResultSet rs2 = pstatement2.executeQuery();
                final ResultSetMetaData md2 = rs2.getMetaData();
                final int columns2 = md2.getColumnCount();
                for (int l = 1; l <= columns2; ++l) {
                    this.columnNames3.addElement(md2.getColumnName(l));
                }
                while (rs2.next()) {
                    final Vector row2 = new Vector(columns2);
                    for (int m = 1; m <= columns2; ++m) {
                        row2.addElement(rs2.getObject(m));
                    }
                    this.data3.addElement(row2);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (Exception e2) {
                System.out.println(e2);
            }
            this.tableModel3.setDataVector(this.data3, this.columnNames3);
            this.table3 = new JTable(this.tableModel3);
            for (int m2 = 0; m2 < this.table3.getColumnCount(); ++m2) {
                this.table3.getColumnModel().getColumn(m2);
            }
            this.txtReportName.setText(this.txtName.getText().toString());
            this.txtReportTerm.setText(term);
            this.table3.repaint();
            this.table3.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString3 = "SELECT * FROM KeyToRatingOfBehaviours ";
                final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT * FROM KeyToRatingOfBehaviours ");
                final ResultSet rs3 = pstatement3.executeQuery();
                final ResultSetMetaData md3 = rs3.getMetaData();
                final int columns3 = md3.getColumnCount();
                for (int l2 = 1; l2 <= columns3; ++l2) {
                    this.columnNames4.addElement(md3.getColumnName(l2));
                }
                while (rs3.next()) {
                    final Vector row3 = new Vector(columns3);
                    for (int i2 = 1; i2 <= columns3; ++i2) {
                        row3.addElement(rs3.getObject(i2));
                    }
                    this.data4.addElement(row3);
                }
                rs3.close();
                pstatement3.close();
            }
            catch (Exception e4) {
                System.out.println(e4);
            }
            this.tableModel4.setDataVector(this.data4, this.columnNames4);
            this.table4 = new JTable(this.tableModel4);
            for (int i3 = 0; i3 < this.table4.getColumnCount(); ++i3) {
                this.table4.getColumnModel().getColumn(i3);
            }
            this.txtReportName.setText(this.txtName.getText().toString());
            this.txtReportTerm.setText(term);
            this.table4.repaint();
            this.table4.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString4 = "SELECT RegNum,Name, FIND_IN_SET(OvrllTotal, (SELECT GROUP_CONCAT(OvrllTotal ORDER BY OvrllTotal DESC) FROM overalltotalandaverageNurPry where Class=? AND Term=?)) As Position FROM overalltotalandaverageNurPry where ID=? AND Class=? AND Term=? order by Position";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT RegNum,Name, FIND_IN_SET(OvrllTotal, (SELECT GROUP_CONCAT(OvrllTotal ORDER BY OvrllTotal DESC) FROM overalltotalandaverageNurPry where Class=? AND Term=?)) As Position FROM overalltotalandaverageNurPry where ID=? AND Class=? AND Term=? order by Position");
                pstatement4.setString(1, myclass);
                pstatement4.setString(2, term);
                pstatement4.setString(3, ID);
                pstatement4.setString(4, myclass);
                pstatement4.setString(5, term);
                final ResultSet rs4 = pstatement4.executeQuery();
                final int Reg2 = 0;
                while (rs4.next()) {
                    final int result2 = rs4.getInt(3);
                    if (result2 == 1) {
                        final String Position = "1ST";
                        this.txtReportClassPosition.setText("1ST");
                    }
                    else if (result2 == 2) {
                        final String Position = "2ND";
                        this.txtReportClassPosition.setText("2ND");
                    }
                    else if (result2 == 3) {
                        final String Position = "3RD";
                        this.txtReportClassPosition.setText("3RD");
                    }
                    else if (result2 == 4) {
                        final String Position = "4TH";
                        this.txtReportClassPosition.setText("4TH");
                    }
                    else if (result2 == 5) {
                        final String Position = "5TH";
                        this.txtReportClassPosition.setText("5TH");
                    }
                    else if (result2 == 6) {
                        final String Position = "6TH";
                        this.txtReportClassPosition.setText("6TH");
                    }
                    else if (result2 == 7) {
                        final String Position = "7TH";
                        this.txtReportClassPosition.setText("7TH");
                    }
                    else if (result2 == 8) {
                        final String Position = "8TH";
                        this.txtReportClassPosition.setText("8TH");
                    }
                    else if (result2 == 9) {
                        final String Position = "9TH";
                        this.txtReportClassPosition.setText("9TH");
                    }
                    else if (result2 == 10) {
                        final String Position = "10TH";
                        this.txtReportClassPosition.setText("10TH");
                    }
                    else if (result2 == 11) {
                        final String Position = "11TH";
                        this.txtReportClassPosition.setText("11TH");
                    }
                    else if (result2 == 12) {
                        final String Position = "12TH";
                        this.txtReportClassPosition.setText("12TH");
                    }
                    else if (result2 == 13) {
                        final String Position = "13TH";
                        this.txtReportClassPosition.setText("13TH");
                    }
                    else if (result2 == 14) {
                        final String Position = "14TH";
                        this.txtReportClassPosition.setText("14TH");
                    }
                    else if (result2 == 15) {
                        final String Position = "15TH";
                        this.txtReportClassPosition.setText("15TH");
                    }
                    else if (result2 == 16) {
                        final String Position = "16TH";
                        this.txtReportClassPosition.setText("16TH");
                    }
                    else if (result2 == 17) {
                        final String Position = "17TH";
                        this.txtReportClassPosition.setText("17TH");
                    }
                    else if (result2 == 18) {
                        final String Position = "18TH";
                        this.txtReportClassPosition.setText("18TH");
                    }
                    else if (result2 == 19) {
                        final String Position = "19TH";
                        this.txtReportClassPosition.setText("19TH");
                    }
                    else if (result2 == 20) {
                        final String Position = "20TH";
                        this.txtReportClassPosition.setText("20TH");
                    }
                    else if (result2 == 21) {
                        final String Position = "21ST";
                        this.txtReportClassPosition.setText("21ST");
                    }
                    else if (result2 == 22) {
                        final String Position = "22ND";
                        this.txtReportClassPosition.setText("22ND");
                    }
                    else if (result2 == 23) {
                        final String Position = "23RD";
                        this.txtReportClassPosition.setText("23RD");
                    }
                    else if (result2 == 24) {
                        final String Position = "24TH";
                        this.txtReportClassPosition.setText("24TH");
                    }
                    else if (result2 == 25) {
                        final String Position = "25TH";
                        this.txtReportClassPosition.setText("25TH");
                    }
                    else if (result2 == 26) {
                        final String Position = "26TH";
                        this.txtReportClassPosition.setText("26TH");
                    }
                    else if (result2 == 27) {
                        final String Position = "27TH";
                        this.txtReportClassPosition.setText("27TH");
                    }
                    else if (result2 == 28) {
                        final String Position = "28TH";
                        this.txtReportClassPosition.setText("28TH");
                    }
                    else if (result2 == 29) {
                        final String Position = "29TH";
                        this.txtReportClassPosition.setText("29TH");
                    }
                    else if (result2 == 30) {
                        final String Position = "30TH";
                        this.txtReportClassPosition.setText("30TH");
                    }
                    else if (result2 == 31) {
                        final String Position = "31ST";
                        this.txtReportClassPosition.setText("31ST");
                    }
                    else if (result2 == 32) {
                        final String Position = "32ND";
                        this.txtReportClassPosition.setText("32ND");
                    }
                    else if (result2 == 33) {
                        final String Position = "33RD";
                        this.txtReportClassPosition.setText("33RD");
                    }
                    else if (result2 == 34) {
                        final String Position = "34TH";
                        this.txtReportClassPosition.setText("34TH");
                    }
                    else if (result2 == 35) {
                        final String Position = "35TH";
                        this.txtReportClassPosition.setText("35TH");
                    }
                    else if (result2 == 36) {
                        final String Position = "36TH";
                        this.txtReportClassPosition.setText("36TH");
                    }
                    else if (result2 == 37) {
                        final String Position = "37TH";
                        this.txtReportClassPosition.setText("37TH");
                    }
                    else if (result2 == 38) {
                        final String Position = "38TH";
                        this.txtReportClassPosition.setText("38TH");
                    }
                    else if (result2 == 39) {
                        final String Position = "39TH";
                        this.txtReportClassPosition.setText("39TH");
                    }
                    else if (result2 == 40) {
                        final String Position = "40TH";
                        this.txtReportClassPosition.setText("40TH");
                    }
                    else if (result2 == 41) {
                        final String Position = "41ST";
                        this.txtReportClassPosition.setText("41ST");
                    }
                    else if (result2 == 42) {
                        final String Position = "42ND";
                        this.txtReportClassPosition.setText("42ND");
                    }
                    else if (result2 == 43) {
                        final String Position = "43RD";
                        this.txtReportClassPosition.setText("43RD");
                    }
                    else if (result2 == 44) {
                        final String Position = "44TH";
                        this.txtReportClassPosition.setText("44TH");
                    }
                    else if (result2 == 45) {
                        final String Position = "45TH";
                        this.txtReportClassPosition.setText("45TH");
                    }
                    else if (result2 == 46) {
                        final String Position = "46TH";
                        this.txtReportClassPosition.setText("46TH");
                    }
                    else if (result2 == 47) {
                        final String Position = "47TH";
                        this.txtReportClassPosition.setText("47TH");
                    }
                    else if (result2 == 48) {
                        final String Position = "48TH";
                        this.txtReportClassPosition.setText("48TH");
                    }
                    else if (result2 == 49) {
                        final String Position = "49TH";
                        this.txtReportClassPosition.setText("49TH");
                    }
                    else if (result2 == 50) {
                        final String Position = "50TH";
                        this.txtReportClassPosition.setText("50TH");
                    }
                    else if (result2 == 51) {
                        final String Position = "51ST";
                        this.txtReportClassPosition.setText("51ST");
                    }
                    else if (result2 == 52) {
                        final String Position = "52ND";
                        this.txtReportClassPosition.setText("52ND");
                    }
                    else if (result2 == 53) {
                        final String Position = "53RD";
                        this.txtReportClassPosition.setText("53RD");
                    }
                    else if (result2 == 54) {
                        final String Position = "54TH";
                        this.txtReportClassPosition.setText("54TH");
                    }
                    else if (result2 == 55) {
                        final String Position = "55TH";
                        this.txtReportClassPosition.setText("55TH");
                    }
                    else if (result2 == 56) {
                        final String Position = "56TH";
                        this.txtReportClassPosition.setText("56TH");
                    }
                    else if (result2 == 57) {
                        final String Position = "57TH";
                        this.txtReportClassPosition.setText("57TH");
                    }
                    else if (result2 == 58) {
                        final String Position = "58TH";
                        this.txtReportClassPosition.setText("58TH");
                    }
                    else if (result2 == 59) {
                        final String Position = "59TH";
                        this.txtReportClassPosition.setText("59TH");
                    }
                    else if (result2 == 60) {
                        final String Position = "60TH";
                        this.txtReportClassPosition.setText("60TH");
                    }
                    else if (result2 == 61) {
                        final String Position = "61ST";
                        this.txtReportClassPosition.setText("61ST");
                    }
                    else if (result2 == 62) {
                        final String Position = "62ND";
                        this.txtReportClassPosition.setText("62ND");
                    }
                    else if (result2 == 63) {
                        final String Position = "63RD";
                        this.txtReportClassPosition.setText("63RD");
                    }
                    else if (result2 == 64) {
                        final String Position = "64TH";
                        this.txtReportClassPosition.setText("64TH");
                    }
                    else if (result2 == 65) {
                        final String Position = "65TH";
                        this.txtReportClassPosition.setText("65TH");
                    }
                    else if (result2 == 66) {
                        final String Position = "66TH";
                        this.txtReportClassPosition.setText("66TH");
                    }
                    else if (result2 == 67) {
                        final String Position = "67TH";
                        this.txtReportClassPosition.setText("67TH");
                    }
                    else if (result2 == 68) {
                        final String Position = "68TH";
                        this.txtReportClassPosition.setText("68TH");
                    }
                    else if (result2 == 69) {
                        final String Position = "69TH";
                        this.txtReportClassPosition.setText("69TH");
                    }
                    else if (result2 == 70) {
                        final String Position = "70TH";
                        this.txtReportClassPosition.setText("70TH");
                    }
                    else if (result2 == 71) {
                        final String Position = "71ST";
                        this.txtReportClassPosition.setText("71ST");
                    }
                    else if (result2 == 72) {
                        final String Position = "72ND";
                        this.txtReportClassPosition.setText("72ND");
                    }
                    else if (result2 == 73) {
                        final String Position = "73RD";
                        this.txtReportClassPosition.setText("73RD");
                    }
                    else if (result2 == 74) {
                        final String Position = "74TH";
                        this.txtReportClassPosition.setText("74TH");
                    }
                    else if (result2 == 75) {
                        final String Position = "75TH";
                        this.txtReportClassPosition.setText("75TH");
                    }
                    else if (result2 == 76) {
                        final String Position = "76TH";
                        this.txtReportClassPosition.setText("76TH");
                    }
                    else if (result2 == 77) {
                        final String Position = "77TH";
                        this.txtReportClassPosition.setText("77TH");
                    }
                    else if (result2 == 78) {
                        final String Position = "78TH";
                        this.txtReportClassPosition.setText("78TH");
                    }
                    else if (result2 == 79) {
                        final String Position = "79TH";
                        this.txtReportClassPosition.setText("79TH");
                    }
                    else if (result2 == 80) {
                        final String Position = "80TH";
                        this.txtReportClassPosition.setText("80TH");
                    }
                    else {
                        this.txtReportClassPosition.setText(Integer.toString(result2));
                    }
                }
                rs4.close();
                pstatement4.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
        }
        try {
            final String QueryString = "SELECT Comment FROM ExamFormMasterComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Comment FROM ExamFormMasterComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, ID);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg3 = 0;
            while (rs.next()) {
                final String Comment = rs.getString(1);
                this.txtReportFormMasterReport.setText(Comment);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a3) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
            a3.printStackTrace();
        }
        try {
            final String QueryString = "SELECT Comment FROM examformexamofficercomment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Comment FROM examformexamofficercomment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, ID);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg3 = 0;
            while (rs.next()) {
                final String Comment = rs.getString(1);
                this.txtReportExamOffrReport.setText(Comment);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a3) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
            a3.printStackTrace();
        }
        try {
            final String QueryString = "SELECT Comment FROM ExamHouseMasterComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Comment FROM ExamHouseMasterComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, ID);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg3 = 0;
            while (rs.next()) {
                final String Comment = rs.getString(1);
                this.txtReportHouseMasterReport.setText(Comment);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a3) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
            a3.printStackTrace();
        }
        try {
            final String QueryString = "SELECT Comment FROM ExamPrincipalComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Comment FROM ExamPrincipalComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, ID);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg3 = 0;
            while (rs.next()) {
                final String Comment = rs.getString(1);
                this.txtReportPrincipalReport.setText(Comment);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a3) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
            a3.printStackTrace();
        }
        try {
            final String QueryString = "SELECT Comment FROM ExamProprietorComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Comment FROM ExamProprietorComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, ID);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg3 = 0;
            while (rs.next()) {
                final String Comment = rs.getString(1);
                this.txtReportProprietorReport.setText(Comment);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a3) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
            a3.printStackTrace();
        }
    }
    
    public void btnGenerateGradePositionAndRemarksMethod(final ActionEvent e9) {
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            if (subj == "Quran") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforquran where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforquran where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Arabic Language") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforArabic where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforArabic where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Biology") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBiology where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBiology where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Chemistry") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforChemistry where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforChemistry where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Computer Science") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforComputerScience where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforComputerScience where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Economics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforeconomics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforeconomics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "English Language") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforEnglish where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforEnglish where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Foods and Nutrition") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforFoodsandnut where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforFoodsandnut where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Further Mathematics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforFurtherMaths where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforFurtherMaths where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Geography") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforGeography where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforGeography where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Government") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforGovernment where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforGovernment where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Hausa") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHausa where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHausa where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "History") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHistory where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHistory where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Islamic Religion Knowledge") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforIslamic where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforIslamic where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Literature in English") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforLiterature where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforLiterature where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Mathematics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforMathematics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforMathematics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Physics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforPhysics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforPhysics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "ENGLISHjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforENGLISHjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforENGLISHjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "MATHSjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforMATHSjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforMATHSjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "IRSjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforIRSjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforIRSjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "ARABICjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforARABICjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforARABICjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "HOME ECONOMICjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforhomeeconsjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforhomeeconsjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "AGRICULTURAL SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforagricjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforagricjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "PHEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforPHEjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforPHEjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "BASIC SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBasicscjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBasicscjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "CIVIC EDUCATIONjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforcivicEdujss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforcivicEdujss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "LITERATURE IN ENGLISHjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforLitInEngjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforLitInEngjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "QURANjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforQURANjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforQURANjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "HAUSAjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHAUSAjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHAUSAjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "COMPUTER SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforComputerScjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforComputerScjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "BASIC TECHNOLOGYjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBasicTechjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBasicTechjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "CCAjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforCCAjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforCCAjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
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
                final String QueryString = "SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Position = rs.getString(1);
                    this.txtmySubjPosition.setText(Position);
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
    
    public void btnGenerateCAandExamsandTotal(final ActionEvent e10) {
        this.txtmyExamMarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyTotal.setText("");
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
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            double myCA = 0.0;
            try {
                final String QueryString = "SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myCA = rs.getDouble(1);
                    this.txtmyCA.setText(Double.toString(myCA));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT ExamScore FROM ExamDataEntry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ExamScore FROM ExamDataEntry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double ExamScore = rs.getDouble(1);
                    this.txtmyExamMarks.setText(Double.toString(ExamScore));
                    final double total = ExamScore + myCA;
                    this.txtmyTotal.setText(Double.toString(total));
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
    
    public void btnCOmputeCHTotalMethod(final ActionEvent evt12) {
        this.txtCHTotal.setText("");
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
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT SUM(C_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(C_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.Cwork = rs.getDouble(1);
                    this.txtCHTotal.setText(Double.toString(this.Cwork));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT SUM(H_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(H_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.Hwork = rs.getDouble(1);
                    final double CworkHworkTotal = this.Cwork + this.Hwork;
                    this.txtCHTotal.setText(Double.toString(CworkHworkTotal));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT COUNT(*) C_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) C_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.CworkRowCount = result;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT COUNT(*) H_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) H_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.HworkRowCount = result;
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
    
    public void btnGenerateTatalAverageAndActualPositionMethod(final ActionEvent evt13) {
        this.txtmyOverallTotal.setText("");
        this.txtmyAverage.setText("");
        this.txtmyActualPosition.setText("");
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
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Position = rs.getString(1);
                    this.txtmyActualPosition.setText(Position);
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
    
    public void btnGenerateClassTermAndMethod(final ActionEvent evt14) {
        this.txtmyExamMarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyTotal.setText("");
        this.txtSubjectTotal.setText("");
        final double ExamScore = 0.0;
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
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "3RD TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                final String QueryString = "SELECT Class,Term,NoInClass FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Class,Term,NoInClass FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String MYClass = rs.getString(1);
                    final String myterm = rs.getString(2);
                    final String NoInClass = rs.getString(3);
                    this.txtmyClass.setText(MYClass);
                    this.txtmyterm.setText(myterm);
                    this.txtmyNoinClass.setText(NoInClass);
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
    
    public void btnSubjectGaringMethod(final ActionEvent evt15) {
        double ExamScore = 0.0;
        this.txtRemark.setText("");
        this.txtSubjectGrading.setText("");
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
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT ExamScore FROM examdataentry WHERE RegNum =? AND Term =? AND Form =? AND Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ExamScore FROM examdataentry WHERE RegNum =? AND Term =? AND Form =? AND Subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    ExamScore = rs.getDouble(1);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT CAmarks FROM CA WHERE RegNum = ? AND Term =? AND Form = ? AND Subject =? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAmarks FROM CA WHERE RegNum = ? AND Term =? AND Form = ? AND Subject =? ");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final double CAresult = rs.getDouble(1);
                    final double SubjTototal = ExamScore + CAresult;
                    String Grade = "";
                    String Remark = "";
                    if (SubjTototal >= 80.0) {
                        Grade = "A+";
                        Remark = "Excellent";
                    }
                    else if (SubjTototal >= 70.0) {
                        Grade = "A";
                        Remark = "Very Good";
                    }
                    else if (SubjTototal >= 60.0) {
                        Grade = "B";
                        Remark = "Good";
                    }
                    else if (SubjTototal >= 50.0) {
                        Grade = "C";
                        Remark = "Pass";
                    }
                    else if (SubjTototal >= 40.0) {
                        Grade = "D";
                        Remark = "Fair";
                    }
                    else if (SubjTototal < 40.0) {
                        Grade = "F";
                        Remark = "Poor";
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "There is no valid entry in column Total!\n", "Error Grading", 0);
                    }
                    this.txtSubjectGrading.setText("");
                    this.txtRemark.setText("");
                    this.txtSubjectGrading.setText(Grade);
                    this.txtRemark.setText(Remark);
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
    
    public void ComboSelecClassMethod(final ActionEvent evt16) {
        if (evt16.getSource() == this.ComboSelecClass) {
            final String csc = (String)this.ComboSelecClass.getSelectedItem();
            if (csc.equals("JSS I A") || csc.equals("JSS I B")) {
                this.ComboForm.setSelectedItem("FORM ONE");
            }
            else if (csc.equals("JSS II A") || csc.equals("JSS II B")) {
                this.ComboForm.setSelectedItem("FORM TWO");
            }
            else if (csc.equals("JSS III A") || csc.equals("JSS III B")) {
                this.ComboForm.setSelectedItem("FORM THREE");
            }
            else if (csc.equals("SSS1 A") || csc.equals("SSS1 B")) {
                this.ComboForm.setSelectedItem("FORM FOUR");
            }
            else if (csc.equals("SSS2 A") || csc.equals("SSS2 B")) {
                this.ComboForm.setSelectedItem("FORM FIVE");
            }
            else if (csc.equals("SSS3 A") || csc.equals("SSS3 B")) {
                this.ComboForm.setSelectedItem("FORM SIX");
            }
            else {
                this.ComboForm.setSelectedItem("SELECT FORM");
            }
            this.panel.repaint();
            this.panel.revalidate();
        }
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
    
    private JTextPane createTextPane() {
        final String[] initString = { "" };
        final String[] initStyles = { "regular", "italic", "bold", "small", "large", "regular", "button", "regular", "icon", "regular" };
        final JTextPane textPane = new JTextPane();
        final StyledDocument doc = textPane.getStyledDocument();
        this.addStylesToDocument(doc);
        try {
            for (int i = 0; i < initString.length; ++i) {
                doc.insertString(doc.getLength(), initString[i], doc.getStyle(initStyles[i]));
            }
        }
        catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }
        return textPane;
    }
    
    protected void addStylesToDocument(final StyledDocument doc) {
        final Style def = StyleContext.getDefaultStyleContext().getStyle("default");
        final Style regular = doc.addStyle("Tahoma", def);
        StyleConstants.setFontFamily(def, "SansSerif");
        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);
        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);
        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 20);
        s = doc.addStyle("large", regular);
        StyleConstants.setFontSize(s, 20);
        StyleConstants.setFontSize(regular, 20);
        s = doc.addStyle("icon", regular);
        StyleConstants.setAlignment(s, 1);
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1JSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2JSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3JSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3JSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS1BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS1Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS1PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS1Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS2BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS2Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS2PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS2Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS3BlueMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS3Blue WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm1SSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm1SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm2SSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm2SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void ExamOverallTotalAndAverageTerm3SSS3PinkMethod() {
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        try {
            final String QueryString = "SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Average,OvrllTotal FROM OverallTotalAndAverageTerm3SSS3Pink WHERE Regnum=? and Form=? and Class=? and Term=? ");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, form);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            final ResultSet rs = pstatement.executeQuery();
            final int Reg = 0;
            while (rs.next()) {
                final double myAverage = rs.getDouble(1);
                this.txtReportAverage.setText(Double.toString(myAverage));
                final double myOvrllTotal = rs.getDouble(2);
                this.txtReportTatal.setText(Double.toString(myOvrllTotal));
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnPreviousMethod(final ActionEvent e18) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.txtmyclass.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        ID = Integer.parseInt(this.txtID.getText().toString());
        final String R = Integer.toString(--ID);
        this.txtID.setText(R);
        final String IDNumber = this.txtID.getText().toString();
        this.txtID.requestFocus();
    }
}
