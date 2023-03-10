import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JLabel Label= new JLabel();
    JTextField TextField = new JTextField();
    JButton Button0 = new JButton("0");
    JButton Button1 = new JButton("1");
    JButton Button2 = new JButton("2");
    JButton Button3 = new JButton("3");
    JButton Button4 = new JButton("4");
    JButton Button5 = new JButton("5");
    JButton Button6 = new JButton("6");
    JButton Button7 = new JButton("7");
    JButton Button8 = new JButton("8");
    JButton Button9 = new JButton("9");
    JButton ButtonAC = new JButton("AC");
    JButton ButtonC = new JButton("C");
    JButton ButtonDiv = new JButton("/");
    JButton ButtonEq = new JButton("=");
    JButton ButtonAdd = new JButton("+");
    JButton ButtonSub = new JButton("-");
    JButton ButtonMul = new JButton("*");
    JButton ButtonDec = new JButton(".");
    JButton ButtonPow = new JButton("^");
    JFrame frame = new JFrame("Calculator");

    double num1 = 0, num2 = 0;
    int ops = 1;
    public Calculator(){

        prepGUI();
        addComp();

        ActionListener buttonListener =  new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton o = (JButton)e.getSource();
                String name = o.getText();
                TextField.setText(TextField.getText() + ((name.equals("."))?(!TextField.getText().contains(".")?".":""):name));
            }
        };

        Button0.addActionListener(this);
        Button1.addActionListener(buttonListener);
        Button2.addActionListener(buttonListener);
        Button3.addActionListener(buttonListener);
        Button4.addActionListener(buttonListener);
        Button5.addActionListener(buttonListener);
        Button6.addActionListener(buttonListener);
        Button7.addActionListener(buttonListener);
        Button8.addActionListener(buttonListener);
        Button9.addActionListener(buttonListener);
        ButtonDec.addActionListener(buttonListener);
        ButtonAdd.addActionListener(this);
        ButtonSub.addActionListener(this);
        ButtonMul.addActionListener(this);
        ButtonDiv.addActionListener(this);
        ButtonPow.addActionListener(this);
        ButtonAC.addActionListener(this);
        ButtonC.addActionListener(this);
        ButtonEq.addActionListener(this);
    }

    public void prepGUI(){
        frame.setSize(350, 450);
        frame.setLayout(null);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addComp(){
        Dimension buttonSize = new Dimension(80, 60);
        Font buttonFont = new Font("Segoe UI", Font.PLAIN, 20);
        Label.setHorizontalAlignment(SwingConstants.RIGHT);
        Label.setBorder(new EmptyBorder(10,10,10,10));
        Label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Label.setPreferredSize(new Dimension(240, 50));
        TextField.setHorizontalAlignment(SwingConstants.RIGHT);
        TextField.setBorder(new CompoundBorder(TextField.getBorder(),new EmptyBorder(10, 10, 10, 10)));
        TextField.setFont(new Font("Segoe UI", Font.BOLD, 26));
        TextField.setPreferredSize(new Dimension(240, 50));
        Button0.setPreferredSize(buttonSize);
        Button1.setPreferredSize(buttonSize);
        Button2.setPreferredSize(buttonSize);
        Button3.setPreferredSize(buttonSize);
        Button4.setPreferredSize(buttonSize);
        Button5.setPreferredSize(buttonSize);
        Button6.setPreferredSize(buttonSize);
        Button7.setPreferredSize(buttonSize);
        Button8.setPreferredSize(buttonSize);
        Button9.setPreferredSize(buttonSize);
        ButtonDec.setPreferredSize(buttonSize);
        ButtonAdd.setPreferredSize(buttonSize);
        ButtonSub.setPreferredSize(buttonSize);
        ButtonMul.setPreferredSize(buttonSize);
        ButtonDiv.setPreferredSize(buttonSize);
        ButtonPow.setPreferredSize(buttonSize);
        ButtonAC.setPreferredSize(buttonSize);
        ButtonC.setPreferredSize(buttonSize);
        ButtonEq.setPreferredSize(buttonSize);
        // 
        Button0.setFont(buttonFont);
        Button1.setFont(buttonFont);
        Button2.setFont(buttonFont);
        Button3.setFont(buttonFont);
        Button4.setFont(buttonFont);
        Button5.setFont(buttonFont);
        Button6.setFont(buttonFont);
        Button7.setFont(buttonFont);
        Button8.setFont(buttonFont);
        Button9.setFont(buttonFont);
        ButtonDec.setFont(buttonFont);
        ButtonAdd.setFont(buttonFont);
        ButtonSub.setFont(buttonFont);
        ButtonMul.setFont(buttonFont);
        ButtonDiv.setFont(buttonFont);
        ButtonPow.setFont(buttonFont);
        ButtonAC.setFont(buttonFont);
        ButtonC.setFont(buttonFont);
        ButtonEq.setFont(buttonFont);


        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        frame.add(Label, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        frame.add(TextField, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        ButtonAC.setPreferredSize(buttonSize);
        frame.add(ButtonAC, c);

        c.gridx = 1;
        c.gridy = 2;
        frame.add(ButtonC, c);

        c.gridx = 2;
        c.gridy = 2;
        frame.add(ButtonPow, c);

        c.gridx = 0;
        c.gridy = 3;
        frame.add(Button7, c);

        c.gridx = 1;
        c.gridy = 3;
        frame.add(Button8, c);

        c.gridx = 2;
        c.gridy = 3;
        frame.add(Button9, c);

        c.gridx = 0;
        c.gridy = 4;
        frame.add(Button4, c);

        c.gridx = 1;
        c.gridy = 4;
        frame.add(Button5, c);

        c.gridx = 2;
        c.gridy = 4;
        frame.add(Button6, c);

        c.gridx = 0;
        c.gridy = 5;
        frame.add(Button1, c);

        c.gridx = 1;
        c.gridy = 5;
        frame.add(Button2, c);

        c.gridx = 2;
        c.gridy = 5;
        frame.add(Button3, c);

        c.gridx = 1;
        c.gridy = 6;
        frame.add(Button0, c);
        
        c.gridx = 3;
        c.gridy = 5;
        frame.add(ButtonAdd, c);
        
        c.gridx = 3;
        c.gridy = 4;
        frame.add(ButtonSub, c);
        
        c.gridx = 3;
        c.gridy = 2;
        frame.add(ButtonDiv, c);

        c.gridx = 3;
        c.gridy = 3;
        frame.add(ButtonMul, c);
        
        c.gridx = 0;
        c.gridy = 6;
        frame.add(ButtonDec, c);
        
        c.gridx = 2;
        c.gridy = 6;
        c.gridwidth = 2;
        frame.add(ButtonEq, c);
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton source = (JButton)e.getSource();
        if (ButtonAC == source) {
            TextField.setText("");
            Label.setText("");
            num1=0;
            num2=0;
            ops=1;
        } else if (ButtonC == source) {
            if(TextField.getText().length()==0) {
                num1=0;
                num2=0;
                ops=1;
                Label.setText("");
                return;
            }
            TextField.setText(TextField.getText().substring(0, TextField.getText().length() - 1));
        }else if(Button0 == source) {
            if (TextField.getText().equals("0")) return;
            TextField.setText(TextField.getText()+ 0);
        }
        else if(TextField.getText().length()>0) {
            num2 = Double.parseDouble(TextField.getText());
            switch (ops) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    num1 = num1 / num2;
                    break;
                case 5:
                    num1 = Math.pow(num1, num2);
            }
            if (num1 == (int) num1) num1 = (int) num1;
        }

        if(ButtonAdd == source){
            Label.setText(((num1==(int)num1)?(int)num1+"": num1+"" )+ "+");
            TextField.setText("");
            ops = 1;
        }else if(ButtonSub == source){
            Label.setText(((num1==(int)num1)?(int)num1+"": num1+"") + "-");
            TextField.setText("");
            ops = 2;
        }else if(ButtonMul == source){
            Label.setText(((num1==(int)num1)?(int)num1+"": num1+"") + "*");
            TextField.setText("");
            ops = 3;
        }else if(ButtonDiv == source){
            Label.setText(((num1==(int)num1)?(int)num1+"": num1+"")+ " /");
            TextField.setText("");
            ops = 4;
        }else if(ButtonPow == source){
            Label.setText(((num1==(int)num1)?(int)num1+"": num1+"")+ " ^");
            TextField.setText("");
            ops = 5;
        }else if(ButtonEq == source){
            if(TextField.getText().length()== 0) return;
            Label.setText("");
            TextField.setText((num1==(int)num1)?(int)num1+"": num1+""+"");
            num1=0;
            num2=0;
            ops=1;
        }
    }

}