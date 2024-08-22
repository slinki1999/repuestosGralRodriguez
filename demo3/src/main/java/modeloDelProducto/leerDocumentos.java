package modeloDelProducto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leerDocumentos {
    
    public static void main(String[] args) {
        
        String archivo="C:\\Users\\criss\\Desktop\\Nueva carpeta\\demo3\\src\\main\\java\\modeloDelProducto\\retenesSueltos.txt";
        try (BufferedReader buffer=new BufferedReader(new FileReader(archivo));){
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
        

        
    }
}
