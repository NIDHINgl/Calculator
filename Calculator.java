package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

	JFrame jf;
	JLabel displayLabel;
	String labelText,operator;
	float firstValue = 0,SecondValue,result;
	boolean isOperatorClicked = false,isSyntaxError = false;
	
	JButton sevenButton,eightButton,nineButton,divisionButton,fourButton,fiveButton,sixButton,mulButton,oneButton,twoButton,threeButton,minusButton,zeroButton,dotButton,equalButton,addButton,clearButton;

	public Calculator(){
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(460,620);
		jf.setLocation(300,50);
		displayLabel = new JLabel();
		displayLabel.setBounds(30,50,380,60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setFont(displayLabel.getFont().deriveFont(30f));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);

		sevenButton = new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,30));
		eightButton.addActionListener(this);
		jf.add(eightButton);

		nineButton = new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,30));
		nineButton.addActionListener(this);
		jf.add(nineButton);

		divisionButton = new JButton("/");
		divisionButton.setBounds(330,130,80,80);
		divisionButton.setFont(new Font("Arial",Font.PLAIN,30));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);

		fourButton = new JButton("4");
		fourButton.setBounds(30,220,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,30));
		fourButton.addActionListener(this);
		jf.add(fourButton);

		fiveButton = new JButton("5");
		fiveButton.setBounds(130,220,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.setBounds(230,220,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,30));
		sixButton.addActionListener(this);
		jf.add(sixButton);

		mulButton = new JButton("x");
		mulButton.setBounds(330,220,80,80);
		mulButton.setFont(new Font("Arial",Font.PLAIN,30));
		mulButton.addActionListener(this);
		jf.add(mulButton);

		oneButton = new JButton("1");
		oneButton.setBounds(30,320,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,30));
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setBounds(130,320,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,30));
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setBounds(230,320,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,30));
		threeButton.addActionListener(this);
		jf.add(threeButton);

		minusButton = new JButton("-");
		minusButton.setBounds(330,320,80,80);
		minusButton.setFont(new Font("Arial",Font.PLAIN,30));
		minusButton.addActionListener(this);
		jf.add(minusButton);

		zeroButton = new JButton("0");
		zeroButton.setBounds(30,420,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		dotButton = new JButton(".");
		dotButton.setBounds(130,420,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,30));
		dotButton.addActionListener(this);
		jf.add(dotButton);

		equalButton = new JButton("=");
		equalButton.setBounds(230,420,80,80);
		equalButton.setFont(new Font("Arial",Font.PLAIN,30));
		equalButton.addActionListener(this);
		jf.add(equalButton);

		addButton = new JButton("+");
		addButton.setBounds(330,420,80,80);
		addButton.setFont(new Font("Arial",Font.PLAIN,30));
		addButton.addActionListener(this);
		jf.add(addButton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(30,520,380,40);
		clearButton.setFont(new Font("Arial",Font.PLAIN,28));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		/*System.out.println("HI");*/
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		labelText = displayLabel.getText();
		if(e.getSource() == nineButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "9");
		}else if(e.getSource() == eightButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "8");
		}else if(e.getSource() == sevenButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "7");
		}else if(e.getSource() == sixButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "6");
		}else if(e.getSource() == fiveButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "5");
		}else if(e.getSource() == fourButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "4");
		}else if(e.getSource() == threeButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "3");
		}else if(e.getSource() == twoButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "2");
		}else if(e.getSource() == oneButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "1");
		}else if(e.getSource() == zeroButton){
			checkSyntaxError();
			isOperatorClicked = false;
			displayLabel.setText(displayLabel.getText() + "0");
		}else if(e.getSource() == dotButton){
			if(isOperatorClicked) {
				displayLabel.setText("Syntax Error");
				isSyntaxError = true;
			}else {
				checkSyntaxError();
			    isOperatorClicked = true;
			    displayLabel.setText(displayLabel.getText() + ".");
			}		
		}else if(e.getSource() == clearButton){
			displayLabel.setText("");
			isOperatorClicked = false;
			firstValue = 0;
			SecondValue = 0;
		}else if(e.getSource() == addButton) {
			if(isOperatorClicked) {
				displayLabel.setText("Syntax Error");
				isSyntaxError = true;
			}else if(firstValue != 0){
				SecondValue = Float.parseFloat(labelText);
				firstValue = sum(operator,firstValue,SecondValue);
				operator = "+";
				isOperatorClicked = true;
				displayLabel.setText("");
			}else {
				operator = "+";
				isOperatorClicked = true; 
				firstValue = Float.parseFloat(labelText);
				displayLabel.setText("");
			}
			
		}else if(e.getSource() == minusButton) {
			if(isOperatorClicked) {
				displayLabel.setText("Syntax Error");
				isSyntaxError = true;
			}else if(firstValue != 0){
				SecondValue = Float.parseFloat(labelText);
				firstValue = sum(operator,firstValue,SecondValue);
				operator = "-";
				isOperatorClicked = true;
				displayLabel.setText("");
			}else {
				operator = "-";
				isOperatorClicked = true;  
				firstValue = Float.parseFloat(labelText);
				displayLabel.setText("");
			}
			
		}else if(e.getSource() == mulButton) {
			if(isOperatorClicked) {
				displayLabel.setText("Syntax Error");
				isSyntaxError = true;
			}else if(firstValue != 0){
				SecondValue = Float.parseFloat(labelText);
				firstValue = sum(operator,firstValue,SecondValue);
				operator = "*";
				isOperatorClicked = true;
				displayLabel.setText("");
			}else {
			    operator = "*";
			    isOperatorClicked = true;
			    firstValue = Float.parseFloat(labelText);
			    displayLabel.setText("");
			}
			
		}else if(e.getSource() == divisionButton) {
			if(isOperatorClicked) {
				displayLabel.setText("Syntax Error");
				isSyntaxError = true;
			}else if(firstValue != 0){
				SecondValue = Float.parseFloat(labelText);
				firstValue = sum(operator,firstValue,SecondValue);
				operator = "/";
				isOperatorClicked = true;
				displayLabel.setText("");
			}else {
			    operator = "/";
			    isOperatorClicked = true;
			    firstValue = Float.parseFloat(labelText);
			    displayLabel.setText("");
			}
			
		}else if(e.getSource() == equalButton) {
			switch(operator) {
			case "+":
				SecondValue = Float.parseFloat(labelText);
				result = firstValue + SecondValue;
				displayLabel.setText(result+"");
			    break;
			
			case "-":
				SecondValue = Float.parseFloat(labelText);
				result = firstValue - SecondValue;
				displayLabel.setText(result+"");
				break;
				
			case "*":
				SecondValue = Float.parseFloat(labelText);
				result = firstValue * SecondValue;
				displayLabel.setText(result+"");
				break;
				
			case "/":
				SecondValue = Float.parseFloat(labelText);
				result = firstValue / SecondValue;
				displayLabel.setText(result+"");
				break;
					
			}
			
			isOperatorClicked = false;
			firstValue = 0;
			SecondValue = 0;
			
		}
		
		/*jf.getContentPane().setBackground(Color.BLUE);*/
	}

	public static void main(String ar[]){
		new Calculator();
	}
	
	public float sum(String operator,float num1,float num2) {
		
		switch(operator) {
		case "+":
			result = num1 + num2;
		    break;
		
		case "-":
//			SecondValue = Float.parseFloat(labelText);
			result = firstValue - SecondValue;
//			displayLabel.setText(result+"");
			break;
			
		case "*":
			result = num1 + num2;
			break;
			
		case "/":
			result = num1 + num2;
			break;
				
		}
		
		return result;
	}
	
	public void checkSyntaxError() {
		if(isSyntaxError) {
			displayLabel.setText("");
			isOperatorClicked = false;
			firstValue = 0;
			SecondValue = 0;
			isSyntaxError = false;
		}
	}
}
