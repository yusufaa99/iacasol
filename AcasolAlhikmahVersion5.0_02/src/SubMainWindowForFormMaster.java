import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.Box;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class SubMainWindowForFormMaster extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnQueryWindows;
    private JButton btnDataEntryWindow;
    private JButton btnProcessingWindows;
    private JButton btnCompilationWindow;
    private JButton btnOutputWindow;
    private JButton btnArchive;
    private JButton btnClose;
    private JButton ExamsOverallTotalAndAverage;
    private ImageIcon lblImage;
    private JLabel lblCenterIcon;
    private JLabel lblTest;
    
    
    public JLabel getLblTest() {
		return lblTest;
	}

	public void setLblTest(JLabel lblTest) {
		this.lblTest = lblTest;
	}

	public void SubMainWindowForFormMaster() {
		
		   lblTest = new JLabel("Username");
	         
	    
        this.panel = new JPanel();
        this.btnQueryWindows = new JButton("QUERY");
        this.btnDataEntryWindow = new JButton("DATA ENTRY");
        this.btnProcessingWindows = new JButton("PROCESSING");
        this.btnCompilationWindow = new JButton("COMPILATION");
        this.btnOutputWindow = new JButton("OUTPUT WINDOW");
        this.btnArchive = new JButton("ARCHIVED RESULT");
        this.btnClose = new JButton("Close");
        this.ExamsOverallTotalAndAverage = new JButton("REPORTSHEET TOTAL AND AVG");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(750, 240);
        this.setTitle("Sub Main Window For Form Master - For Secondary School Ver 2.0");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange.darker());
        this.btnDataEntryWindow.setBackground(Color.black);
        this.btnDataEntryWindow.setForeground(Color.RED);
        this.btnProcessingWindows.setBackground(Color.black);
        this.btnProcessingWindows.setForeground(Color.RED);
        this.btnCompilationWindow.setBackground(Color.black);
        this.btnCompilationWindow.setForeground(Color.red);
        this.btnOutputWindow.setBackground(Color.black);
        this.btnOutputWindow.setForeground(Color.red);
        this.btnArchive.setBackground(Color.black);
        this.btnArchive.setForeground(Color.red);
        this.btnQueryWindows.setBackground(Color.black);
        this.btnQueryWindows.setForeground(Color.red);
        this.btnClose.setBackground(Color.white);
        this.btnClose.setForeground(Color.black);
        this.ExamsOverallTotalAndAverage.setBackground(Color.black);
        this.ExamsOverallTotalAndAverage.setForeground(Color.red);
        this.lblImage = new ImageIcon("Acasol.jpg");
        this.lblCenterIcon = new JLabel(this.lblImage);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnQueryWindows);
        Buttogrp1.add(Box.createVerticalStrut(10));
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnDataEntryWindow);
        Buttogrp2.add(Box.createVerticalStrut(20));
        Buttogrp2.add(this.ExamsOverallTotalAndAverage);
        Buttogrp2.add(Box.createVerticalStrut(20));
        Buttogrp2.add(this.btnCompilationWindow);
        Buttogrp2.add(Box.createVerticalStrut(20));
        Buttogrp2.add(this.btnOutputWindow);
        Buttogrp2.add(Box.createVerticalStrut(20));
        Buttogrp2.add(this.btnQueryWindows);
        Buttogrp2.add(lblTest);
        
        this.addItem(this.panel, Buttogrp2, 0, 0, 1, 1, 10);
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 4, 0, 1, 1, 10);
        this.addItem(this.panel, this.lblCenterIcon, 0, 1, 5, 5, 10);
        this.btnQueryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubMainWindowForFormMaster.this.btnQueryWindowsMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubMainWindowForFormMaster.this.btnCloseMethod(evt2);
            }
        });
        this.btnDataEntryWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubMainWindowForFormMaster.this.btnDataEntryWindowMethod(evt3);
            }
        });
        this.btnOutputWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubMainWindowForFormMaster.this.btnOutputWindowMethod(evt4);
            }
        });
        this.btnCompilationWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubMainWindowForFormMaster.this.btnCompilationWindowMethod(evt6);
            }
        });
        this.btnProcessingWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
            }
        });
        this.btnArchive.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                SubMainWindowForFormMaster.this.btnArchiveMethod(evt8);
            }
        });
        this.ExamsOverallTotalAndAverage.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                SubMainWindowForFormMaster.this.ExamsOverallTotalAndAverageMethod(evt8);
            }
        });
    
	
        AuthenticationWindow auth = new AuthenticationWindow();
	       // lblTest.setText(auth.getTxtUserName().toString());
	        lblTest.setText(auth.getMyCurrentUser().toString());
	        System.out.println("Testing the lblTest:"+ auth.getTxtUserName());
	        System.out.println("Testing the lblTest:"+ auth.getMyCurrentUser().toString());

	        lblTest.setVisible(true);
	        lblTest.revalidate();
	        panel.revalidate();
 	
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
    
    public void btnQueryWindowsMethod(final ActionEvent evt1) {
        final SubQueryWindow sqw = new SubQueryWindow();
        sqw.SubQueryWindow();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnDataEntryWindowMethod(final ActionEvent evt3) {
        final DataEntryWindow dew = new DataEntryWindow();
        dew.DataEntryWindow();
    }
    
    public void btnOutputWindowMethod(final ActionEvent evt4) {
        final SubOutputWindow sow = new SubOutputWindow();
        sow.SubOutputWindow();
    }
    
    public void btnCompilationWindowMethod(final ActionEvent evt6) {
        final ReportSheetCompilation rcw = new ReportSheetCompilation();
        rcw.ReportSheetCompilation();
    }
    
    public void ExamsOverallTotalAndAverageMethod(final ActionEvent evt8) {
        final ExamsOverallTotalAndAverage ExamTotalaAndAVG = new ExamsOverallTotalAndAverage();
        ExamTotalaAndAVG.ExamsOverallTotalAndAverage();
    }
    
    public void btnArchiveMethod(final ActionEvent evt8) {
        final SubArchivedResults arch = new SubArchivedResults();
        arch.SubArchivedResults();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
