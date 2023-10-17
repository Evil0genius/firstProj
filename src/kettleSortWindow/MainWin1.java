package kettleSortWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Vector;


public class MainWin1 extends JFrame{
    HashSet<Kettle> kettles2 = new HashSet<>();
    public HashSet<Kettle> getKettles2() {
        return kettles2;
    }

    private JButton button= new JButton("Сортировать");

    private JRadioButtonMenuItem a1 = new JRadioButtonMenuItem("По объему");
    private JRadioButtonMenuItem a2 = new JRadioButtonMenuItem("По мощности");
    private JRadioButtonMenuItem a3 = new JRadioButtonMenuItem("По материалу");
    private JRadioButtonMenuItem a4 = new JRadioButtonMenuItem("По бренду");
    private JRadioButtonMenuItem a5 = new JRadioButtonMenuItem("По возрастанию");
    private JRadioButtonMenuItem a6 = new JRadioButtonMenuItem("По убыванию");

    public MainWin1(HashSet<Kettle> kettle){
        super("Вид чайника");
        this.setBounds(100,100,600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        kettles2.addAll(kettle);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,2,2,2));
        JMenuBar m1 = new JMenuBar();
        JMenu menu = new JMenu("Группировка");
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
        JMenu menu1 = new JMenu("Сортировка");
        menu1.add(a5);
        menu1.add(a6);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(a5);
        bg1.add(a6);
        m1.add(menu1);
        setJMenuBar(m1);
        setSize(400,400);

        Vector<String> items2 = new Vector<>();
        for(Kettle k : kettles2) items2.add(k.toString());
        JList<String> list2 = new JList<>(items2);
        container.add(new JScrollPane(list2));
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        setVisible(true);

    }

    class ButtonEventListener implements ActionListener{
        String message = "";

        public void actionPerformed(ActionEvent e) {
            boolean typeOfKettle = a1.isSelected();
            boolean directionOfSelection = a5.isSelected();
            if(typeOfKettle){
                if(directionOfSelection){
                    if(a1.isSelected()){

                        //уперся в то что нужно переделывать весь KettleSortButtons, чтобы он выдавал String
                        // а не печатал в консоль, но времени уже нет) и сил тоже)

                    }
                }
            }

            message += "Button pressed\n";
            message += getKettles2().toString();

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
