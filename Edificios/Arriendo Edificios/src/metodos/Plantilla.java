
package metodos;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import java.io.FileOutputStream;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.Segment;

public class Plantilla {
    
    String contrato;
    String descripcion;
    String cliente;
    String edificio;
    String inicio;
    String termino;
    

    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    
    
    
    public Plantilla(String contrato, String descripcion, String cliente, String edificio, String inicio, String termino){
    
    this.contrato = contrato;
    this.descripcion = descripcion;
    this.cliente = cliente;
    this.edificio = edificio;
    this.inicio = inicio;
    this.termino = termino;

    
    documento = new Document();
    titulo = new Paragraph("Contrato de Arriendo de Edificios");
    
    
    }

    
    public void crearPlantilla(){
    try{
    
        archivo = new FileOutputStream("C:\\Users\\gabri\\Desktop\\"+ contrato +" .pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        titulo.setAlignment(1);
        
        
        documento.add(Chunk.NEWLINE);
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("ID Del Contrato :" + contrato));
        documento.add(new Paragraph("Descripcion del contrato : " + descripcion));
        documento.add(new Paragraph("Que corresponde al cliente con rut : " + cliente));
        documento.add(new Paragraph("Y corresponde al edificio con ID : " + edificio));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Que inicia en la fecha de" + inicio));
        documento.add(new Paragraph("Y finaliza en la fecha de" + termino));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Este documento valida el contrato entre el cliente y el edificio"));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Firma del Cliente : ________________________________________________________"));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Firma del administrador : ________________________________________________________"));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        Paragraph texto = new Paragraph("Documento oficial de ArriendosTemporada");
        
        texto.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(texto);
        
        documento.add(Chunk.NEWLINE);
        
        documento.close();
        
        System.out.println("Archivo PDF creado correctamente");
    
    }catch(Exception e){}
    
    
    }
    
}
