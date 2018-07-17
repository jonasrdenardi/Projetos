package model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FormatoCpf extends PlainDocument {
    //(XX) XXXX-XXXX
    //(XX) XXXXX-XXXX

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {

        if (string != null) {
            if ((string.matches("\\d+") && getLength() < 15) || string.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
                super.insertString(i, string, as);
                insertNumeric();
            }
        }

    }

    private void insertNumeric() throws BadLocationException {
        String numericText = "";
        for (char character : super.getText(0, super.getLength()).toCharArray()) {
            if (Character.isDigit(character)) {
                numericText += character;
            }
        }
        if (getLength() > 0) {
            super.remove(0, getLength());
            super.insertString(0, formatPhoneNumber(numericText), null);
        }
    }

    private String formatPhoneNumber(String number) {
        String formatted = "";
        int numberLength = number.length();

        char[] numberCharSet = number.toCharArray();
        for (int i = 0; (i < numberLength && i < 11); i++) {
            formatted += before(i, numberLength);
            formatted += numberCharSet[i];
        }
        return formatted;
    }

    private String before(int index, int length) {
        String result = "";
        if (index == 3) {
            result = ".";
        }
        if (index == 6) {
            result = ".";
        }
        if (index == 9) {
            result = "-";
        }
        return result;
    }

    @Override
    public void remove(int i, int i1) throws BadLocationException {
        super.remove(i, i1);
        insertNumeric();
    }

}
