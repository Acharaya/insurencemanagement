package com.ProjectLpu;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

import static net.codejava.swing.jtable.JTableColumnWidthRowHeightExample.setJTableColumnsWidth;

public class ApplyPolicy extends JFrame implements ActionListener {
    JLabel dashboard, applyPolicy,histroy,askQuestion,questionHistroy,heading,hhead;
    JButton backbtn, tapply;
    JPanel sidepanel, toppanel, panel, hpanel, sp1,sp2,sp3,sp4,sp5;
    DefaultTableModel model;
    TableCellRenderer tableCellRenderer;

    ApplyPolicy(){
        Font f = new Font("Serif", Font.BOLD, 30);
        Font smf = new Font("Bell MT", Font.BOLD, 14);

        //frame

        setSize(1200,650);
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);



//        background
        ImageIcon bg=new ImageIcon("src/com/ProjectLpu/Images/bg11.png");
        Image img= bg.getImage();
        Image temp_img=img.getScaledInstance(1500,700,Image.SCALE_SMOOTH);
        bg= new ImageIcon(temp_img);
        JLabel background =new JLabel("",bg,JLabel.CENTER);

        toppanel=new JPanel();
        toppanel.setBounds(0,0,1200,60);
        toppanel.setBackground(new Color(14, 13, 13, 169));
        toppanel.setLayout(new BorderLayout());

        heading= new JLabel("INSURANCE MANAGEMENT SYSTEM",JLabel.CENTER);
        heading.setForeground(Color.WHITE);
        heading.setFont(f);
        heading.setBounds(150,0, 600,60);
        toppanel.add(heading, BorderLayout.CENTER);

//
        sidepanel =new JPanel();
        sidepanel.setBounds(0,58,250,555);
        sidepanel.setBackground(new Color(10, 206, 241));
        sidepanel.setLayout(null);

