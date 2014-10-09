package progra2;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Familia Alpizar R
 */
public class VentanaPrincipal extends javax.swing.JFrame {


    
   Reloj reloj = new Reloj(1, 2, 1200, 230);//Instancia de nuestra clase Reloj
   private File fichero; // guarda la imagen elegida en el FileChooser
   JFileChooser fileChooser = new JFileChooser();  // instancia de la JFileChooser para seleccionar imagenes
   ImageIcon icon; // instancia de ImageIcon para cargar la imagenes
   private static Banco bankito;
   private static Archivos archivo;
   private static ColaPrioridad colaGeneral;
   private static String genteCola;
   private static Contador contSistema;
   static String logoestatico;
    
    
    /**
     * Constructor de la Ventana Principal
     */    
    public VentanaPrincipal() {
         prueba serial = new prueba();

        System.out.println(serial.leer( "Clientes.bin")[0][0]);
        
        try{

            File hola = new File("Clientes.bin");
            System.out.println("Entro");
            if(null==serial.leer( "Clientes.bin")){
                throw new Exception("Error compa");
            }
        }catch(Exception a){
            System.out.println("Creando archivo.bin");
            Object[][] objeto=new Object[1000][5];
           serial.guardar(objeto, "Clientes.bin");
            
        }
        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//Centrado del texto 
        reloj.setFont(new java.awt.Font("Arial", 1, 18));//tipo de letra y tamaño 
        this.getContentPane().add(reloj);//agrega el reloj  a la pantalla
        this.getContentPane().setBackground(Color.white); // fondo blanco en la pantalla
        initComponents(); 
        
        VentanaPrincipal.colaGeneral = new ColaPrioridad();
        Contador contadorTiquete = new Contador();
        VentanaPrincipal.contSistema = contadorTiquete;
        
        Archivos archivo = new Archivos();
    	archivo.generarDirectorio();
    	archivo.archivoTxt("datos.txt");
        VentanaPrincipal.archivo = archivo;
        
        String[] arreglo = archivo.leerTxt("datos.txt");
        logoestatico=arreglo[2];
        System.out.println("Este es el valor de la variable estatica: "+logoestatico);
  
        if(arreglo[0]!= null){
            int cantidad = Integer.parseInt(arreglo[1]);
            VentanaPrincipal.bankito = new Banco(arreglo[0],cantidad);
            nombreBanco.setText("Bienvenido al Banco" + " " + bankito.getNombre()); // coloca el nombre en la pantalla principal
            cantidadCajas.setText(String.valueOf(bankito.getCantidadCajas())); // coloca la cantidad de cajas en la pantalla principal
            cajasDisponibles.setText(String.valueOf(bankito.getDisponibles())); // coloca la cantidad de cajas que estan disponibles al inicio

         
            try{
                icon = new ImageIcon(arreglo[2]);
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(logoBanco.getWidth(), logoBanco.getHeight(),Image.SCALE_DEFAULT));
                logoBanco.setText(null);
                logoBanco.setIcon(icono);

            }
            catch(Throwable e){
                
            }

        }
        
    }
    
    public static Banco getBanco(){
        return VentanaPrincipal.bankito;
    }
    
    public static ColaPrioridad getCola(){
        return VentanaPrincipal.colaGeneral;
    }
    
    public static void setPersonaCola(Persona personita,String prioridad){
        VentanaPrincipal.colaGeneral.añadirColaPersonas(personita, prioridad);
    }
    public static void setCantidad(String cantidad){
        VentanaPrincipal.genteCola = cantidad;
        //personasEnCola.setText(genteCola);
    }
    public static Contador getContador(){
        return VentanaPrincipal.contSistema;
    }
    public static void setContador(Contador cont){
        VentanaPrincipal.contSistema = cont;
    }
           
    
    /**
     * Método que aplica la configuracion de las caracteristicas de banco
     * @param banco Recibe todas las caracteristicas del banco con las que va a funcionar el programa  
     */
    public void añadir(Banco banco){
        VentanaPrincipal.bankito = banco;
        String nombre = bankito.getNombre(); // obtiene el nombre del banco
        int valor = bankito.getDisponibles(); // obtiene la cantidad de cajas que tiene el banco
        int cajas = bankito.getCantidadCajas();
        
        nombreBanco.setText("Bienvenido al Banco" + " " + nombre); // coloca el nombre en la pantalla principal
        cajasDisponibles.setText(String.valueOf(valor)); // coloca la cantidad de cajas que estan disponibles al inicio
        cantidadCajas.setText(String.valueOf(cajas));
        String var = Integer.toString(cajas);
        String imagen = "@";
        if(VentanaPrincipal.archivo.leerTxt("datos.txt")[0]!= null){

            String[] arreglo = VentanaPrincipal.archivo.leerTxt("datos.txt");
            VentanaPrincipal.archivo.borrarLineaTxt("datos.txt", arreglo[0]);
            VentanaPrincipal.archivo.borrarLineaTxt("datos.txt",arreglo[1]);
            VentanaPrincipal.archivo.borrarLineaTxt("datos.txt",arreglo[2]);
            var = arreglo[1];
            imagen = arreglo[2];
        }
        try{
            int verificar = Integer.parseInt(var);
        }
        catch(Throwable e){
           var = Integer.toString(cajas);
        }

        archivo.archivoTxt("datos.txt");
        archivo.escribirTxt(nombre, "datos.txt");
        archivo.escribirTxt("\r\n" + var, "datos.txt");
        archivo.escribirTxt("\r\n" + imagen, "datos.txt");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoBanco = new javax.swing.JPanel();
        nuevaPersona = new javax.swing.JButton();
        panelCantidadCajas = new javax.swing.JPanel();
        cantidadCajas = new javax.swing.JLabel();
        panelCajasDisp = new javax.swing.JPanel();
        cajasDisponibles = new javax.swing.JLabel();
        panelCajasOcupadas = new javax.swing.JPanel();
        cajasOcupadas = new javax.swing.JLabel();
        btnLiberarCaja = new javax.swing.JButton();
        imagenGuarga = new javax.swing.JLabel();
        nombreBanco = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        logoBanco = new javax.swing.JLabel();
        btnSeleccionarImagen = new javax.swing.JButton();
        panelFechaHora = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pcola = new javax.swing.JLabel();
        personasEnCola = new javax.swing.JLabel();
        sig = new javax.swing.JLabel();
        btnAtender = new javax.swing.JButton();
        siguientePersona = new javax.swing.JLabel();
        tiq = new javax.swing.JLabel();
        tiquete = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opcionDeConfiguracion = new javax.swing.JMenu();
        opcionConfiguracion = new javax.swing.JMenuItem();
        opcionDeReportes = new javax.swing.JMenu();
        opcioListaClientes = new javax.swing.JMenuItem();
        opcionGTipoCliente = new javax.swing.JMenuItem();
        opcionGClientesAtendidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de atención al cliente BAC San José");
        setBackground(new java.awt.Color(255, 255, 255));

        infoBanco.setBackground(new java.awt.Color(255, 255, 255));
        infoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        nuevaPersona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nuevaPersona.setText("Nueva Persona");
        nuevaPersona.setFocusable(false);
        nuevaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPersonaActionPerformed(evt);
            }
        });

        panelCantidadCajas.setBackground(new java.awt.Color(255, 255, 255));
        panelCantidadCajas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cantidad de cajas "));
        panelCantidadCajas.setFocusable(false);

        cantidadCajas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cantidadCajas.setText("0");

        javax.swing.GroupLayout panelCantidadCajasLayout = new javax.swing.GroupLayout(panelCantidadCajas);
        panelCantidadCajas.setLayout(panelCantidadCajasLayout);
        panelCantidadCajasLayout.setHorizontalGroup(
            panelCantidadCajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCantidadCajasLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(cantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panelCantidadCajasLayout.setVerticalGroup(
            panelCantidadCajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCantidadCajasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantidadCajas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCajasDisp.setBackground(new java.awt.Color(255, 255, 255));
        panelCajasDisp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cajas Disponibles"));

        cajasDisponibles.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajasDisponibles.setText("0");

        javax.swing.GroupLayout panelCajasDispLayout = new javax.swing.GroupLayout(panelCajasDisp);
        panelCajasDisp.setLayout(panelCajasDispLayout);
        panelCajasDispLayout.setHorizontalGroup(
            panelCajasDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCajasDispLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(cajasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelCajasDispLayout.setVerticalGroup(
            panelCajasDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajasDispLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajasDisponibles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCajasOcupadas.setBackground(new java.awt.Color(255, 255, 255));
        panelCajasOcupadas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cajas Ocupadas"));

        cajasOcupadas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajasOcupadas.setText("0");

        btnLiberarCaja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLiberarCaja.setText("Liberar una caja");
        btnLiberarCaja.setFocusable(false);
        btnLiberarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCajasOcupadasLayout = new javax.swing.GroupLayout(panelCajasOcupadas);
        panelCajasOcupadas.setLayout(panelCajasOcupadasLayout);
        panelCajasOcupadasLayout.setHorizontalGroup(
            panelCajasOcupadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajasOcupadasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCajasOcupadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCajasOcupadasLayout.createSequentialGroup()
                        .addComponent(btnLiberarCaja)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCajasOcupadasLayout.createSequentialGroup()
                        .addComponent(cajasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        panelCajasOcupadasLayout.setVerticalGroup(
            panelCajasOcupadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCajasOcupadasLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(cajasOcupadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiberarCaja)
                .addContainerGap())
        );

        imagenGuarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("guardia.jpg"))); // NOI18N

        nombreBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreBanco.setText("Configurar nombre del banco");

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));

        logoBanco.setText("              Configurar logo del banco");
        logoBanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSeleccionarImagen.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSeleccionarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Editar.JPG"))); // NOI18N
        btnSeleccionarImagen.setBorderPainted(false);
        btnSeleccionarImagen.setContentAreaFilled(false);
        btnSeleccionarImagen.setDefaultCapable(false);
        btnSeleccionarImagen.setFocusable(false);
        btnSeleccionarImagen.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnSeleccionarImagen.setMaximumSize(new java.awt.Dimension(44, 36));
        btnSeleccionarImagen.setOpaque(true);
        btnSeleccionarImagen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("editarPrecionado.JPG"))); // NOI18N
        btnSeleccionarImagen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("ediSeleccionado.JPG"))); // NOI18N
        btnSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addComponent(btnSeleccionarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addComponent(logoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelFechaHora.setBackground(new java.awt.Color(255, 255, 255));
        panelFechaHora.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Fecha y Hora del sistema"));

        javax.swing.GroupLayout panelFechaHoraLayout = new javax.swing.GroupLayout(panelFechaHora);
        panelFechaHora.setLayout(panelFechaHoraLayout);
        panelFechaHoraLayout.setHorizontalGroup(
            panelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFechaHoraLayout.setVerticalGroup(
            panelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        Pcola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pcola.setText("Personas en cola: ");

        personasEnCola.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        personasEnCola.setText("0");

        sig.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sig.setText("Siguiente:");

        btnAtender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.setFocusPainted(false);
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        siguientePersona.setBackground(new java.awt.Color(255, 255, 255));
        siguientePersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        siguientePersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tiq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tiq.setText("Tiquete:");

        tiquete.setBackground(new java.awt.Color(204, 255, 204));
        tiquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout infoBancoLayout = new javax.swing.GroupLayout(infoBanco);
        infoBanco.setLayout(infoBancoLayout);
        infoBancoLayout.setHorizontalGroup(
            infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBancoLayout.createSequentialGroup()
                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoBancoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelCajasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelCantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelCajasOcupadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoBancoLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(nuevaPersona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infoBancoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(infoBancoLayout.createSequentialGroup()
                                        .addComponent(Pcola, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(personasEnCola)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtender)
                                        .addGap(30, 30, 30))
                                    .addGroup(infoBancoLayout.createSequentialGroup()
                                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sig)
                                            .addComponent(tiq))
                                        .addGap(18, 18, 18)
                                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(siguientePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(imagenGuarga)))
                .addGap(22, 22, 22))
        );
        infoBancoLayout.setVerticalGroup(
            infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBancoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombreBanco)
                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelCantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCajasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(infoBancoLayout.createSequentialGroup()
                                .addComponent(panelFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelCajasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagenGuarga, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(infoBancoLayout.createSequentialGroup()
                        .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoBancoLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2))
                            .addGroup(infoBancoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Pcola)
                                        .addComponent(personasEnCola))
                                    .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(siguientePersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sig))
                                .addGap(24, 24, 24)
                                .addGroup(infoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tiquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tiq))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevaPersona)
                        .addGap(25, 25, 25))))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(86, 26));

        opcionDeConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        opcionDeConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("conf.png"))); // NOI18N

        opcionConfiguracion.setText("Configurar datos");
        opcionConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionConfiguracionActionPerformed(evt);
            }
        });
        opcionDeConfiguracion.add(opcionConfiguracion);

        jMenuBar1.add(opcionDeConfiguracion);

        opcionDeReportes.setText("Reportes");

        opcioListaClientes.setText("Lista de Clientes");
        opcioListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioListaClientesActionPerformed(evt);
            }
        });
        opcionDeReportes.add(opcioListaClientes);

        opcionGTipoCliente.setText("Gráfico según tipo de cliente");
        opcionGTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionGTipoClienteActionPerformed(evt);
            }
        });
        opcionDeReportes.add(opcionGTipoCliente);

        opcionGClientesAtendidos.setText("Gráfico de clientes atendidos");
        opcionGClientesAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionGClientesAtendidosActionPerformed(evt);
            }
        });
        opcionDeReportes.add(opcionGClientesAtendidos);

        jMenuBar1.add(opcionDeReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(infoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    /**
     * Abre la ventana para configurar los datos del banco
     * @param evt 
     */
    private void opcionConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionConfiguracionActionPerformed
        VentanaDeConfiguracion config = new VentanaDeConfiguracion(this,true);
        config.setVisible(true);

    }//GEN-LAST:event_opcionConfiguracionActionPerformed

    
    
    
    /**
     * Abre la ventana de que muestra la lista de los clientes que han sido atendidos por el banco
     * @param evt 
     */
    private void opcioListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioListaClientesActionPerformed
        Object[][] arreglo ={{1,2,3,4,5}};
        VentanaListaClientes a = new VentanaListaClientes(this,arreglo);
       
        
             
        
    }//GEN-LAST:event_opcioListaClientesActionPerformed

    
    
    
    /**
     * Abre la ventana donde se observaran los graficos de barras y pastel de los tipos de clientes
     * @param evt 
     */
    private void opcionGTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionGTipoClienteActionPerformed
        VentanaGraficoTipoClientes grafico = new VentanaGraficoTipoClientes(this,true);
        grafico.setVisible(true);
    }//GEN-LAST:event_opcionGTipoClienteActionPerformed

    
    
    
    /**
     * Abre la ventana donde se mostrara el grafico de todos los clientes atendidos por hora y por dia
     * @param evt 
     */
    private void opcionGClientesAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionGClientesAtendidosActionPerformed
        VentanaGrafClientesAtendidos clientes = new VentanaGrafClientesAtendidos(this,true);
        clientes.setVisible(true);
    }//GEN-LAST:event_opcionGClientesAtendidosActionPerformed

    private void btnSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImagenActionPerformed
        //creacion de filtro que solo muestre imagenes
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        fileChooser.setFileFilter(filtro);

        int seleccion = fileChooser.showOpenDialog(this); // imagen seleccionada

        // no continua hasta que se elija una imagen
        if (JFileChooser.APPROVE_OPTION == seleccion){
            fichero = fileChooser.getSelectedFile();

            VentanaPrincipal.archivo.redireccionarImagen(fichero.toString());
            String nuevaImagen = VentanaPrincipal.archivo.getDirectorioFinal() + fichero.getName();
            String[] datos = VentanaPrincipal.archivo.leerTxt("datos.txt");
            
            if(VentanaPrincipal.archivo.leerTxt("datos.txt")[0] != null){
                VentanaPrincipal.archivo.borrarLineaTxt("datos.txt", datos[0]);
                VentanaPrincipal.archivo.borrarLineaTxt("datos.txt", datos[1]);
                VentanaPrincipal.archivo.borrarLineaTxt("datos.txt", datos[2]);
                VentanaPrincipal.archivo.escribirTxt(datos[0],"datos.txt");
                VentanaPrincipal.archivo.escribirTxt("\r\n" + datos[1],"datos.txt");
                VentanaPrincipal.archivo.escribirTxt("\r\n" + nuevaImagen, "datos.txt");
            }
            else{
                VentanaPrincipal.archivo.escribirTxt("Banco","datos.txt");
                VentanaPrincipal.archivo.escribirTxt("\r\n" + "@","datos.txt");
                VentanaPrincipal.archivo.escribirTxt("\r\n" + nuevaImagen, "datos.txt");
            }
            try{
                icon = new ImageIcon(nuevaImagen);
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(logoBanco.getWidth(), logoBanco.getHeight(),
                    Image.SCALE_DEFAULT)); // obtiene el ancho y la altuta del label para colocar la imagen con las mismas dimensiones
            logoBanco.setText(null); // borra el texto del label
            logoBanco.setIcon(icono); // coloca la imagen dentrol del label

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen. Por favor elija una imagen nuevamente",
                "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnSeleccionarImagenActionPerformed

    /**
     * Libera las cajas para que los demas clientes puedan ser atendidos 
     * @param evt 
     */
    private void btnLiberarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarCajaActionPerformed
        String cjOcupadas = cajasOcupadas.getText(); // obtiene la cantidad de cajas ocupadas en el momento
        if ( "0".equals(cjOcupadas)){ // si no hay cajas ocupadas se mostrara un mensaje en pantalla
            JOptionPane.showMessageDialog(null, "No hay cajas ocupadas", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            bankito.restarOcupadas();
            cajasDisponibles.setText((Integer.parseInt(cantidadCajas.getText())-Integer.parseInt(cajasOcupadas.getText()))+1+"");
            String tamaño = Integer.toString(bankito.getCantidadOcupadas());
            cajasOcupadas.setText(tamaño);
            

        }
    }//GEN-LAST:event_btnLiberarCajaActionPerformed

    /**
     * Abre la ventana en la que se recolectan los datos de los clientes
     * @param evt 
     */
    private void nuevaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPersonaActionPerformed
        InformacionPersona ventana = new InformacionPersona(this,true);
        ventana.setVisible(true);
        String tamaño = Integer.toString(VentanaPrincipal.colaGeneral.getTamaño());
        personasEnCola.setText(tamaño);
        Persona primera = (Persona)colaGeneral.getElemento(0);
        siguientePersona.setText(primera.getNombre());
        tiquete.setText(primera.getTiquete());
        Object[][] temp = new Object[100][5];
        Object[] te= new Object[5];
        prueba serial = new prueba();
        int inttemporal=0;
        for(int j=0;serial.leer("Clientes.bin")[j]!=null;j++){
            temp[j][0]=serial.leer("Clientes.bin")[j][0];
            temp[j][1]=serial.leer("Clientes.bin")[j][1];
            temp[j][2]=serial.leer("Clientes.bin")[j][2];
            temp[j][3]=serial.leer("Clientes.bin")[j][3];
            temp[j][4]="";
            inttemporal++;
            
            
        }
        /*for(int i = inttemporal-1;colaGeneral.getElemento(i)!=null;i++){
            
            
               Persona temporal = (Persona)colaGeneral.getElemento(i);
               System.out.println(temporal.getNombre());
               temp[i][0]=temporal.getNombre();
               temp[i][1]=temporal.getCorreo();
               temp[i][2]=temporal.getPrioridad();
               temp[i][3]=temporal.getTiquete();
               temp[i][4]="";
               
           }*/
        serial.guardar(temp, "Clientes.bin");
        System.out.println(serial.leer("Clientes.bin")[0][0]);
        Object[][] y = serial.leer("Clientes.bin");
        System.out.println("Esto es lo que tiene el arreglo"+y[0][0]);
        
        
        /*for(int n =0;y[n]!=null;n++ ){
            System.out.println(y[n][0]);
        }*/
      //  serializar serial = new serializar();
        
        
    }//GEN-LAST:event_nuevaPersonaActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
       if (cajasOcupadas.getText().equals(cajasDisponibles.getText())){
           JOptionPane.showMessageDialog(null, "No hay cajas disponibles", "Atención", JOptionPane.INFORMATION_MESSAGE);
       }
       else if(bankito.getCantidadOcupadas()<= bankito.getDisponibles()){
           System.out.println("Estas son las personas que se encuentran en cola");
           for(int i = 0;colaGeneral.getElemento(i)!=null;i++){
               Persona temporal = (Persona)colaGeneral.getElemento(i);
               System.out.println(temporal.getNombre());
               
           }
            Persona primera = (Persona)colaGeneral.getElemento(0);
            System.out.println("Esto es lo que se imprime:   "+logoestatico );

            EnvioCorreo e = new EnvioCorreo("andreysanchezcr@gmail.com","+9d9542ab93+",logoestatico,"santayana.JPG",primera.getCorreo(),"Estimado usuario"+primera.getNombre(),"Se le informa que existen cajeros disponibles para atenderlo\n Por favor haga uso de los servicios brindados");
            if (e.enviar()){
                System.out.println("El email se enviado correctamente");
            }else{
            System.out.println("El email no se enviado correctamente");
            }
     
            if(colaGeneral.getElemento(0)!= null){
                bankito.sumarOcupadas();
                String ocupadas = Integer.toString(bankito.getCantidadOcupadas());
                cajasOcupadas.setText(ocupadas);
                colaGeneral.descolar();
            }
            if(colaGeneral.getElemento(0) != null){
               // Persona primera = (Persona)colaGeneral.getElemento(0);
 
    
                siguientePersona.setText(primera.getNombre());
                tiquete.setText(primera.getTiquete());    
            }
            else{
                siguientePersona.setText(null);
                tiquete.setText(null);
                

                }
            }
       
            
        String tamaño = Integer.toString(VentanaPrincipal.colaGeneral.getTamaño());
        personasEnCola.setText(tamaño); 
         
    }//GEN-LAST:event_btnAtenderActionPerformed

    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pcola;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnLiberarCaja;
    private javax.swing.JButton btnSeleccionarImagen;
    public javax.swing.JLabel cajasDisponibles;
    public javax.swing.JLabel cajasOcupadas;
    public javax.swing.JLabel cantidadCajas;
    private javax.swing.JLabel imagenGuarga;
    private javax.swing.JPanel infoBanco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel logoBanco;
    private javax.swing.JLabel nombreBanco;
    private javax.swing.JButton nuevaPersona;
    private javax.swing.JMenuItem opcioListaClientes;
    private javax.swing.JMenuItem opcionConfiguracion;
    private javax.swing.JMenu opcionDeConfiguracion;
    private javax.swing.JMenu opcionDeReportes;
    private javax.swing.JMenuItem opcionGClientesAtendidos;
    private javax.swing.JMenuItem opcionGTipoCliente;
    private javax.swing.JPanel panelCajasDisp;
    private javax.swing.JPanel panelCajasOcupadas;
    private javax.swing.JPanel panelCantidadCajas;
    private javax.swing.JPanel panelFechaHora;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JLabel personasEnCola;
    private javax.swing.JLabel sig;
    private javax.swing.JLabel siguientePersona;
    private javax.swing.JLabel tiq;
    private javax.swing.JLabel tiquete;
    // End of variables declaration//GEN-END:variables
}
