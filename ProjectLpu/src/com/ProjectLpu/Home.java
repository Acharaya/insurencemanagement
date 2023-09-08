package com.ProjectLpu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

import static java.awt.SystemColor.menu;

public class Home extends  JFrame implements ActionListener {
    JLabel dashboard, applyPolicy,histroy,askQuestion,questionHistroy, avaPolicy,appedPolicy, pcategory,tQasked, n1,n2,n3,n4, heading;
    JButton backbtn;
        JPanel sidepanel, smpanel1,smpanel2,smpanel3,smpanel4, toppanel,sp1,sp2,sp3,sp4,sp5;
        Home(){
            Font f = new Font("Serif", Font.BOLD, 30);
            Font smpf = new Font("Serif", Font.BOLD, 18);
            Font nf = new Font("Serif", Font.BOLD, 30);
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
                public void mouseClicked(MouseEvent e) {
                    if (e.getSource() == sp2){
                        new ApplyPolicy();
                        setVisible(false);
                    }
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

//            small panel 1 details
            smpanel1 = new JPanel();
            smpanel1.setVisible(true);
            smpanel1.setBounds(260,100,200,100);
            smpanel1.setBackground(Color.blue);
            smpanel1.setLayout(null);
            background.add(smpanel1);

            avaPolicy= new JLabel("Available Policy");
            avaPolicy.setBounds(5,10,150,40);
            avaPolicy.setForeground(Color.WHITE);
            avaPolicy.setFont(smpf);
            smpanel1.add(avaPolicy);

            n1 = new JLabel("10", JLabel.RIGHT);
            n1.setBounds(110,40,70,60);
            n1.setForeground(Color.WHITE);

            n1.setFont(nf);
            smpanel1.add(n1);


//          small panel 2 details
            smpanel2 = new JPanel();
            smpanel2.setVisible(true);
            smpanel2.setBounds(480,100,200,100);
            smpanel2.setBackground(Color.blue);
            smpanel2.setLayout(null);
            background.add(smpanel2);

            appedPolicy= new JLabel("Applied Policy");
            appedPolicy.setBounds(5,10,150,40);
            appedPolicy.setForeground(Color.WHITE);
            appedPolicy.setFont(smpf);
            smpanel2.add(appedPolicy);

            n2 = new JLabel("4", JLabel.RIGHT);
            n2.setBounds(110,40,70,60);
            n2.setForeground(Color.WHITE);
            n2.setFont(nf);
            smpanel2.add(n2);

            smpanel3 = new JPanel();
            smpanel3.setVisible(true);
            smpanel3.setBounds(700,100,200,100);
            smpanel3.setBackground(Color.BLUE);
            smpanel3.setLayout(null);
            background.add(smpanel3);

            pcategory= new JLabel("Policy Category");
            pcategory.setBounds(5,10,150,40);
            pcategory.setForeground(Color.WHITE);
            pcategory.setFont(smpf);
            smpanel3.add(pcategory);

            n3 = new JLabel("17", JLabel.RIGHT);
            n3.setBounds(110,40,70,60);
            n3.setForeground(Color.WHITE);
            n3.setFont(nf);
            smpanel3.add(n3);

            smpanel4 = new JPanel();
            smpanel4.setVisible(true);
            smpanel4.setBounds(920,100,200,100);
            smpanel4.setBackground(Color.blue);
            smpanel4.setLayout(null);
            background.add(smpanel4);

            tQasked= new JLabel("Policy Category");
            tQasked.setBounds(5,10,150,40);
            tQasked.setForeground(Color.WHITE);
            tQasked.setFont(smpf);
            smpanel4.add(tQasked);

            n4 = new JLabel("89", JLabel.RIGHT);
            n4.setBounds(110,40,70,60);
            n4.setForeground(Color.WHITE);
            n4.setFont(nf);
            smpanel4.add(n4);

            add(background);
            background.add(toppanel);
            background.add(sidepanel);
            setVisible(true);
        }

        public static void main(String[] args) {
            new Home();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

