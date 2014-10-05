package progra2;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 * Clase que permite el envio de correos electronicos
 * @author Familia Alpizar R
 */
public class EnvioCorreo {
    
    //Atributos de la clase
    String usuarioCorreo;
    String password;
    
    String rutaArchivo; // para enviar un dato adjunto
    String nombreArchivo; // nombre que se mostrara en el correo
    
    String destinatario; // persona a la que sera destinado el correo 
    String asunto; // asunto del correo
    String mensaje; // cuerpo del correo
    
    
    /**
     * Constructor de la clase EnvioCorreo si se desea incluir datos adjuntos
     * @param usuarioCorreo Remitente del correo electronico
     * @param password Contraseña del remitente
     * @param rutaArchivo Ruta del archivo que se va a enviar
     * @param nombreArchivo Nombre con el que aparecerá la imagen en el correo electronico
     * @param destinatario Persona a la que se le enviara el correo electronico
     * @param asunto Asunto del correo
     * @param mensaje Mensaje o cuerpo del correo
     */
    public EnvioCorreo(String usuarioCorreo, String password, String rutaArchivo, String nombreArchivo, String destinatario, String asunto,String mensaje) {
        this.usuarioCorreo = usuarioCorreo;
        this.password = password; 
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    
    /**
     * Segundo costructor de la clase EnvioCorreo en la que no se adjuntan archivos
     * @param usuarioCorre Remitente del correo electronico
     * @param password Contraseña del remitente
     * @param destinatario Persona a la que se le enviara el correo electronico
     * @param mensaje Mensaje o cuerpo del correo
     */
    public EnvioCorreo(String usuarioCorre,String password,String destinatario,String mensaje){
        this(usuarioCorre,password,"","",destinatario,"",mensaje);
    }
    
    public EnvioCorreo(String usuarioCorre,String password,String destinatario,String asunto,String mensaje){
        this(usuarioCorre,password,"","",destinatario,asunto,mensaje);
    }    

    /**
     * Metodo que envia el correo electronico
     * @return true o false si el correo se envio correctamente o no
     */
    public boolean enviar(){
        try
        {
            Properties props = new Properties(); // propiedades
            props.put("mail.smtp.host", "smtp.gmail.com"); // servidor smtp de gmail 
            props.setProperty("mail.smtp.starttls.enable", "true");  
            props.setProperty("mail.smtp.port", "587"); // asigna puerto 
            props.setProperty("mail.smtp.user", usuarioCorreo); // asigna el lugar de donde seran enviados los correos
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props, null);
            BodyPart texto = new MimeBodyPart(); // alamacenara el mensaje del correo
            texto.setText(mensaje); // se asigna el mensaje del correo

            BodyPart adjunto = new MimeBodyPart(); // almacenara la ruta y el nombre del archivo que se va a adjuntar
            if (!rutaArchivo.equals("")){ 
                 adjunto.setDataHandler(
                    new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);                
            }

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto); // añadira el nombre del archivo al cuerpo del mensaje
            if (!rutaArchivo.equals("")){
                multiParte.addBodyPart(adjunto);
            }

            MimeMessage message = new MimeMessage(session); 
            message.setFrom(new InternetAddress(usuarioCorreo)); // asigna el remitente del correo
            message.addRecipient( 
                Message.RecipientType.TO,
                new InternetAddress(destinatario));
                message.setSubject(asunto); // asigna el destinarario asignado e incluye el asunto del correo
            message.setContent(multiParte); // contenido del mensaje

            Transport t = session.getTransport("smtp"); // acceso al servidor
            t.connect(usuarioCorreo, password); // conecta con el servidor
            t.sendMessage(message, message.getAllRecipients()); 
            t.close(); // desconecta el servidor
            return true;
        }
        catch (MessagingException e){
            return false;
        }        
    }
    /**
    public static void main(String[] args){
        String clave = "tareaprogramada2"; 
        EnvioCorreo e = new EnvioCorreo("sylalp7@gmail.com",clave,"C:\\Users\\Familia Alpizar R\\Desktop\\compu.JPG","compu.JPG","g.a.m.a130793@gmail.com","Adjunto","Prueba del tutorial para mandar un email");
        if (e.enviar()){
            System.out.println("El email se enviado correctamente");
        }else{
            System.out.println("El email no se enviado correctamente");
        }
    }*/

}
