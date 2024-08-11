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

public class SubOutputWindow extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnCAOutputWindow;
    private JButton btnReportSheetOutputType1;
    private JButton btnReportSheetOutputType2;
    private JButton btnReportSheetOutputType3;
    private JButton btnReportSheetOutputTypeMut;
    private JButton btnReportSheetOutputType4;
    private JButton btnReportSheetOutputType5;
    private JButton btnReportSheetOutputType6;
    private JButton btnReportSheetOutputType7;
    private JButton btnReportSheetOutputType8;
    private JButton btnReportSheetOutputType9;
    private JButton btnReportSheetOutputForNusery;
    private JButton btnReportSheetOutputForNuseryConventional;
    private JButton btnReportOrOutputWindows;
    private JButton btnEditingWindows;
    private JButton btnQueryWindows;
    private JButton btnClose;
    
    public void SubOutputWindow() {
        this.panel = new JPanel();
        this.btnCAOutputWindow = new JButton("C.A. OUTPUT WINDOW");
        this.btnReportSheetOutputType1 = new JButton("REPORTSHEET NURSERY & PRIMARY SECTION");
        this.btnReportSheetOutputType2 = new JButton("TAH [II]");
        this.btnReportSheetOutputType3 = new JButton("TAH [III]");
        this.btnReportSheetOutputTypeMut = new JButton("MUTAWASSIT");
        this.btnReportSheetOutputType4 = new JButton("REPORTSHEET- JSS SECTION");
        this.btnReportSheetOutputType5 = new JButton("ISL [II]");
        this.btnReportSheetOutputType6 = new JButton("ISL [III]");
        this.btnReportSheetOutputType7 = new JButton("REPORTSHEET- SSS SECTION");
        this.btnReportSheetOutputType8 = new JButton("REPORTSHEET- SSS");
        this.btnReportSheetOutputType9 = new JButton("UMM [III]");
        this.btnReportSheetOutputForNusery = new JButton("REPORTSHEET [Nusery_Islamiyya]");
        this.btnReportSheetOutputForNuseryConventional = new JButton("REPORTSHEET [Nusery_Conv.]");
        this.btnReportOrOutputWindows = new JButton("OUTPUT WINDOWS");
        this.btnEditingWindows = new JButton("EDITING WINDOWS");
        this.btnQueryWindows = new JButton("QUERY WINDOWS");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(760, 110);
        this.setTitle("Sub Output Window - For Acasol Application");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        final JPanel panel = this.panel;
        final Color green = Color.green;
        panel.setBackground(Color.red.darker());
        this.btnCAOutputWindow.setBackground(Color.black);
        this.btnCAOutputWindow.setForeground(Color.green.darker());
        this.btnReportSheetOutputType1.setBackground(Color.black);
        this.btnReportSheetOutputType1.setForeground(Color.pink);
        this.btnReportSheetOutputType2.setBackground(Color.black);
        this.btnReportSheetOutputType2.setForeground(Color.pink);
        this.btnReportSheetOutputType3.setBackground(Color.black);
        this.btnReportSheetOutputType3.setForeground(Color.pink);
        this.btnReportSheetOutputType4.setBackground(Color.black);
        this.btnReportSheetOutputType4.setForeground(Color.CYAN.brighter());
        this.btnReportSheetOutputTypeMut.setBackground(Color.black);
        this.btnReportSheetOutputTypeMut.setForeground(Color.CYAN.brighter());
        this.btnReportSheetOutputTypeMut.setBackground(Color.LIGHT_GRAY);
        this.btnReportSheetOutputTypeMut.setForeground(Color.RED);
        this.btnReportSheetOutputType5.setBackground(Color.black);
        this.btnReportSheetOutputType5.setForeground(Color.CYAN.brighter());
        this.btnReportSheetOutputType6.setBackground(Color.black);
        this.btnReportSheetOutputType6.setForeground(Color.CYAN.brighter());
        this.btnReportSheetOutputType7.setBackground(Color.black);
        this.btnReportSheetOutputType7.setForeground(Color.WHITE);
        this.btnReportSheetOutputType8.setBackground(Color.black);
        this.btnReportSheetOutputType8.setForeground(Color.WHITE);
        this.btnReportSheetOutputType9.setBackground(Color.black);
        this.btnReportSheetOutputType9.setForeground(Color.WHITE);
        this.btnReportSheetOutputForNusery.setBackground(Color.black);
        this.btnReportSheetOutputForNusery.setForeground(Color.GRAY);
        this.btnReportSheetOutputForNuseryConventional.setBackground(Color.black);
        this.btnReportSheetOutputForNuseryConventional.setForeground(Color.GRAY);
        this.btnReportOrOutputWindows.setBackground(Color.black);
        this.btnReportOrOutputWindows.setForeground(Color.pink);
        this.btnEditingWindows.setBackground(Color.black);
        this.btnEditingWindows.setForeground(Color.red);
        this.btnQueryWindows.setBackground(Color.black);
        this.btnQueryWindows.setForeground(Color.red);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.red);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(Box.createVerticalStrut(10));
        Buttogrp1.add(this.btnReportSheetOutputType1);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(this.btnReportSheetOutputType4);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(this.btnReportSheetOutputTypeMut);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(this.btnReportSheetOutputType7);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(Box.createVerticalStrut(30));
        this.addItem(this.panel, Buttogrp1, 0, 0, 1, 1, 10);
        this.addItem(this.panel, this.btnClose, 1, 0, 1, 1, 13);
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnReportOrOutputWindows);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnEditingWindows);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnQueryWindows);
        this.btnCAOutputWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubOutputWindow.this.btnCAOutputWindowMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubOutputWindow.this.btnCloseMethod(evt2);
            }
        });
        this.btnReportSheetOutputType1.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubOutputWindow.this.btnReportSheetOutputType1Method(evt3);
            }
        });
        this.btnReportSheetOutputType2.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubOutputWindow.this.btnReportSheetOutputType2Method(evt4);
            }
        });
        this.btnReportSheetOutputForNusery.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                SubOutputWindow.this.btnReportSheetOutputForNuseryMethod(evt5);
            }
        });
        this.btnReportSheetOutputForNuseryConventional.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubOutputWindow.this.btnReportSheetOutputForNuseryConventionalMethod(evt6);
            }
        });
        this.btnReportSheetOutputType3.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SubOutputWindow.this.btnReportSheetOutputType3Method(evt7);
            }
        });
        this.btnReportSheetOutputType4.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                SubOutputWindow.this.btnReportSheetOutputType4Method(evt8);
            }
        });
        this.btnReportSheetOutputType5.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                SubOutputWindow.this.btnReportSheetOutputType5Method(evt9);
            }
        });
        this.btnReportSheetOutputType6.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                SubOutputWindow.this.btnReportSheetOutputType6Method(evt10);
            }
        });
        this.btnReportSheetOutputType7.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                SubOutputWindow.this.btnReportSheetOutputType7Method(evt11);
            }
        });
        this.btnReportSheetOutputType8.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                SubOutputWindow.this.btnReportSheetOutputType8Method(evt12);
            }
        });
        this.btnReportSheetOutputType9.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                SubOutputWindow.this.btnReportSheetOutputType9Method(evt13);
            }
        });
        this.btnReportSheetOutputTypeMut.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                SubOutputWindow.this.btnReportSheetOutputTypeMutMethod(evt15);
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
    
    public void btnCAOutputWindowMethod(final ActionEvent evt1) {
        final CAReport CA = new CAReport();
        CA.CAReport();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnReportSheetOutputType1Method(final ActionEvent evt3) {
        final ReportSheet RS1 = new ReportSheet();
        RS1.ReportSheet();
    }
    
    public void btnReportSheetOutputType2Method(final ActionEvent evt3) {
        final ReportSheet2 RS2 = new ReportSheet2();
        RS2.ReportSheet2();
    }
    
    public void btnReportSheetOutputForNuseryMethod(final ActionEvent evt5) {
        final reportsheetForNusery n = new reportsheetForNusery();
        n.reportsheetForNusery();
    }
    
    public void btnReportSheetOutputType3Method(final ActionEvent evt7) {
        final ReportSheet3 RS2 = new ReportSheet3();
        RS2.ReportSheet3();
    }
    
    public void btnReportSheetOutputType4Method(final ActionEvent evt8) {
        final ReportSheet4 RS2 = new ReportSheet4();
        RS2.ReportSheet4();
    }
    
    public void btnReportSheetOutputType5Method(final ActionEvent evt9) {
        final ReportSheet5 RS2 = new ReportSheet5();
        RS2.ReportSheet5();
    }
    
    public void btnReportSheetOutputType6Method(final ActionEvent evt10) {
        final ReportSheet6 RS2 = new ReportSheet6();
        RS2.ReportSheet6();
    }
    
    public void btnReportSheetOutputType7Method(final ActionEvent evt11) {
        final ReportSheet7 RS2 = new ReportSheet7();
        RS2.ReportSheet7();
    }
    
    public void btnReportSheetOutputType8Method(final ActionEvent evt12) {
    }
    
    public void btnReportSheetOutputType9Method(final ActionEvent evt13) {
    }
    
    public void btnReportSheetOutputForNuseryConventionalMethod(final ActionEvent evt6) {
        final reportsheerForNurseyConv c = new reportsheerForNurseyConv();
        c.reportsheerForNurseyConv();
    }
    
    public void btnReportSheetOutputTypeMutMethod(final ActionEvent evt15) {
        final ReportSheetMutawassit Rmt = new ReportSheetMutawassit();
        Rmt.ReportSheetMutawassit();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
