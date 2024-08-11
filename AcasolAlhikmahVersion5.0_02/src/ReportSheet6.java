import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.sql.ResultSetMetaData;
import java.awt.print.PrinterException;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.Graphics;
import java.awt.print.Printable;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.table.TableModel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Font;
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

public class ReportSheet6 extends JFrame
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
    Vector columnNames5;
    Vector data5;
    Vector columnNames6;
    Vector data6;
    Vector columnNames7;
    Vector data7;
    Vector columnNames8;
    Vector data8;
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
    private JComboBox ComboTermInformation;
    private JTextField txtTermAttribute;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JButton btnviewComment;
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
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JScrollPane ScrollPane2;
    private JScrollPane ScrollPane3;
    private JScrollPane ScrollPane4;
    private JScrollPane ScrollPane5;
    private JScrollPane ScrollPane6;
    private JScrollPane ScrollPane7;
    private JScrollPane ScrollPane8;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnClose;
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
    private JTable table5;
    private JTable table6;
    private JTable table7;
    private JTable table8;
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
    private DefaultTableModel tableModel5;
    private DefaultTableModel tableModel6;
    private DefaultTableModel tableModel7;
    private DefaultTableModel tableModel8;
    private JLabel lblReportIsmuttalib;
    private JLabel lblReportAssaf;
    private JLabel lblReportRaqmuttasjil;
    private JLabel lblReportAmuddirasy;
    private JLabel lblReportAlfatarah;
    private JLabel lblReportRaqm;
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
    private JTextField txtReportIsmuttalib;
    private JTextField txtReportAssaf;
    private JTextField txtReportRaqmuttasjil;
    private JTextField txtReportAmuddirasy;
    private JTextField txtReportAlfatarah;
    private JTextField txtReportRaqm;
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
    String comment;
    int myposition;
    int myTotalStud;
    String mystudentName;
    String logotitle;
    private JTextField txtReportGender;
    
    static {
        ReportSheet6.printer = new J2Printer("");
    }
    
    public ReportSheet6() {
        this.columnNames = new Vector();
        this.data = new Vector();
        this.columnNames2 = new Vector();
        this.data2 = new Vector();
        this.columnNames3 = new Vector();
        this.data3 = new Vector();
        this.columnNames4 = new Vector();
        this.data4 = new Vector();
        this.columnNames5 = new Vector();
        this.data5 = new Vector();
        this.columnNames6 = new Vector();
        this.data6 = new Vector();
        this.columnNames7 = new Vector();
        this.data7 = new Vector();
        this.columnNames8 = new Vector();
        this.data8 = new Vector();
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
        ReportSheet6.onScreen = val;
    }
    
    public void ReportSheet6() {
        this.logotitle = "";
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        final Font tablefont = new Font("null", 1, 14);
        final Font f2 = new Font(null, 1, 20);
        final Font arabfont = new Font("HMSYekta", 0, 13);
        final Font f3 = new Font(null, 1, 11);
        final Font f4 = new Font(null, 1, 11);
        final Font f5 = new Font("Arial Unicode MS", 1, 11);
        final Font f6 = new Font("KacstQurn", 1, 11);
        final Font arabicFont = new Font("HMSYekta", 1, 11);
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
        (this.txtID = new JTextField("0", 7)).setFont(f2);
        this.txtRegNum = new JTextField(7);
        (this.txtName = new JTextField(35)).setFont(f2);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtCHTotal = new JTextField(5);
        this.txtOverallTotal = new JTextField(5);
        this.txtAverage = new JTextField(5);
        this.txtNoInClass = new JTextField(5);
        this.txtSubjectTotal = new JTextField(5);
        this.txtSubjectGrading = new JTextField(5);
        this.txtRemark = new JTextField(7);
        this.txtReportGender = new JTextField(7);
        this.OverallTotal = new JButton("OverallTotal");
        this.txtoverallTotal = new JTextField(5);
        this.lbloverallTotal = new JLabel("OverallTotal");
        this.lblRemark = new JLabel("REMARK:");
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.addItem("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623");
        this.ComboSelecClass.addItem("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u062c");
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b");
        this.ComboSelecClass.addItem("\u0627\u0644\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633");
        this.ComboSelecClass.setEditable(false);
        this.ComboSelecClass.setFont(f2);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0623\u0648\u0644\u0649");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629");
        this.ComboTerm.setFont(f2);
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
        this.btnviewComment = new JButton("view comment");
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
        this.panel.setBorder(BorderFactory.createLineBorder(Color.black));
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
        this.tableModel5 = new DefaultTableModel(0, 0);
        final JTable table5 = new JTable(this.tableModel5);
        this.tableModel6 = new DefaultTableModel(0, 0);
        final JTable table6 = new JTable(this.tableModel6);
        this.tableModel7 = new DefaultTableModel(0, 0);
        final JTable table7 = new JTable(this.tableModel7);
        this.tableModel8 = new DefaultTableModel(0, 0);
        final JTable table8 = new JTable(this.tableModel8);
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
        table5.setAutoCreateRowSorter(true);
        table5.setShowGrid(true);
        table5.setShowHorizontalLines(true);
        table5.setShowVerticalLines(true);
        table5.setBackground(Color.white);
        table5.setGridColor(Color.black);
        table8.setRowHeight(55);
        (this.ScrollPane = new JScrollPane(table, 21, 31)).setPreferredSize(new Dimension(600, 87));
        (this.ScrollPane2 = new JScrollPane(table2, 21, 31)).setPreferredSize(new Dimension(480, 150));
        (this.ScrollPane3 = new JScrollPane(table3, 21, 31)).setPreferredSize(new Dimension(500, 42));
        (this.ScrollPane4 = new JScrollPane(table4, 21, 31)).setPreferredSize(new Dimension(550, 42));
        (this.ScrollPane5 = new JScrollPane(table5, 21, 31)).setPreferredSize(new Dimension(450, 40));
        (this.ScrollPane6 = new JScrollPane(table6, 21, 31)).setPreferredSize(new Dimension(550, 75));
        (this.ScrollPane7 = new JScrollPane(table7, 21, 31)).setPreferredSize(new Dimension(550, 45));
        (this.ScrollPane8 = new JScrollPane(table8, 21, 31)).setPreferredSize(new Dimension(550, 55));
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
        this.textPane.insertIcon(new ImageIcon("islamiyyaSectionLogo.jpg"));
        (this.txtReportRaqmuttasjil = new JTextField(11)).setAlignmentY(0.5f);
        this.txtReportRaqmuttasjil.setAlignmentX(0.1f);
        this.txtReportRaqmuttasjil.setFont(f5);
        this.txtReportRaqmuttasjil.setHorizontalAlignment(0);
        this.textPane.insertComponent(this.txtReportRaqmuttasjil);
        (this.lblReportRaqmuttasjil = new JLabel("\u0631\u0642\u0645 \u0627\u0644\u062a\u0633\u062c\u064a\u0644 : ")).setAlignmentY(0.5f);
        this.lblReportRaqmuttasjil.setAlignmentX(0.1f);
        this.lblReportRaqmuttasjil.setFont(f5);
        this.textPane.insertComponent(this.lblReportRaqmuttasjil);
        (this.txtReportRaqm = new JTextField(7)).setAlignmentY(0.5f);
        this.txtReportRaqm.setAlignmentX(0.1f);
        this.txtReportRaqm.setFont(f5);
        this.txtReportRaqm.setHorizontalAlignment(0);
        this.textPane.insertComponent(this.txtReportRaqm);
        (this.lblReportRaqm = new JLabel(" \u0627\u0644\u0631\u0642\u0645: ")).setAlignmentY(0.5f);
        this.lblReportRaqm.setAlignmentX(0.1f);
        this.lblReportRaqm.setFont(f5);
        this.textPane.insertComponent(this.lblReportRaqm);
        (this.txtReportIsmuttalib = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportIsmuttalib.setAlignmentX(0.1f);
        this.txtReportIsmuttalib.setFont(f5);
        this.txtReportIsmuttalib.setHorizontalAlignment(4);
        this.textPane.insertComponent(this.txtReportIsmuttalib);
        (this.lblReportIsmuttalib = new JLabel("\u0625\u0633\u0645 \u0627\u0644\u0637\u0627\u0644\u0628|\u0629 :")).setAlignmentY(0.5f);
        this.lblReportIsmuttalib.setAlignmentX(0.1f);
        this.lblReportIsmuttalib.setFont(f5);
        this.textPane.insertComponent(this.lblReportIsmuttalib);
        (this.txtReportAmuddirasy = new JTextField(9)).setAlignmentY(0.5f);
        this.txtReportAmuddirasy.setAlignmentX(0.1f);
        this.txtReportAmuddirasy.setHorizontalAlignment(4);
        this.txtReportAmuddirasy.setFont(arabfont);
        this.textPane.insertComponent(this.txtReportAmuddirasy);
        (this.lblReportAmuddirasy = new JLabel(" \u0627\u0644\u0639\u0627\u0645 \u0627\u0644\u062f\u0631\u0627\u0633\u064a: ")).setAlignmentY(0.5f);
        this.lblReportAmuddirasy.setAlignmentX(0.1f);
        this.lblReportAmuddirasy.setFont(f5);
        this.txtReportIsmuttalib.setHorizontalAlignment(4);
        this.textPane.insertComponent(this.lblReportAmuddirasy);
        (this.txtReportAlfatarah = new JTextField(4)).setAlignmentY(0.5f);
        this.txtReportAlfatarah.setAlignmentX(0.1f);
        this.txtReportAlfatarah.setFont(f5);
        this.txtReportAlfatarah.setHorizontalAlignment(4);
        this.textPane.insertComponent(this.txtReportAlfatarah);
        (this.lblReportAlfatarah = new JLabel(" \u0627\u0644\u0641\u062a\u0631\u0629: ")).setAlignmentY(0.5f);
        this.lblReportAlfatarah.setAlignmentX(0.1f);
        this.lblReportAlfatarah.setFont(f5);
        this.textPane.insertComponent(this.lblReportAlfatarah);
        (this.txtReportAssaf = new JTextField(7)).setAlignmentY(0.5f);
        this.txtReportAssaf.setAlignmentX(0.1f);
        this.txtReportAssaf.setFont(f5);
        this.txtReportAssaf.setHorizontalAlignment(4);
        this.textPane.insertComponent(this.txtReportAssaf);
        (this.lblReportAssaf = new JLabel(" \u0627\u0644\u0635\u0641: ")).setAlignmentY(0.5f);
        this.lblReportAssaf.setAlignmentX(0.1f);
        this.lblReportAssaf.setFont(f5);
        this.textPane.insertComponent(this.lblReportAssaf);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.textPane.insertComponent(this.ScrollPane);
        (this.txtblankSpace1 = new JTextField("\u0627\u0644\u0635\u0641\u0627\u062a \u0627\u0644\u0646\u0641\u0633\u064a\u0629 \u0648\u062a\u0641\u0627\u0639\u0644 \u0627\u0644\u0637\u0627\u0644\u0628", 50)).setEditable(false);
        this.txtblankSpace1.setVisible(true);
        this.txtblankSpace1.setBackground(Color.GREEN.brighter());
        this.txtblankSpace1.setFont(f6);
        this.txtblankSpace1.setHorizontalAlignment(0);
        this.textPane.insertComponent(this.txtblankSpace1);
        this.textPane.insertComponent(this.ScrollPane2);
        (this.txtblankSpace2 = new JTextField("\u062a\u0641\u0627\u0635\u064a\u0644 \u0627\u0644\u062d\u0636\u0648\u0631", 50)).setEditable(false);
        this.txtblankSpace2.setVisible(true);
        this.txtblankSpace2.setBackground(Color.GREEN.brighter());
        this.txtblankSpace2.setFont(f6);
        this.txtblankSpace2.setHorizontalAlignment(0);
        this.textPane.insertComponent(this.txtblankSpace2);
        this.textPane.insertComponent(this.ScrollPane3);
        (this.txtblankSpace3 = new JTextField("\u0645\u0644\u062e\u0635 \u0623\u062f\u0627\u0621 \u0627\u0644\u0637\u0627\u0644\u0628", 50)).setEditable(false);
        this.txtblankSpace3.setVisible(true);
        this.txtblankSpace3.setBackground(Color.GREEN.brighter());
        this.txtblankSpace3.setFont(f6);
        this.txtblankSpace3.setHorizontalAlignment(0);
        this.textPane.insertComponent(this.txtblankSpace3);
        this.textPane.insertComponent(this.ScrollPane4);
        this.textPane.insertComponent(this.ScrollPane5);
        this.textPane.insertComponent(this.ScrollPane6);
        this.textPane.insertComponent(this.ScrollPane8);
        (this.txtBlankSpaceForHeading = new JTextField(50)).setEditable(false);
        this.txtBlankSpaceForHeading.setVisible(true);
        this.txtBlankSpaceForHeading.setBackground(Color.PINK);
        (this.lblReportScoresObtainable = new JLabel("SCORES OBTAINABLE : ")).setAlignmentY(0.5f);
        this.lblReportScoresObtainable.setAlignmentX(0.1f);
        this.lblReportScoresObtainable.setFont(f3);
        (this.txtReportScoresObtainable = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportScoresObtainable.setAlignmentX(0.1f);
        this.txtReportScoresObtainable.setFont(f3);
        (this.lblReportScoresObtained = new JLabel("SCORES OBTAINED : ")).setAlignmentY(0.5f);
        this.lblReportScoresObtained.setAlignmentX(0.1f);
        this.lblReportScoresObtained.setFont(f3);
        (this.txtReportScoresObtained = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportScoresObtained.setAlignmentX(0.1f);
        this.txtReportScoresObtained.setFont(f3);
        (this.lblReportAverage = new JLabel("AVERAGE: ")).setAlignmentY(0.5f);
        this.lblReportAverage.setAlignmentX(0.1f);
        this.lblReportAverage.setFont(f3);
        (this.txtReportAverage = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportAverage.setAlignmentX(0.1f);
        this.txtReportAverage.setFont(f3);
        (this.lblReportNoInClass = new JLabel("NO. IN CLASS: ")).setAlignmentY(0.5f);
        this.lblReportNoInClass.setAlignmentX(0.1f);
        this.lblReportNoInClass.setFont(f3);
        (this.txtReportNoInClass = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportNoInClass.setAlignmentX(0.1f);
        this.txtReportNoInClass.setFont(f3);
        (this.lblReportClassPosition = new JLabel("CLASS POSITION: ")).setAlignmentY(0.5f);
        this.lblReportClassPosition.setAlignmentX(0.1f);
        this.lblReportClassPosition.setFont(f3);
        (this.txtReportClassPosition = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportClassPosition.setAlignmentX(0.1f);
        this.txtReportClassPosition.setFont(f3);
        this.txtReportClassPosition.setBackground(Color.GRAY);
        (this.lblReportFormMasterReport = new JLabel("\u062a\u0639\u0644\u064a\u0642 \u0623\u0628\u064a \u0627\u0644\u0641\u0635\u0644: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterReport.setAlignmentX(0.1f);
        this.lblReportFormMasterReport.setFont(f3);
        (this.txtReportFormMasterReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportFormMasterReport.setAlignmentX(0.1f);
        this.txtReportFormMasterReport.setFont(tablefont);
        (this.lblReportPrincipalReport = new JLabel("HEAD TEACHER'S COMMENT:    ")).setAlignmentY(0.5f);
        this.lblReportPrincipalReport.setAlignmentX(0.1f);
        this.lblReportPrincipalReport.setFont(f3);
        (this.txtReportPrincipalReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportPrincipalReport.setAlignmentX(0.1f);
        this.txtReportPrincipalReport.setFont(f3);
        (this.lblReportNextTermBegins = new JLabel("RESUMPTION DATE: ")).setAlignmentY(0.5f);
        this.lblReportNextTermBegins.setAlignmentX(0.1f);
        this.lblReportNextTermBegins.setFont(f3);
        (this.txtReportNextTermBegins = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportNextTermBegins.setAlignmentX(0.1f);
        this.txtReportNextTermBegins.setFont(f3);
        (this.lblReportSchFeesBalance = new JLabel("OUTSTANDING FEE: ")).setAlignmentY(0.5f);
        this.lblReportSchFeesBalance.setAlignmentX(0.1f);
        this.lblReportSchFeesBalance.setFont(f3);
        (this.txtReportSchFeesBalance = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportSchFeesBalance.setAlignmentX(0.1f);
        this.txtReportSchFeesBalance.setFont(f3);
        (this.lblReportSchFeesBalanceTerm = new JLabel("TERM: ")).setAlignmentY(0.5f);
        this.lblReportSchFeesBalanceTerm.setAlignmentX(0.1f);
        this.lblReportSchFeesBalanceTerm.setFont(f3);
        (this.txtReportSchFeesBalanceTerm = new JTextField(15)).setAlignmentY(0.5f);
        this.txtReportSchFeesBalanceTerm.setAlignmentX(0.1f);
        this.txtReportSchFeesBalanceTerm.setFont(f3);
        (this.lblReportPrincipalSignature3 = new JLabel("SIGNATURE: ")).setAlignmentY(0.99f);
        this.lblReportPrincipalSignature3.setAlignmentX(-0.1f);
        this.lblReportPrincipalSignature3.setFont(f3);
        (this.lblReportPrincipalDate = new JLabel("DATE: ")).setAlignmentY(0.5f);
        this.lblReportPrincipalDate.setAlignmentX(-0.1f);
        this.lblReportPrincipalDate.setFont(f3);
        (this.txtReportPrincipalDate = new JTextField(2)).setAlignmentY(0.5f);
        this.txtReportPrincipalDate.setAlignmentX(0.1f);
        this.txtReportPrincipalDate.setFont(f3);
        this.txtReportPrincipalDate.setText(this.year);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(690, 615);
        this.setTitle("Report Sheet Output Window [ISLAMIYYA Type III]");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.red);
        this.btnviewComment.setBackground(Color.red);
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
                ReportSheet6.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                ReportSheet6.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                ReportSheet6.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGenerateGradePositionAndRemarks.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnGenerateGradePositionAndRemarksMethod(evt9);
            }
        });
        this.btnGenerateCAandExamsandTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnGenerateCAandExamsandTotal(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnGenerateTatalAverageAndActualPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnGenerateTatalAverageAndActualPositionMethod(evt13);
            }
        });
        this.btnGenerateClassTermAnd.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnGenerateClassTermAndMethod(evt14);
            }
        });
        this.btnSubjectGrading.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnSubjectGaringMethod(evt15);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ReportSheet6.this.connectToDB();
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                ReportSheet6.this.connectToDB();
                ReportSheet6.this.btnPreviousMethod(evt18);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font("KacstQurn", 1, 9);
                table.setFont(d);
                final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(0);
                table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
                final DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                rightRenderer.setHorizontalAlignment(4);
                table.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
                table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
                table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                final JTableHeader header = table.getTableHeader();
                header.setBackground(Color.GREEN.brighter().brighter());
                header.setFont(d);
                final TableColumnModel colModel = header.getColumnModel();
                final TableColumn colMawad = colModel.getColumn(7);
                colMawad.setHeaderValue("\u0627\u0644\u0645\u0648\u0627\u062f");
                final TableColumn colTaqweem = colModel.getColumn(6);
                colTaqweem.setHeaderValue(" \u062a/\u0645\u0633\u062a\u0645\u0631");
                final TableColumn colImtihan = colModel.getColumn(5);
                colImtihan.setHeaderValue("\u0627\u0644\u0625\u0645\u062a\u062d\u0627\u0646 ");
                final TableColumn colAlmajmuu = colModel.getColumn(4);
                colAlmajmuu.setHeaderValue("\u0627\u0644\u0645\u062c\u0645\u0648\u0639");
                final TableColumn colAttaqdeer = colModel.getColumn(3);
                colAttaqdeer.setHeaderValue("\u0627\u0644\u062a\u0642\u062f\u064a\u0631");
                final TableColumn colAlmarkaz = colModel.getColumn(2);
                colAlmarkaz.setHeaderValue("\u0627\u0644\u0645\u0631\u0643\u0630 ");
                final TableColumn colAlmulahazah = colModel.getColumn(1);
                colAlmulahazah.setHeaderValue("\u0627\u0644\u0645\u0644\u062d\u0648\u0638\u0629 ");
                final TableColumn colSubjects = colModel.getColumn(0);
                colSubjects.setHeaderValue("Subjects");
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(110);
                final TableColumn column2 = table.getColumnModel().getColumn(1);
                column2.setPreferredWidth(90);
                final TableColumn column3 = table.getColumnModel().getColumn(2);
                column3.setPreferredWidth(20);
                final TableColumn column4 = table.getColumnModel().getColumn(3);
                column4.setPreferredWidth(23);
                final TableColumn column5 = table.getColumnModel().getColumn(4);
                column5.setPreferredWidth(25);
                final TableColumn column6 = table.getColumnModel().getColumn(5);
                column6.setPreferredWidth(31);
                final TableColumn column7 = table.getColumnModel().getColumn(6);
                column7.setPreferredWidth(25);
                final TableColumn column8 = table.getColumnModel().getColumn(7);
                column8.setPreferredWidth(73);
                final DefaultTableModel model = (DefaultTableModel)table.getModel();
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("1") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("1.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("1.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("1.0")) {
                    final String arabicver = "\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("1.0")) {
                        model.setValueAt("\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("1.0")) {
                        model.setValueAt("\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("1.0")) {
                        model.setValueAt("\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("1")) {
                        model.setValueAt("\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("2") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("2.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("2.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("2.0")) {
                    final String arabicver = "\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("2.0")) {
                        model.setValueAt("\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("2.0")) {
                        model.setValueAt("\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("2.0")) {
                        model.setValueAt("\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("2")) {
                        model.setValueAt("\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("3") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("3.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("3.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("3.0")) {
                    final String arabicver = "\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("3.0")) {
                        model.setValueAt("\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("3.0")) {
                        model.setValueAt("\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("3.0")) {
                        model.setValueAt("\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("3")) {
                        model.setValueAt("\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("4") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("4.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("4.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("4.0")) {
                    final String arabicver = "\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("4.0")) {
                        model.setValueAt("\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("4.0")) {
                        model.setValueAt("\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("4.0")) {
                        model.setValueAt("\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("4")) {
                        model.setValueAt("\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("5") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("5.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("5.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("5.0")) {
                    final String arabicver = "\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("5.0")) {
                        model.setValueAt("\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("5.0")) {
                        model.setValueAt("\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("5.0")) {
                        model.setValueAt("\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("5")) {
                        model.setValueAt("\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("6") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("6.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("6.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("6.0")) {
                    final String arabicver = "\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("6.0")) {
                        model.setValueAt("\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("6.0")) {
                        model.setValueAt("\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("6.0")) {
                        model.setValueAt("\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("6")) {
                        model.setValueAt("\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("7") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("7.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("7.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("7.0")) {
                    final String arabicver = "\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("7.0")) {
                        model.setValueAt("\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("7.0")) {
                        model.setValueAt("\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("7.0")) {
                        model.setValueAt("\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("7")) {
                        model.setValueAt("\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("8") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("8.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("8.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("8.0")) {
                    final String arabicver = "\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("8.0")) {
                        model.setValueAt("\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("8.0")) {
                        model.setValueAt("\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("8.0")) {
                        model.setValueAt("\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("8")) {
                        model.setValueAt("\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("9") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("9.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("9.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("9.0")) {
                    final String arabicver = "\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("9.0")) {
                        model.setValueAt("\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("9.0")) {
                        model.setValueAt("\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("9.0")) {
                        model.setValueAt("\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("9")) {
                        model.setValueAt("\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("10") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("10.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("10.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("10.0")) {
                    final String arabicver = "\u0661\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("10.0")) {
                        model.setValueAt("\u0661\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("10.0")) {
                        model.setValueAt("\u0661\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("10.0")) {
                        model.setValueAt("\u0661\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("10")) {
                        model.setValueAt("\u0661\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("11") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("11.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("11.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("11.0")) {
                    final String arabicver = "\u0661\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("11.0")) {
                        model.setValueAt("\u0661\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("11.0")) {
                        model.setValueAt("\u0661\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("11.0")) {
                        model.setValueAt("\u0661\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("11")) {
                        model.setValueAt("\u0661\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("12") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("12.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("12.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("12.0")) {
                    final String arabicver = "\u0661\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("12.0")) {
                        model.setValueAt("\u0661\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("12.0")) {
                        model.setValueAt("\u0661\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("12.0")) {
                        model.setValueAt("\u0661\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("12")) {
                        model.setValueAt("\u0661\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("13") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("13.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("13.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("13.0")) {
                    final String arabicver = "\u0661\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("13.0")) {
                        model.setValueAt("\u0661\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("13.0")) {
                        model.setValueAt("\u0661\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("13.0")) {
                        model.setValueAt("\u0661\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("13")) {
                        model.setValueAt("\u0661\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("14") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("14.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("14.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("14.0")) {
                    final String arabicver = "\u0661\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("14.0")) {
                        model.setValueAt("\u0661\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("14.0")) {
                        model.setValueAt("\u0661\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("14.0")) {
                        model.setValueAt("\u0661\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("14")) {
                        model.setValueAt("\u0661\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("15") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("15.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("15.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("15.0")) {
                    final String arabicver = "\u0661\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("15.0")) {
                        model.setValueAt("\u0661\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("15.0")) {
                        model.setValueAt("\u0661\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("15.0")) {
                        model.setValueAt("\u0661\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("15")) {
                        model.setValueAt("\u0661\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("16") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("16.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("16.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("16.0")) {
                    final String arabicver = "\u0661\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("16.0")) {
                        model.setValueAt("\u0661\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("16.0")) {
                        model.setValueAt("\u0661\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("16.0")) {
                        model.setValueAt("\u0661\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("16")) {
                        model.setValueAt("\u0661\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("17") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("17.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("17.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("17.0")) {
                    final String arabicver = "\u0661\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("17.0")) {
                        model.setValueAt("\u0661\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("17.0")) {
                        model.setValueAt("\u0661\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("17.0")) {
                        model.setValueAt("\u0661\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("17")) {
                        model.setValueAt("\u0661\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("18") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("18.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("18.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("18.0")) {
                    final String arabicver = "\u0661\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("18.0")) {
                        model.setValueAt("\u0661\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("18.0")) {
                        model.setValueAt("\u0661\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("18.0")) {
                        model.setValueAt("\u0661\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("18")) {
                        model.setValueAt("\u0661\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("19") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("19.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("19.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("19.0")) {
                    final String arabicver = "\u0661\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("19.0")) {
                        model.setValueAt("\u0661\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("19.0")) {
                        model.setValueAt("\u0661\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("19.0")) {
                        model.setValueAt("\u0661\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("19")) {
                        model.setValueAt("\u0661\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("20") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("20.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("20.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("20.0")) {
                    final String arabicver = "\u0662\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("20.0")) {
                        model.setValueAt("\u0662\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("20.0")) {
                        model.setValueAt("\u0662\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("20.0")) {
                        model.setValueAt("\u0662\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("20")) {
                        model.setValueAt("\u0662\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("21") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("21.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("21.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("21.0")) {
                    final String arabicver = "\u0662\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("21.0")) {
                        model.setValueAt("\u0662\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("21.0")) {
                        model.setValueAt("\u0662\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("21.0")) {
                        model.setValueAt("\u0662\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("21")) {
                        model.setValueAt("\u0662\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("22") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("22.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("22.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("22.0")) {
                    final String arabicver = "\u0662\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("22.0")) {
                        model.setValueAt("\u0662\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("22.0")) {
                        model.setValueAt("\u0662\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("22.0")) {
                        model.setValueAt("\u0662\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("22")) {
                        model.setValueAt("\u0662\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("23") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("23.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("23.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("23.0")) {
                    final String arabicver = "\u0662\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("23.0")) {
                        model.setValueAt("\u0662\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("23.0")) {
                        model.setValueAt("\u0662\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("23.0")) {
                        model.setValueAt("\u0662\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("23")) {
                        model.setValueAt("\u0662\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("24") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("24.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("24.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("24.0")) {
                    final String arabicver = "\u0662\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("24.0")) {
                        model.setValueAt("\u0662\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("24.0")) {
                        model.setValueAt("\u0662\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("24.0")) {
                        model.setValueAt("\u0662\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("24")) {
                        model.setValueAt("\u0662\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("25") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("25.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("25.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("25.0")) {
                    final String arabicver = "\u0662\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("25.0")) {
                        model.setValueAt("\u0662\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("25.0")) {
                        model.setValueAt("\u0662\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("25.0")) {
                        model.setValueAt("\u0662\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("25")) {
                        model.setValueAt("\u0662\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("26") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("26.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("26.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("26.0")) {
                    final String arabicver = "\u0662\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("26.0")) {
                        model.setValueAt("\u0662\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("26.0")) {
                        model.setValueAt("\u0662\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("26.0")) {
                        model.setValueAt("\u0662\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("26")) {
                        model.setValueAt("\u0662\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("27") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("27.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("27.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("27.0")) {
                    final String arabicver = "\u0662\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("27.0")) {
                        model.setValueAt("\u0662\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("27.0")) {
                        model.setValueAt("\u0662\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("27.0")) {
                        model.setValueAt("\u0662\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("27")) {
                        model.setValueAt("\u0662\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("28") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("28.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("28.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("28.0")) {
                    final String arabicver = "\u0662\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("28.0")) {
                        model.setValueAt("\u0662\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("28.0")) {
                        model.setValueAt("\u0662\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("28.0")) {
                        model.setValueAt("\u0662\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("28")) {
                        model.setValueAt("\u0662\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("29") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("29.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("29.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("29.0")) {
                    final String arabicver = "\u0662\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("29.0")) {
                        model.setValueAt("\u0662\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("29.0")) {
                        model.setValueAt("\u0662\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("29.0")) {
                        model.setValueAt("\u0662\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("29")) {
                        model.setValueAt("\u0662\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("30") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("30.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("30.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("30.0")) {
                    final String arabicver = "\u0663\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("30.0")) {
                        model.setValueAt("\u0663\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("30.0")) {
                        model.setValueAt("\u0663\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("30.0")) {
                        model.setValueAt("\u0663\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("30")) {
                        model.setValueAt("\u0663\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("31") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("31.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("31.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("31.0")) {
                    final String arabicver = "\u0663\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("31.0")) {
                        model.setValueAt("\u0663\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("31.0")) {
                        model.setValueAt("\u0663\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("31.0")) {
                        model.setValueAt("\u0663\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("31")) {
                        model.setValueAt("\u0663\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("32") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("32.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("32.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("32.0")) {
                    final String arabicver = "\u0663\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("32.0")) {
                        model.setValueAt("\u0663\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("32.0")) {
                        model.setValueAt("\u0663\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("32.0")) {
                        model.setValueAt("\u0663\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("32")) {
                        model.setValueAt("\u0663\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("33") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("33.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("33.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("33.0")) {
                    final String arabicver = "\u0663\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("33.0")) {
                        model.setValueAt("\u0663\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("33.0")) {
                        model.setValueAt("\u0663\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("33.0")) {
                        model.setValueAt("\u0663\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("33")) {
                        model.setValueAt("\u0663\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("34") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("34.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("34.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("34.0")) {
                    final String arabicver = "\u0663\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("34.0")) {
                        model.setValueAt("\u0663\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("34.0")) {
                        model.setValueAt("\u0663\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("34.0")) {
                        model.setValueAt("\u0663\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("34")) {
                        model.setValueAt("\u0663\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("35") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("35.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("35.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("35.0")) {
                    final String arabicver = "\u0663\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("35.0")) {
                        model.setValueAt("\u0663\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("35.0")) {
                        model.setValueAt("\u0663\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("35.0")) {
                        model.setValueAt("\u0663\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("35")) {
                        model.setValueAt("\u0663\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("36") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("36.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("36.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("36.0")) {
                    final String arabicver = "\u0663\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("36.0")) {
                        model.setValueAt("\u0663\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("36.0")) {
                        model.setValueAt("\u0663\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("36.0")) {
                        model.setValueAt("\u0663\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("36")) {
                        model.setValueAt("\u0663\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("37") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("37.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("37.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("37.0")) {
                    final String arabicver = "\u0663\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("37.0")) {
                        model.setValueAt("\u0663\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("37.0")) {
                        model.setValueAt("\u0663\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("37.0")) {
                        model.setValueAt("\u0663\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("37")) {
                        model.setValueAt("\u0663\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("38") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("38.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("38.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("38.0")) {
                    final String arabicver = "\u0663\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("38.0")) {
                        model.setValueAt("\u0663\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("38.0")) {
                        model.setValueAt("\u0663\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("38.0")) {
                        model.setValueAt("\u0663\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("38")) {
                        model.setValueAt("\u0663\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("39") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("39.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("39.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("39.0")) {
                    final String arabicver = "\u0663\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("39.0")) {
                        model.setValueAt("\u0663\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("39.0")) {
                        model.setValueAt("\u0663\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("39.0")) {
                        model.setValueAt("\u0663\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("39")) {
                        model.setValueAt("\u0663\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("40") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("40.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("40.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("40.0")) {
                    final String arabicver = "\u0664\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("40.0")) {
                        model.setValueAt("\u0664\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("40.0")) {
                        model.setValueAt("\u0664\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("40.0")) {
                        model.setValueAt("\u0664\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("40")) {
                        model.setValueAt("\u0664\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("41") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("41.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("41.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("41.0")) {
                    final String arabicver = "\u0664\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("41.0")) {
                        model.setValueAt("\u0664\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("41.0")) {
                        model.setValueAt("\u0664\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("41.0")) {
                        model.setValueAt("\u0664\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("41")) {
                        model.setValueAt("\u0664\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("42") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("42.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("42.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("42.0")) {
                    final String arabicver = "\u0664\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("42.0")) {
                        model.setValueAt("\u0664\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("42.0")) {
                        model.setValueAt("\u0664\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("42.0")) {
                        model.setValueAt("\u0664\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("42")) {
                        model.setValueAt("\u0664\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("43") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("43.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("43.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("43.0")) {
                    final String arabicver = "\u0664\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("43.0")) {
                        model.setValueAt("\u0664\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("43.0")) {
                        model.setValueAt("\u0664\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("43.0")) {
                        model.setValueAt("\u0664\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("43")) {
                        model.setValueAt("\u0664\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("44") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("44.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("44.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("44.0")) {
                    final String arabicver = "\u0664\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("44.0")) {
                        model.setValueAt("\u0664\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("44.0")) {
                        model.setValueAt("\u0664\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("44.0")) {
                        model.setValueAt("\u0664\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("44")) {
                        model.setValueAt("\u0664\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("45") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("45.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("45.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("45.0")) {
                    final String arabicver = "\u0664\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("45.0")) {
                        model.setValueAt("\u0664\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("45.0")) {
                        model.setValueAt("\u0664\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("45.0")) {
                        model.setValueAt("\u0664\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("45")) {
                        model.setValueAt("\u0664\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("46") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("46.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("46.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("46.0")) {
                    final String arabicver = "\u0664\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("46.0")) {
                        model.setValueAt("\u0664\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("46.0")) {
                        model.setValueAt("\u0664\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("46.0")) {
                        model.setValueAt("\u0664\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("46")) {
                        model.setValueAt("\u0664\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("47") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("47.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("47.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("47.0")) {
                    final String arabicver = "\u0664\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("47.0")) {
                        model.setValueAt("\u0664\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("47.0")) {
                        model.setValueAt("\u0664\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("47.0")) {
                        model.setValueAt("\u0664\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("47")) {
                        model.setValueAt("\u0664\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("48") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("48.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("48.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("48.0")) {
                    final String arabicver = "\u0664\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("48.0")) {
                        model.setValueAt("\u0664\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("48.0")) {
                        model.setValueAt("\u0664\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("48.0")) {
                        model.setValueAt("\u0664\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("48")) {
                        model.setValueAt("\u0664\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("49") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("49.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("49.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("49.0")) {
                    final String arabicver = "\u0664\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("49.0")) {
                        model.setValueAt("\u0664\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("49.0")) {
                        model.setValueAt("\u0664\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("49.0")) {
                        model.setValueAt("\u0664\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("49")) {
                        model.setValueAt("\u0664\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("50") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("50.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("50.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("50.0")) {
                    final String arabicver = "\u0665\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("50.0")) {
                        model.setValueAt("\u0665\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("50.0")) {
                        model.setValueAt("\u0665\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("50.0")) {
                        model.setValueAt("\u0665\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("50")) {
                        model.setValueAt("\u0665\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("51") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("51.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("51.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("51.0")) {
                    final String arabicver = "\u0665\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("51.0")) {
                        model.setValueAt("\u0665\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("51.0")) {
                        model.setValueAt("\u0665\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("51.0")) {
                        model.setValueAt("\u0665\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("51")) {
                        model.setValueAt("\u0665\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("52") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("52.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("52.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("52.0")) {
                    final String arabicver = "\u0665\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("52.0")) {
                        model.setValueAt("\u0665\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("52.0")) {
                        model.setValueAt("\u0665\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("52.0")) {
                        model.setValueAt("\u0665\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("52")) {
                        model.setValueAt("\u0665\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("53") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("53.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("53.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("53.0")) {
                    final String arabicver = "\u0665\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("53.0")) {
                        model.setValueAt("\u0665\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("53.0")) {
                        model.setValueAt("\u0665\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("53.0")) {
                        model.setValueAt("\u0665\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("53")) {
                        model.setValueAt("\u0665\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("54") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("54.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("54.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("54.0")) {
                    final String arabicver = "\u0665\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("54.0")) {
                        model.setValueAt("\u0665\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("54.0")) {
                        model.setValueAt("\u0665\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("54.0")) {
                        model.setValueAt("\u0665\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("54")) {
                        model.setValueAt("\u0665\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("55") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("55.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("55.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("55.0")) {
                    final String arabicver = "\u0665\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("55.0")) {
                        model.setValueAt("\u0665\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("55.0")) {
                        model.setValueAt("\u0665\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("55.0")) {
                        model.setValueAt("\u0665\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("55")) {
                        model.setValueAt("\u0665\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("56") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("56.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("56.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("56.0")) {
                    final String arabicver = "\u0665\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("56.0")) {
                        model.setValueAt("\u0665\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("56.0")) {
                        model.setValueAt("\u0665\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("56.0")) {
                        model.setValueAt("\u0665\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("56")) {
                        model.setValueAt("\u0665\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("57") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("57.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("57.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("57.0")) {
                    final String arabicver = "\u0665\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("57.0")) {
                        model.setValueAt("\u0665\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("57.0")) {
                        model.setValueAt("\u0665\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("57.0")) {
                        model.setValueAt("\u0665\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("57")) {
                        model.setValueAt("\u0665\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("58") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("58.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("58.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("58.0")) {
                    final String arabicver = "\u0665\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("58.0")) {
                        model.setValueAt("\u0665\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("58.0")) {
                        model.setValueAt("\u0665\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("58.0")) {
                        model.setValueAt("\u0665\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("58")) {
                        model.setValueAt("\u0665\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("59") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("59.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("59.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("59.0")) {
                    final String arabicver = "\u0665\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("59.0")) {
                        model.setValueAt("\u0665\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("59.0")) {
                        model.setValueAt("\u0665\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("59.0")) {
                        model.setValueAt("\u0665\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("59")) {
                        model.setValueAt("\u0665\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("60") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("60.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("60.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("60.0")) {
                    final String arabicver = "\u0666\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("60.0")) {
                        model.setValueAt("\u0666\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("60.0")) {
                        model.setValueAt("\u0666\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("60.0")) {
                        model.setValueAt("\u0666\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("60")) {
                        model.setValueAt("\u0666\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("61") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("61.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("61.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("61.0")) {
                    final String arabicver = "\u0666\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("61.0")) {
                        model.setValueAt("\u0666\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("61.0")) {
                        model.setValueAt("\u0666\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("61.0")) {
                        model.setValueAt("\u0666\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("61")) {
                        model.setValueAt("\u0666\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("62") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("62.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("62.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("62.0")) {
                    final String arabicver = "\u0666\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("62.0")) {
                        model.setValueAt("\u0666\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("62.0")) {
                        model.setValueAt("\u0666\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("62.0")) {
                        model.setValueAt("\u0666\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("62")) {
                        model.setValueAt("\u0666\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("63") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("63.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("63.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("63.0")) {
                    final String arabicver = "\u0666\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("63.0")) {
                        model.setValueAt("\u0666\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("63.0")) {
                        model.setValueAt("\u0666\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("63.0")) {
                        model.setValueAt("\u0666\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("63")) {
                        model.setValueAt("\u0666\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("64") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("64.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("64.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("64.0")) {
                    final String arabicver = "\u0666\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("64.0")) {
                        model.setValueAt("\u0666\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("64.0")) {
                        model.setValueAt("\u0666\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("64.0")) {
                        model.setValueAt("\u0666\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("64")) {
                        model.setValueAt("\u0666\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("65") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("65.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("65.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("65.0")) {
                    final String arabicver = "\u0666\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("65.0")) {
                        model.setValueAt("\u0666\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("65.0")) {
                        model.setValueAt("\u0666\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("65.0")) {
                        model.setValueAt("\u0666\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("65")) {
                        model.setValueAt("\u0666\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("66") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("66.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("66.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("66.0")) {
                    final String arabicver = "\u0666\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("66.0")) {
                        model.setValueAt("\u0666\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("66.0")) {
                        model.setValueAt("\u0666\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("66.0")) {
                        model.setValueAt("\u0666\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("66")) {
                        model.setValueAt("\u0666\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("67") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("67.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("67.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("67.0")) {
                    final String arabicver = "\u0666\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("67.0")) {
                        model.setValueAt("\u0666\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("67.0")) {
                        model.setValueAt("\u0666\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("67.0")) {
                        model.setValueAt("\u0666\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("67")) {
                        model.setValueAt("\u0666\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("68") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("68.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("68.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("68.0")) {
                    final String arabicver = "\u0666\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("68.0")) {
                        model.setValueAt("\u0666\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("68.0")) {
                        model.setValueAt("\u0666\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("68.0")) {
                        model.setValueAt("\u0666\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("68")) {
                        model.setValueAt("\u0666\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("69") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("69.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("69.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("69.0")) {
                    final String arabicver = "\u0666\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("69.0")) {
                        model.setValueAt("\u0666\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("69.0")) {
                        model.setValueAt("\u0666\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("69.0")) {
                        model.setValueAt("\u0666\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("69")) {
                        model.setValueAt("\u0666\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("70") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("70.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("70.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("70.0")) {
                    final String arabicver = "\u0667\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("70.0")) {
                        model.setValueAt("\u0667\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("70.0")) {
                        model.setValueAt("\u0667\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("70.0")) {
                        model.setValueAt("\u0667\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("70")) {
                        model.setValueAt("\u0667\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("71") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("71.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("71.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("71.0")) {
                    final String arabicver = "\u0667\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("71.0")) {
                        model.setValueAt("\u0667\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("71.0")) {
                        model.setValueAt("\u0667\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("71.0")) {
                        model.setValueAt("\u0667\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("71")) {
                        model.setValueAt("\u0667\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("72") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("72.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("72.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("72.0")) {
                    final String arabicver = "\u0667\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("72.0")) {
                        model.setValueAt("\u0667\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("72.0")) {
                        model.setValueAt("\u0667\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("72.0")) {
                        model.setValueAt("\u0667\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("72")) {
                        model.setValueAt("\u0667\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("73") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("73.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("73.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("73.0")) {
                    final String arabicver = "\u0667\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("73.0")) {
                        model.setValueAt("\u0667\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("73.0")) {
                        model.setValueAt("\u0667\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("73.0")) {
                        model.setValueAt("\u0667\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("73")) {
                        model.setValueAt("\u0667\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("74") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("74.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("74.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("74.0")) {
                    final String arabicver = "\u0667\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("74.0")) {
                        model.setValueAt("\u0667\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("74.0")) {
                        model.setValueAt("\u0667\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("74.0")) {
                        model.setValueAt("\u0667\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("74")) {
                        model.setValueAt("\u0667\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("75") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("75.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("75.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("75.0")) {
                    final String arabicver = "\u0667\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("75.0")) {
                        model.setValueAt("\u0667\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("75.0")) {
                        model.setValueAt("\u0667\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("75.0")) {
                        model.setValueAt("\u0667\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("75")) {
                        model.setValueAt("\u0667\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("76") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("76.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("76.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("76.0")) {
                    final String arabicver = "\u0667\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("76.0")) {
                        model.setValueAt("\u0667\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("76.0")) {
                        model.setValueAt("\u0667\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("76.0")) {
                        model.setValueAt("\u0667\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("76")) {
                        model.setValueAt("\u0667\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("77") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("77.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("77.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("77.0")) {
                    final String arabicver = "\u0667\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("77.0")) {
                        model.setValueAt("\u0667\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("77.0")) {
                        model.setValueAt("\u0667\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("77.0")) {
                        model.setValueAt("\u0667\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("77")) {
                        model.setValueAt("\u0667\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("78") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("78.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("78.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("78.0")) {
                    final String arabicver = "\u0667\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("78.0")) {
                        model.setValueAt("\u0667\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("78.0")) {
                        model.setValueAt("\u0667\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("78.0")) {
                        model.setValueAt("\u0667\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("78")) {
                        model.setValueAt("\u0667\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("79") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("79.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("79.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("79.0")) {
                    final String arabicver = "\u0667\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("79.0")) {
                        model.setValueAt("\u0667\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("79.0")) {
                        model.setValueAt("\u0667\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("79.0")) {
                        model.setValueAt("\u0667\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("79")) {
                        model.setValueAt("\u0667\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("80") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("80.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("80.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("80.0")) {
                    final String arabicver = "\u0668\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("80.0")) {
                        model.setValueAt("\u0668\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("80.0")) {
                        model.setValueAt("\u0668\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("80.0")) {
                        model.setValueAt("\u0668\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("80")) {
                        model.setValueAt("\u0668\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("81") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("81.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("81.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("81.0")) {
                    final String arabicver = "\u0668\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("81.0")) {
                        model.setValueAt("\u0668\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("81.0")) {
                        model.setValueAt("\u0668\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("81.0")) {
                        model.setValueAt("\u0668\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("81")) {
                        model.setValueAt("\u0668\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("82") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("82.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("82.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("82.0")) {
                    final String arabicver = "\u0668\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("82.0")) {
                        model.setValueAt("\u0668\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("82.0")) {
                        model.setValueAt("\u0668\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("82.0")) {
                        model.setValueAt("\u0668\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("82")) {
                        model.setValueAt("\u0668\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("83") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("83.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("83.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("83.0")) {
                    final String arabicver = "\u0668\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("83.0")) {
                        model.setValueAt("\u0668\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("83.0")) {
                        model.setValueAt("\u0668\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("83.0")) {
                        model.setValueAt("\u0668\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("83")) {
                        model.setValueAt("\u0668\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("84") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("84.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("84.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("84.0")) {
                    final String arabicver = "\u0668\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("84.0")) {
                        model.setValueAt("\u0668\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("84.0")) {
                        model.setValueAt("\u0668\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("84.0")) {
                        model.setValueAt("\u0668\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("84")) {
                        model.setValueAt("\u0668\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("85") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("85.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("85.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("85.0")) {
                    final String arabicver = "\u0668\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("85.0")) {
                        model.setValueAt("\u0668\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("85.0")) {
                        model.setValueAt("\u0668\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("85.0")) {
                        model.setValueAt("\u0668\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("85")) {
                        model.setValueAt("\u0668\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("86") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("86.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("86.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("86.0")) {
                    final String arabicver = "\u0668\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("86.0")) {
                        model.setValueAt("\u0668\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("86.0")) {
                        model.setValueAt("\u0668\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("86.0")) {
                        model.setValueAt("\u0668\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("86")) {
                        model.setValueAt("\u0668\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("87") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("87.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("87.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("87.0")) {
                    final String arabicver = "\u0668\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("87.0")) {
                        model.setValueAt("\u0668\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("87.0")) {
                        model.setValueAt("\u0668\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("87.0")) {
                        model.setValueAt("\u0668\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("87")) {
                        model.setValueAt("\u0668\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("88") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("88.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("88.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("88.0")) {
                    final String arabicver = "\u0668\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("88.0")) {
                        model.setValueAt("\u0668\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("88.0")) {
                        model.setValueAt("\u0668\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("88.0")) {
                        model.setValueAt("\u0668\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("88")) {
                        model.setValueAt("\u0668\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("89") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("89.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("89.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("89.0")) {
                    final String arabicver = "\u0668\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("89.0")) {
                        model.setValueAt("\u0668\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("89.0")) {
                        model.setValueAt("\u0668\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("89.0")) {
                        model.setValueAt("\u0668\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("89")) {
                        model.setValueAt("\u0668\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("90") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("90.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("90.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("90.0")) {
                    final String arabicver = "\u0669\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("90.0")) {
                        model.setValueAt("\u0669\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("90.0")) {
                        model.setValueAt("\u0669\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("90.0")) {
                        model.setValueAt("\u0669\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("90")) {
                        model.setValueAt("\u0669\u0660", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("91") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("91.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("91.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("91.0")) {
                    final String arabicver = "\u0669\u0661";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("91.0")) {
                        model.setValueAt("\u0669\u0661", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("91.0")) {
                        model.setValueAt("\u0669\u0661", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("91.0")) {
                        model.setValueAt("\u0669\u0661", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("91")) {
                        model.setValueAt("\u0669\u0661", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("92") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("92.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("92.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("92.0")) {
                    final String arabicver = "\u0669\u0662";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("92.0")) {
                        model.setValueAt("\u0669\u0662", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("92.0")) {
                        model.setValueAt("\u0669\u0662", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("92.0")) {
                        model.setValueAt("\u0669\u0662", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("92")) {
                        model.setValueAt("\u0669\u0662", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("93") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("93.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("93.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("93.0")) {
                    final String arabicver = "\u0669\u0663";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("93.0")) {
                        model.setValueAt("\u0669\u0663", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("93.0")) {
                        model.setValueAt("\u0669\u0663", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("93.0")) {
                        model.setValueAt("\u0669\u0663", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("93")) {
                        model.setValueAt("\u0669\u0663", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("94") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("94.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("94.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("94.0")) {
                    final String arabicver = "\u0669\u0664";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("94.0")) {
                        model.setValueAt("\u0669\u0664", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("94.0")) {
                        model.setValueAt("\u0669\u0664", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("94.0")) {
                        model.setValueAt("\u0669\u0664", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("94")) {
                        model.setValueAt("\u0669\u0664", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("95") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("95.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("95.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("95.0")) {
                    final String arabicver = "\u0669\u0665";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("95.0")) {
                        model.setValueAt("\u0669\u0665", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("95.0")) {
                        model.setValueAt("\u0669\u0665", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("95.0")) {
                        model.setValueAt("\u0669\u0665", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("95")) {
                        model.setValueAt("\u0669\u0665", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("96") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("96.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("96.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("96.0")) {
                    final String arabicver = "\u0669\u0666";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("96.0")) {
                        model.setValueAt("\u0669\u0666", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("96.0")) {
                        model.setValueAt("\u0669\u0666", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("96.0")) {
                        model.setValueAt("\u0669\u0666", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("96")) {
                        model.setValueAt("\u0669\u0666", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("97") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("97.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("97.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("97.0")) {
                    final String arabicver = "\u0669\u0667";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("97.0")) {
                        model.setValueAt("\u0669\u0667", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("97.0")) {
                        model.setValueAt("\u0669\u0667", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("97.0")) {
                        model.setValueAt("\u0669\u0667", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("97")) {
                        model.setValueAt("\u0669\u0667", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("98") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("98.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("98.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("98.0")) {
                    final String arabicver = "\u0669\u0668";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("98.0")) {
                        model.setValueAt("\u0669\u0668", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("98.0")) {
                        model.setValueAt("\u0669\u0668", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("98.0")) {
                        model.setValueAt("\u0669\u0668", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("98")) {
                        model.setValueAt("\u0669\u0668", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("99") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("99.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("99.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("99.0")) {
                    final String arabicver = "\u0669\u0669";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("99.0")) {
                        model.setValueAt("\u0669\u0669", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("99.0")) {
                        model.setValueAt("\u0669\u0669", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("99.0")) {
                        model.setValueAt("\u0669\u0669", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("99")) {
                        model.setValueAt("\u0669\u0669", row, 2);
                    }
                }
                if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("100") || table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("100.0") || table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("100.0") || table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("100.0")) {
                    final String arabicver = "\u0661\u0660\u0660";
                    if (table.getModel().getValueAt(row, 4).toString().equalsIgnoreCase("100.0")) {
                        model.setValueAt("\u0661\u0660\u0660", row, 4);
                    }
                    else if (table.getModel().getValueAt(row, 5).toString().equalsIgnoreCase("100.0")) {
                        model.setValueAt("\u0661\u0660\u0660", row, 5);
                    }
                    else if (table.getModel().getValueAt(row, 6).toString().equalsIgnoreCase("100.0")) {
                        model.setValueAt("\u0661\u0660\u0660", row, 6);
                    }
                    else if (table.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("100")) {
                        model.setValueAt("\u0661\u0660\u0660", row, 2);
                    }
                }
                return this;
            }
        });
        table2.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table2, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table2, value, isSelected, hasFocus, row, col);
                final Font d = new Font("KacstQurn", 1, 9);
                table2.setFont(d);
                final DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                rightRenderer.setHorizontalAlignment(4);
                table2.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
                final DefaultTableCellRenderer CenterRenderer = new DefaultTableCellRenderer();
                CenterRenderer.setHorizontalAlignment(0);
                table2.getColumnModel().getColumn(1).setCellRenderer(CenterRenderer);
                table2.getColumnModel().getColumn(2).setCellRenderer(CenterRenderer);
                table2.getColumnModel().getColumn(3).setCellRenderer(CenterRenderer);
                table2.getColumnModel().getColumn(4).setCellRenderer(CenterRenderer);
                table2.getColumnModel().getColumn(5).setCellRenderer(CenterRenderer);
                final JTableHeader header = table2.getTableHeader();
                header.setBackground(Color.PINK);
                header.setFont(d);
                final TableColumnModel colModel = header.getColumnModel();
                final TableColumn colMawad = colModel.getColumn(6);
                colMawad.setHeaderValue("\u0627\u0644\u0635\u0641\u0627\u062a \u0627\u0644\u0646\u0641\u0633\u064a\u0629 \u0648\u0627\u0644\u062a\u0641\u0627\u0639\u0644 \u0627\u0644\u0637\u0627\u0644\u0628");
                final TableColumn colRate5 = colModel.getColumn(5);
                colRate5.setHeaderValue("\u0645\u0631\u062a\u0641\u0639\u0629 \u062c\u062f\u0627");
                final TableColumn colRate6 = colModel.getColumn(4);
                colRate6.setHeaderValue("\u0645\u0631\u062a\u0641\u0639\u0629");
                final TableColumn colRate7 = colModel.getColumn(3);
                colRate7.setHeaderValue("\u0645\u062a\u0648\u0633\u0637");
                final TableColumn colRate8 = colModel.getColumn(2);
                colRate8.setHeaderValue("\u0645\u0646\u062e\u0641\u0636");
                final TableColumn colRate9 = colModel.getColumn(1);
                colRate9.setHeaderValue("\u0645\u0646\u062e\u0641\u0636 \u062c\u062f\u0627");
                final TableColumn Behav = colModel.getColumn(0);
                Behav.setHeaderValue("Behaviour and Skills");
                final TableColumn column = table2.getColumnModel().getColumn(0);
                column.setPreferredWidth(145);
                final TableColumn column2 = table2.getColumnModel().getColumn(1);
                column2.setPreferredWidth(37);
                final TableColumn column3 = table2.getColumnModel().getColumn(2);
                column3.setPreferredWidth(27);
                final TableColumn column4 = table2.getColumnModel().getColumn(3);
                column4.setPreferredWidth(27);
                final TableColumn column5 = table2.getColumnModel().getColumn(4);
                column5.setPreferredWidth(35);
                final TableColumn column6 = table2.getColumnModel().getColumn(5);
                column6.setPreferredWidth(22);
                final TableColumn column7 = table2.getColumnModel().getColumn(6);
                column7.setPreferredWidth(110);
                return this;
            }
        });
        table3.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table3, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table3, value, isSelected, hasFocus, row, col);
                final Font d = new Font("Arial Unicode MS", 1, 9);
                table3.setFont(d);
                final Component c = super.getTableCellRendererComponent(table3, value, isSelected, hasFocus, row, col);
                if (row == 0 && col == 0) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 1) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 2) {
                    c.setFont(arabfont);
                }
                final JTableHeader header = table3.getTableHeader();
                header.setBackground(Color.PINK);
                header.setFont(d);
                final TableColumnModel colModel = header.getColumnModel();
                final TableColumn colAyyamgiyabah = colModel.getColumn(2);
                colAyyamgiyabah.setHeaderValue("\u0639\u062f\u062f \u0623\u064a\u0627\u0645 \u063a\u064a\u0627\u0628\u0647|\u0647\u0627");
                final TableColumn colAyyamhudur = colModel.getColumn(1);
                colAyyamhudur.setHeaderValue("\u0639\u062f\u062f \u0623\u064a\u0627\u0645 \u062d\u0636\u0648\u0631\u0647|\u0647\u0627");
                final TableColumn colAyyamulfatrah = colModel.getColumn(0);
                colAyyamulfatrah.setHeaderValue("\u0639\u062f\u062f \u0623\u064a\u0627\u0645 \u0627\u0644\u0641\u062a\u0631\u0629");
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
                final Font d = new Font(null, 1, 9);
                table4.setFont(d);
                final Component c = super.getTableCellRendererComponent(table4, value, isSelected, hasFocus, row, col);
                if (row == 0 && col == 0) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 1) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 2) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 3) {
                    c.setFont(arabfont);
                }
                if (row == 0 && col == 5) {
                    c.setFont(arabfont);
                }
                final TableColumn column = table4.getColumnModel().getColumn(0);
                column.setPreferredWidth(70);
                final TableColumn column2 = table4.getColumnModel().getColumn(1);
                column2.setPreferredWidth(70);
                final JTableHeader header = table4.getTableHeader();
                final TableColumnModel colModel = header.getColumnModel();
                header.setBackground(Color.PINK);
                header.setFont(d);
                final TableColumn colAlmajmuulmatdlub = colModel.getColumn(0);
                colAlmajmuulmatdlub.setHeaderValue("\u0627\u0644\u0645\u062c\u0645\u0648\u0639 \u0627\u0644\u0645\u0637\u0644\u0648\u0628");
                final TableColumn colAlmajmuulmuhassal = colModel.getColumn(1);
                colAlmajmuulmuhassal.setHeaderValue("\u0627\u0644\u0645\u062c\u0648\u0639 \u0627\u0644\u0645\u062d\u0635\u0644");
                final TableColumn colAnnisbatulmuuwiyah = colModel.getColumn(2);
                colAnnisbatulmuuwiyah.setHeaderValue("\u0627\u0644\u0646\u0633\u0628\u0629 \u0627\u0644\u0645\u0624\u0648\u064a\u0629");
                final TableColumn colAdadullab = colModel.getColumn(3);
                colAdadullab.setHeaderValue("\u0639\u062f\u062f \u0637\u0644\u0627\u0628 \u0627\u0644\u0635\u0641");
                final TableColumn colAttaqdeer = colModel.getColumn(4);
                colAttaqdeer.setHeaderValue("\u0627\u0644\u062a\u0642\u062f\u064a\u0631");
                final TableColumn colAlmarkaj = colModel.getColumn(5);
                colAlmarkaj.setHeaderValue("\u0627\u0644\u0645\u0631\u0643\u0632");
                return this;
            }
        });
        table5.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table5, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table5, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 1, 12);
                table5.setFont(d);
                final DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                rightRenderer.setHorizontalAlignment(0);
                table5.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
                table5.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
                final TableColumn column = table5.getColumnModel().getColumn(0);
                column.setPreferredWidth(450);
                final TableColumn column2 = table5.getColumnModel().getColumn(1);
                column2.setPreferredWidth(42);
                final JTableHeader header = table5.getTableHeader();
                final TableColumnModel colModel = header.getColumnModel();
                header.setBackground(Color.GREEN.brighter().brighter());
                header.setFont(d);
                final TableColumn colAlmajmuulmatdlub = colModel.getColumn(0);
                colAlmajmuulmatdlub.setHeaderValue("\u0627\u0644\u062a\u0639\u0644\u064a\u0642");
                final TableColumn colAlmajmuulmuhassal = colModel.getColumn(1);
                colAlmajmuulmuhassal.setHeaderValue("\u0627\u0644\u0645\u062a\u0639\u0644\u0642");
                return this;
            }
        });
        table6.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table6, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table6, value, isSelected, hasFocus, row, col);
                final Font d = new Font("KacstQurn", 1, 9);
                table6.setFont(d);
                final Component c = super.getTableCellRendererComponent(table6, value, isSelected, hasFocus, row, col);
                if (row == 0 && col == 2) {
                    c.setFont(arabfont);
                }
                if (row == 1 && col == 2) {
                    c.setFont(arabfont);
                }
                if (row == 2 && col == 2) {
                    c.setFont(arabfont);
                }
                final DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                rightRenderer.setHorizontalAlignment(4);
                table6.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                final TableColumn column0 = table6.getColumnModel().getColumn(0);
                column0.setPreferredWidth(47);
                final TableColumn column2 = table6.getColumnModel().getColumn(1);
                column2.setPreferredWidth(55);
                final TableColumn column3 = table6.getColumnModel().getColumn(2);
                column3.setPreferredWidth(25);
                final TableColumn column4 = table6.getColumnModel().getColumn(3);
                column4.setPreferredWidth(8);
                final JTableHeader header = table6.getTableHeader();
                final TableColumnModel colModel = header.getColumnModel();
                header.setBackground(Color.GREEN.brighter().brighter());
                header.setFont(d);
                return this;
            }
        });
        table8.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table8, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table8, value, isSelected, hasFocus, row, col);
                final Font d = new Font("KacstQurn", 1, 10);
                table8.setFont(d);
                final DefaultTableCellRenderer CenterRenderer = new DefaultTableCellRenderer();
                CenterRenderer.setHorizontalAlignment(0);
                table8.getColumnModel().getColumn(3).setCellRenderer(CenterRenderer);
                final JTableHeader header = table8.getTableHeader();
                final TableColumnModel colModel = header.getColumnModel();
                header.setBackground(Color.GREEN.brighter().brighter());
                header.setFont(d);
                final TableColumn colAlkhatam = colModel.getColumn(0);
                colAlkhatam.setHeaderValue("\u0627\u0644\u062e\u062a\u0645");
                final TableColumn colAttareek = colModel.getColumn(1);
                colAttareek.setHeaderValue("\u0627\u0644\u062a\u0627\u0631\u064a\u062e");
                final TableColumn colAttauqee = colModel.getColumn(2);
                colAttauqee.setHeaderValue("\u0627\u0644\u062a\u0648\u0642\u064a\u0639");
                final TableColumn colAlmajmuulmuhassal = colModel.getColumn(3);
                colAlmajmuulmuhassal.setHeaderValue("\u0631\u0626\u064a\u0633 \u0627\u0644\u0645\u062f\u0631\u0633\u0629");
                return this;
            }
        });
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
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            ID = Integer.parseInt(this.txtID.getText().toString());
            final String R = Integer.toString(++ID);
            this.txtID.setText(R);
            final String IDNumber = this.txtID.getText().toString();
            if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum,sex FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum,sex FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?");
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
                    final String gender = rs.getObject(5).toString();
                    this.txtReportGender.setText(gender);
                    this.panel.repaint();
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranululahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranululahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsalisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsalisaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsalisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsalisahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatuladfala WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatuladfala WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatuladfalb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatuladfalb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalkabeeraa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalkabeeraa WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalkabeerab WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalkabeerab WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalsagiraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalsagiraha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalsagirahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatululahalsagirahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsaniyaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulrabiaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulrabiaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulrabiahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulrabiahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulkhamisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulkhamisaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulkhamisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulkhamisahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsadisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsadisahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubraha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubrahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubrahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u062c")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubrahc WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulkubrahc WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulsugraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulsugraha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulsugrahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghadanatulsugrahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatulsaniyaha WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatulsaniyahb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalulkabira WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalulkabira WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalulkabirb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalulkabirb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalussagira WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalussagira WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalussagirb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulauwalussagirb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussania WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussania WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussanib WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussanib WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussalisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussalisa WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussalisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussalisb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslurrabiia WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslurrabiia WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslurrabiib WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslurrabiib WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulkhamisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulkhamisa WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulkhamisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulkhamisb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussadisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussadisa WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussadisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslussadisb WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatalauwal WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatalauwal WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassani WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassani WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassalis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassalis WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatarrabii WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatarrabii WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatalkamis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatalkamis WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassadis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregfaslulummahatassadis WHERE StdID = ? AND StdClass = ?");
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
        final String name = "";
        final String name2 = "";
        final PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName("ReportsheetPrinting");
        pj.setPrintable(new Printable() {
            @Override
            public int print(final Graphics pg, final PageFormat pf, final int pageNum) {
                if (pageNum > 0) {
                    return 1;
                }
                final Graphics2D heder = (Graphics2D)pg.create();
                heder.translate(30, 20);
                final Graphics2D heder2 = (Graphics2D)pg.create();
                heder2.translate(30, 29);
                final float x = 2.0f;
                final float y = 3.0f;
                final Graphics2D g2 = (Graphics2D)pg.create();
                g2.translate(25, 50);
                ReportSheet6.this.textPane.paint(g2);
                return 0;
            }
        });
        if (pj.printDialog()) {
            try {
                pj.print();
            }
            catch (PrinterException ex) {
                System.out.println("Printing error" + ex.getMessage());
            }
        }
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
        this.data5.setSize(0);
        this.columnNames5.setSize(0);
        this.data6.setSize(0);
        this.columnNames6.setSize(0);
        this.data7.setSize(0);
        this.columnNames7.setSize(0);
        this.data8.setSize(0);
        this.columnNames8.setSize(0);
        this.tableModel4.setRowCount(0);
        this.tableModel4.fireTableDataChanged();
        this.tableModel5.setRowCount(0);
        this.tableModel5.fireTableDataChanged();
        this.tableModel6.setRowCount(0);
        this.tableModel6.fireTableDataChanged();
        this.tableModel7.setRowCount(0);
        this.tableModel7.fireTableDataChanged();
        this.tableModel8.setRowCount(0);
        this.tableModel8.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        this.txtReportRaqmuttasjil.setText("");
        this.txtReportRaqm.setText("");
        this.txtReportAlfatarah.setText("");
        this.txtReportAssaf.setText("");
        this.txtReportIsmuttalib.setText("");
        this.txtReportAmuddirasy.setText("");
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
                final String QueryString = "SELECT Subject_ENG,Mulahazah,POSITION,REMARKS,TOTAL,EXAMS_60,CA_40,SUBJECT FROM compiledreportsheet WHERE ID=? and Class=? and Term=? order by CASE WHEN Subject IN ('\u0627\u0644\u0642\u0631\u0622\u0646 \u0643\u062a\u0627\u0628\u0629','\u0639\u0644\u0648\u0645 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645','\u062d\u0631\u0648\u0641 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645','\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645 \u062d\u0641\u0638\u0627','\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645') THEN -1 ELSE Subject END, Subject ASC";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Subject_ENG,Mulahazah,POSITION,REMARKS,TOTAL,EXAMS_60,CA_40,SUBJECT FROM compiledreportsheet WHERE ID=? and Class=? and Term=? order by CASE WHEN Subject IN ('\u0627\u0644\u0642\u0631\u0622\u0646 \u0643\u062a\u0627\u0628\u0629','\u0639\u0644\u0648\u0645 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645','\u062d\u0631\u0648\u0641 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645','\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645 \u062d\u0641\u0638\u0627','\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645') THEN -1 ELSE Subject END, Subject ASC");
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
            this.txtReportIsmuttalib.setText(this.txtName.getText().toString());
            this.txtReportAlfatarah.setText(term);
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString2 = "SELECT COUNT(*) Subject FROM compiledreportsheet WHERE ID = ? AND Term =? AND RegNum=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT COUNT(*) Subject FROM compiledreportsheet WHERE ID = ? AND Term =? AND RegNum=?");
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
                final String QueryString2 = "SELECT ID,RegNum FROM compiledreportsheet WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT ID,RegNum FROM compiledreportsheet WHERE ID=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final int id = rs2.getInt(1);
                    final String myID = String.format("%04d", id);
                    this.txtReportRaqm.setText(myID);
                    final String myRegnum = rs2.getString(2);
                    this.txtReportRaqmuttasjil.setText(myRegnum);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT Class FROM compiledreportsheet WHERE ID=? and Class=? and Term=? and RegNum=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Class FROM compiledreportsheet WHERE ID=? and Class=? and Term=? and RegNum=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                pstatement2.setString(4, myregnum);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final String meclass = rs2.getString(1);
                    this.txtReportAssaf.setText(meclass);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT Behaviour,R1,R2,R3,R4,R5,Behaviour_Arabic FROM Behaviour WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Behaviour,R1,R2,R3,R4,R5,Behaviour_Arabic FROM Behaviour WHERE ID=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final ResultSetMetaData md2 = rs2.getMetaData();
                final int columns2 = md2.getColumnCount();
                for (int l = 1; l <= columns2; ++l) {
                    this.columnNames2.addElement(md2.getColumnName(l));
                }
                while (rs2.next()) {
                    final Vector row2 = new Vector(columns2);
                    for (int m = 1; m <= columns2; ++m) {
                        row2.addElement(rs2.getObject(m));
                    }
                    this.data2.addElement(row2);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (Exception e2) {
                System.out.println(e2);
            }
            this.tableModel2.setDataVector(this.data2, this.columnNames2);
            this.table2 = new JTable(this.tableModel2);
            for (int m2 = 0; m2 < this.table2.getColumnCount(); ++m2) {
                this.table.getColumnModel().getColumn(m2);
            }
            this.table2.repaint();
            this.table2.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString3 = "SELECT MaxNoOfDays,DaysAttended,DaysAbsented FROM Attendance WHERE ID=? and Class=? and Term=?";
                final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT MaxNoOfDays,DaysAttended,DaysAbsented FROM Attendance WHERE ID=? and Class=? and Term=?");
                pstatement3.setString(1, ID);
                pstatement3.setString(2, myclass);
                pstatement3.setString(3, term);
                final ResultSet rs3 = pstatement3.executeQuery();
                final ResultSetMetaData md3 = rs3.getMetaData();
                final int columns3 = md3.getColumnCount();
                for (int l2 = 1; l2 <= columns3; ++l2) {
                    this.columnNames3.addElement(md3.getColumnName(l2));
                }
                while (rs3.next()) {
                    final Vector row3 = new Vector(columns3);
                    for (int i2 = 1; i2 <= columns3; ++i2) {
                        row3.addElement(rs3.getObject(i2));
                    }
                    this.data3.addElement(row3);
                }
                rs3.close();
                pstatement3.close();
            }
            catch (Exception e3) {
                System.out.println(e3);
            }
            this.tableModel3.setDataVector(this.data3, this.columnNames3);
            this.table3 = new JTable(this.tableModel3);
            for (int i3 = 0; i3 < this.table3.getColumnCount(); ++i3) {
                this.table3.getColumnModel().getColumn(i3);
            }
            this.table3.repaint();
            this.table3.revalidate();
            this.panel.validate();
            this.panel.repaint();
            if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623")) {
                try {
                    final String QueryString4 = "SELECT SEX FROM studentregriyadulquranululaha WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT SEX FROM studentregriyadulquranululaha WHERE StdID=? and StdRegNum=? ");
                    pstatement4.setString(1, ID);
                    pstatement4.setString(2, myregnum);
                    final ResultSet rs4 = pstatement4.executeQuery();
                    final int Reg2 = 0;
                    while (rs4.next()) {}
                    rs4.close();
                    pstatement4.close();
                }
                catch (SQLException a2) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                    a2.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628")) {
                try {
                    final String QueryString4 = "SELECT SEX FROM studentregriyadulquranululahb WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT SEX FROM studentregriyadulquranululahb WHERE StdID=? and StdRegNum=? ");
                    pstatement4.setString(1, ID);
                    pstatement4.setString(2, myregnum);
                    final ResultSet rs4 = pstatement4.executeQuery();
                    final int Reg2 = 0;
                    while (rs4.next()) {}
                    rs4.close();
                    pstatement4.close();
                }
                catch (SQLException a2) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                    a2.printStackTrace();
                }
            }
            else if (myclass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
                try {
                    final String QueryString4 = "SELECT SEX FROM studentregnursery3_islamiyya WHERE StdID=? and StdRegNum=? ";
                    final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT SEX FROM studentregnursery3_islamiyya WHERE StdID=? and StdRegNum=? ");
                    pstatement4.setString(1, ID);
                    pstatement4.setString(2, myregnum);
                    final ResultSet rs4 = pstatement4.executeQuery();
                    final int Reg2 = 0;
                    while (rs4.next()) {
                        final String meclass2 = rs4.getString(1);
                        this.txtReportSex.setText(meclass2);
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
                final String QueryString4 = "SELECT NoInClass,Class,RegNum,ID FROM compiledreportsheet WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT NoInClass,Class,RegNum,ID FROM compiledreportsheet WHERE ID=? and Class=? and Term=? ");
                pstatement4.setString(1, ID);
                pstatement4.setString(2, myclass);
                pstatement4.setString(3, term);
                final ResultSet rs4 = pstatement4.executeQuery();
                final int Reg2 = 0;
                while (rs4.next()) {}
                rs4.close();
                pstatement4.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
            try {
                final String QueryString4 = "SELECT OvrllTotal,ID FROM overalltotalandaverageacasolarabic WHERE ID=? and Class=? and Term=? ";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT OvrllTotal,ID FROM overalltotalandaverageacasolarabic WHERE ID=? and Class=? and Term=? ");
                pstatement4.setString(1, ID);
                pstatement4.setString(2, myclass);
                pstatement4.setString(3, term);
                final ResultSet rs4 = pstatement4.executeQuery();
                final int Reg2 = 0;
                while (rs4.next()) {
                    final String total = rs4.getString(1);
                    this.txtReportScoresObtained.setText(total);
                    final String StudID = rs4.getString(2);
                    this.txtReportRaqm.setText(StudID);
                }
                rs4.close();
                pstatement4.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
            try {
                final String QueryString4 = "SELECT Average FROM overalltotalandaverageacasolarabic WHERE ID = ? AND Term =? AND Class=?";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT Average FROM overalltotalandaverageacasolarabic WHERE ID = ? AND Term =? AND Class=?");
                pstatement4.setString(1, ID);
                pstatement4.setString(2, term);
                pstatement4.setString(3, myclass);
                final ResultSet rs4 = pstatement4.executeQuery();
                while (rs4.next()) {
                    final double avg = rs4.getDouble(1);
                    this.txtReportAverage.setText(String.format("%.2f", avg));
                }
                rs4.close();
                pstatement4.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
            try {
                final String QueryString4 = "SELECT POSITION FROM  compiledreportsheet WHERE ID=? AND Class=? AND Term=? group by class";
                final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT POSITION FROM  compiledreportsheet WHERE ID=? AND Class=? AND Term=? group by class");
                pstatement4.setString(1, ID);
                pstatement4.setString(2, myclass);
                pstatement4.setString(3, term);
                final ResultSet rs4 = pstatement4.executeQuery();
                final int Reg2 = 0;
                while (rs4.next()) {}
                rs4.close();
                pstatement4.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
        }
        try {
            final String InsertQueryString = "INSERT INTO attaqdeer(ID,RegNum,Name,class,term,OvrllTotal,Attaqdeer)SELECT ID,RegNum,Name,class,term,OvrllTotal,Null FROM overalltotalandaverageacasolarabic where class=? AND term=?ON DUPLICATE KEY UPDATE OvrllTotal=VALUES(OvrllTotal)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO attaqdeer(ID,RegNum,Name,class,term,OvrllTotal,Attaqdeer)SELECT ID,RegNum,Name,class,term,OvrllTotal,Null FROM overalltotalandaverageacasolarabic where class=? AND term=?ON DUPLICATE KEY UPDATE OvrllTotal=VALUES(OvrllTotal)");
            pstatement.setString(1, myclass);
            pstatement.setString(2, term);
            pstatement.executeUpdate();
            pstatement.close();
        }
        catch (SQLException e4) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e4.getMessage());
            e4.printStackTrace();
        }
        final double overalltotal = Double.parseDouble(this.txtReportScoresObtained.getText().toString());
        final String Attaqdeer = "";
        Label_5363: {
            if (!this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623") && !this.txtClass.getText().toString().equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628") && !this.txtClass.getText().toString().equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623")) {
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=300) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=250) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=200) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=100) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=300) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=250) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=200) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=100) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=500) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=350) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=300) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=500) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=350) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=300) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=400) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=300) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=250) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=400) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=300) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=250) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=500) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=350) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=300) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=500) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=350) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=300) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=200) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=600) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=450) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=350) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=250) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=600) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=450) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=350) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=250) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=700) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=550) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=400) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=250) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=700) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=550) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=400) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=250) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=800) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=650) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=450) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=800) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=650) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=450) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623") || this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628")) {
                    try {
                        final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=900) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=800) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=500) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                        final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=900) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=800) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=500) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                        final int numberOfRowsUpdated = pstatement5.executeUpdate();
                        final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                        pstatement5.close();
                    }
                    catch (SQLException e5) {
                        JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                        e5.printStackTrace();
                    }
                    break Label_5363;
                }
                if (!this.txtClass.getText().toString().equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a") && !this.txtClass.getText().toString().equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644")) {
                    break Label_5363;
                }
                try {
                    final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=900) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=800) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=500) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                    final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=900) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=800) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=500) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=300) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                    final int numberOfRowsUpdated = pstatement5.executeUpdate();
                    final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                    pstatement5.close();
                }
                catch (SQLException e5) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                    e5.printStackTrace();
                }
            }
            else {
                try {
                    final String InsertQueryString2 = "UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=260) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=200) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=150) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=100) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )";
                    final PreparedStatement pstatement5 = this.connection.prepareStatement("UPDATE attaqdeer SET  Attaqdeer = ( CASE WHEN (OvrllTotal >=260) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (OvrllTotal >=200) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (OvrllTotal >=150) THEN '\u062c\u064a\u062f'  WHEN (OvrllTotal >=100) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END )");
                    final int numberOfRowsUpdated = pstatement5.executeUpdate();
                    final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                    pstatement5.close();
                }
                catch (SQLException e5) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e5.getMessage());
                    e5.printStackTrace();
                }
            }
            try {
                final String QueryString5 = "SELECT (SELECT count(*)*100 RequiredTotal FROM compiledreportsheet  WHERE ID=? and Class=? and Term=? GROUP BY CLASS),OvrllTotal,format(Average,2),( select DISTINCT NoInClass from compiledreportsheet where ID=? AND Class=? AND Term=?), (select attaqdeer from attaqdeer where ID=? AND Class=? AND Term=?),FIND_IN_SET(OvrllTotal, (SELECT GROUP_CONCAT(OvrllTotal ORDER BY OvrllTotal DESC) FROM overalltotalandaverageacasolarabic where Class=? AND Term=?)) As Position FROM overalltotalandaverageacasolarabic where ID=? AND Class=? AND Term=? order by Position";
                final PreparedStatement pstatement5 = this.connection.prepareStatement("SELECT (SELECT count(*)*100 RequiredTotal FROM compiledreportsheet  WHERE ID=? and Class=? and Term=? GROUP BY CLASS),OvrllTotal,format(Average,2),( select DISTINCT NoInClass from compiledreportsheet where ID=? AND Class=? AND Term=?), (select attaqdeer from attaqdeer where ID=? AND Class=? AND Term=?),FIND_IN_SET(OvrllTotal, (SELECT GROUP_CONCAT(OvrllTotal ORDER BY OvrllTotal DESC) FROM overalltotalandaverageacasolarabic where Class=? AND Term=?)) As Position FROM overalltotalandaverageacasolarabic where ID=? AND Class=? AND Term=? order by Position");
                pstatement5.setString(1, ID);
                pstatement5.setString(2, myclass);
                pstatement5.setString(3, term);
                pstatement5.setString(4, ID);
                pstatement5.setString(5, myclass);
                pstatement5.setString(6, term);
                pstatement5.setString(7, ID);
                pstatement5.setString(8, myclass);
                pstatement5.setString(9, term);
                pstatement5.setString(10, myclass);
                pstatement5.setString(11, term);
                pstatement5.setString(12, ID);
                pstatement5.setString(13, myclass);
                pstatement5.setString(14, term);
                final ResultSet rs5 = pstatement5.executeQuery();
                final ResultSetMetaData md4 = rs5.getMetaData();
                final int columns4 = md4.getColumnCount();
                for (int i4 = 1; i4 <= columns4; ++i4) {
                    this.columnNames4.addElement(md4.getColumnName(i4));
                }
                while (rs5.next()) {
                    final String classposition = rs5.getObject(6).toString();
                    this.txtReportClassPosition.setText(classposition);
                    System.out.println("my posision:" + classposition);
                    final Vector row4 = new Vector(columns4);
                    for (int i5 = 1; i5 <= columns4; ++i5) {
                        row4.addElement(rs5.getObject(i5));
                    }
                    this.data4.addElement(row4);
                }
                rs5.close();
                pstatement5.close();
            }
            catch (Exception e6) {
                System.out.println(e6);
            }
        }
        this.tableModel4.setDataVector(this.data4, this.columnNames4);
        this.table4 = new JTable(this.tableModel4);
        for (int i6 = 0; i6 < this.table4.getColumnCount(); ++i6) {
            this.table.getColumnModel().getColumn(i6);
        }
        this.table4.repaint();
        this.table4.revalidate();
        this.panel.validate();
        this.panel.repaint();
        this.comment = "";
        final String commenter = "\u062a\u0639\u0644\u064a\u0642 \u0623\u0628\u064a \u0627\u0644\u0641\u0635\u0644 ";
        if (myclass.equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatuladfala WHERE StdClass=?),sex,StDName FROM studentreghadanatuladfala WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatuladfala WHERE StdClass=?),sex,StDName FROM studentreghadanatuladfala WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatuladfalb WHERE StdClass=?),sex,StDName FROM studentreghadanatuladfalb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatuladfalb WHERE StdClass=?),sex,StDName FROM studentreghadanatuladfalb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranululaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranululaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranululahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranululahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranululahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranululahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranulsaniyaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranulsaniyaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranulsaniyahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranulsaniyahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranulsalisaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsalisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranulsalisaha WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsalisaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranulsalisahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsalisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranulsalisahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsalisahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatululahalsagiraha WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalsagiraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatululahalsagiraha WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalsagiraha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatululahalsagirahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalsagirahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatululahalsagirahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalsagirahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatululahalkabeeraa WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalkabeeraa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatululahalkabeeraa WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalkabeeraa WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatululahalkabeerab WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalkabeerab WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatululahalkabeerab WHERE StdClass=?),sex,StDName FROM studentreghalaqatululahalkabeerab WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsaniyaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsaniyaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsaniyahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsaniyahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsalisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsalisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsalisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsalisaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsalisahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsalisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsalisahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsalisahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsaniyahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsaniyahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsaniyahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulrabiahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulrabiahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulrabiahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulrabiahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulkhamisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulkhamisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulkhamisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulkhamisaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulkhamisahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulkhamisahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulkhamisahb WHERE StdClass=?),sex,StDName FROM studentreghalaqatulkhamisahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsadisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsadisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghalaqatulsadisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghalaqatulsadisaha WHERE StdClass=?),sex,StDName FROM studentreghalaqatulsadisaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatulsugraha WHERE StdClass=?),sex,StDName FROM studentreghadanatulsugraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatulsugraha WHERE StdClass=?),sex,StDName FROM studentreghadanatulsugraha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatulsugrahb WHERE StdClass=?),sex,StDName FROM studentreghadanatulsugrahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatulsugrahb WHERE StdClass=?),sex,StDName FROM studentreghadanatulsugrahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatulkubraha WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubraha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatulkubraha WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubraha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatulkubrahb WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubrahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatulkubrahb WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubrahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u062c")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentreghadanatulkubrahc WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubrahc WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentreghadanatulkubrahc WHERE StdClass=?),sex,StDName FROM studentreghadanatulkubrahc WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregraudatululaha WHERE StdClass=?),sex,StDName FROM studentregraudatululaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregraudatululaha WHERE StdClass=?),sex,StDName FROM studentregraudatululaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregraudatululahb WHERE StdClass=?),sex,StDName FROM studentregraudatululahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregraudatululahb WHERE StdClass=?),sex,StDName FROM studentregraudatululahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregraudatulsaniyaha WHERE StdClass=?),sex,StDName FROM studentregraudatulsaniyaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregraudatulsaniyaha WHERE StdClass=?),sex,StDName FROM studentregraudatulsaniyaha WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregriyadulquranulsaniyahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregriyadulquranulsaniyahb WHERE StdClass=?),sex,StDName FROM studentregriyadulquranulsaniyahb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulauwalussagira WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalussagira WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulauwalussagira WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalussagira WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulauwalussagirb WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalussagirb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulauwalussagirb WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalussagirb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulauwalulkabira WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalulkabira WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulauwalulkabira WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalulkabira WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulauwalulkabirb WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalulkabirb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulauwalulkabirb WHERE StdClass=?),sex,StDName FROM studentregfaslulauwalulkabirb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussania WHERE StdClass=?),sex,StDName FROM studentregfaslussania WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussania WHERE StdClass=?),sex,StDName FROM studentregfaslussania WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussanib WHERE StdClass=?),sex,StDName FROM studentregfaslussanib WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussanib WHERE StdClass=?),sex,StDName FROM studentregfaslussanib WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussalisa WHERE StdClass=?),sex,StDName FROM studentregfaslussalisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussalisa WHERE StdClass=?),sex,StDName FROM studentregfaslussalisa WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussalisb WHERE StdClass=?),sex,StDName FROM studentregfaslussalisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussalisb WHERE StdClass=?),sex,StDName FROM studentregfaslussalisb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslurrabiia WHERE StdClass=?),sex,StDName FROM studentregfaslurrabiia WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslurrabiia WHERE StdClass=?),sex,StDName FROM studentregfaslurrabiia WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslurrabiib WHERE StdClass=?),sex,StDName FROM studentregfaslurrabiib WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslurrabiib WHERE StdClass=?),sex,StDName FROM studentregfaslurrabiib WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulkhamisa WHERE StdClass=?),sex,StDName FROM studentregfaslulkhamisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulkhamisa WHERE StdClass=?),sex,StDName FROM studentregfaslulkhamisa WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulkhamisb WHERE StdClass=?),sex,StDName FROM studentregfaslulkhamisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulkhamisb WHERE StdClass=?),sex,StDName FROM studentregfaslulkhamisb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussadisa WHERE StdClass=?),sex,StDName FROM studentregfaslussadisa WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussadisa WHERE StdClass=?),sex,StDName FROM studentregfaslussadisa WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslussadisb WHERE StdClass=?),sex,StDName FROM studentregfaslussadisb WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslussadisb WHERE StdClass=?),sex,StDName FROM studentregfaslussadisb WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatalauwal WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatalauwal WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatalauwal WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatalauwal WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatassani WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassani WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatassani WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassani WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatassalis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassalis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatassalis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassalis WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0627\u0644\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatarrabii WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatarrabii WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatarrabii WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatarrabii WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatalkamis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatalkamis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatalkamis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatalkamis WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        else if (myclass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633")) {
            try {
                final String QueryString6 = "SELECT (select count(*) FROM studentregfaslulummahatassadis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassadis WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement6 = this.connection.prepareStatement("SELECT (select count(*) FROM studentregfaslulummahatassadis WHERE StdClass=?),sex,StDName FROM studentregfaslulummahatassadis WHERE StdID = ? AND StdClass = ?");
                pstatement6.setString(1, myclass);
                pstatement6.setString(2, ID);
                pstatement6.setString(3, myclass);
                final ResultSet rs6 = pstatement6.executeQuery();
                while (rs6.next()) {
                    final String gender = rs6.getObject(2).toString();
                    this.txtReportGender.setText(gender);
                    this.myposition = Integer.parseInt(this.txtReportClassPosition.getText().toString());
                    this.myTotalStud = Integer.parseInt(rs6.getObject(1).toString());
                    this.mystudentName = String.valueOf(String.valueOf(rs6.getString(3).toString())) + " ";
                    if (this.txtReportGender.getText().toString().equalsIgnoreCase("\u0630\u0643\u0631")) {
                        this.txtReportClassPosition.setText("");
                        this.commentingForMaleMthd(this.myposition);
                    }
                    else {
                        if (!this.txtReportGender.getText().toString().equalsIgnoreCase("\u0623\u0646\u062b\u0627")) {
                            continue;
                        }
                        this.txtReportClassPosition.setText("");
                        this.commentingForFemaleMthd(this.myposition);
                        System.out.println("here i am:" + this.myposition);
                    }
                }
                rs6.close();
                pstatement6.close();
            }
            catch (Exception e7) {
                System.out.println(e7.getMessage());
            }
        }
        try {
            final String InsertQueryString3 = "INSERT INTO comments(ID,RegNum,Name,class,term,comment,commenter) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE comment=VALUES(comment)";
            final PreparedStatement pstatement7 = this.connection.prepareStatement("INSERT INTO comments(ID,RegNum,Name,class,term,comment,commenter) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE comment=VALUES(comment)");
            pstatement7.setString(1, ID);
            pstatement7.setString(2, myregnum);
            pstatement7.setString(3, Name);
            pstatement7.setString(4, myclass);
            pstatement7.setString(5, term);
            pstatement7.setString(6, this.comment);
            pstatement7.setString(7, "\u062a\u0639\u0644\u064a\u0642 \u0623\u0628\u064a \u0627\u0644\u0641\u0635\u0644 ");
            pstatement7.executeUpdate();
            pstatement7.close();
        }
        catch (Exception e7) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e7.getMessage());
            e7.printStackTrace();
        }
        try {
            final String Query = "SELECT comment,Commenter FROM comments WHERE ID=? AND Class=? AND Term=? ";
            final PreparedStatement mypstatement = this.connection.prepareStatement("SELECT comment,Commenter FROM comments WHERE ID=? AND Class=? AND Term=? ");
            mypstatement.setString(1, ID);
            mypstatement.setString(2, myclass);
            mypstatement.setString(3, term);
            final ResultSet rs7 = mypstatement.executeQuery();
            final ResultSetMetaData md5 = rs7.getMetaData();
            final int columns5 = md5.getColumnCount();
            for (int i7 = 1; i7 <= columns5; ++i7) {
                this.columnNames5.addElement(md5.getColumnName(i7));
            }
            while (rs7.next()) {
                final String commenter2 = rs7.getObject(2).toString();
                System.out.println(commenter2);
                final Vector row5 = new Vector(columns5);
                for (int i8 = 1; i8 <= columns5; ++i8) {
                    row5.addElement(rs7.getObject(i8));
                }
                this.data5.addElement(row5);
            }
            this.pstatement.close();
        }
        catch (Exception e7) {
            System.out.println(e7);
        }
        this.tableModel5.setDataVector(this.data5, this.columnNames5);
        this.table5 = new JTable(this.tableModel5);
        for (int j2 = 0; j2 < this.table5.getColumnCount(); ++j2) {
            this.table.getColumnModel().getColumn(j2);
        }
        this.table5.repaint();
        this.table5.revalidate();
        this.panel.validate();
        this.panel.repaint();
        final String termStatus = "Active Session";
        try {
            final String Query2 = "SELECT Term_Attribute,Term_Information,Arab_Term_Information,Arab_Term_Attribute FROM terminformation WHERE Term=? AND Status=? ORDER BY Term_Attribute DESC";
            final PreparedStatement mypstatement2 = this.connection.prepareStatement("SELECT Term_Attribute,Term_Information,Arab_Term_Information,Arab_Term_Attribute FROM terminformation WHERE Term=? AND Status=? ORDER BY Term_Attribute DESC");
            mypstatement2.setString(1, term);
            mypstatement2.setString(2, "Active Session");
            final ResultSet rs8 = mypstatement2.executeQuery();
            final ResultSetMetaData md6 = rs8.getMetaData();
            final int columns6 = md6.getColumnCount();
            for (int i9 = 1; i9 <= columns6; ++i9) {
                this.columnNames6.addElement(md6.getColumnName(i9));
            }
            while (rs8.next()) {
                final String commenter3 = rs8.getObject(2).toString();
                System.out.println(commenter3);
                final Vector row6 = new Vector(columns6);
                for (int i10 = 1; i10 <= columns6; ++i10) {
                    row6.addElement(rs8.getObject(i10));
                }
                this.data6.addElement(row6);
            }
            this.pstatement.close();
        }
        catch (Exception e8) {
            System.out.println(e8);
        }
        this.tableModel6.setDataVector(this.data6, this.columnNames6);
        this.table6 = new JTable(this.tableModel6);
        for (int i11 = 0; i11 < this.table6.getColumnCount(); ++i11) {
            this.table.getColumnModel().getColumn(i11);
        }
        this.table6.repaint();
        this.table6.revalidate();
        this.panel.validate();
        this.panel.repaint();
        try {
            final String QueryString7 = "SELECT Session FROM terminformation WHERE Term=?";
            final PreparedStatement pstatement8 = this.connection.prepareStatement("SELECT Session FROM terminformation WHERE Term=?");
            pstatement8.setString(1, term);
            final ResultSet rs9 = pstatement8.executeQuery();
            while (rs9.next()) {
                final String Amuddirasy = rs9.getObject(1).toString();
                this.txtReportAmuddirasy.setText(Amuddirasy);
            }
            rs9.close();
            pstatement8.close();
        }
        catch (Exception e9) {
            System.out.println(e9.getMessage());
        }
        try {
            final String Query3 = "SELECT Signature,Date,Stamp,SchoolHeadName FROM SchoolHead";
            final PreparedStatement mypstatement3 = this.connection.prepareStatement("SELECT Signature,Date,Stamp,SchoolHeadName FROM SchoolHead");
            final ResultSet rs10 = mypstatement3.executeQuery();
            final ResultSetMetaData md7 = rs10.getMetaData();
            final int columns7 = md7.getColumnCount();
            for (int i12 = 1; i12 <= columns7; ++i12) {
                this.columnNames8.addElement(md7.getColumnName(i12));
            }
            while (rs10.next()) {
                final Vector row7 = new Vector(columns7);
                for (int i13 = 1; i13 <= columns7; ++i13) {
                    row7.addElement(rs10.getObject(i13));
                }
                this.data8.addElement(row7);
            }
            this.pstatement.close();
        }
        catch (Exception e9) {
            System.out.println(e9);
        }
        this.tableModel8.setDataVector(this.data8, this.columnNames8);
        this.table8 = new JTable(this.tableModel8);
        for (int i14 = 0; i14 < this.table8.getColumnCount(); ++i14) {
            this.table.getColumnModel().getColumn(i14);
        }
        this.table8.repaint();
        this.table8.revalidate();
        this.panel.validate();
        this.panel.repaint();
    }
    
    public String commentingForMaleMthd(final int possition) {
        if (this.myposition == 1) {
            this.comment = "\u0625\u0646 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0623\u0639\u062c\u0628 \u0645\u062f\u0631\u0633\u064a\u0647 \u0628\u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628\u0629" + " ," + "\u0646\u0633\u062a\u0634\u0641 \u0644\u0647 \u0645\u0633\u062a\u0642\u0628\u0644\u0627 \u0645\u0634\u0631\u0642\u0627 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647  \u062a\u0639\u0627\u0644\u0649";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 2) {
            this.comment = "\u0625\u0646 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u064a\u062a\u0645\u062a\u0639 \u0628\u062a\u0631\u0643\u064a\u0632 \u0639\u0627\u0644 \u0641\u064a \u0627\u0644\u062a\u0639\u0644\u064a\u0645" + " ," + " \u0648\u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628 \u062f\u0644\u064a\u0644 \u0639\u0644\u0649 \u0630\u0644\u0643 ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 3) {
            this.comment = "\u0644\u0642\u062f \u0628\u0630\u0644 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u062c\u0647\u062f\u0627 \u0645\u0642\u062f\u0631\u0627 \u0643\u0645\u0627 \u062a\u0628\u064a\u0646 \u0630\u0644\u0643 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628\u0629";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 4 || this.myposition < 14) {
            this.comment = "\u0643\u0648\u0646 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0636\u0645\u0646 \u0627\u0644\u0639\u0634\u0631\u0629 \u0627\u0644\u0623\u0648\u0627\u0626\u0644 \u064a\u062f\u0644 \u0639\u0644\u0649 \u062a\u0642\u062f\u0645\u0647 \u0641\u064a \u0627\u0644\u0623\u062f\u0627\u0621 \u0644\u0647\u0630\u0647 \u0627\u0644\u0641\u062a\u0631\u0629" + " ," + " \u0648\u0647\u0630\u0627 \u0623\u0645\u0631 \u0645\u0641\u0631\u062d";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 14 || this.myposition < 21) {
            this.comment = "\u0644\u0642\u062f \u062a\u0646\u0627\u0641\u0633 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0648\u062d\u0635\u0644 \u0639\u0644\u0649 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0644\u0627 \u0628\u0623\u0633 \u0628\u0647\u0627" + " ," + " \u0641\u0644\u062a\u0639\u0645\u0644 \u0645\u0639\u0646\u0627 \u0627\u0644\u0623\u0633\u0631\u0629 \u0644\u0646\u0631\u0627\u0647 \u0645\u0646 \u0627\u0644\u0645\u062a\u0641\u0648\u0642\u064a\u0646 \u0641\u064a \u0627\u0644\u0645\u0633\u062a\u0642\u0628\u0644 \u0627\u0644\u0642\u0624\u064a\u0628 \u0628\u0625\u0646 \u0627\u0644\u0644\u0647";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 21 || this.myposition < 26) {
            this.comment = "\u0644\u0642\u062f \u062d\u0627\u0648\u0644 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0648\u062d\u0635\u0644 \u0639\u0644\u0649 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 " + "\u0641\u0644\u062a\u0639\u0645\u0644 \u0645\u0639\u0646\u0627 \u0627\u0644\u0622\u0628\u0627\u0621  " + " ," + " \u0644\u064a\u062d\u0627\u0648\u0644 \u0623\u0643\u062b\u0631 \u0645\u0646 \u0647\u0630\u0647 \u0641\u064a \u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0642\u0627\u062f\u0645\u0629" + " ," + "\u062d\u062a\u0649 \u062a\u0643\u0648\u0646 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u062c\u064a\u062f\u0629 \u0628\u0625\u0646 \u0627\u0644\u0644\u0647  ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 26 || this.myposition < this.myTotalStud - 1) {
            this.comment = "\u0643\u0648\u0646 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0636\u0645\u0646 \u0627\u0644\u0639\u0634\u0631\u0629 \u0627\u0644\u0623\u0648\u0627\u062e\u0631 \u064a\u062f\u0644 \u0639\u0644\u0649 \u0645\u0634\u0643\u0644\u0629 \u0645\u0627 \u0641\u064a \u062a\u0639\u0644\u0645\u0647" + " \u0641\u0644\u062a\u062a\u0639\u0627\u0648\u0646 \u0645\u0639\u0646\u0627 \u0627\u0644\u0623\u0633\u0631\u0629 \u0644\u0643\u0634\u0641 \u0647\u0630\u0647 \u0627\u0644\u0645\u0634\u0643\u0644\u0629 \u0648\u0645\u0639\u0644\u062c\u062a\u0647\u0627 \u0644\u062a\u062d\u0633\u0646 \u0623\u062f\u0627\u0624\u0647 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647 ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == this.myTotalStud - 1 || this.myposition > this.myTotalStud - 1) {
            this.comment = "\u0644\u0648\u062d\u0638 \u0645\u0646 \u0627\u0644\u0637\u0627\u0644\u0628 " + this.mystudentName + " ," + " \u0642\u0644\u0629 \u0627\u0644\u062a\u0631\u0643\u064a\u0632 \u0641\u064a \u0627\u0644\u062a\u0639\u0644\u064a\u0645" + " \u0648\u0646\u0623\u0645\u0644 \u0623\u0646 \u064a\u062a\u0639\u0627\u0648\u0646 \u0645\u0639\u0646\u0627 \u0627\u0644\u0622\u0628\u0627\u0621 \u0644\u0645\u0639\u0627\u0644\u062d\u0629 \u0630\u0644\u0643" + " \u0641\u062a\u062d\u0633\u0646 \u0623\u062f\u0624\u0647 \u0641\u064a \u0627\u0644\u0645\u0633\u062a\u0642\u0628\u0644 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647.";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        return this.comment;
    }
    
    public String commentingForFemaleMthd(final int possition) {
        if (this.myposition == 1) {
            this.comment = "\u0625\u0646 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0623\u0639\u062c\u0628\u062a \u0645\u062f\u0631\u0633\u064a\u0647\u0627 \u0628\u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628\u0629" + " ," + "\u0646\u0633\u062a\u0634\u0641 \u0644\u0647\u0627 \u0645\u0633\u062a\u0642\u0628\u0644\u0627 \u0645\u0634\u0631\u0642\u0627 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647  \u062a\u0639\u0627\u0644\u0649";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 2) {
            this.comment = "\u0625\u0646 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u062a\u062a\u0645\u062a\u0639 \u0628\u062a\u0631\u0643\u064a\u0632 \u0639\u0627\u0644 \u0641\u064a \u0627\u0644\u062a\u0639\u0644\u064a\u0645" + " ," + " \u0648\u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628 \u062f\u0644\u064a\u0644 \u0639\u0644\u0649 \u0630\u0644\u0643 ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 3) {
            this.comment = "\u0644\u0642\u062f \u0628\u0630\u0644 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u062c\u0647\u062f\u0627 \u0645\u0642\u062f\u0631\u0627 \u0643\u0645\u0627 \u062a\u0628\u064a\u0646 \u0630\u0644\u0643 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0627\u0644\u0637\u064a\u0628\u0629";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 4 || this.myposition < 14) {
            this.comment = "\u0644\u0642\u062f \u062a\u0646\u0627\u0641\u0633\u062a \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0648\u062d\u0635\u0644\u062a \u0639\u0644\u0649 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0644\u0627 \u0628\u0623\u0633 \u0628\u0647\u0627" + " ," + " \u0641\u0644\u062a\u0639\u0645\u0644 \u0645\u0639\u0646\u0627 \u0627\u0644\u0623\u0633\u0631\u0629 \u0644\u0646\u0631\u0627\u0647\u0627 \u0645\u0646 \u0627\u0644\u0645\u062a\u0641\u0648\u0642\u064a\u0646 \u0641\u064a \u0627\u0644\u0645\u0633\u062a\u0642\u0628\u0644 \u0627\u0644\u0642\u0624\u064a\u0628 \u0628\u0625\u0646 \u0627\u0644\u0644\u0647";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 14 || this.myposition < 21) {
            this.comment = "\u0644\u0642\u062f \u062a\u0646\u0627\u0641\u0633 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0648\u062d\u0635\u0644 \u0639\u0644\u0649 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u0644\u0627 \u0628\u0623\u0633 \u0628\u0647\u0627" + " ," + " \u0641\u0644\u062a\u0639\u0645\u0644 \u0645\u0639\u0646\u0627 \u0627\u0644\u0623\u0633\u0631\u0629 \u0644\u0646\u0631\u0627\u0647 \u0645\u0646 \u0627\u0644\u0645\u062a\u0641\u0648\u0642\u064a\u0646 \u0641\u064a \u0627\u0644\u0645\u0633\u062a\u0642\u0628\u0644 \u0627\u0644\u0642\u0624\u064a\u0628 \u0628\u0625\u0646 \u0627\u0644\u0644\u0647";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 21 || this.myposition < 26) {
            this.comment = "\u0644\u0642\u062f \u062d\u0627\u0648\u0644\u062a \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0648\u062d\u0635\u0644 \u0639\u0644\u0649 \u0647\u0630\u0647 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 " + "\u0641\u0644\u062a\u0639\u0645\u0644 \u0645\u0639\u0646\u0627 \u0627\u0644\u0622\u0628\u0627\u0621  " + " ," + " \u0644\u062a\u062d\u0627\u0648\u0644 \u0623\u0643\u062b\u0631 \u0645\u0646 \u0647\u0630\u0647 \u0641\u064a \u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0642\u0627\u062f\u0645\u0629" + " ," + "\u062d\u062a\u0649 \u062a\u0643\u0648\u0646 \u0627\u0644\u0646\u062a\u064a\u062c\u0629 \u062c\u064a\u062f\u0629 \u0628\u0625\u0646 \u0627\u0644\u0644\u0647  ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == 26 || this.myposition < this.myTotalStud - 1) {
            this.comment = "\u0643\u0648\u0646 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0636\u0645\u0646 \u0627\u0644\u0639\u0634\u0631\u0629 \u0627\u0644\u0623\u0648\u0627\u062e\u0631 \u064a\u062f\u0644 \u0639\u0644\u0649 \u0645\u0634\u0643\u0644\u0629 \u0645\u0627 \u0641\u064a \u062a\u0639\u0644\u0645\u0647" + " \u0641\u0644\u062a\u062a\u0639\u0627\u0648\u0646 \u0645\u0639\u0646\u0627 \u0627\u0644\u0623\u0633\u0631\u0629 \u0644\u0643\u0634\u0641 \u0647\u0630\u0647 \u0627\u0644\u0645\u0634\u0643\u0644\u0629 \u0648\u0645\u0639\u0644\u062c\u062a\u0647\u0627 \u0644\u062a\u062d\u0633\u0646 \u0623\u062f\u0627\u0624\u0647\u0627 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647 ";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        else if (this.myposition == this.myTotalStud - 1 || this.myposition > this.myTotalStud - 1) {
            this.comment = "\u0644\u0648\u062d\u0638 \u0645\u0646 \u0627\u0644\u0637\u0627\u0644\u0628\u0629 " + this.mystudentName + " ," + " \u0642\u0644\u0629 \u0627\u0644\u062a\u0631\u0643\u064a\u0632 \u0641\u064a \u0627\u0644\u062a\u0639\u0644\u064a\u0645" + " \u0648\u0646\u0623\u0645\u0644 \u0623\u0646 \u064a\u062a\u0639\u0627\u0648\u0646 \u0645\u0639\u0646\u0627 \u0627\u0644\u0622\u0628\u0627\u0621 \u0644\u0645\u0639\u0627\u0644\u062d\u0629 \u0630\u0644\u0643" + " \u0641\u062a\u062d\u0633\u0646 \u0623\u062f\u0624\u0647\u0627 \u0641\u064a \u0627\u0644\u0645\u0633\u062a\u0642\u0628\u0644 \u0628\u0625\u0630\u0646 \u0627\u0644\u0644\u0647.";
            this.txtReportFormMasterReport.setText(this.comment);
        }
        return this.comment;
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
