
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
*
* @author Mario
*/
public class FechaHora {
    DateFormat dateFormat;
    Date date;

    FechaHora(){
    date = new Date();
    
    
    }
    String getFecha(){
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
        
        
    }
    String getHora(){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        return hourFormat.format(date);
        
    }
    String getFechaHora(){
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return hourdateFormat.format(date);
    }

public static void main(String[] args) {
//Caso 1: obtener la hora y salida por pantalla con formato:
FechaHora reloj = new FechaHora();
System.out.println(reloj.getFecha());
}
}