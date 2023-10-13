package lesson12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import static lesson12.KettleSortButtons.*;

public class MainWin extends JFrame{
    HashSet<Kettle> kettles2 = new HashSet<>();



    public HashSet<Kettle> getKettles2() {
        return kettles2;
    }

    private JButton button= new JButton("Сортировать");

    private JRadioButtonMenuItem a1 = new JRadioButtonMenuItem("По объему");
    private JRadioButtonMenuItem a2 = new JRadioButtonMenuItem("По мощности");
    private JRadioButtonMenuItem a3 = new JRadioButtonMenuItem("По материалу");
    private JRadioButtonMenuItem a4 = new JRadioButtonMenuItem("По цене");
    private JRadioButtonMenuItem a7 = new JRadioButtonMenuItem("По объему");
    private JRadioButtonMenuItem a8 = new JRadioButtonMenuItem("По весу");
    private JRadioButtonMenuItem a9 = new JRadioButtonMenuItem("По материалу");
    private JRadioButtonMenuItem a10 = new JRadioButtonMenuItem("По цене");
    private JRadioButton radio1 = new JRadioButton("Электрочайник");
    private JRadioButton radio2 = new JRadioButton("Заварочный чайник");
    private JRadioButton radio8 = new JRadioButton("По возрастанию");
    private JRadioButton radio9 = new JRadioButton("По убыванию");

    public MainWin(HashSet<Kettle> kettles){
        super("Вид чайника");
        this.setBounds(100,100,600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        kettles2.addAll(kettles);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,2,2,2));
        JMenuBar m1 = new JMenuBar();
        JMenu menu = new JMenu("Электрический");
        menu.add(a1);
        menu.add(a2);
        menu.add(a3);
        menu.add(a4);
        m1.add(menu);
        ButtonGroup bg = new ButtonGroup();
        bg.add(a1);
        bg.add(a2);
        bg.add(a3);
        bg.add(a4);
        JMenu menu1 = new JMenu("Заварочный");
        menu1.add(a7);
        menu1.add(a8);
        menu1.add(a9);
        menu1.add(a10);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(a7);
        bg1.add(a8);
        bg1.add(a9);
        bg1.add(a10);
        m1.add(menu1);
        setJMenuBar(m1);
        setSize(400,400);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio8);
        group2.add(radio9);
        container.add(radio8);
        radio8.setSelected(true);
        container.add(radio9);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        setVisible(true);

    }

    class ButtonEventListener implements ActionListener{
        String message = "";

        public void actionPerformed(ActionEvent e) {
            boolean typeOfKettle = radio1.isSelected();
            boolean directionOfSelection = radio8.isSelected();
            if(typeOfKettle){
                if(directionOfSelection){
                    if(a1.isSelected()){

                        //уперся в то что нужно переделывать весь KettleSortButtons, чтобы он выдавал String
                        // а не печатал в консоль, но времени уже нет) и сил тоже)

                    }
                }
            }

            message += "Button pressed\n";
            //message += getKettles2().toString();

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
