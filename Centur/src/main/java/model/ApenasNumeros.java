package model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ApenasNumeros extends PlainDocument{

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (getLength() <= 9){
            super.insertString(i, string.replaceAll("[^0-9 | ^,]", ""), as);
        }
        
    }
    
}
