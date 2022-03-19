package com.example.calculators;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Label numberLabel;

    @FXML
    public boolean add = false;
    @FXML
    public boolean sub = false;
    @FXML
    public boolean mul = false;
    @FXML
    public boolean div = false;
    @FXML
    public boolean decimal = false;

    @FXML
    public String userInput = "";
    @FXML
    public int number1 = 0;
    @FXML
    public int number2 = 0;
    @FXML
    public double number1Double = 0;
    @FXML
    public double number2Double = 0;
    @FXML
    public char lastDigit;

    // Numbers
    @FXML
    public void num0() {

        userInput += "0";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num1() {

        userInput += "1";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num2() {
        userInput += "2";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num3() {
        userInput += "3";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num4() {
        userInput += "4";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num5() {
        userInput += "5";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num6() {
        userInput += "6";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num7() {
        userInput += "7";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num8() {
        userInput += "8";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void num9() {
        userInput += "9";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    @FXML
    public void decimal() {

        decimal = true;

        userInput += ".";
        numberLabel.setText(userInput);

        lastDigit = userInput.charAt(userInput.length() - 1);
    }

    // Operations
    @FXML
    public void addition() {

        number1 = Integer.parseInt(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1Double = 0;

        add = true;
        sub = false;
        mul = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void additionDecimal() {

        number1Double = Double.parseDouble(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1 = 0;

        add = true;
        sub = false;
        mul = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void handleAddition() {

        try {
            if (decimal) {
                additionDecimal();
            } else {
                addition();
            }
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }
    }

    @FXML
    public void subtraction() {

        number1 = Integer.parseInt(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1Double = 0;

        sub = true;
        add = false;
        mul = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void subtractionDecimal() {

        number1Double = Double.parseDouble(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1 = 0;

        sub = true;
        add = false;
        mul = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void handleSubtraction() {

        try {
            if (decimal) {
                subtractionDecimal();
            } else {
                subtraction();
            }
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }
    }

    @FXML
    public void multiplication() {

        number1 = Integer.parseInt(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1Double = 0;

        mul = true;
        add = false;
        sub = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void multiplicationDecimal() {

        number1Double = Double.parseDouble(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1 = 0;

        mul = true;
        add = false;
        sub = false;
        div = false;
        decimal = false;
    }

    @FXML
    public void handleMultiplication() {

        try {
            if (decimal) {
                multiplicationDecimal();
            } else {
                multiplication();
            }
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }

    }

    @FXML
    public void division() {

        number1 = Integer.parseInt(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1Double = 0;

        div = true;
        add = false;
        sub = false;
        mul = false;
        decimal = false;
    }

    @FXML
    public void divisionDecimal() {

        number1Double = Double.parseDouble(numberLabel.getText());
        numberLabel.setText("");
        userInput = "";

        number1 = 0;

        div = true;
        add = false;
        sub = false;
        mul = false;
        decimal = false;
    }

    @FXML
    public void handleDivision() {

        try {
            if (decimal) {
                divisionDecimal();
            } else {
                division();
            }
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }
    }

    @FXML
    public void equals() {

        number2 = Integer.parseInt(numberLabel.getText());

        numberLabel.setText("");

        boolean breakOut = false;

        if (number1Double != 0) {
            equalsParse2();
            breakOut = true;
        }

        if (!breakOut) {

            if (add) {
                numberLabel.setText(String.valueOf(number1 + number2));
                add = false;
            }

            if (sub) {
                numberLabel.setText(String.valueOf(number1 - number2));
                sub = false;
            }

            if (mul) {
                numberLabel.setText(String.valueOf(number1 * number2));
                mul = false;
            }

            if (div) {
                numberLabel.setText(String.valueOf(number1 / number2));
                div = false;
            }
            decimal = false;
        }
    }

    @FXML
    public void equalsDecimal() {

        number2Double = Double.parseDouble(numberLabel.getText());

        numberLabel.setText("");

        boolean breakOut = false;

        if (number1 != 0) {
            equalsParse();
            breakOut = true;
        }

        if (!breakOut) {
            if (add) {
                numberLabel.setText(String.valueOf(number1Double + number2Double));
                add = false;
            }

            if (sub) {
                numberLabel.setText(String.valueOf(number1Double - number2Double));
                sub = false;
            }

            if (mul) {
                numberLabel.setText(String.valueOf(number1Double * number2Double));
                mul = false;
            }

            if (div) {
                numberLabel.setText(String.valueOf(number1Double / number2Double));
                div = false;
            }
            decimal = false;
        }
    }

    @FXML
    public void equalsParse() {

        if (add) {
            numberLabel.setText(String.valueOf((double) number1 + number2Double));
            add = false;
        }

        if (sub) {
            numberLabel.setText(String.valueOf((double) number1 - number2Double));
            sub = false;
        }

        if (mul) {
            numberLabel.setText(String.valueOf((double) number1 * number2Double));
            mul = false;
        }

        if (div) {
            numberLabel.setText(String.valueOf((double) number1 / number2Double));
            div = false;
        }
        decimal = true;
    }

    @FXML
    public void equalsParse2() {

        if (add) {
            numberLabel.setText(String.valueOf(number1Double + (double) number2));
            add = false;
        }

        if (sub) {
            numberLabel.setText(String.valueOf(number1Double - (double) number2));
            sub = false;
        }

        if (mul) {
            numberLabel.setText(String.valueOf(number1Double * (double) number2));
            mul = false;
        }

        if (div) {
            numberLabel.setText(String.valueOf(number1Double / (double) number2));
            div = false;
        }
        decimal = true;
    }

    @FXML
    public void handleEquals() {

        try {
            if (decimal) {
                equalsDecimal();
            } else {
                equals();
            }
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }

    }

    @FXML
    public void clear() {

        number1 = 0;
        number2 = 0;
        number1Double = 0;
        number2Double = 0;
        numberLabel.setText("");
        userInput = "";

        div = true;
        add = false;
        sub = false;
        mul = false;
        decimal = false;

    }

    @FXML
    public void remove() {

        try {
            userInput = userInput.substring(0 , userInput.length() - 1);
            numberLabel.setText(userInput);
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }

    }

    @FXML
    public void abs() {

        try {
            int number = (int) Double.parseDouble(userInput);

            number *= -1;

            userInput = String.valueOf(number);
            numberLabel.setText(userInput);

            decimal = false;
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }

    }

    @FXML
    public void squareRoot() {

        try {
            userInput = String.valueOf(Math.sqrt(Double.parseDouble(numberLabel.getText())));
            numberLabel.setText(userInput);

            decimal = true;
        } catch (Exception e) {
            numberLabel.setText("No input.");
        }
    }
}