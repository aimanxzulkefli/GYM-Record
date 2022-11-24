import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Frame extends JFrame {

    Calendar calender;
    SimpleDateFormat dateFormat;
    JLabel dateLabel;
    String date;
    JTextField workTimeText, restTimeText, roundText;
    move movingBar;
    JProgressBar workBar;
    int round;
    JLabel countLabel;
    boolean exit;

    Frame() {
        this.setTitle("GYM Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(350, 600));
        this.setBackground(new Color(249, 104, 21));
        this.setLayout(new BorderLayout());

        // Border left
        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(35, 0));
        panelLeft.setBackground(new Color(249, 104, 21));

        // Border right
        JPanel panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(35, 0));
        panelRight.setBackground(new Color(249, 104, 21));

        // Border top
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(0, 250));
        topPanel.setBackground(new Color(249, 104, 21));

        // Center
        JPanel panelMain = new JPanel();
        panelMain.setBackground(new Color(249, 104, 21));
        panelMain.setLayout(new BorderLayout());

        // Inside center top
        JPanel insidePtop = new JPanel();
        insidePtop.setBackground(new Color(249, 104, 21));

        // Put image
        ImageIcon icon = new ImageIcon("bar curl.png");
        JLabel labelImage = new JLabel();
        labelImage.setIcon(icon);
        topPanel.add(labelImage);

        // Put date
        dateFormat = new SimpleDateFormat("dd / MM / yyyy");
        dateLabel = new JLabel();
        dateLabel.setForeground(new Color(255, 253, 250));
        dateLabel.setFont(new Font("Sans Serif", Font.BOLD, 18));
        insidePtop.add(dateLabel);
        panelMain.add(insidePtop, BorderLayout.NORTH);

        // Inside center center
        JPanel insidePcenter = new JPanel();
        insidePcenter.setBackground(new Color(249, 104, 21));
        insidePcenter.setLayout(null);
        panelMain.add(insidePcenter, BorderLayout.CENTER);

        JLabel weightLabel = new JLabel();
        weightLabel.setText("Weight (kg)");
        weightLabel.setForeground(new Color(255, 253, 250));
        weightLabel.setBackground(new Color(249, 104, 21));
        weightLabel.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        weightLabel.setBounds(7, 10, 100, 30);
        weightLabel.setOpaque(true);
        insidePcenter.add(weightLabel);

        JTextField weightText1 = new JTextField();
        weightText1.setBounds(110, 10, 30, 30);
        weightText1.setOpaque(true);
        insidePcenter.add(weightText1);

        JTextField weightText2 = new JTextField();
        weightText2.setBounds(140, 10, 30, 30);
        weightText2.setOpaque(true);
        insidePcenter.add(weightText2);

        JTextField weightText3 = new JTextField();
        weightText3.setBounds(170, 10, 30, 30);
        weightText3.setOpaque(true);
        insidePcenter.add(weightText3);

        JTextField weightText4 = new JTextField();
        weightText4.setBounds(200, 10, 30, 30);
        weightText4.setOpaque(true);
        insidePcenter.add(weightText4);

        JTextField weightText5 = new JTextField();
        weightText5.setBounds(230, 10, 30, 30);
        weightText5.setOpaque(true);
        insidePcenter.add(weightText5);

        JLabel repetitionLabel = new JLabel();
        repetitionLabel.setText("Repetition");
        repetitionLabel.setForeground(new Color(255, 253, 250));
        repetitionLabel.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        repetitionLabel.setBounds(7, 50, 100, 30);
        repetitionLabel.setOpaque(true);
        repetitionLabel.setBackground(new Color(249, 104, 21));
        insidePcenter.add(repetitionLabel);

        JTextField weightText1_1 = new JTextField();
        weightText1_1.setBounds(110, 50, 30, 30);
        weightText1_1.setOpaque(true);
        insidePcenter.add(weightText1_1);

        JTextField weightText2_1 = new JTextField();
        weightText2_1.setBounds(140, 50, 30, 30);
        weightText2_1.setOpaque(true);
        insidePcenter.add(weightText2_1);

        JTextField weightText3_1 = new JTextField();
        weightText3_1.setBounds(170, 50, 30, 30);
        weightText3_1.setOpaque(true);
        insidePcenter.add(weightText3_1);

        JTextField weightText4_1 = new JTextField();
        weightText4_1.setBounds(200, 50, 30, 30);
        weightText4_1.setOpaque(true);
        insidePcenter.add(weightText4_1);

        JTextField weightText5_1 = new JTextField();
        weightText5_1.setBounds(230, 50, 30, 30);
        weightText5_1.setOpaque(true);
        insidePcenter.add(weightText5_1);

        // Panel inside bottom
        JPanel insidePbottom = new JPanel();
        insidePbottom.setPreferredSize(new Dimension(0, 190));
        insidePbottom.setLayout(new BorderLayout());

        // Panel inside bottom, top
        JPanel insidePbottomT = new JPanel();
        insidePbottomT.setBackground(new Color(249, 104, 21));
        insidePbottomT.setPreferredSize(new Dimension(0, 42));
        insidePbottom.add(insidePbottomT, BorderLayout.NORTH);

        // Panel inside bottom, center
        JPanel insidePbottomC = new JPanel();
        insidePbottomC.setBackground(new Color(249, 104, 21));
        insidePbottomC.setLayout(new GridLayout(3, 2));
        insidePbottom.add(insidePbottomC, BorderLayout.CENTER);

        JLabel timerLabel = new JLabel("Timer");
        timerLabel.setForeground(new Color(255, 253, 250));
        timerLabel.setBackground(new Color(249, 104, 21));
        timerLabel.setFont(new Font("Sans Serif", Font.BOLD, 18));
        timerLabel.setOpaque(true);
        insidePbottomT.add(timerLabel);
        panelMain.add(insidePbottom, BorderLayout.SOUTH);

        JLabel workTime = new JLabel("Workout time");
        workTime.setForeground(new Color(255, 253, 250));
        workTime.setBackground(new Color(249, 104, 21));
        workTime.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        workTime.setOpaque(true);
        insidePbottomC.add(workTime);

        workTimeText = new JTextField();
        workTimeText.setOpaque(true);
        workTimeText.setForeground(Color.GRAY);
        workTimeText.setText(" second");
        insidePbottomC.add(workTimeText);

        JLabel restTime = new JLabel("Rest time");
        restTime.setForeground(new Color(255, 253, 250));
        restTime.setBackground(new Color(249, 104, 21));
        restTime.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        restTime.setOpaque(true);
        insidePbottomC.add(restTime);

        restTimeText = new JTextField();
        restTimeText.setOpaque(true);
        restTimeText.setForeground(Color.GRAY);
        restTimeText.setText(" second");
        insidePbottomC.add(restTimeText);

        JLabel round = new JLabel("Round");
        round.setForeground(new Color(255, 253, 250));
        round.setBackground(new Color(249, 104, 21));
        round.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        round.setOpaque(true);
        insidePbottomC.add(round);

        roundText = new JTextField();
        roundText.setOpaque(true);
        insidePbottomC.add(roundText);

        // Panel inside bottom, bottom
        JPanel insidePbottomB = new JPanel();
        insidePbottomB.setBackground(new Color(249, 104, 21));
        insidePbottomB.setPreferredSize(new Dimension(0, 40));
        insidePbottom.add(insidePbottomB, BorderLayout.SOUTH);

        JButton timerButton = new JButton("Start timer");
        timerButton.setFocusable(false);
        insidePbottomB.add(timerButton);
        timerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                start();

            }
        });

        JButton saveButton = new JButton("Save");
        saveButton.setFocusable(false);
        insidePbottomB.add(saveButton);
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }

        });

        this.add(panelMain, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        this.add(panelLeft, BorderLayout.EAST);
        this.add(panelRight, BorderLayout.WEST);
        this.setVisible(true);
        setDate();
    }

    void start() {

        if (workTimeText.getText().isEmpty() || restTimeText.getText().isEmpty() || roundText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Work time, Rest time and Round", null,
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JFrame timerFrame = new JFrame();
            timerFrame.setTitle("Workout Timer");
            timerFrame.setPreferredSize(new Dimension(320, 160));
            timerFrame.setLayout(new FlowLayout());

            workBar = new JProgressBar();
            workBar.setString(" ");
            workBar.setPreferredSize(new Dimension(300, 70));
            JPanel countPanel = new JPanel();
            countPanel.setPreferredSize(new Dimension(300, 30));
            countLabel = new JLabel();
            countLabel.setText(" ");
            countLabel.setForeground(Color.BLACK);
            countLabel.setFont(new Font("Sans Serif", Font.BOLD, 18));
            countPanel.add(countLabel);
            int i = Integer.parseInt(roundText.getText());

            timerFrame.add(workBar);
            timerFrame.add(countPanel);
            timerFrame.pack();
            timerFrame.setVisible(true);

            for (int l = 0; l<i;l++){
                movingBar = new move(workBar, workTimeText, countLabel);
                movingBar.start();
                countLabel.setText("Round "+l);
            }
        }
    }

    class move extends Thread {

        JProgressBar copyBar;
        JTextField copyWText;
        JLabel copyRLabel;

        move(JProgressBar copyBar, JTextField copyWText, JLabel copyRLabel) {
            copyBar = workBar;
            copyWText = workTimeText;
            copyRLabel = countLabel;
        }

        public void run() {

            double wTime = Double.parseDouble(workTimeText.getText());
            double wTimef = wTime * 10;
            int counter = 100;
            workBar.setString("Work Now");
            workBar.setFont(new Font("Sans Serif", Font.BOLD, 30));
            workBar.setForeground(new Color(50, 205, 50));
            workBar.setStringPainted(true);
            while (counter >= 0) {
                workBar.setValue(counter);
                try {
                    sleep((long) wTimef);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                counter -= 1;
            }

            do {
                double rTime = Double.parseDouble(restTimeText.getText());
                double rTimef = rTime * 10;

                workBar.setString("Take a rest");
                workBar.setFont(new Font("Sans Serif", Font.BOLD, 30));
                workBar.setForeground(new Color(255, 0, 0));
                workBar.setStringPainted(true);

                workBar.setValue(counter);
                try {
                    sleep((long) rTimef);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                counter += 1;
            } while (workBar.getValue() <= 100);
        }
    }

    public void setDate() {
        while (true) {
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
        }
    }
}
