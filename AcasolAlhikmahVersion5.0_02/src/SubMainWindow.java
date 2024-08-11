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

public class SubMainWindow extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnDataEntryWindows;
    private JButton btnProcessingWindow;
    private JButton btnReportSheetTotalandAVG;
    private JButton btnCompilationWindows;
    private JButton btnReportOrOutputWindows;
    private JButton btnEditingWindows;
    private JButton btnQueryWindows;
    private JButton btnClose;
    
    public void SubMainWindow() {
        this.panel = new JPanel();
        this.btnDataEntryWindows = new JButton("DATA ENTRY WINDOWS");
        this.btnProcessingWindow = new JButton("PROCESSING WINDOWS");
        this.btnReportSheetTotalandAVG = new JButton("REPORTSHEET TOTAL AND AVG");
        this.btnCompilationWindows = new JButton("COMPILATION WINDOWS");
        this.btnReportOrOutputWindows = new JButton("OUTPUT WINDOWS");
        this.btnEditingWindows = new JButton("EDITING WINDOWS");
        this.btnQueryWindows = new JButton("QUERY WINDOWS");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(670, 135);
        this.setTitle("Sub Main Window - For Nursery and Primary Schools Ver 2.0");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.blue);
        this.btnDataEntryWindows.setBackground(Color.black);
        this.btnDataEntryWindows.setForeground(Color.white);
        this.btnProcessingWindow.setBackground(Color.black);
        this.btnProcessingWindow.setForeground(Color.WHITE);
        this.btnReportSheetTotalandAVG.setBackground(Color.black);
        this.btnReportSheetTotalandAVG.setForeground(Color.red);
        this.btnCompilationWindows.setBackground(Color.black);
        this.btnCompilationWindows.setForeground(Color.red);
        this.btnReportOrOutputWindows.setBackground(Color.black);
        this.btnReportOrOutputWindows.setForeground(Color.red);
        this.btnEditingWindows.setBackground(Color.black);
        this.btnEditingWindows.setForeground(Color.red);
        this.btnQueryWindows.setBackground(Color.black);
        this.btnQueryWindows.setForeground(Color.red);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.red);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnDataEntryWindows);
        Buttogrp1.add(Box.createVerticalStrut(10));
        Buttogrp1.add(this.btnProcessingWindow);
        Buttogrp1.add(Box.createVerticalStrut(10));
        Buttogrp1.add(this.btnCompilationWindows);
        this.addItem(this.panel, Buttogrp1, 0, 0, 1, 1, 10);
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnReportOrOutputWindows);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnEditingWindows);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnQueryWindows);
        this.addItem(this.panel, Buttogrp2, 0, 2, 1, 1, 10);
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 3, 5, 1, 1, 10);
        this.btnDataEntryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubMainWindow.this.btnDataEntryWindowsMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubMainWindow.this.btnCloseMethod(evt2);
            }
        });
        this.btnReportOrOutputWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubMainWindow.this.btnReportOrOutputWindowsMethod(evt3);
            }
        });
        this.btnProcessingWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubMainWindow.this.btnProcessingWindowWindowMethod(evt4);
            }
        });
        this.btnCompilationWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                SubMainWindow.this.btnCompilationWindowsMethod(evt5);
            }
        });
        this.btnQueryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubMainWindow.this.btnQueryWindowsMethod(evt6);
            }
        });
        this.btnEditingWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SubMainWindow.this.btnEditingWindowsMethod(evt7);
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
    
    public void btnDataEntryWindowsMethod(final ActionEvent evt1) {
        final DataEntryWindow dew = new DataEntryWindow();
        dew.DataEntryWindow();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnReportOrOutputWindowsMethod(final ActionEvent evt3) {
        final SubOutputWindow sow = new SubOutputWindow();
        sow.SubOutputWindow();
    }
    
    public void btnProcessingWindowWindowMethod(final ActionEvent evt4) {
        final ExamsOverallTotalAndAverage t = new ExamsOverallTotalAndAverage();
        t.ExamsOverallTotalAndAverage();
    }
    
    public void btnCompilationWindowsMethod(final ActionEvent evt5) {
        final ReportSheetCompilation rsc = new ReportSheetCompilation();
        rsc.ReportSheetCompilation();
    }
    
    public void btnQueryWindowsMethod(final ActionEvent evt6) {
        final SubQueryWindow sqw = new SubQueryWindow();
        sqw.SubQueryWindow();
    }
    
    public void btnEditingWindowsMethod(final ActionEvent evt7) {
        final EditAuthenticateWindow eaw = new EditAuthenticateWindow();
        eaw.EditAuthenticateWindow();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
