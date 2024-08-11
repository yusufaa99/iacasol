import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
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
import java.awt.Component;
import java.awt.Color;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class DataEntryForm extends JFrame
{
    private static final long serialVersionUID = 1L;
    int acctCounter;
    String pulledClassName_Eng;
    int accControlCounter;
    String myUsername_From_Authentication_Class;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private ResultSet rs;
    private JPanel panel;
    private JPanel panel2;
    private String Combosuject_Eng;
    private JComboBox CombPulledosuject_Eng;
    private JComboBox ComboSession;
    private JLabel lblSession;
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
    Font tablefont;
    Font f;
    private JLabel lblHomeWork;
    private JLabel lblTest1Marks;
    private JLabel lblTest2Marks;
    private JLabel lblExamMarks;
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
    ResultSet rscomboClass;
    PreparedStatement pstatementcomboClass;
    
    public DataEntryForm() {
        this.acctCounter = 0;
        this.pulledClassName_Eng = "";
        this.accControlCounter = 0;
        this.myUsername_From_Authentication_Class = "";
        this.Combosuject_Eng = "";
        this.tablefont = new Font("null", 1, 14);
        this.f = new Font("Arial Unicode MS", 1, 18);
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void TestDataEntryForm() {
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblID = new JLabel("STUD. ID:");
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
        this.lblTest1Marks = new JLabel("TEST SCORE: ");
        this.lblTest2Marks = new JLabel("TEST2 SCORE: ");
        this.lblExamMarks = new JLabel("EXAMINATION SCORE: ");
        this.txtHomeWork = new JTextField(5);
        this.txtTest1Marks = new JTextField(5);
        this.txtTest2Marks = new JTextField(5);
        this.txtExamMarks = new JTextField(5);
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.txtID = new JTextField("0", 7);
        this.txtRegNum = new JTextField(16);
        (this.txtRegNum = new JTextField(16)).setEditable(false);
        this.txtName = new JTextField(25);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtID.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtName.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtClass.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.lblSession = new JLabel("SESSION:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(this.f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        this.CombPulledosuject_Eng = new JComboBox();
        (this.ComboSelecClass = new JComboBox()).setFont(this.f);
        this.ComboSelecClass.addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("FIRST TERM");
        this.ComboTerm.addItem("SECOND TERM");
        this.ComboTerm.addItem("THIRD TERM");
        this.ComboTerm.setFont(this.f);
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        (this.ComboSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
        this.ComboSelectSubj.setFont(this.f);
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
        this.lblQueryAllSelecTerm = new JLabel("TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
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
        this.lblTest2Percentage = new JLabel("40%");
        this.lblTest1Percentage = new JLabel("40%");
        this.lblExamPercentage = new JLabel("60%");
        this.lblTest1Percentage.setForeground(Color.red);
        this.lblTest2Percentage.setForeground(Color.red);
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
        table.setFont(this.tablefont);
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        ScrollPane.setPreferredSize(new Dimension(670, 280));
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
        paneScrollPane.setPreferredSize(new Dimension(640, 200));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("DataentryDisplay.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        final Border TB = new TitledBorder("Marks Data Entry Section");
        this.panel2.setBorder(TB);
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.panel2.setBackground(Color.green.brighter());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(735, 684);
        this.setTitle("Data Entry Window - For- Result Processing");
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
        this.addItem(this.panel, this.ComboSession, 1, 1, 1, 1, 17);
        final Box REgIDBox = Box.createHorizontalBox();
        REgIDBox.add(Box.createHorizontalStrut(5));
        REgIDBox.add(this.txtID);
        REgIDBox.add(Box.createHorizontalStrut(8));
        REgIDBox.add(this.lblRegNum);
        REgIDBox.add(Box.createHorizontalStrut(5));
        REgIDBox.add(this.txtRegNum);
        REgIDBox.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel, this.lblID, 0, 2, 1, 1, 13);
        this.addItem(this.panel, this.txtID, 1, 2, 1, 1, 17);
        this.addItem(this.panel, this.lblRegNum, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.txtRegNum, 1, 3, 1, 1, 17);
        this.addItem(this.panel, this.lblName, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.txtName, 1, 4, 2, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 5, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 6, 3, 1, 17);
        this.addItem(this.panel, this.lblSubject, 0, 7, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelectSubj, 1, 7, 3, 1, 17);
        final Box DateBox = Box.createHorizontalBox();
        DateBox.add((Component)this.picker);
        DateBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, this.panel2, 1, 9, 2, 2, 17);
        this.addItem(this.panel2, this.lblTest1Marks, 0, 2, 1, 1, 13);
        final Box MarksBox1 = Box.createHorizontalBox();
        MarksBox1.add(Box.createHorizontalStrut(5));
        MarksBox1.add(this.txtTest1Marks);
        MarksBox1.add(Box.createHorizontalStrut(5));
        MarksBox1.add(this.lblTest1Percentage);
        MarksBox1.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, MarksBox1, 1, 2, 2, 1, 17);
        final Box MarksBox2 = Box.createHorizontalBox();
        MarksBox2.add(Box.createHorizontalStrut(5));
        MarksBox2.add(this.txtTest2Marks);
        MarksBox2.add(Box.createHorizontalStrut(5));
        MarksBox2.add(this.lblTest2Percentage);
        MarksBox2.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, this.lblExamMarks, 0, 4, 1, 1, 13);
        final Box MarksBox3 = Box.createHorizontalBox();
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.txtExamMarks);
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.lblExamPercentage);
        MarksBox3.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, MarksBox3, 1, 4, 3, 1, 17);
        this.addItem(this.panel, paneScrollPane, 1, 11, 3, 3, 10);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrevious);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 0, 18, 2, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                DataEntryForm.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                DataEntryForm.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                DataEntryForm.this.connectToDB();
                DataEntryForm.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                DataEntryForm.this.connectToDB();
                DataEntryForm.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                DataEntryForm.this.connectToDB();
                DataEntryForm.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                DataEntryForm.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                DataEntryForm.this.btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                DataEntryForm.this.connectToDB();
                DataEntryForm.this.btnPreviousMethod(evt8);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                DataEntryForm.this.connectToDB();
                DataEntryForm.this.ComboSelecClassMethod(evt9);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 1, 10);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(30);
                if (table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("\u0631\u0633\u0648\u0628") || table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("\u0636\u0639\u0641 \u062c\u062f\u0627 \u0641\u064a \u0647\u0630\u0647 \u0627\u0644\u0645\u0627\u062f\u0629")) {
                    this.setForeground(Color.RED);
                }
                else {
                    this.setForeground(Color.BLACK);
                }
                return this;
            }
        });
        this.txtExamMarks.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    DataEntryForm.this.btnSave.doClick();
                }
            }
        });
        this.txtExamMarks.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 32) {
                    DataEntryForm.this.btnNext.doClick();
                }
            }
        });
        this.setVisible(false);
        this.setVisible(true);
        this.fillCoboSelectClass();
        this.panel.validate();
        this.panel.revalidate();
        this.panel.repaint();
        this.fillComboSession();
        this.panel.validate();
        this.panel.revalidate();
        this.panel.repaint();
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
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.connectToDB();
        this.pulledCLassName_ENG();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.txtExamMarks.setText("");
        this.txtName.setText("");
        this.txtRegNum.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        final String ClassName_Eng = this.pulledClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        //String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();

        Label_0561: {
            try {
                ID = Integer.parseInt(this.txtID.getText().toString());
                final String R = Integer.toString(++ID);
                this.txtID.setText(R);
                final String IDNumber = this.txtID.getText().toString();
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM " + ClassName_Eng + " WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
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
                }
            }
            catch (SQLException e5) {
                JOptionPane.showMessageDialog(null, "btnNext, Error Occured: \n" + " Student ID does NOT exist!", "Error occured: ", 0);
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e6) {
                    e6.printStackTrace();
                }
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e7) {
                    e7.printStackTrace();
                }
                break Label_0561;
            }
            finally {
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e7) {
                    e7.printStackTrace();
                }
            }
            try {
                this.connection.close();
                this.rs.close();
                this.pstatement.close();
            }
            catch (SQLException e7) {
                e7.printStackTrace();
            }
            try {
                this.connection.close();
                this.rs.close();
                this.pstatement.close();
            }
            catch (SQLException e8) {
                e8.printStackTrace();
            }
        }
        this.txtTest1Marks.requestFocus();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        this.pulledCLassName_ENG();
        this.accessControlMethod();
        final String term = this.ComboTerm.getSelectedItem().toString();
        final String form = this.ComboForm.getSelectedItem().toString();
 
        final String myclass = this.ComboSelecClass.getSelectedItem().toString();//.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String subj = this.ComboSelectSubj.getSelectedItem().toString();
        final String ID = this.txtID.getText().toString();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        final String Test = this.comboTest.getSelectedItem().toString();
        final String HomeWorkscore = this.txtHomeWork.getText().toString();
        final String TestScore1 = this.txtTest1Marks.getText().toString();
        final String Exam = this.txtExamMarks.getText().toString();
        final String wkcombo = (String)this.ComboWeekNumber.getSelectedItem();
        final double myHomeWork = 0.0;
        final double testscore1 = Double.parseDouble(TestScore1);
        final double myExam = Double.parseDouble(Exam);
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString().replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        final String mySubject_Ara = this.ComboSelectSubj.getSelectedItem().toString().replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        
       // String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
      
        try {
            this.connectToDB();
            final String QueryString = "SELECT Subject_Eng FROM assign_subject WHERE Classname_Ara = ? AND Subject_Ara = ? ";
            (this.pstatement = this.connection.prepareStatement("SELECT Subject_Eng FROM assign_subject WHERE Classname_Ara = ? AND Subject_Ara = ? ")).setString(1, myClassName_Ara);
            this.pstatement.setString(2, mySubject_Ara);
            this.rs = this.pstatement.executeQuery();
            while (this.rs.next()) {
                final String myPulledosuject_Eng = this.rs.getString("Subject_Eng");
                this.CombPulledosuject_Eng.removeAllItems();
                this.CombPulledosuject_Eng.addItem(myPulledosuject_Eng);
                this.panel.repaint();
                this.panel.revalidate();
            }
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select Session!", "Error in Session Data Entry", 0);
        }
        else if (term.equals("SELECT TERM") || myclass.equals("SELECT CLASS") || subj.equals("SELECT SUBJECT")) {
            JOptionPane.showMessageDialog(null, "Please, select term, class, subject or subject!", "Error in Test score Data Entry", 0);
        }
        else if (Name.equalsIgnoreCase("") || RegNum.equalsIgnoreCase("") || ID.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, supply ID, RegNum or Name!", "Error in Test score Data Entry", 0);
        }
        else if (Date.equals("dd")) {
            JOptionPane.showMessageDialog(null, "Please, select date!", "Error in date", 0);
        }
        else if (testscore1 > 40.0 || testscore1 < 0.0) {
            JOptionPane.showMessageDialog(null, "you cannot enter marks > thirty (40) or < one (1) for Test1 score !", "Error in Test score1 Data Entry", 0);
        }
        else if (myExam > 60.0 || myExam < 0.0) {
            JOptionPane.showMessageDialog(null, "you cannot enter marks > forty (60) or < one (1) for Exam Score !", "Error in Exam Score Data Entry", 0);
        }
