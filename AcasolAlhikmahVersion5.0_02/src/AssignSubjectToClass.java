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
import javax.swing.JComponent;
import javax.swing.Box;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
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
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class AssignSubjectToClass extends JFrame
{
    private static final long serialVersionUID = 1L;
    int acctCounter;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private String subjectEng;
    private JComboBox ComboSession;
    private JLabel lblSession;
    private JLabel lblClassId;
    private JLabel lblSubectAssignmentSection;
    private JLabel lblSubjectId;
    private JLabel lblSubject_Ara;
    private JLabel lblSubject_Eng;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblClass_English;
    private JLabel lblSection;
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
    private JTextField txtClassID;
    private JTextField txtClass_Eng;
    private JTextField txtClass_Ara;
    private JTextField txtSubjectID;
    private JTextField txtSubject_Eng;
    private JTextField txtSubject_Ara;
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
    private JComboBox ComboSection;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox comboTest;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnAssign;
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
    private JButton btnSearchClass;
    private JButton btnSearchSubject;
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
    
    public AssignSubjectToClass() {
        this.acctCounter = 0;
        this.tablefont = new Font("null", 1, 14);
        this.f = new Font("Arial Unicode MS", 1, 18);
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void AssignSubjectToClass() {
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
        this.lblSection = new JLabel("SECTION:");
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
        this.txtClass = new JTextField(20);
        this.txtClassID = new JTextField(4);
        this.txtClass_Eng = new JTextField(22);
        this.txtClass_Ara = new JTextField(22);
        this.txtSubjectID = new JTextField(4);
        this.txtSubject_Eng = new JTextField(22);
        this.txtSubject_Ara = new JTextField(22);
        this.txtClassID.setFont(this.f);
        this.txtClass_Eng.setFont(this.f);
        this.txtClass_Ara.setFont(this.f);
        this.txtClass_Eng.setEditable(false);
        this.txtClass_Ara.setEditable(false);
        this.txtSubjectID.setFont(this.f);
        this.txtSubject_Eng.setFont(this.f);
        this.txtSubject_Ara.setFont(this.f);
        this.txtSubject_Eng.setEditable(false);
        this.txtSubject_Ara.setEditable(false);
        this.txtClass.setEditable(false);
        this.txtName.setEditable(false);
        this.txtID.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtName.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtClass.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.lblSession = new JLabel("SESSION:");
        this.lblClassId = new JLabel("CLASS ID:");
        (this.lblSubectAssignmentSection = new JLabel("---- SUBJECT ASSIGNMENT SECTION ------")).setBackground(Color.RED.darker());
        this.lblSubectAssignmentSection.setForeground(Color.blue.brighter());
        this.lblSubectAssignmentSection.setFont(this.f);
        this.lblSubjectId = new JLabel("SUBJECT ID:");
        this.lblSubject_Ara = new JLabel("SUBJECT Ara:");
        this.lblSubject_Eng = new JLabel("SUBJECT Eng:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.addItem("2017/2018");
        this.ComboSession.addItem("2018/2019");
        this.ComboSession.addItem("2019/2020");
        this.ComboSession.addItem("2020/2021");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(this.f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        (this.ComboSelecClass_English = new JComboBox()).setEditable(true);
        this.ComboSelecClass_English.setFont(this.f);
        this.ComboSelecClass_English.addItem("SELECT CLASS_ENLISH");
        this.ComboSelecClass_English.addItem("studentreghadanatuladfala");
        this.ComboSelecClass_English.addItem("studentreghadanatuladfalb");
        this.ComboSelecClass_English.addItem("studentregriyadulquranululaha");
        this.ComboSelecClass_English.addItem("studentregriyadulquranululahb");
        this.ComboSelecClass_English.addItem("studentregriyadulquranulsaniyaha");
        this.ComboSelecClass_English.addItem("studentregriyadulquranulsaniyahb");
        this.ComboSelecClass_English.addItem("studentregriyadulquranulsaniyahc");
        this.ComboSelecClass_English.addItem("studentregriyadulquranulsalisaha");
        this.ComboSelecClass_English.addItem("studentregriyadulquranulsalisahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatululahalsagiraha");
        this.ComboSelecClass_English.addItem("studentreghalaqatululahalsagirahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatululahalkabeeraa");
        this.ComboSelecClass_English.addItem("studentreghalaqatululahalkabeerab");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsaniyaha");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsaniyahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsalisaha");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsalisahm");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsalisahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatulrabiaha");
        this.ComboSelecClass_English.addItem("studentreghalaqatulrabiahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatulkhamisaha");
        this.ComboSelecClass_English.addItem("studentreghalaqatulkhamisahb");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsadisaha");
        this.ComboSelecClass_English.addItem("studentreghalaqatulsadisahb");
        this.ComboSelecClass_English.addItem("studentreghadanatulsugraha");
        this.ComboSelecClass_English.addItem("studentreghadanatulsugrahb");
        this.ComboSelecClass_English.addItem("studentreghadanatulkubraha");
        this.ComboSelecClass_English.addItem("studentreghadanatulkubrahb");
        this.ComboSelecClass_English.addItem("studentreghadanatulkubrahc");
        this.ComboSelecClass_English.addItem("studentregraudatululaha");
        this.ComboSelecClass_English.addItem("studentregraudatululahb");
        this.ComboSelecClass_English.addItem("studentregraudatululahc");
        this.ComboSelecClass_English.addItem("studentregraudatululahd");
        this.ComboSelecClass_English.addItem("studentregraudatulsaniyaha");
        this.ComboSelecClass_English.addItem("studentregraudatulsaniyahb");
        this.ComboSelecClass_English.addItem("studentregfaslulauwalussagira");
        this.ComboSelecClass_English.addItem("studentregfaslulauwalussagirb");
        this.ComboSelecClass_English.addItem("studentregfaslulauwalulkabira");
        this.ComboSelecClass_English.addItem("studentregfaslulauwalulkabirb");
        this.ComboSelecClass_English.addItem("studentregfaslussania");
        this.ComboSelecClass_English.addItem("studentregfaslussanib");
        this.ComboSelecClass_English.addItem("studentregfaslussalisa");
        this.ComboSelecClass_English.addItem("studentregfaslussalisb");
        this.ComboSelecClass_English.addItem("studentregfaslurrabiia");
        this.ComboSelecClass_English.addItem("studentregfaslurrabiib");
        this.ComboSelecClass_English.addItem("studentregfaslulkhamisa");
        this.ComboSelecClass_English.addItem("studentregfaslulkhamisb");
        this.ComboSelecClass_English.addItem("studentregfaslussadisa");
        this.ComboSelecClass_English.addItem("studentregfaslussadisb");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatalauwal");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatassani");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatassalis");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatarrabii");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatalkamis");
        this.ComboSelecClass_English.addItem("studentregfaslulummahatassadis");
        (this.ComboSelecClass = new JComboBox()).setFont(this.f);
        this.ComboSelecClass.addItem("SELECT CLASS");
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
        this.ComboSection = new JComboBox();
        (this.ComboSection = new JComboBox()).addItem("SELECT SECTION");
        this.ComboSection.addItem("TAHFEEZ");
        this.ComboSection.addItem("ISLAMIYYA");
        this.ComboSection.addItem("UMMAHAT");
        this.ComboSection.addItem("MUWASSIT");
        this.ComboSection.setEditable(true);
        this.ComboSection.setFont(this.f);
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
        this.btnPreview = new JButton("Preview");
        this.btnSave = new JButton("Register");
        this.btnAssign = new JButton("Assign");
        this.btnDeregister = new JButton("Deregister");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnSave.setFont(this.f);
        this.btnPrint.setFont(this.f);
        this.btnPreview.setFont(this.f);
        this.btnDeregister.setFont(this.f);
        this.btnAssign.setFont(this.f);
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REGISTRATION NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
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
        this.btnSearchClass = new JButton("Search For Class");
        this.btnSearchSubject = new JButton("Search For Subject");
        this.btnSearchClass.setFont(this.f);
        this.btnSearchSubject.setFont(this.f);
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
        this.setSize(855, 599);
        this.setTitle("[AcasolV5.0_02] Assign Subject To Classes");
        this.add(this.panel);
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLUE);
        this.btnSave.setForeground(Color.WHITE);
        this.btnAssign.setBackground(Color.BLUE);
        this.btnAssign.setForeground(Color.WHITE);
        this.btnDeregister.setForeground(Color.RED);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.BLACK);
        this.btnPreview.setForeground(Color.CYAN);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.BLACK);
        this.btnNext.setForeground(Color.CYAN);
        this.btnSearchClass.setBackground(Color.BLUE);
        this.btnSearchClass.setForeground(Color.WHITE);
        this.btnSearchSubject.setBackground(Color.GREEN.darker());
        this.btnSearchSubject.setForeground(Color.WHITE);
        this.btnPrevious.setBackground(Color.green);
        final Box SearchBox = Box.createHorizontalBox();
        SearchBox.add(this.txtClassID);
        SearchBox.add(Box.createHorizontalStrut(20));
        SearchBox.add(this.btnSearchClass);
        SearchBox.add(Box.createHorizontalStrut(3));
        this.addItem(this.panel, this.lblClassId, 0, 1, 1, 1, 13);
        this.addItem(this.panel, SearchBox, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblClass_English, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.txtClass_Eng, 1, 4, 2, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.txtClass_Ara, 1, 5, 1, 1, 17);
        this.addItem(this.panel, this.lblSubectAssignmentSection, 0, 6, 3, 1, 10);
        final Box SubjectIdBox = Box.createHorizontalBox();
        SubjectIdBox.add(Box.createHorizontalStrut(5));
        SubjectIdBox.add(this.txtSubjectID);
        SubjectIdBox.add(Box.createHorizontalStrut(5));
        SubjectIdBox.add(this.btnSearchSubject);
        this.addItem(this.panel, this.lblSubjectId, 0, 7, 1, 1, 13);
        this.addItem(this.panel, SubjectIdBox, 1, 7, 1, 1, 17);
        this.addItem(this.panel, this.lblSubject_Eng, 0, 8, 1, 1, 13);
        this.addItem(this.panel, this.txtSubject_Eng, 1, 8, 1, 1, 17);
        this.addItem(this.panel, this.lblSubject_Ara, 0, 9, 1, 1, 13);
        this.addItem(this.panel, this.txtSubject_Ara, 1, 9, 1, 1, 17);
        this.addItem(this.panel, paneScrollPane, 1, 11, 3, 3, 10);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(this.btnDeregister);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnAssign);
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
                AssignSubjectToClass.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                AssignSubjectToClass.this.btnClearMethod(evt2);
            }
        });
        this.btnSearchClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.btnSearchClassMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.btnNextMethod(evt4);
            }
        });
        this.btnAssign.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.btnAssignMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                AssignSubjectToClass.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                AssignSubjectToClass.this.btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.btnPreviousMethod(evt8);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.ComboSelecClassMethod(evt9);
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
        this.txtSubjectID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    AssignSubjectToClass.this.btnAssign.doClick();
                }
            }
        });
        this.txtClassID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    AssignSubjectToClass.this.btnSearchClass.doClick();
                }
            }
        });
        this.txtSubjectID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 18) {
                    AssignSubjectToClass.this.btnSearchSubject.doClick();
                }
            }
        });
        this.txtExamMarks.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 32) {
                    AssignSubjectToClass.this.btnNext.doClick();
                }
            }
        });
        this.btnDeregister.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                AssignSubjectToClass.this.btnDeregisterMethod(evt10);
            }
        });
        this.btnSearchSubject.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                AssignSubjectToClass.this.connectToDB();
                AssignSubjectToClass.this.btnSearchSubjectMethod(evt11);
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
    
    public void btnSearchClassMethod(final ActionEvent e3) {
        this.txtID.setText("");
        this.txtClass_Eng.setText("");
        this.txtClass_Ara.setText("");
        final String MyClassId = this.txtClassID.getText().toString();
        final String myClassName_Eng = this.txtClass_Eng.getText().toString();
        final String myClassName_Arabic = this.txtClass_Ara.getText().toString();
        final String mySection = this.ComboSection.getSelectedItem().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String ClassStatus = "Active";
        final String TheClassName_Eng = "";
        final String TheClassName_Arabic = "";
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        final int searchCounter = 0;
        if (MyClassId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, Supply Class Name!", "Error Occured", 0);
        }
        else {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng,Classname_Ara FROM class_regsitration WHERE ClassID=? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Classname_Eng,Classname_Ara FROM class_regsitration WHERE ClassID=? ");
                pstatement.setString(1, MyClassId);
                final ResultSet rs = pstatement.executeQuery();
                final ResultSetMetaData md = rs.getMetaData();
                final int columns = md.getColumnCount();
                for (int i = 1; i <= columns; ++i) {
                    this.columnNames.addElement(md.getColumnName(i));
                }
                while (rs.next()) {
                    final String ClassName_Eng = rs.getString(1).toString();
                    this.txtClass_Eng.setText(ClassName_Eng);
                    final String ClassName_Ara = rs.getString(2).toString();
                    this.txtClass_Ara.setText(ClassName_Ara);
                    final Vector row = new Vector(columns);
                    for (int j = 1; j <= columns; ++j) {
                        row.addElement(rs.getObject(j));
                    }
                    this.data.addElement(row);
                }
                rs.close();
                pstatement.close();
                this.connection.close();
            }
            catch (Exception e4) {
                System.out.println(e4);
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
    
    public void btnSearchSubjectMethod(final ActionEvent e11) {
        this.txtSubject_Eng.setText("");
        this.txtSubject_Ara.setText("");
        final String MySubjectId = this.txtSubjectID.getText().toString();
        final String mySubject_Eng = this.txtSubject_Eng.getText().toString();
        final String mySubject_Arabic = this.txtSubject_Ara.getText().toString();
        final String mySection = this.ComboSection.getSelectedItem().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String ClassStatus = "Active";
        final String TheClassName_Eng = "";
        final String TheClassName_Arabic = "";
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        final int searchCounter = 0;
        if (MySubjectId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, Supply ClassId!", "Error Occured", 0);
        }
        else {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Subject_Eng,Subject_Ara FROM subject_regsitration WHERE SubjectID=? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Subject_Eng,Subject_Ara FROM subject_regsitration WHERE SubjectID=? ");
                pstatement.setString(1, MySubjectId);
                final ResultSet rs = pstatement.executeQuery();
                final ResultSetMetaData md = rs.getMetaData();
                final int columns = md.getColumnCount();
                for (int i = 1; i <= columns; ++i) {
                    this.columnNames.addElement(md.getColumnName(i));
                }
                while (rs.next()) {
                    final String SubjectName_Eng = rs.getString(1).toString();
                    this.txtSubject_Eng.setText(SubjectName_Eng);
                    final String SubjectName_Ara = rs.getString(2).toString();
                    this.txtSubject_Ara.setText(SubjectName_Ara);
                    final Vector row = new Vector(columns);
                    for (int j = 1; j <= columns; ++j) {
                        row.addElement(rs.getObject(j));
                    }
                    this.data.addElement(row);
                }
                rs.close();
                pstatement.close();
            }
            catch (Exception e12) {
                System.out.println(e12);
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
            final String myClassId = this.txtClassID.getText().toString();
            final String myClassName_Eng = this.txtClass_Eng.getText().toString();
            final String myClassName_Ara = this.txtClass_Ara.getText().toString();
            final String mySubjectId = this.txtSubjectID.getText().toString();
            final String mySubject_Eng = this.txtSubject_Eng.getText().toString();
            final String mySubject_Ara = this.txtSubject_Ara.getText().toString();
            final String mySection = this.ComboSection.getSelectedItem().toString();
            final String mySession = this.ComboSession.getSelectedItem().toString();
            final String ClassStatus = "Active";
            final String TheClassName_Eng = "";
            final String TheClassName_Arabic = "";
            int counterForDeletion = 0;
            if (myClassId.equals("")) {
                JOptionPane.showMessageDialog(null, "Please, Supply Class", "Error in Occured", 0);
            }
            else if (mySubjectId.equals("SELECT CLASS_ENLISH")) {
                JOptionPane.showMessageDialog(null, "Please, Subject ID", "Error in Occured", 0);
            }
            else {
                try {
                    this.connectToDB();
                    final String QueryString = "SELECT Classname_Ara,Classname_Eng FROM assign_subject WHERE ClassID =? AND SubjectID =? ";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Classname_Ara,Classname_Eng FROM assign_subject WHERE ClassID =? AND SubjectID =? ");
                    pstatement.setString(1, myClassId);
                    pstatement.setString(2, mySubjectId);
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
                if (mySubject_Eng.equalsIgnoreCase("") || mySubject_Ara.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Pls, Subject_Eng OR Subject_Arabic not selected", "Error Occured", 0);
                }
                else if (counterForDeletion <= 0) {
                    JOptionPane.showMessageDialog(null, "The Selected Subject does NOT EXIST inside the Databse!", "Error Occured", 0);
                }
                else {
                    try {
                        this.connectToDB();
                        final String QueryString = "DELETE FROM assign_subject WHERE ClassID =? AND SubjectID =?  ";
                        final PreparedStatement pstatement = this.connection.prepareStatement("DELETE FROM assign_subject WHERE ClassID =? AND SubjectID =?  ");
                        pstatement.setString(1, myClassId);
                        pstatement.setString(2, mySubjectId);
                        pstatement.executeUpdate();
                        pstatement.close();
                        JOptionPane.showMessageDialog(null, "  The  Subject: \n " + mySubject_Ara + "\n" + " is been DELETED FROM: " + myClassName_Ara + "\n");
                    }
                    catch (SQLException a) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                        a.printStackTrace();
                    }
                    try {
                        this.connectToDB();
                        final String QueryString = "SELECT * FROM assign_subject WHERE ClassID = ? ";
                        final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM assign_subject WHERE ClassID = ? ");
                        pstatement.setString(1, myClassId);
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
    
    public void btnAssignMethod(final ActionEvent evt5) {
        this.btnSearchSubjectMethod(evt5);
        this.btnSearchClassMethod(evt5);
        final int SaveButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to 'Assign Subject'?", "Registration Confirmation Window", 0);
        if (SaveButton == 0) {
            final String myClassId = this.txtClassID.getText().toString();
            final String myClassName_Eng = this.txtClass_Eng.getText().toString();
            final String myClassName_Ara = this.txtClass_Ara.getText().toString();
            final int searchCounter = 0;
            final String mySubjectId = this.txtSubjectID.getText().toString();
            final String mySubject_Eng = this.txtSubject_Eng.getText().toString();
            final String mySubject_Ara = this.txtSubject_Ara.getText().toString();
            String TheClassID = "";
            String TheSubjectID = "";
            String TheCheckedClassID = "";
            final String TheCheckedSubjectID = "";
            final String TheCheckClassName_Eng = "";
            final String TheCheckClassName_Ara = "";
            final String TheCheckSubject_Eng = "";
            final String TheCheckSubject_Ara = "";
            try {
                this.connectToDB();
                final String QueryString = "SELECT ClassID FROM class_regsitration WHERE Classname_Eng = ? AND Classname_Ara = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ClassID FROM class_regsitration WHERE Classname_Eng = ? AND Classname_Ara = ?");
                pstatement.setString(1, myClassName_Eng);
                pstatement.setString(2, myClassName_Ara);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    TheCheckedClassID = rs.getString(1);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                this.connectToDB();
                final String QueryString = "SELECT SubjectID FROM subject_regsitration WHERE Subject_Eng = ? AND Subject_Ara = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SubjectID FROM subject_regsitration WHERE Subject_Eng = ? AND Subject_Ara = ?");
                pstatement.setString(1, mySubject_Eng);
                pstatement.setString(2, mySubject_Ara);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    TheCheckedClassID = rs.getString(1);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                this.connectToDB();
                final String QueryString = "SELECT ClassID,SubjectID FROM assign_subject WHERE ClassID =? AND SubjectID =?  ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ClassID,SubjectID FROM assign_subject WHERE ClassID =? AND SubjectID =?  ");
                pstatement.setString(1, myClassId);
                pstatement.setString(2, mySubjectId);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    TheClassID = rs.getString(1);
                    TheSubjectID = rs.getString(2);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            if (myClassId.equals("")) {
                JOptionPane.showMessageDialog(null, "Please, select ClassID!", "Error Occured", 0);
            }
            else if (mySubjectId.equals("")) {
                JOptionPane.showMessageDialog(null, "Please, select SubjectID!", "Error Occured", 0);
            }
            else if (!TheCheckedClassID.equals(mySubjectId)) {
                JOptionPane.showMessageDialog(null, "Wrong 'Class_ID' !\n Make sure that Class_ID corresponds with the ClassName!", "Error Occured", 0);
            }
            else if (!TheCheckedClassID.equals(mySubjectId)) {
                JOptionPane.showMessageDialog(null, "Wrong 'Subject_ID' !\n Make sure that Subject_ID corresponds with the Subject", "Error Occured", 0);
            }
            else if (myClassId.equalsIgnoreCase(TheClassID) && myClassId.equalsIgnoreCase(TheClassID)) {
                JOptionPane.showMessageDialog(null, "Error: This SUBJECT Has been assigned! ", "Error Occured", 0);
            }
            else {
                try {
                    final String InsertQueryString = "INSERT INTO assign_subject (ClassID,SubjectID,Classname_Eng,Classname_Ara,Subject_Eng,Subject_Ara)VALUES (?,?,?,?,?,?) ";
                    final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO assign_subject (ClassID,SubjectID,Classname_Eng,Classname_Ara,Subject_Eng,Subject_Ara)VALUES (?,?,?,?,?,?) ");
                    pstatement.setString(1, myClassId);
                    pstatement.setString(2, mySubjectId);
                    pstatement.setString(3, myClassName_Eng);
                    pstatement.setString(4, myClassName_Ara);
                    pstatement.setString(5, mySubject_Eng);
                    pstatement.setString(6, mySubject_Ara);
                    pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "  The  Subject: " + mySubject_Ara + "\n has been ASSIGNED TO: " + myClassName_Ara);
                    pstatement.close();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();
                }
                this.data.setSize(0);
                this.columnNames.setSize(0);
                this.tableModel1.setRowCount(0);
                this.tableModel1.fireTableDataChanged();
                this.panel.validate();
                this.panel.repaint();
                this.TextArea.setText("");
                if (myClassId.equalsIgnoreCase("") || mySubjectId.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Pls, ClassID OR SubjectID not selected", "Error Occured", 0);
                }
                else {
                    try {
                        this.connectToDB();
                        final String QueryString = "SELECT * FROM assign_subject WHERE ClassID = ? ";
                        final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM assign_subject WHERE ClassID = ? ");
                        pstatement.setString(1, myClassId);
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
            }
            this.txtSubjectID.requestFocus();
            this.txtRegNum.setText("");
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
        else {
            this.remove(SaveButton);
        }
        this.txtSubjectID.setText("");
        this.txtSubject_Eng.setText("");
        this.txtSubject_Ara.setText("");
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        final String myClassId = this.txtClassID.getText().toString();
        final String myClassName_Eng = this.txtClass_Eng.getText().toString();
        final String myClassName_Ara = this.txtClass_Ara.getText().toString();
        final int searchCounter = 0;
        final String mySubjectId = this.txtSubjectID.getText().toString();
        final String mySubject_Eng = this.txtSubject_Eng.getText().toString();
        final String mySubject_Ara = this.txtClass_Ara.getText().toString();
        final String ClassStatus = "Active";
        final String TheClassName_Eng = "";
        final String TheClassName_Arabic = "";
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        if (myClassId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, supply ClassID !", "Error Occured", 0);
        }
        else {
            try {
                this.connectToDB();
                final String QueryString = "SELECT * FROM assign_subject WHERE ClassID = ? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM assign_subject WHERE ClassID = ? ");
                pstatement.setString(1, myClassId);
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
}
