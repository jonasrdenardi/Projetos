package reports;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {

    private final String PATH = "reports/";     //diretório do relatório
    private final String filename;      //nome do arquivo
    private final Connection con;       //conexão com o banco de dados
    private final HashMap param;        // parâmetros

    public Relatorio(String filename, Connection con, HashMap param) {
        this.filename = PATH + filename;
        this.con = con;
        this.param = param;
    }

    public void show() {
        try {
            String jasperFile = filename + ".jasper";
            // Exporta para PDF
            String pdfFile = "reports/relatorio.pdf";
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFile, param, con);
            JasperExportManager.exportReportToPdfFile(jasperPrint, pdfFile);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "ERRO REL: " + ex.getMessage());
        }
    }
    /*    
    public void show(){
        try {
            //Preencher o Relatório com os Dados
            // JASPER --> JRPRINT
            JasperFillManager.fillReportToFile(this.filename + ".jasper", param, con);
            
            //Visualizar o Relatório
            JasperViewer jv = new JasperViewer(this.filename + ".jrprint", false, false);
            jv.setVisible(true);
        } catch (JRException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
     */
}
