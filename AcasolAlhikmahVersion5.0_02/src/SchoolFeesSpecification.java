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
import java.util.Locale;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Component;
import java.awt.ComponentOrientation;
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
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class SchoolFeesSpecification extends JFrame
{
    private static final long serialVersionUID = 1L;
    int acctCounter;
    int fees_dublicate_counter = 0;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private String subjectEng;
    private JComboBox ComboSession;
    private JLabel lblSession;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblClass_English;
    private JLabel lblFees;
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
    private JComboBox ComboSelecClass_English;
    private JComboBox ComboFees;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox comboTest;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnDeregister;
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
    private JComboBox ComboClass;
    private JLabel lblComboClass;
    
    private JLabel lblFeesAmount;
    private JTextField txtAmount;
    
    public SchoolFeesSpecification() {
        this.acctCounter = 0;
        this.tablefont = new Font("null", 1, 14);
        this.f = new Font("Arial Unicode MS", 1, 18);
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void SchoolFeesSpecification() {
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
        this.lblFees = new JLabel("FEES:");
        this.lblClass_English = new JLabel("CLASS Eng:");
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
        
        lblComboClass = new JLabel("CLASS:"); 
        (this.ComboClass = new JComboBox()).setEditable(false);
		this.ComboClass.addItem("SELECT CLASS");
		this.ComboClass.setEditable(false);
		this.ComboClass.setFont(f);
		
		lblFeesAmount = new JLabel("FEES AMOUNT:");
		txtAmount =  new JTextField(10);
		txtAmount.setFont(f);
        
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(this.f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        (this.ComboSelecClass_English = new JComboBox()).setEditable(true);
        this.ComboSelecClass_English.setFont(this.f);
        this.ComboSelecClass_English.addItem("SELECT CLASS_ENLISH");
        
         (this.ComboSelecClass = new JComboBox()).setFont(this.f);
       
         this.ComboSelecClass.addItem("SELECT CLASS");
       
        this.ComboSelecClass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        
        this.ComboSelecClass.addItem("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623");
        this.ComboSelecClass.addItem("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u062c");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649");
        this.ComboSelecClass.addItem("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0645\u062a\u0648\u0633\u0637\u0629");
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
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062c");
        this.ComboSelecClass.addItem("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062f");
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
        this.ComboSelecClass.setEditable(true);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        this.ComboSelecClass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       
        this.ComboFees = new JComboBox();
        (this.ComboFees = new JComboBox()).addItem("SELECT FEES TYPE");
        this.ComboFees.addItem("SCHOOL FEES");
        this.ComboFees.addItem("REGISTRATION FEES");
        this.ComboFees.addItem("UNIFORM FEES");
        this.ComboFees.addItem("BOOKS FEES");
        this.ComboFees.addItem("UTILITY FEES");   
        this.ComboFees.addItem("EXAMINATION FEES");
        this.ComboFees.addItem("SPORTWEAR FEES");
        
        this.ComboFees.setEditable(true);
        this.ComboFees.setFont(this.f);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0623\u0648\u0644\u0649");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629");
        this.ComboTerm.setFont(this.f);
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        (this.ComboSelectSubj = new JComboBox()).setFont(this.f);
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
        this.btnDeregister = new JButton("Deregister");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnSave.setFont(this.f);
        this.btnPrint.setFont(this.f);
        this.btnPreview.setFont(this.f);
        this.btnDeregister.setFont(this.f);
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
        this.setResizable(true);
        this.setSize(890, 482);
        this.setTitle("[AcasolV5.0_02] School Fees Specification Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLUE);
        this.btnSave.setForeground(Color.WHITE);
        this.btnDeregister.setForeground(Color.RED);
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
        this.addItem(this.panel, this.lblComboClass, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboClass, 1, 4, 2, 1, 17);
     
        //this.addItem(this.panel, this.lblClass, 0, 5, 1, 1, 13);
        //this.addItem(this.panel, this.ComboSelecClass, 1, 5, 3, 1, 17);
        //this.ComboSelecClass.getInputContext().selectInputMethod(new Locale("ar", "SA"));
        this.addItem(this.panel, this.lblFees, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.ComboFees, 1, 5, 3, 1, 17);
        
        this.addItem(this.panel, this.lblFeesAmount, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.txtAmount, 1, 6, 3, 1, 17);
        
        this.addItem(this.panel, paneScrollPane, 1, 11, 3, 3, 10);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(this.btnDeregister);
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
                btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                connectToDB();
                 btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
               connectToDB();
                 btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                connectToDB();
                btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                connectToDB();
                btnPreviousMethod(evt8);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                connectToDB();
                ComboSelecClassMethod(evt9);
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
                if (e.getKeyCode() == 32) {
                    btnNext.doClick();
                }
            }
        });
        this.ComboFees.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    btnSave.doClick();
                }
            }
        });
        this.btnDeregister.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                btnDeregisterMethod(evt10);
            }
        });
        this.fillComboSession();
        
        this.ComboClass.addActionListener(new ActionListener() {
			public void actionPerfomed(final ActionEvent e11) {
			}

			@Override
			public void actionPerformed(final ActionEvent evt11) {
				 connectToDB();
				 ComboClassMethod(evt11);
			}
		});
		this.fillComboClass();  
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
            else if (myClass.equalsIgnoreCase("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u062c")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyahC WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregriyadulquranulsaniyahC WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0645\u062a\u0648\u0633\u0637\u0629")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisahm WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentreghalaqatulsalisahm WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062c")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahc WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahc WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062f")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahd WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregraudatululahd WHERE StdID = ? AND StdClass = ?");
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
                    System.out.println("outpuFrom btnNext: " + this.txtRegNum.getText().toString());
                    System.out.println("outpuFrom btnNext: " + this.txtName.getText().toString());
                    System.out.println("outpuFrom btnNext: " + this.txtClass.getText().toString());
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u062a\u0648\u0633\u0637")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAuwalulmutawassit WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAuwalulmutawassit WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u0645\u062a\u0648\u0633\u0637")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssanimutawassit WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssanimutawassit WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u0645\u062a\u0648\u0633\u0637")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssalismutawassit WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssalismutawassit WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAuwalussanawi WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAuwalussanawi WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssanisanawi WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssanisanawi WHERE StdID = ? AND StdClass = ?");
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
            else if (myClass.equalsIgnoreCase("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssalissanawi WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregAssalissanawi WHERE StdID = ? AND StdClass = ?");
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
        this.txtTest1Marks.requestFocus();
    }
    
    public void btnDeregisterMethod(final ActionEvent evt10) {
    	 
        final int DeleteButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to DELETE?", "Deregistration Confirmation Window", 0);
        if (DeleteButton == 0) {
        	
        	  final String mySession = this.ComboSession.getSelectedItem().toString();
              final String myClassName = this.ComboClass.getSelectedItem().toString();
              final String myFeesType = this.ComboFees.getSelectedItem().toString();
               
              String TheModifiedClassname_Eng = myClassName.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
              
        	
//            final String myClassName_Eng = this.ComboSelecClass_English.getSelectedItem().toString();
//            final String myClassName_Arabic = this.ComboSelecClass.getSelectedItem().toString();
//            final String myFees = this.ComboFees.getSelectedItem().toString();
//           // final String mySession = this.ComboSession.getSelectedItem().toString();
//            final String ClassStatus = "Active";
//            final String TheClassName_Eng = "";
//            final String TheClassName_Arabic = "";
            
            int counterForDeletion = 0;
            
            if (mySession.equals("Select Session")) {
                JOptionPane.showMessageDialog(null, "Please, select Session!", "Error in Fees Specification", 0);
            }           
            else if (myClassName.equals("SELECT CLASS")) {
                JOptionPane.showMessageDialog(null, "Please, select Subject_Arabic!", "Error in Fees Specification", 0);
            }
            else if (myFeesType.equals("SELECT FEES TYPE")) {
                JOptionPane.showMessageDialog(null, "Please, select FeesType!", "Error in Fees Specification", 0);
            }  
           else {
                try {
                    this.connectToDB();
                     final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM feesSpecification WHERE session =? AND class=? AND fees_type=? ");
                     pstatement.setString(1, mySession);
                     pstatement.setString(2, myClassName);
                     pstatement.setString(3, myFeesType );
                    final ResultSet rs = pstatement.executeQuery();
                    if (rs.next()) {
                        ++counterForDeletion;
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
                 
                if (counterForDeletion <= 0) {
                    JOptionPane.showMessageDialog(null, "The selected class/session/feesType do NOT EXIST inside the Databse!", "Error Occured", 0);
                }
                else {
                    try {
                        this.connectToDB();
                         final PreparedStatement pstatement = this.connection.prepareStatement("DELETE FROM feesSpecification WHERE session =? AND class =?  AND fees_type=?   ");
                         pstatement.setString(1, mySession);
                         pstatement.setString(2, myClassName);
                         pstatement.setString(3, myFeesType );
                        pstatement.executeUpdate();
                        pstatement.close();
                        JOptionPane.showMessageDialog(null, "  The  Class " + myFeesType + "\n For: " + myClassName + "Session: "+ mySession + "\n " + " is been DELETED!");
                    }
                    catch (SQLException a) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                        a.printStackTrace();
                    }
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                        final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                        final String USERNAME = "root";
                        final String PASSWORD = "ash123";
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                         
                        //final String QueryString2 = "SELECT * FROM class_regsitration";
                        final PreparedStatement pstatement2 = con.prepareStatement(" SELECT * FROM feesSpecification WHERE Session=? AND Class=? ");
                        final ResultSet rs2 = pstatement2.executeQuery();
                        final ResultSetMetaData md = rs2.getMetaData();
                        final int columns = md.getColumnCount();
                        for (int i = 1; i <= columns; ++i) {
                            this.columnNames.addElement(md.getColumnName(i));
                        }
                        while (rs2.next()) {
                            final Vector row = new Vector(columns);
                            for (int j = 1; j <= columns; ++j) {
                                row.addElement(rs2.getObject(j));
                            }
                            this.data.addElement(row);
                        }
                        rs2.close();
                        pstatement2.close();
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
            this.txtRegNum.setText("");
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
            
         }
        else {
            this.remove(DeleteButton);
        }
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final int clasreg_counter = 0; 
        final int SaveButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to Register this fees?", "Fees Registration Confirmation Window", 0);
        if (SaveButton == 0) {
           
            final String mySession = this.ComboSession.getSelectedItem().toString();
            final String myClassName = this.ComboClass.getSelectedItem().toString();
            final String myFeesType = this.ComboFees.getSelectedItem().toString();
            final double myAmount = Double.parseDouble(txtAmount.getText().toString());
  
            String TheModifiedClassname_Eng = myClassName.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
            		
            		try {
                this.connectToDB();
                 final PreparedStatement pstatement = this.connection.prepareStatement("SELECT fees_type FROM feesSpecification WHERE class =? AND session=? AND fees_type= 'SCHOOL FEES || REGISTRATION FEES || UNIFORM FEES BOOKS FEES || UTILITY FEES || EXAMINATION FEES || SPORTWEAR FEES' ");//AND fees_type= ?
                 pstatement.setString(1, myClassName);
                 pstatement.setString(2, mySession);
                // pstatement.setString(3, myDefinedfeesType);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                	
                	//++fees_dublicate_counter;
                	
                 	 final String TheregistredColumn = rs.getObject(1).toString();
                 	 if(TheregistredColumn.equalsIgnoreCase("SCHOOL FEES")) {
                  		 ++fees_dublicate_counter;
                  	 }else if(TheregistredColumn.equalsIgnoreCase("REGISTRATION FEES")){
                  		 ++fees_dublicate_counter;
                  	 }else if(TheregistredColumn.equalsIgnoreCase("UNIFORM FEES")){
                  		 ++fees_dublicate_counter;
                  	 }else if(TheregistredColumn.equalsIgnoreCase("BOOKS FEES")){
                  		 ++fees_dublicate_counter;
                  	 }else if(TheregistredColumn.equalsIgnoreCase("UTILITY FEES")){
                  		 ++fees_dublicate_counter;
                 	 }else if(TheregistredColumn.equalsIgnoreCase("EXAMINATION FEES")){
                  		 ++fees_dublicate_counter;
                 	 }else if(TheregistredColumn.equalsIgnoreCase("SPORTWEAR FEES")){
                 		 ++fees_dublicate_counter;
                  	 }else {
                  		 //do nothing
                  	 }
                	
                System.out.println("Error has occured: The Fees "+ myFeesType + "has been registered for this class!");
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            if (mySession.equals("Select Session")) {
                JOptionPane.showMessageDialog(null, "Please, select Session!", "Error in Session Sch Fess Spec", 0);
            }          
            else if (myFeesType.equals("SELECT FEES TYPE")) {
                JOptionPane.showMessageDialog(null, "Please, select Fees Type!!", "Error in Feestype Sch Fess Spec", 0);
            }
            else if (txtAmount.getText().toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Please, select Amount!", "Error in Fees_Amount Sch Fess Spec", 0);
            }
            
           else if (fees_dublicate_counter > 0) {
            JOptionPane.showMessageDialog(null, "This Fees has been registered for this Class, \n Pls, check your entries", "Error in Session Sch Fess Spec", 0);
           // viewTheCapturedRecord();//invoked, even when the insertion fails. this is because we want to show the existing record to the users
        }
            else {
            	 
                try {
                     final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO feesSpecification VALUES (?,?,?,?,?, now() )");
                    pstatement.setString(1, null);
                    pstatement.setString(2, mySession);
                    pstatement.setString(3, myClassName);
                    pstatement.setString(4, myFeesType);
                    pstatement.setDouble(5, myAmount);                   
                    pstatement.executeUpdate();
                     
                    JOptionPane.showMessageDialog(null, "  The  FEES TYPE: " + myFeesType + "\n  With AMOUNT:" + myAmount + " IS BEEN Captured. \n Thank you.");
                    pstatement.close();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();                    
                }
             
                viewTheCapturedRecord();//invoked  
            }
            //clearing some variables 
            txtAmount.setText("");
            //ComboFees.setSelectedItem("SELECT FEES TYPE");
            
            this.txtHomeWork.requestFocus();
            this.txtRegNum.setText("");
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
        else {
            this.remove(SaveButton);
        }
    }
    
    public void viewTheCapturedRecord() {
    	final String mySession = this.ComboSession.getSelectedItem().toString();
        final String myClassName = this.ComboClass.getSelectedItem().toString();
        
    	 this.data.setSize(0);
         this.columnNames.setSize(0);
         this.tableModel1.setRowCount(0);
         this.tableModel1.fireTableDataChanged();
         this.panel.validate();
         this.panel.repaint();
         this.TextArea.setText("");
         if (myClassName.equalsIgnoreCase("") || mySession.equalsIgnoreCase("")) {
             JOptionPane.showMessageDialog(null, "Pls, Class or Session not selected", "Error Occured", 0);
         }
         else {
             try {
                 this.connectToDB();
                 final String QueryString = "SELECT * FROM feesSpecification";
                 final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM feesSpecification");
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
             catch (Exception e2) {
                 System.out.println(e2);
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
         
         this.txtHomeWork.requestFocus();
         this.txtRegNum.setText("");
         this.table.repaint();
         this.table.revalidate();
         this.panel.validate();
         this.panel.repaint();
    }//end of the class
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) { 
    	
    	  final String mySession = this.ComboSession.getSelectedItem().toString();
          final String myClassName = this.ComboClass.getSelectedItem().toString();
    	
          String TheModifiedClassname_Eng = myClassName.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
            
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        
        
            try {
                this.connectToDB();
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM feesSpecification WHERE Session=? AND Class=? ");
                
                pstatement.setString(1, mySession);
                pstatement.setString(2, myClassName);
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
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        
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
            final String csc = (String)this.ComboSelecClass.getSelectedItem();
            if (csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0623") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0623\u0648\u0644\u0649 \u0628") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u062c") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0623") || csc.equals("\u0631\u064a\u0627\u0636 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0628") || csc.equals("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0623") || csc.equals("\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0623\u0637\u0641\u0627\u0644 \u0628") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0623") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0627\u0644\u0643\u0628\u064a\u0631\u0629 \u0628") || csc.equals("PRIMARY SIX") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0623") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0623\u0648\u0644\u0649 \u0627\u0644\u0635\u063a\u064a\u0631\u0629 \u0628") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629  \u0627\u0644\u0635\u063a\u0631\u0649")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u062d\u0631\u0648\u0641 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0623\u0628\u064a\u0627\u062a \u0627\u0644\u062a\u062c\u0648\u064a\u062f\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0639\u0644\u0645 \u0627\u0644\u062a\u062c\u0648\u064a\u062f");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062a\u0641\u0633\u064a\u0631");
            }
            else if (csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0645\u062a\u0648\u0633\u0637\u0629") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0643\u0628\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629 \u0627\u0644\u0635\u063a\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0631\u0627\u0628\u0639\u0629  \u0627\u0644\u0635\u063a\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0643\u0628\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u062e\u0627\u0645\u0633\u0629  \u0627\u0644\u0635\u063a\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0643\u0628\u0631\u0649") || csc.equals("\u0627\u0644\u062d\u0644\u0642\u0629 \u0627\u0644\u0633\u0627\u062f\u0633\u0629 \u0627\u0644\u0635\u063a\u0631\u0649")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645 \u062d\u0641\u0638\u0627");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0643\u062a\u0627\u0628\u0629");
                this.ComboSelectSubj.addItem("\u0639\u0644\u0648\u0645 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u062d\u0631\u0648\u0641 \u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u0639\u0644\u0645 \u0627\u0644\u062a\u062c\u0648\u064a\u062f");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062a\u0641\u0633\u064a\u0631");
            }
            else if (csc.equals("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0623") || csc.equals("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u0628") || csc.equals("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0643\u0628\u0631\u0649 \u062c") || csc.equals("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0623") || csc.equals("\u0627\u0644\u062d\u0636\u0627\u0646\u0629 \u0627\u0644\u0635\u063a\u0631\u0649 \u0628") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0623") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u0628") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062c") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u0623\u0648\u0644\u064a \u062f") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0623") || csc.equals("\u0627\u0644\u0631\u0648\u0636\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629 \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0643\u0628\u064a\u0631 \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u0635\u063a\u064a\u0631 \u0628")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062d\u0631\u0648\u0641");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0639\u062f\u062f");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0623\u0630\u0643\u0627\u0631");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0643\u062a\u0627\u0628\u0629");
            }
            else if (csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0646\u064a \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062b\u0627\u0644\u062b \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0631\u0627\u0628\u0639 \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u062e\u0627\u0645\u0633 \u0628") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0623") || csc.equals("\u0627\u0644\u0641\u0635\u0644 \u0627\u0644\u0633\u0627\u062f\u0633 \u0628") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0623\u0648\u0644") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0646\u064a") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062b\u0627\u0644\u062b") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0631\u0627\u0628\u0639") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u062e\u0627\u0645\u0633") || csc.equals("\u0641\u0635\u0644  \u0627\u0644\u0623\u0645\u0647\u0627\u062a \u0627\u0644\u0633\u0627\u062f\u0633")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062d\u062f\u064a\u062b");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062a\u0648\u062d\u064a\u062f");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0641\u0642\u0647");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0646\u062d\u0648");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0625\u0646\u0634\u0627\u0621");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0623\u0630\u0643\u0627\u0631");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0625\u0645\u0644\u0627\u0621");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062e\u0637");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062d\u0631\u0648\u0641");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0635\u0631\u0641");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0645\u0637\u0627\u0644\u0639\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0633\u064a\u0631\u0629");
            }
            else if (csc.equals("\u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u062a\u0648\u0633\u0637") || csc.equals("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u0645\u062a\u0648\u0633\u0637") || csc.equals("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u0645\u062a\u0648\u0633\u0637") || csc.equals("\u0627\u0644\u0623\u0648\u0644 \u0627\u0644\u062b\u0627\u0646\u0648\u064a") || csc.equals("\u0627\u0644\u062b\u0627\u0646\u064a \u0627\u0644\u062b\u0627\u0646\u0648\u064a") || csc.equals("\u0627\u0644\u062b\u0627\u0644\u062b \u0627\u0644\u062b\u0627\u0646\u0648\u064a")) {
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0642\u0631\u0622\u0646 \u0627\u0644\u0643\u0631\u064a\u0645");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062d\u062f\u064a\u062b");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062a\u0648\u062d\u064a\u062f");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0641\u0642\u0647");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0646\u062d\u0648");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0625\u0646\u0634\u0627\u0621");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0623\u0630\u0643\u0627\u0631");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0625\u0645\u0644\u0627\u0621");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062e\u0637");
                this.ComboSelectSubj.addItem("\u0627\u0644\u062d\u0631\u0648\u0641");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0635\u0631\u0641");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0645\u0637\u0627\u0644\u0639\u0629");
                this.ComboSelectSubj.addItem("\u0627\u0644\u0633\u064a\u0631\u0629");
            }
            else {
                this.ComboSelectSubj.setSelectedItem("SELECT SUBJECT");
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
    
    public void ComboClassMethod(final ActionEvent evt11) {
		final String ClassName_Ara = this.ComboClass.getSelectedItem().toString();
		String myClass = "";
		try {
			 
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