        //side Content panel
        sp1= new JPanel();
        sp1.setBounds(50,80,170,40);
        sp1.setLayout(null);
        sp1.setBackground(Color.ORANGE);
        sp1.addMouseListener(new MouseAdapter() {
            Color color = sp1.getBackground();
            public void mouseEntered(MouseEvent me) {
                color = sp1.getBackground();
                sp1.setBackground(Color.yellow);// change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                sp1.setBackground(color);
            }
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == sp1){
                    new Home();
                    setVisible(false);
                }
            }
        });
        sidepanel.add(sp1);

        sp2= new JPanel();
        sp2.setBounds(50,140,170,40);
        sp2.setBackground(Color.ORANGE);
        sp2.setLayout(null);
        sp2.addMouseListener(new MouseAdapter() {
            Color color = sp2.getBackground();
            public void mouseEntered(MouseEvent me) {
                color = sp2.getBackground();
                sp2.setBackground(Color.yellow);// change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                sp2.setBackground(color);
            }
        });
        sidepanel.add(sp2);

        sp3= new JPanel();
        sp3.setBounds(50,200,170,40);
        sp3.setBackground(Color.ORANGE);
        sp3.setLayout(null);
        sp3.addMouseListener(new MouseAdapter() {
            Color color = sp3.getBackground();
            public void mouseEntered(MouseEvent me) {
                color = sp3.getBackground();
                sp3.setBackground(Color.yellow);// change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                sp3.setBackground(color);
            }
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == sp3){
                    new Histroy();
                    setVisible(false);
                }
            }
        });
        sidepanel.add(sp3);

        sp4= new JPanel();
        sp4.setBounds(50,260,170,40);
        sp4.setBackground(Color.ORANGE);
        sp4.setLayout(null);
        sp4.addMouseListener(new MouseAdapter() {
            Color color = sp4.getBackground();
            public void mouseEntered(MouseEvent me) {
                color = sp4.getBackground();
                sp4.setBackground(Color.yellow);// change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                sp4.setBackground(color);
            }
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == sp4){
                    new askQue();
                    setVisible(false);
                }
            }
        });
        sidepanel.add(sp4);

        sp5= new JPanel();
        sp5.setBounds(50,320,170,40);
        sp5.setBackground(Color.ORANGE);
        sp5.setLayout(null);
        sp5.addMouseListener(new MouseAdapter() {
            Color color = sp5.getBackground();
            public void mouseEntered(MouseEvent me) {
                color = sp5.getBackground();
                sp5.setBackground(Color.yellow);// change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                sp5.setBackground(color);
            }
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == sp5){
                    new QuestionHis();
                    setVisible(false);
                }
            }
        });
        sidepanel.add(sp5);


        dashboard = new JLabel("Dashboard");
        dashboard.setBounds(50,9,100,20);
        dashboard.setBackground(new Color(0, 0, 44, 0));
        dashboard.setFont(smf);
        dashboard.setForeground(new Color(0, 0, 0, 181));
        sp1.add(dashboard);

        applyPolicy = new JLabel("Apply Policy");
        applyPolicy.setBounds(50,9,100,20);
        applyPolicy.setFont(smf);
        applyPolicy.setBackground(new Color(0x000002C, true));
        applyPolicy.setForeground(new Color(0, 0, 0, 181));
        sp2.add(applyPolicy);

        histroy = new JLabel("History");
        histroy.setBounds(50,9,100,20);
        histroy.setFont(smf);
        histroy.setBackground(new Color(0x000002C, true));
        histroy.setForeground(new Color(0, 0, 0, 181));
        sp3.add(histroy);

        askQuestion = new JLabel("Ask Question");
        askQuestion.setBounds(50,9,100,20);
        askQuestion.setBackground(new Color(0x000002C, true));
        askQuestion.setFont(smf);
        askQuestion.setForeground(new Color(0, 0, 0, 181));
        sp4.add(askQuestion);

        questionHistroy = new JLabel("Question History");
        questionHistroy.setBounds(50,9,150,20);
        questionHistroy.setFont(smf);
        questionHistroy.setBackground(new Color(0x000002C, true));
        questionHistroy.setForeground(new Color(0, 0, 0, 181));
        sp5.add(questionHistroy);

        //end of Side bar



        panel = new JPanel();
        panel.setBounds(255,150,900,400);
        panel.setBackground(new Color(22,33,22, 0));
        panel.setLayout(null);
        background.add(panel);


        String data[][]={{"1","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"2","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"3","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"4","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"5","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"6","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"7","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"8","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"9","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"10","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"11","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"12","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"13","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"14","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"},
                {"15","Syska Insurance", "Mobile Insurance","50000","2000","10", "May 9,2021","Apply"}
        };

        String[] col = {"Sl No.", "Policy Name","Category","Sum Assurance","Premium","Tenure","Creation Date","Apply"};
        model = new DefaultTableModel(data, col);
        JTable table = new JTable(model){
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };

        // sets row height
        table.setRowHeight(40);

        TableColumnModel columnModel = table.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(120);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(180);
        columnModel.getColumn(7).setPreferredWidth(100);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10,10,870,380);
        panel.add(pane , BorderLayout.CENTER);

        //create button column
        ButtonColumn buttonColumn = new ButtonColumn( table ,7);



        //breadcrum

        hpanel = new JPanel();
        hpanel.setBounds(280,70,970,50);
        hpanel.setLayout(null);
        hpanel.setBackground(new Color(12, 170, 199));
        background.add(hpanel);

        hhead = new JLabel("APPLY POLICY");
        hhead.setForeground(Color.WHITE);
        hhead.setFont(new Font("Times New Roman",Font.PLAIN,28));
        hhead.setBounds(20,0,300,50);
        hpanel.add(hhead);





        add(background);
        background.add(toppanel);
        background.add(sidepanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ApplyPolicy();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    class ButtonColumn extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener{
        JTable table;
        JButton renderButton;
        JButton editButton;
        String text;

        public ButtonColumn(JTable table, int column) {
            super();
            this.table = table;
            renderButton = new JButton();

            editButton = new JButton();
            editButton.setFocusPainted( false );
            editButton.addActionListener( this );

            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(column).setCellRenderer( this );
            columnModel.getColumn(column).setCellEditor( this );
        }
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
        {
            if (hasFocus)
            {
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }
            else if (isSelected)
            {
                renderButton.setForeground(table.getSelectionForeground());
                renderButton.setBackground(table.getSelectionBackground());
            }
            else
            {
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }

            renderButton.setText( (value == null) ? "" : value.toString() );
            return renderButton;
        }

        public Component getTableCellEditorComponent(
                JTable table, Object value, boolean isSelected, int row, int column)
        {
            text = (value == null) ? "" : value.toString();
            editButton.setText( text );
            return editButton;
        }

        public Object getCellEditorValue()
        {
            return text;
        }

        public void actionPerformed(ActionEvent e)
        {
            fireEditingStopped();
            System.out.println( e.getActionCommand() + " : " + table.getSelectedRow());
            JOptionPane.showMessageDialog(panel,"Apply Success","Success",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
