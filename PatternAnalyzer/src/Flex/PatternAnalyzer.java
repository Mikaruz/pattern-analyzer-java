package Flex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAnalyzer {
 
    public static String analizadorPatrones(String inputText){
       
        // Definir los patrones y las etiquetas correspondientes
        Pattern capitalizedPattern = Pattern.compile("\\b[A-Z][a-z]+\\b");
        Pattern datePattern = Pattern.compile("\\b\\d{2}-\\d{2}-\\d{4}\\b");
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Pattern phonePattern = Pattern.compile("\\b[0-9]{9}\\b");

        // Realizar el análisis léxico
        Matcher matcher = capitalizedPattern.matcher(inputText);
        String textoAnalizado = "";
        while (matcher.find()) {
            textoAnalizado = textoAnalizado + "Palabra con mayúscula: " + matcher.group() + "\n";
        }

        matcher = datePattern.matcher(inputText);
        while (matcher.find()) {
            textoAnalizado = textoAnalizado + "Fecha: " + matcher.group() + "\n";
        }

        matcher = emailPattern.matcher(inputText);
        while (matcher.find()) {
            textoAnalizado = textoAnalizado + "Correo electrónico: " + matcher.group() + "\n";
        }

        matcher = phonePattern.matcher(inputText);
        while (matcher.find()) {
            textoAnalizado = textoAnalizado + "Teléfono: " + matcher.group() + "\n";
        }
        
        
        
        return textoAnalizado;
    }
}
