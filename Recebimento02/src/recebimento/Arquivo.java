package recebimento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Arquivo {

    public void gravarArquivo(String endereco, int[] codProduto, String[] descricao, int[] quantidade, double[] peso) throws IOException {

        File arquivo = new File(endereco);
        int j = codProduto.length;

        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            FileWriter fw = new FileWriter(endereco);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i <= j - 1; i++) {
                bw.write(codProduto[i] + " - ");
                bw.write(descricao[i] + " - ");
                bw.write(quantidade[i] + " - ");
                bw.write(peso[i] + ";");                
                bw.newLine();
            }
            
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso.");

            bw.close();
            fw.close();

        } catch (IOException ex) {
        }
    }
}
