import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class SubQueryWindow extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnStudRegQueryWindow;
    private JButton btnStaffRegQueryWindow;
    private JButton btnEvaAndContAssQuery;
    private JButton btnReportSheetOutputType2;
    private JButton btnFirstCAQuery;
    private JButton btnSecondCAQuery;
    private JButton btnThirdCAQueryWindows;
    private JButton btnClose;
    private JButton btnExamQueryWindow;
    
    public void SubQueryWindow() {
        this.panel = new JPanel();
        this.btnStudRegQueryWindow = new JButton("STUDENT QUERY OUTPUT WINDOW");
        this.btnStaffRegQueryWindow = new JButton("STAFF QUERY OUTPUT WINDOW");
        this.btnEvaAndContAssQuery = new JButton("EVALUATIONS AND CONT. ASSESMT. WINDOW");
        this.btnReportSheetOutputType2 = new JButton("REPORTSHEET OUTPUT TYPE [II]");
        this.btnFirstCAQuery = new JButton("1ST C.A. QUERY WINDOW");
        this.btnSecondCAQuery = new JButton("2ND C.A. QUERY WINDOWS");
        this.btnThirdCAQueryWindows = new JButton("3RD C.A. QUERY WINDOWS");
        this.btnExamQueryWindow = new JButton("EXAM QUERY WINDOW");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(850, 120);
        this.setTitle("Sub Query Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        final JPanel panel = this.panel;
        final Color green = Color.green;
        panel.setBackground(Color.red.darker());
        this.btnStudRegQueryWindow.setBackground(Color.black);
        this.btnStudRegQueryWindow.setForeground(Color.white);
        this.btnStaffRegQueryWindow.setForeground(Color.white);
        this.btnStaffRegQueryWindow.setBackground(Color.black);
        this.btnEvaAndContAssQuery.setBackground(Color.black);
        this.btnEvaAndContAssQuery.setForeground(Color.white);
        this.btnReportSheetOutputType2.setBackground(Color.black);
        this.btnReportSheetOutputType2.setForeground(Color.pink);
        this.btnFirstCAQuery.setBackground(Color.black);
        this.btnFirstCAQuery.setForeground(Color.red);
        this.btnSecondCAQuery.setBackground(Color.black);
        this.btnSecondCAQuery.setForeground(Color.red);
        this.btnThirdCAQueryWindows.setBackground(Color.black);
        this.btnThirdCAQueryWindows.setForeground(Color.red);
        this.btnExamQueryWindow.setBackground(Color.black);
        this.btnExamQueryWindow.setForeground(Color.red);
        this.btnClose.setBackground(Color.white);
        this.btnClose.setForeground(Color.black.darker());
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnStudRegQueryWindow);
        Buttogrp1.add(this.btnStaffRegQueryWindow);
        Buttogrp1.add(Box.createVerticalStrut(10));
        Buttogrp1.add(this.btnEvaAndContAssQuery);
        Buttogrp1.add(Box.createVerticalStrut(10));
        this.addItem(this.panel, Buttogrp1, 0, 0, 1, 1, 10);
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnFirstCAQuery);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnSecondCAQuery);
        Buttogrp2.add(Box.createVerticalStrut(10));
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 3, 0, 1, 1, 10);
        final Box ExamQueryButton = Box.createHorizontalBox();
        ExamQueryButton.add(this.btnExamQueryWindow);
        ExamQueryButton.add(Box.createVerticalStrut(10));
        this.btnStudRegQueryWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubQueryWindow.this.btnStudRegQueryWindowthod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubQueryWindow.this.btnCloseMethod(evt2);
            }
        });
        this.btnEvaAndContAssQuery.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubQueryWindow.this.btnEvaAndContAssQueryMethod(evt3);
            }
        });
        this.btnFirstCAQuery.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubQueryWindow.this.btnFirstCAQueryMethod(evt4);
            }
        });
        this.btnSecondCAQuery.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                SubQueryWindow.this.btnSecondCAQueryMethod(evt5);
            }
        });
        this.btnThirdCAQueryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubQueryWindow.this.btnThirdCAQueryWindowsMethod(evt6);
            }
        });
        this.btnStaffRegQueryWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SubQueryWindow.this.btnStaffRegQueryWindowthod(evt7);
            }
        });
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
    
    public void btnStudRegQueryWindowthod(final ActionEvent evt1) {
        final StudRegQuery SQW = new StudRegQuery();
        SQW.StudRegQuery();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnReportSheetOutputType1Method(final ActionEvent evt3) {
        final ReportSheet RS1 = new ReportSheet();
        RS1.ReportSheet();
    }
    
    public void btnEvaAndContAssQueryMethod(final ActionEvent evt3) {
        final EvaAndContAssQuery ecq = new EvaAndContAssQuery();
        ecq.EvaAndContAssQuery();
    }
    
    public void btnFirstCAQueryMethod(final ActionEvent evt4) {
        final FirstCAQuery FCA = new FirstCAQuery();
        FCA.FirstCAQuery();
    }
    
    public void btnSecondCAQueryMethod(final ActionEvent evt5) {
        final SecondCAQuery sat = new SecondCAQuery();
        sat.SecondCAQuery();
    }
    
    public void btnThirdCAQueryWindowsMethod(final ActionEvent evt6) {
        final ThirdCAQuery tCA = new ThirdCAQuery();
        tCA.ThirdCAQuery();
    }
    
    public void btnStaffRegQueryWindowthod(final ActionEvent evt7) {
        final StaffRegQuery SRQ = new StaffRegQuery();
        SRQ.StaffRegQuery();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
