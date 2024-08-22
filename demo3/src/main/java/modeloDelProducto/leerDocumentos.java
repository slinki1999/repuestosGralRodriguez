package modeloDelProducto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class leerDocumentos {
    
    public static void main(String[] args) {
        
        //Leer documento
        String rutaArchivo="C:\\Users\\criss\\Desktop\\Nueva carpeta\\demo3\\src\\main\\java\\modeloDelProducto\\retenesSueltos.txt";
        try (BufferedReader buffer=new BufferedReader(new FileReader(rutaArchivo))){
            String cadena;
            int cont=0;
            while ((cadena=buffer.readLine())!=null) {
                System.out.println(cadena);
                cont++;
            }
            System.out.println(cont);
        } catch (IOException e) {
            System.out.println("Error de lectura!"+e.getMessage());
        }
        
        //Escribir en un documento
        try (FileWriter fileWriter = new FileWriter(rutaArchivo);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
            // Escribir el contenido en el archivo
            Scanner input= new Scanner(System.in);
            printWriter.println(input.next());
            
            // Confirmación de escritura
            System.out.println("El archivo se ha escrito correctamente.");
            
        } catch (IOException e) {
            // Manejo de posibles excepciones
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
        
    }
}
