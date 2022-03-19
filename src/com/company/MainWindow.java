package com.company;

import javax.swing.*;

public class MainWindow {
    private JTextField firstNumberTextField;
    private JLabel lblSecondNum;
    private JLabel lblFisrtNum;
    private JTextField textFieldSecond;
    private JButton btnCalculate;
    private JComboBox chooseOperation;
    private JButton quitButton;
    protected JPanel calcGUI;
    private JButton clearBtn;
    private JButton isPrimeBtn;
    private JTextField textFieldPrimeNumber;
    private JButton isEvenBtn;
    private JButton aboutBtn;

    public MainWindow(){
        chooseOperation.addItem("add");
        chooseOperation.addItem("substract");
        chooseOperation.addItem("multiply");
        chooseOperation.addItem("divide");
        chooseOperation.addItem("powerOf");
        quitButton.addActionListener(e -> {
            System.exit(0);
        });
        isPrimeBtn.addActionListener(e ->{
            int primeInt = 0;
            if(!textFieldPrimeNumber.getText().toString().isEmpty()){
                primeInt = Integer.parseInt(textFieldPrimeNumber.getText());
            }
            Prime prime = new Prime(primeInt);
            boolean isPrime = prime.isPrime();
            if(isPrime){
                JOptionPane.showMessageDialog(null,Integer.toString(primeInt) + " is a prime number");
            }
            else{
                JOptionPane.showMessageDialog(null,Integer.toString(primeInt) + " is not a prime number");
            }
        });
        btnCalculate.addActionListener(e -> {
            String operation = chooseOperation.getSelectedItem().toString();
            double firstNumber = 0;
            double secondNumber = 0;
            if(!firstNumberTextField.getText().isEmpty()){
                firstNumber = Double.parseDouble(firstNumberTextField.getText());
            }
            if(!textFieldSecond.getText().isEmpty()){
                secondNumber = Double.parseDouble(textFieldSecond.getText());
            }
            double result;
            Calculator calc = new Calculator(firstNumber,secondNumber);
            switch (operation){
                case "add":
                    result = calc.add();
                    JOptionPane.showMessageDialog(null,"The result is "+Double.toString(result));
                    break;
                case "substract":
                    result = calc.substract();
                    JOptionPane.showMessageDialog(null,"The result is "+Double.toString(result));
                    break;
                case "multiply":
                    result = calc.multiply();
                    JOptionPane.showMessageDialog(null,"The result is "+Double.toString(result));
                    break;
                case "divide":
                    result = calc.divide();
                    JOptionPane.showMessageDialog(null,"The result is "+Double.toString(result));
                    break;
                case "powerOf":
                    result = calc.powerOf();
                    if(result < Double.MAX_VALUE/4){
                        JOptionPane.showMessageDialog(null,"The result is "+Double.toString(result));
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Range","The power of operator doesn't support negative numbers",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        });
        aboutBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"BSD 3-Clause License\n" +
                    "\n" +
                    "Copyright (c) 2022, Jorkano Faln\n" +
                    "All rights reserved.\n" +
                    "\n" +
                    "Redistribution and use in source and binary forms, with or without\n" +
                    "modification, are permitted provided that the following conditions are met:\n" +
                    "\n" +
                    "1. Redistributions of source code must retain the above copyright notice, this\n" +
                    "   list of conditions and the following disclaimer.\n" +
                    "\n" +
                    "2. Redistributions in binary form must reproduce the above copyright notice,\n" +
                    "   this list of conditions and the following disclaimer in the documentation\n" +
                    "   and/or other materials provided with the distribution.\n" +
                    "\n" +
                    "3. Neither the name of the copyright holder nor the names of its\n" +
                    "   contributors may be used to endorse or promote products derived from\n" +
                    "   this software without specific prior written permission.\n" +
                    "\n" +
                    "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"\n" +
                    "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE\n" +
                    "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE\n" +
                    "DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE\n" +
                    "FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL\n" +
                    "DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR\n" +
                    "SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER\n" +
                    "CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,\n" +
                    "OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE\n" +
                    "OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.");
        });
        isEvenBtn.addActionListener(e ->{
            int evenInt = 0;
            if(!textFieldPrimeNumber.getText().isEmpty()){
                evenInt = Integer.parseInt(textFieldPrimeNumber.getText());
            }
            Prime prime = new Prime(evenInt);
            boolean isEven = prime.isEven();
            if(isEven){
                JOptionPane.showMessageDialog(null,Integer.toString(evenInt) + " is an even number");
            }
            else{
                JOptionPane.showMessageDialog(null,Integer.toString(evenInt) + " is an odd number");
            }
        });
        clearBtn.addActionListener(e -> {
            firstNumberTextField.setText("");
            textFieldSecond.setText("");
            textFieldPrimeNumber.setText("");
            chooseOperation.setSelectedIndex(0);
        });
    }
}
