import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
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

public class CommentMainWindow extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnCAComment;
    private JButton btnExam;
    private JButton btnClose;
    
    public void CommentMainWindow() {
        this.panel = new JPanel();
        this.btnCAComment = new JButton("C.A. Comment");
        this.btnExam = new JButton("EXaminations Comment");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(280, 120);
        this.setTitle("Comment Main Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.ORANGE);
        this.btnCAComment.setBackground(Color.black);
        this.btnCAComment.setForeground(Color.WHITE);
        this.btnExam.setBackground(Color.black);
        this.btnExam.setForeground(Color.WHITE);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.red);
        this.addItem(this.panel, this.btnExam, 1, 1, 1, 1, 10);
        this.addItem(this.panel, this.btnClose, 2, 1, 1, 1, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                CommentMainWindow.this.btnCloseMethod(evt1);
            }
        });
        this.btnCAComment.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                CommentMainWindow.this.btnCACommetMethod(evt2);
            }
        });
        this.btnExam.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                CommentMainWindow.this.btnExamCommetMethod(evt3);
            }
        });
        this.btnExam.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                CommentMainWindow.this.btnExamCommetMethod(evt3);
            }
        });
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
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
    
    public void btnCloseMethod(final ActionEvent evt1) {
        this.dispose();
    }
    
    public void btnCACommetMethod(final ActionEvent evt2) {
        final CASubCommentMenu CASCM = new CASubCommentMenu();
        CASCM.CASubCommentMenu();
    }
    
    public void btnExamCommetMethod(final ActionEvent evt3) {
        final SubCommentMenu SCM = new SubCommentMenu();
        SCM.SubCommentMenu();
    }
}