//        else if (this.accControlCounter <= 0) {
//            JOptionPane.showMessageDialog(null, "USERNAME: [ " + this.myUsername_From_Authentication_Class + " ]" + " NOT ENABLED for the Class: " + "[ " + myclass + " ]", "Error occured", 0);
//        }
        else {
            try {
                ++this.flag;
                final String InsertQueryString = "INSERT INTO dataentryacasolarabic (ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Date,Test,Exam,Total,Position,Grade,Remarks,Session)VALUES (?,?,?,?,?,?,?,?,?,?,Test+Exam,NULL,NULL,NULL,?) ON DUPLICATE KEY UPDATE Test=VALUES(Test),Exam=VALUES(Exam), Total=VALUES(Total), Position=VALUES(Position), Remarks=VALUES(Remarks), Grade=VALUES(Grade)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO dataentryacasolarabic (ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Date,Test,Exam,Total,Position,Grade,Remarks,Session)VALUES (?,?,?,?,?,?,?,?,?,?,Test+Exam,NULL,NULL,NULL,?) ON DUPLICATE KEY UPDATE Test=VALUES(Test),Exam=VALUES(Exam), Total=VALUES(Total), Position=VALUES(Position), Remarks=VALUES(Remarks), Grade=VALUES(Grade)");
                pstatement.setString(1, ID);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, Name);
                pstatement.setString(4, myclass);
                pstatement.setString(5, term);
                pstatement.setString(6, subj);
                pstatement.setString(7, subj);
                
                pstatement.setString(8, Date);
                pstatement.setDouble(9, testscore1);
                pstatement.setDouble(10, myExam);
                pstatement.setString(11, mySession);
               // System.out.println("//// The Pulled ENG Subj" + this.CombPulledosuject_Eng.getSelectedItem().toString());
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                final String subject = (String)this.ComboSelectSubj.getSelectedItem();
                JOptionPane.showMessageDialog(null, "  The  Marks  Score =  " + testscore1 + ", " + myExam + " for " + subject + " ," + term + " Term, " + " has been stored for " + Name + " Session: " + mySession);
                this.CombPulledosuject_Eng.removeAllItems();
                this.panel.revalidate();
                this.panel.repaint();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
            if (this.flag > 0) {//updating the dataentry table with "remarks" and "grades"
                try {
                	//"UPDATE dataentryacasolarabic SET  Remarks = ( CASE WHEN (Total >=80) THEN '\u0645\u0645\u062a\u0627\u0632' WHEN (Total >=70) THEN '\u062c\u0628\u062f \u062c\u062f\u0627' WHEN (Total >=50) THEN '\u062c\u064a\u062f'  WHEN (Total >=40) THEN '\u0645\u0642\u0628\u0648\u0644' ELSE ('\u0631\u0633\u0648\u0628') END), Mulahazah=( CASE WHEN (Total >=80) THEN '\u0628\u0627\u0631\u0643 \u0627\u0644\u0644\u0647 \u0641\u064a\u0643' WHEN (Total >=70) THEN '\u0628\u0627\u0631\u0643 \u0627\u0644\u0644\u0647 \u0641\u064a\u0643' WHEN (Total >=50) THEN '\u0628\u0627\u0631\u0643 \u0627\u0644\u0644\u0647 \u0641\u064a\u0643' WHEN (Total >=40) THEN '\u0636\u0639\u0641 \u0641\u064a \u0647\u0630\u0627 \u0627\u0644\u0645\u0627\u062f' ELSE ('\u0636\u0639\u0641 \u062c\u062f\u0627 \u0641\u064a \u0647\u0630\u0647 \u0627\u0644\u0645\u0627\u062f\u0629') END )"
                    final String InsertQueryString = "UPDATE dataentryacasolarabic SET  Remarks = ( CASE WHEN (Total >=70) THEN 'Excellent' WHEN (Total >=60) THEN 'Very Good' WHEN (Total >=50) THEN 'Credit' WHEN (Total >=45) THEN 'Pass' WHEN (Total >=40) THEN 'Pass' ELSE ('Fail') END), Grade=( CASE WHEN (Total >=70) THEN 'A' WHEN (Total >=60) THEN 'B' WHEN (Total >=50) THEN 'C' WHEN (Total >=45) THEN 'D' WHEN (Total >=40) THEN 'E' ELSE ('F') END )";
                    final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                    final int numberOfRowsUpdated = pstatement.executeUpdate();
                    final String s = (String)this.ComboSelectSubj.getSelectedItem();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();
                }
            }
            if (this.flag > 0) {
                try {
                    final String InsertQueryString = "INSERT INTO position_persubjacasolarabic(ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Total,Position) SELECT  ID,RegNum,Name,Class,Term,Subject,Subject_ENG,total,FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=?)) FROM dataentryacasolarabic dt where subject=? AND Class=? AND Term=? ON DUPLICATE KEY UPDATE Total=VALUES(Total), Position=VALUES(Position)";
                    final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO position_persubjacasolarabic(ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Total,Position) SELECT  ID,RegNum,Name,Class,Term,Subject,Subject_ENG,total,FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=?)) FROM dataentryacasolarabic dt where subject=? AND Class=? AND Term=? ON DUPLICATE KEY UPDATE Total=VALUES(Total), Position=VALUES(Position)");
                    pstatement.setString(1, subj);
                    pstatement.setString(2, myclass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, subj);
                    pstatement.setString(5, myclass);
                    pstatement.setString(6, term);
                    final int numberOfRowsUpdated = pstatement.executeUpdate();
                    final String s2 = (String)this.ComboSelectSubj.getSelectedItem();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();
                }
            }
            if (this.flag > 0) {
                try {
                    final String InsertQueryString = "UPDATE dataentryacasolarabic As t1 INNER JOIN position_persubjacasolarabic As t2 ON t1.regnum=t2.regnum AND t1.class=t2.class AND t1.term=t2.term AND t1.subject=t2.subject SET t1.position=t2.position WHERE t1.subject=? AND t1.class=? AND t1.term=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("UPDATE dataentryacasolarabic As t1 INNER JOIN position_persubjacasolarabic As t2 ON t1.regnum=t2.regnum AND t1.class=t2.class AND t1.term=t2.term AND t1.subject=t2.subject SET t1.position=t2.position WHERE t1.subject=? AND t1.class=? AND t1.term=?");
                    pstatement.setString(1, subj);
                    pstatement.setString(2, myclass);
                    pstatement.setString(3, term);
                    final int numberOfRowsUpdated = pstatement.executeUpdate();
                    final String s3 = (String)this.ComboSelectSubj.getSelectedItem();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();
                }
            }
            this.data.setSize(0);
            this.columnNames.setSize(0);
            this.tableModel1.setRowCount(0);
            this.tableModel1.fireTableDataChanged();
            this.panel.validate();
            this.panel.repaint();
            this.TextArea.setText("");
            if (subj.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Pls, Subject not selected", "Error Occured", 0);
            }
            else {
                Label_1884: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                        final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                        final String USERNAME = "root";
                        final String PASSWORD = "ash123";
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                        final String QueryString2 = "SELECT ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Test,Exam,Total,Remarks,Mulahazah, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?)) As Position,Session FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?";
                        final PreparedStatement pstatement2 = con.prepareStatement("SELECT ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Test,Exam,Total,Remarks,Mulahazah, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?)) As Position,Session FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?");
                        pstatement2.setString(1, subj);
                        pstatement2.setString(2, myclass);
                        pstatement2.setString(3, term);
                        pstatement2.setString(4, mySession);
                        pstatement2.setString(5, subj);
                        pstatement2.setString(6, myclass);
                        pstatement2.setString(7, term);
                        pstatement2.setString(8, mySession);
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
                    }
                    catch (Exception e2) {
                        System.out.println(e2);
                        try {
                            this.connection.close();
                            this.rs.close();
                            this.pstatement.close();
                        }
                        catch (SQLException e3) {
                            e3.printStackTrace();
                        }
                        try {
                            this.connection.close();
                            this.rs.close();
                            this.pstatement.close();
                        }
                        catch (SQLException e4) {
                            e4.printStackTrace();
                        }
                        break Label_1884;
                    }
                    finally {
                        try {
                            this.connection.close();
                            this.rs.close();
                            this.pstatement.close();
                        }
                        catch (SQLException e4) {
                            e4.printStackTrace();
                        }
                    }
                    try {
                        this.connection.close();
                        this.rs.close();
                        this.pstatement.close();
                    }
                    catch (SQLException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        this.connection.close();
                        this.rs.close();
                        this.pstatement.close();
                    }
                    catch (SQLException e5) {
                        e5.printStackTrace();
                    }
                }
                this.tableModel1.setDataVector(this.data, this.columnNames);
                this.table = new JTable(this.tableModel1);
                for (int k = 0; k < this.table.getColumnCount(); ++k) {
                    this.table.getColumnModel().getColumn(k);
                }
                this.table.repaint();
                this.table.revalidate();
                this.panel.validate();
                this.panel.repaint();
            }
        }
        this.txtHomeWork.requestFocus();
        this.txtRegNum.setText("");
        this.table.repaint();
        this.table.revalidate();
        this.panel.validate();
        this.panel.repaint();
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        this.TextArea.setText("");
        final String term = this.ComboTerm.getSelectedItem().toString();
        final String form = this.ComboForm.getSelectedItem().toString();
        final String myclass = this.ComboSelecClass.getSelectedItem().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String subj = this.ComboSelectSubj.getSelectedItem().toString();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String test = (String)this.comboTest.getSelectedItem();
        final String TestScore1 = this.txtTest1Marks.getText().toString();
        final String myhomwwork = this.txtHomeWork.getText().toString();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select Session!", "Error Occured", 0);
        }
        else if (subj.equalsIgnoreCase("SELECT SUBJECT")) {
            JOptionPane.showMessageDialog(null, "Pls, Subject not selected", "Error Occured", 0);
        }
        else if (term.equalsIgnoreCase("SELECT TERM")) {
            JOptionPane.showMessageDialog(null, "Pls, term not selected", "Error Occured", 0);
        }
        else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Pls, class not selected", "Error Occured", 0);
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final String QueryString = "SELECT ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Test,Exam,Total,Grade,Remarks, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?)) As Position,Session FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=? order by ID";
                final PreparedStatement pstatement = con.prepareStatement("SELECT ID,RegNum,Name,Class,Term,Subject,Subject_ENG,Test,Exam,Total,Grade,Remarks, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=?)) As Position,Session FROM dataentryacasolarabic where subject=? AND Class=? AND Term=? AND Session=? order by ID");
                pstatement.setString(1, subj);
                pstatement.setString(2, myclass);
                pstatement.setString(3, term);
                pstatement.setString(4, mySession);
                pstatement.setString(5, subj);
                pstatement.setString(6, myclass);
                pstatement.setString(7, term);
                pstatement.setString(8, mySession);
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
            }
            catch (Exception e) {
                System.out.println(e);
            }
            this.tableModel1.setDataVector(this.data, this.columnNames);
            this.table = new JTable(this.tableModel1);
            for (int k = 0; k < this.table.getColumnCount(); ++k) {
                this.table.getColumnModel().getColumn(k);
            }
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
    }
    
    public void btnPreviousMethod(final ActionEvent e8) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.TextArea.setText("");
        this.txtTest1Marks.setText("");
        this.txtHomeWork.setText("");
        this.txtExamMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        this.ComboSelecClass.setFont(this.f);
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
            this.ComboSelectSubj.removeAllItems();
            this.fillComboSelectSubj();
            this.panel.validate();
            this.panel.revalidate();
            this.panel.repaint();
            this.panel.repaint();
            this.panel.revalidate();
        }
        else {
            this.ComboSelectSubj.setSelectedItem("SELECT SUBJECT");
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
        final String[] initString = { " " };
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
    
    public void fillCoboSelectClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0293: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString(1);
                    this.ComboSelecClass.addItem(ComboClassName);
                    this.ComboSelecClass.revalidate();
                    this.ComboSelecClass.repaint();
                    this.panel.revalidate();
                    this.panel.repaint();
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
                break Label_0293;
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
    
    public void fillComboSelectSubj() {
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        this.ComboSelectSubj.addItem("SELECT SUBJECT");
        Label_0314: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString(1);
                    this.ComboSelectSubj.addItem(Combosuject_Ara);
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
                break Label_0314;
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
        Label_0242: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString(1).replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
                   // String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
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
                break Label_0242;
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
    
    public void accessControlMethod() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        this.myUsername_From_Authentication_Class = AuthenticationWindow.txtUserName.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem().toString().replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        //String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        if (this.myUsername_From_Authentication_Class.equalsIgnoreCase("saif")) {
            ++this.accControlCounter;
        }
        else {
            try {
                this.connectToDB();
                pstatement = this.connection.prepareStatement("SELECT userName FROM accssControl WHERE class=? AND userName=?");
                pstatement.setString(1, myClass);
                pstatement.setString(2, this.myUsername_From_Authentication_Class);
                rs = pstatement.executeQuery();
                if (rs.next()) {
                    ++this.accControlCounter;
                    final String TheSQLretrievedUserNameForAccessControl = rs.getString("userName");
                    System.out.println(" Testing vrariable:  " + this.myUsername_From_Authentication_Class);
                }
                else {
                    this.accControlCounter = 0;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                return;
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
    }
    
    public void fillComboSession() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0281: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT distinct Session FROM terminformation order by Session Asc";
                pstatement = this.connection.prepareStatement("SELECT distinct Session FROM terminformation order by Session Asc");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString("Session");
                    this.ComboSession.addItem(Combosuject_Ara);
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
}
