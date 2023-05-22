/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_append_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_12_APPEND_TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          String ruta = "c:\\archivos\\";
          writeUsingBufferedWriter(ruta, "Prueba de APPEND");
          
    }catch (IOException ex)
    private Object Looger;
{
    Looger.getLogger(EVA3_12_APPEND_TEXT.class.getName()).log();
}
     public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        
        File file = new File(ruta + "archivoBufferedWriter.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 2; i++) {
            bufWriter.write((i+1) + ". " + datos);
            bufWriter.write("\n\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
}
