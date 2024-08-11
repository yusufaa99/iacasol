import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.border.Border;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
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

public class StudentPaymentSys extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
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
    private JLabel lblSelectTest;
    private JLabel lblOutput;
    private JTextField txtID;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtTest1Marks;
    private JTextField txtTest2Marks;
    private JTextField txtExamMarks;
    private JTextField txtHomeWork;
    private JLabel lblHomeWork;
    private JLabel lblTest1Marks;
    private JLabel lblTest2Marks;
    private JLabel lblExamMarks;
    private JLabel lblBehavior;
    private JLabel lblRate;
    private JLabel lblSection;
    private JLabel lblSession;
    private JLabel lblfeespaid;
    private JLabel lblUniform;
    private JLabel lblBooks;
    private JLabel lblExamandSpeech;
    private JLabel lblTotal;
    private JTextField txtSession;
    private JComboBox ComboSections;
    private JTextField txtfeespaid;
    private JTextField txtUniform;
    private JTextField txtBooks;
    private JTextField txtExamandSpeech;
    private JTextField txtTotal;
    private JTextField txtYear;
    private JComboBox ComboSelectBehaviour;
    private JComboBox ComboSelectRate;
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
    private JButton btnClose;
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtmyclass;
    private JLabel lblTest1Percentage;
    private JLabel lblTest2Percentage;
    private JLabel lblHomeWorkPercentage;
    private JLabel lblExamPercentage;
    private DefaultTableModel tableModel1;
    Vector columnNames;
    Vector data;
    private JTable table;
    private JScrollPane myreportJSP;
    private JTextPane myreportJTP;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    private JDateChooser picker;
    int flag;
    int result;
    
    public StudentPaymentSys() {
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void newStudentFeesManagement() {
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        final Font tablefont = new Font("null", 1, 14);
        final Font f = new Font(null, 1, 18);
        final Font f2 = new Font("Arial Unicode MS", 1, 16);
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblID = new JLabel("STUDENT ID:");
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
        this.lblSelectTest = new JLabel("SELECT TEST:");
        this.lblHomeWork = new JLabel("HOMEWORK:");
        this.lblTest1Marks = new JLabel("TEST1 SCORE: ");
        this.lblTest2Marks = new JLabel("TEST2 SCORE: ");
        this.lblExamMarks = new JLabel("EXAMINATION SCORE: ");
        this.txtHomeWork = new JTextField(5);
        this.txtTest1Marks = new JTextField(5);
        this.txtTest2Marks = new JTextField(5);
        this.txtExamMarks = new JTextField(5);
        this.lblBehavior = new JLabel("BEHAVIOUR:");
        this.lblRate = new JLabel("RATING :");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        (this.txtID = new JTextField("0", 7)).setFont(f);
        this.txtRegNum = new JTextField(16);
        this.txtID.setFont(f);
        this.txtName = new JTextField(25);
        this.txtClass = new JTextField(20);
        (this.txtSession = new JTextField(7)).setFont(f);
        (this.txtfeespaid = new JTextField(7)).setFont(f);
        (this.txtUniform = new JTextField(7)).setFont(f);
        (this.txtBooks = new JTextField(7)).setFont(f);
        (this.txtExamandSpeech = new JTextField(7)).setFont(f);
        (this.txtYear = new JTextField(7)).setFont(f);
        this.txtTotal = new JTextField(7);
        this.txtYear.setFont(f);
        (this.ComboSections = new JComboBox()).addItem("SELECT SECTION");
        this.ComboSections.addItem("ISLAMIYYA");
        this.ComboSections.addItem("TAHFEEZ");
        this.ComboSections.addItem("UMMAHAT");
        this.ComboSections.setFont(f2);
        this.lblfeespaid = new JLabel("TOTAL FEES PAID:");
        this.lblUniform = new JLabel("UNIFORM FEES:");
        this.lblBooks = new JLabel("BOOK FEES:");
        this.lblExamandSpeech = new JLabel("EXAMS & SPEECH:");
        this.lblTotal = new JLabel("TOTAL:");
        this.lblSection = new JLabel("SECTION:");
        this.lblSession = new JLabel("SESSION:");
        this.lblYear = new JLabel("YEAR:");
        this.txtID.setFont(f);
        this.txtRegNum.setFont(f);
        this.txtName.setFont(f);
        this.txtClass.setEditable(false);
        this.txtName.setEditable(false);
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
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633");
        this.ComboSelecClass.addItem("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633");
        this.ComboSelecClass.setEditable(false);
        this.ComboSelecClass.setFont(f2);
        this.ComboSelecClass.setEditable(false);
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
        this.ComboWeekNumber.addItem("WEEK THIRTEEN");
        this.ComboWeekNumber.addItem("WEEK FOURTEEN");
        this.ComboWeekNumber.addItem("WEEK FIFTEEN");
        (this.ComboSelectBehaviour = new JComboBox()).addItem("SELECT BEHAVIOUR");
        this.ComboSelectBehaviour.addItem("Attentiveness");
        this.ComboSelectBehaviour.addItem("Class Participation");
        this.ComboSelectBehaviour.addItem("Handling Items with care");
        this.ComboSelectBehaviour.addItem("Initiative");
        this.ComboSelectBehaviour.addItem("Personal Neatness & Etiquette");
        this.ComboSelectBehaviour.addItem("Politeness & Confidence");
        this.ComboSelectBehaviour.addItem("Promptitude & Perception");
        this.ComboSelectBehaviour.addItem("Punctuality");
        this.ComboSelectBehaviour.addItem("Sense of Responsibilty");
        this.ComboSelectBehaviour.addItem("Writing Skills");
        (this.ComboSelectRate = new JComboBox()).addItem("SELECT RATING");
        this.ComboSelectRate.addItem("RATE 1");
        this.ComboSelectRate.addItem("RATE 2");
        this.ComboSelectRate.addItem("RATE 3");
        this.ComboSelectRate.addItem("RATE 4");
        this.ComboSelectRate.addItem("RATE 5");
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
        this.btnClose = new JButton("Close");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.TextArea = new JTextArea(6, 40);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
        this.txtmyclass = new JTextField();
        this.lblHomeWorkPercentage = new JLabel("10%");
        this.lblTest2Percentage = new JLabel("15%");
        this.lblTest1Percentage = new JLabel("15%");
        this.lblExamPercentage = new JLabel("60%");
        this.lblHomeWorkPercentage.setForeground(Color.red);
        this.lblTest1Percentage.setForeground(Color.red);
        this.lblTest2Percentage.setForeground(Color.red);
        this.lblHomeWorkPercentage.setForeground(Color.red);
        this.lblExamPercentage.setForeground(Color.red);
        this.tableModel1 = new DefaultTableModel(0, 0);
        final JTable table = new JTable(this.tableModel1);
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.black);
        table.setForeground(Color.black);
        table.setAutoResizeMode(4);
        table.setAutoResizeMode(1);
        table.setAutoResizeMode(2);
        table.setFont(tablefont);
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        ScrollPane.setPreferredSize(new Dimension(630, 280));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(670, 280));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("Behaviour Rating.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        final Border TB = new TitledBorder("Student Payment System");
        this.panel2.setBorder(TB);
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.panel2.setBackground(Color.GREEN);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(730, 680);
        this.setTitle("Students Payment System");
        this.add(this.panel);
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLUE);
        this.btnSave.setForeground(Color.WHITE);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.BLACK);
        this.btnPreview.setForeground(Color.CYAN);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.BLACK);
        this.btnNext.setForeground(Color.CYAN);
        this.btnSearch.setBackground(Color.red);
        this.btnSearch.setBackground(Color.BLACK);
        this.btnSearch.setForeground(Color.CYAN);
        this.btnPrevious.setBackground(Color.green);
        this.addItem(this.panel, this.lblSession, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.txtSession, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblYear, 0, 2, 1, 1, 13);
        this.addItem(this.panel, this.txtYear, 1, 2, 1, 1, 17);
        this.addItem(this.panel, this.lblSection, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSections, 1, 3, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 4, 2, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 5, 2, 1, 17);
        this.addItem(this.panel, this.lblfeespaid, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.txtfeespaid, 1, 6, 3, 1, 17);
        this.addItem(this.panel, this.lblRegNum, 0, 8, 1, 1, 13);
        this.addItem(this.panel, this.txtRegNum, 1, 8, 3, 1, 17);
        this.addItem(this.panel, this.lblName, 0, 9, 1, 1, 13);
        this.addItem(this.panel, this.txtName, 1, 9, 3, 1, 17);
        final Box DateBox = Box.createHorizontalBox();
        DateBox.add((Component)this.picker);
        DateBox.add(Box.createHorizontalStrut(5));
        final Box MarksBox3 = Box.createHorizontalBox();
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.txtHomeWork);
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.lblHomeWorkPercentage);
        MarksBox3.add(Box.createHorizontalStrut(8));
        final Box MarksBox4 = Box.createHorizontalBox();
        MarksBox4.add(Box.createHorizontalStrut(5));
        MarksBox4.add(this.txtTest1Marks);
        MarksBox4.add(Box.createHorizontalStrut(5));
        MarksBox4.add(this.lblTest1Percentage);
        MarksBox4.add(Box.createHorizontalStrut(8));
        final Box MarksBox5 = Box.createHorizontalBox();
        MarksBox5.add(Box.createHorizontalStrut(5));
        MarksBox5.add(this.txtTest2Marks);
        MarksBox5.add(Box.createHorizontalStrut(5));
        MarksBox5.add(this.lblTest2Percentage);
        MarksBox5.add(Box.createHorizontalStrut(8));
        final Box MarksBox6 = Box.createHorizontalBox();
        MarksBox6.add(Box.createHorizontalStrut(5));
        MarksBox6.add(this.txtExamMarks);
        MarksBox6.add(Box.createHorizontalStrut(5));
        MarksBox6.add(this.lblExamPercentage);
        MarksBox6.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel, paneScrollPane, 0, 11, 3, 3, 10);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 0, 18, 2, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                StudentPaymentSys.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                StudentPaymentSys.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                StudentPaymentSys.this.connectToDB();
                StudentPaymentSys.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                StudentPaymentSys.this.connectToDB();
                StudentPaymentSys.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                StudentPaymentSys.this.connectToDB();
                StudentPaymentSys.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                StudentPaymentSys.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                StudentPaymentSys.this.btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                StudentPaymentSys.this.connectToDB();
                StudentPaymentSys.this.btnPreviousMethod(evt8);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                StudentPaymentSys.this.connectToDB();
                StudentPaymentSys.this.ComboSelecClassMethod(evt9);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(150);
                if (table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("Fail") || table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("F")) {
                    this.setForeground(Color.RED);
                }
                else {
                    this.setForeground(Color.BLACK);
                }
                return this;
            }
        });
        this.ComboSelectRate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    StudentPaymentSys.this.btnSave.doClick();
                }
            }
        });
        this.ComboSelectRate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 17) {
                    StudentPaymentSys.this.btnNext.doClick();
                }
            }
        });
        this.ComboSelectRate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 18) {
                    StudentPaymentSys.this.btnPrevious.doClick();
                }
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
        final int clouseButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Windows Close Warning", 0);
        if (clouseButton == 0) {
            this.dispose();
        }
        else {
            this.remove(clouseButton);
        }
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.txtRegNum.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.TextArea.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        this.txtRegNum.setText("");
        final String ID = this.txtID.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS") || myClass.equals("SELECT TERM") || myClass.equals("SELECT FORM")) {
            JOptionPane.showMessageDialog(null, "Please, select a class, term or form", "Class Selection Error", 0);
        }
        else if (myClass.equalsIgnoreCase("SSS1 A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("SSS1 B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("SSS2 A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("SSS2 B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("SSS3 A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("SSS3 B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS I A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS I B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS II A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS II B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS III A")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?");
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
        else if (myClass.equalsIgnoreCase("JSS III B")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?");
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
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.txtExamMarks.setText("");
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
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranululaha WHERE StdID = ? AND StdClass = ?");
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639")) {
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
                    this.connection.close();
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
                    this.connection.close();
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
                    this.connection.close();
                    pstatement.close();
                }
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
        this.txtHomeWork.requestFocus();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final String mysession = this.txtSession.getText().toString();
        final String myYear = this.txtYear.getText().toString();
        final String mysection = (String)this.ComboSections.getSelectedItem();
        final String myTerm = (String)this.ComboTerm.getSelectedItem();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String myUniformFees = this.txtUniform.getText().toString();
        final String myBooks = this.txtBooks.getText().toString();
        final String SubCharSessionChar = mysession.substring(5, 9);
        System.out.println(" year:" + myYear);
        System.out.println(" myyear:" + SubCharSessionChar);
        final int totalFeesPaid = Integer.parseInt(this.txtfeespaid.getText().toString());
        final String myRegnum = this.txtRegNum.getText().toString();
        final String myName = this.txtName.getText().toString();
        if (mysection.equals("SELECT SECTION")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter section!", "Error School Fees Spec. Data Entry", 0);
        }
        else if (this.txtSession.getText().equals("") || this.txtSession.getText().length() < 9) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter a session", "Error in Student Payment System", 0);
        }
        else if (this.txtYear.getText().equals("") || this.txtYear.getText().length() > 4) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter a valid Year! (4-digits needed)", "Error in YearData Entry", 0);
        }
        else if (myTerm.equalsIgnoreCase("SELECT TERM")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term!", "Error in Student Payment System", 0);
        }
        else if (myClass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select class!", "Error in Student Payment System", 0);
        }
        else if (this.txtfeespaid.getText().equals("") || this.txtfeespaid.getText().equals("0")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter a valid total amount paid!", "Error in Student Payment System", 0);
        }
        else if (this.txtRegNum.getText().equals("") || this.txtRegNum.getText().equals("0")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter a valid Reg. Number!", "Error in Student Payment System", 0);
        }
        else if (this.txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, name not displayed!", "Error in Student Payment System", 0);
        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO studentpayment (session,year,section,term,class,total,balance,regnum,name)VALUES (?,?,?,?,?,?,null,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO studentpayment (session,year,section,term,class,total,balance,regnum,name)VALUES (?,?,?,?,?,?,null,?,?)");
                pstatement.setString(1, mysession);
                pstatement.setString(2, myYear);
                pstatement.setString(3, mysection);
                pstatement.setString(4, myTerm);
                pstatement.setString(5, myClass);
                pstatement.setInt(6, totalFeesPaid);
                pstatement.setString(7, myRegnum);
                pstatement.setString(8, myName);
                pstatement.executeUpdate();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
            this.data.setSize(0);
            this.columnNames.setSize(0);
            this.tableModel1.setRowCount(0);
            this.tableModel1.fireTableDataChanged();
            this.panel.validate();
            this.panel.repaint();
            this.TextArea.setText("");
        }
        if (myClass.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, select class", "Error Occured", 0);
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final String QueryString = "SELECT regnum,name,session,year,section,term,class,total,balance FROM studentpayment WHERE session=? AND year=? AND section=? AND term=? AND class=? AND regnum=?";
                final PreparedStatement pstatement2 = con.prepareStatement("SELECT regnum,name,session,year,section,term,class,total,balance FROM studentpayment WHERE session=? AND year=? AND section=? AND term=? AND class=? AND regnum=?");
                pstatement2.setString(1, mysession);
                pstatement2.setString(2, myYear);
                pstatement2.setString(3, mysection);
                pstatement2.setString(4, myTerm);
                pstatement2.setString(5, myClass);
                pstatement2.setString(6, myRegnum);
                final ResultSet rs = pstatement2.executeQuery();
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
                pstatement2.close();
            }
            catch (Exception e2) {
                System.out.println(e2);
            }
            this.tableModel1.setDataVector(this.data, this.columnNames);
            this.table = new JTable(this.tableModel1);
            for (int k = 0; k < this.table.getColumnCount(); ++k) {
                this.table.getColumnModel().getColumn(k);
            }
        }
        this.txtName.setText("");
        this.table.repaint();
        this.table.revalidate();
        this.panel.validate();
        this.panel.repaint();
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
        this.txtName.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String test = (String)this.comboTest.getSelectedItem();
        final String TestScore1 = this.txtTest1Marks.getText().toString();
        final String TestScore2 = this.txtTest2Marks.getText().toString();
        final String myhomwwork = this.txtHomeWork.getText().toString();
        final String wknumber = (String)this.ComboWeekNumber.getSelectedItem();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        final String b = (String)this.ComboSelectBehaviour.getSelectedItem();
        final String mysession = this.txtSession.getText().toString();
        final String mysection = (String)this.ComboSections.getSelectedItem();
        final String myYear = this.txtYear.getText().toString();
        final String myfeespaid = this.txtfeespaid.getText().toString();
        final String myExamAndSpeech = this.txtExamandSpeech.getText().toString();
        final String myRegnum = this.txtRegNum.getText().toString();
        if (myRegnum.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter registration number! ", "Error Occured", 0);
        }
        else if (myclass.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter class! ", "Error Occured", 0);
        }
        else if (mysession.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter session! ", "Error Occured", 0);
        }
        else if (myYear.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter session! ", "Error Occured", 0);
        }
        else if (mysection.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter Section! ", "Error Occured", 0);
        }
        else if (term.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter Term! ", "Error Occured", 0);
        }
        else if (this.txtfeespaid.getText().toString().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, enter total amount paid by student! ", "Error Occured", 0);
        }
        else {
            try {
                if (myclass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623")) {
                    final String QueryString = "SELECT StdName,StdClass,StdRegNum FROM studentregriyadulquranululaha WHERE StdRegNum = ? AND StdClass = ?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdName,StdClass,StdRegNum FROM studentregriyadulquranululaha WHERE StdRegNum = ? AND StdClass = ?");
                    pstatement.setString(1, myRegnum);
                    pstatement.setString(2, myclass);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String myName = rs.getObject(1).toString();
                        this.txtName.setText(myName);
                        System.out.println("your Name" + this.txtName.getText().toString());
                        this.panel.repaint();
                        rs.close();
                    }
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void btnPreviousMethod(final ActionEvent e8) {
        this.TextArea.setText("");
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.txtExamMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        ID = Integer.parseInt(this.txtID.getText().toString());
        final String R = Integer.toString(--ID);
        this.txtID.setText(R);
        final String IDNumber = this.txtID.getText().toString();
        this.txtHomeWork.requestFocus();
        this.txtRegNum.setText("");
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt9) {
        if (evt9.getSource() == this.ComboSelecClass) {
            final String csc = (String)this.ComboSelecClass.getSelectedItem();
            if (csc.equals("JSS I A") || csc.equals("JSS I B")) {
                this.ComboForm.setSelectedItem("FORM ONE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("IRS");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("HOME ECONOMICS");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCE");
                this.ComboSelectSubj.addItem("PHE");
                this.ComboSelectSubj.addItem("BASIC SCIENCE");
                this.ComboSelectSubj.addItem("CIVIC EDUCATION");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("QURAN");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGY");
                this.ComboSelectSubj.addItem("CCA");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCE");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGY");
                this.ComboSelectSubj.addItem("BUSINESS STUDIES");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
            }
            else if (csc.equals("JSS II A") || csc.equals("JSS II B")) {
                this.ComboForm.setSelectedItem("FORM TWO");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("IRS");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("HOME ECONOMICS");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCE");
                this.ComboSelectSubj.addItem("PHE");
                this.ComboSelectSubj.addItem("BASIC SCIENCE");
                this.ComboSelectSubj.addItem("CIVIC EDUCATION");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("QURAN");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGY");
                this.ComboSelectSubj.addItem("CCA");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCE");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGY");
                this.ComboSelectSubj.addItem("BUSINESS STUDIES");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
            }
            else if (csc.equals("JSS III A") || csc.equals("JSS III B")) {
                this.ComboForm.setSelectedItem("FORM THREE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("IRS");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("HOME ECONOMICS");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCE");
                this.ComboSelectSubj.addItem("PHE");
                this.ComboSelectSubj.addItem("BASIC SCIENCE");
                this.ComboSelectSubj.addItem("CIVIC EDUCATION");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("QURAN");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGY");
                this.ComboSelectSubj.addItem("CCA");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCE");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGY");
                this.ComboSelectSubj.addItem("BUSINESS STUDIES");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
            }
            else if (csc.equals("SSS1 A") || csc.equals("SSS1 B")) {
                this.ComboForm.setSelectedItem("FORM FOUR");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("BIOLOGY");
                this.ComboSelectSubj.addItem("CHEMISTRY");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("ECONOMICS");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("FOODS AND NUTRITION");
                this.ComboSelectSubj.addItem("FURTHER MATHEMATICS");
                this.ComboSelectSubj.addItem("GEOGRAPHY");
                this.ComboSelectSubj.addItem("GOVERNMENT ");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("HOME MANAGEMENT");
                this.ComboSelectSubj.addItem("HISTORY");
                this.ComboSelectSubj.addItem("ISLAMIC RELIGION KNOWLEDGE");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("PHYSICS");
            }
            else if (csc.equals("SSS2 A") || csc.equals("SSS2 B")) {
                this.ComboForm.setSelectedItem("FORM FIVE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("BIOLOGY");
                this.ComboSelectSubj.addItem("CHEMISTRY");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("ECONOMICS");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("FOODS AND NUTRITION");
                this.ComboSelectSubj.addItem("FURTHER MATHEMATICS");
                this.ComboSelectSubj.addItem("GEOGRAPHY");
                this.ComboSelectSubj.addItem("GOVERNMENT ");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("HOME MANAGEMENT");
                this.ComboSelectSubj.addItem("HISTORY");
                this.ComboSelectSubj.addItem("ISLAMIC RELIGION KNOWLEDGE");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("PHYSICS");
            }
            else if (csc.equals("SSS3 A") || csc.equals("SSS3 B")) {
                this.ComboForm.setSelectedItem("FORM SIX");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("QURAN & TAJWEED");
                this.ComboSelectSubj.addItem("ARABIC LANGUAGE");
                this.ComboSelectSubj.addItem("BIOLOGY");
                this.ComboSelectSubj.addItem("CHEMISTRY");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCE");
                this.ComboSelectSubj.addItem("ECONOMICS");
                this.ComboSelectSubj.addItem("ENGLISH LANGUAGE");
                this.ComboSelectSubj.addItem("FOODS AND NUTRITION");
                this.ComboSelectSubj.addItem("FURTHER MATHEMATICS");
                this.ComboSelectSubj.addItem("GEOGRAPHY");
                this.ComboSelectSubj.addItem("GOVERNMENT ");
                this.ComboSelectSubj.addItem("HAUSA");
                this.ComboSelectSubj.addItem("HOME MANAGEMENT");
                this.ComboSelectSubj.addItem("HISTORY");
                this.ComboSelectSubj.addItem("ISLAMIC RELIGION KNOWLEDGE");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISH");
                this.ComboSelectSubj.addItem("MATHEMATICS");
                this.ComboSelectSubj.addItem("PHYSICS");
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
        final String[] initString = { "\n:  " };
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
}
