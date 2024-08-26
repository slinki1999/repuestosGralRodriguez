package modeloDelProducto;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class practicandoDocumentosJSON {

    //JSON
    public static String crearJSON(Object repuesto) {
        GsonBuilder gsonbuilder= new GsonBuilder();
        gsonbuilder.setPrettyPrinting();
        Gson gson= gsonbuilder.create();
        String json=gson.toJson(repuesto);
        return json;
    }

    public static void guardarJSON(String _json, String nombreDoc) {
        try (FileOutputStream out = new FileOutputStream(nombreDoc)){
            out.write(_json.getBytes());
            System.out.println("Se cargo un objeto en el doc json : "+ nombreDoc);
        } catch (IOException e) {
            System.out.println("Error al guardar json: "+e.getMessage());
        }
    }

    public static void guardarJSON_Version2() {
        // Ruta del archivo JSON
        String filePath = "data.json";
        Gson gson = new Gson();
        JsonObject jsonObject;

        try {
            // Intentar leer el archivo JSON
            FileReader reader = new FileReader(filePath);
            jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            reader.close();
        } catch (IOException e) {
            // Si el archivo no existe, crear un nuevo JsonObject
            jsonObject = new JsonObject();
        }

        // Modificar o agregar datos
        jsonObject.addProperty("new_key", "new_value");
        JsonObject nestedObject = new JsonObject();
        nestedObject.addProperty("nested_key", "nested_value");
        jsonObject.add("nested_object", nestedObject);

        // Guardar los datos actualizados en el archivo JSON
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(jsonObject, writer);
            System.out.println("Datos guardados y actualizados.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }

    public static ArrayList<String> lecturaDoc() {
        ArrayList<String> list = new ArrayList<>();
        String rutaArchivo="C:\\Users\\criss\\Desktop\\Nueva carpeta\\demo3\\src\\main\\java\\modeloDelProducto\\retenesSueltos.txt";
        try (BufferedReader buffer=new BufferedReader(new FileReader(rutaArchivo))){
            String cadena;
            while ((cadena=buffer.readLine())!=null) {
                list.add(cadena);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura!"+e.getMessage());
        }
        return list;
    }

    //guardarObjetosEnLista

    public static ArrayList<Object> obtenerObjetos(ArrayList<String> lista) {
        ArrayList<Object> listaRepuestos = new ArrayList<>();
        for (String linea: lista) {
            ArrayList<String> atributos= obtenerAtributos(linea);
            Double atributoPrecio=Double.parseDouble(atributos.get(5));
            repuestoParaAuto repuesto= new repuestoParaAuto(atributos.get(0), atributos.get(1), atributos.get(2),
            atributos.get(3), atributos.get(4), atributoPrecio);
            listaRepuestos.add(repuesto);
        }
        return listaRepuestos;
    }

    public static ArrayList<String> obtenerAtributos(String linea) {
        ArrayList<String> _atributos = new ArrayList<>();
        String cadena="";
        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) == ';') {
                _atributos.add(cadena);
                cadena="";
            } else {
                cadena+=linea.charAt(i);
            }
            
        }
        _atributos.add(cadena);
        return _atributos;
    }

    public static String crearAtributo(String cadena) {
        if (cadena.isEmpty() || cadena.length()<1) {
            return cadena;
        }
        return "" + cadena.charAt(0)+crearAtributo(resto(cadena));
    }
    public static String resto(String cadena) {
        return cadena.substring(1);
    }

    public static void main(String[] args) {
        //Nombre del documento.JSON
        String archivo= "tiendaRepuesto1.json";

        //Lectura del documento.txt
        ArrayList<String> listRetenes = lecturaDoc();

        //Objetos en una lista
        ArrayList<Object> listObjetos=obtenerObjetos( listRetenes);

        for (Object elem : listObjetos) {
            String jsonCreado=crearJSON(elem);
            //System.out.println(jsonCreado);
            //guardarJSON(jsonCreado, archivo);
        }
        
        
        
        
       
    }
}
