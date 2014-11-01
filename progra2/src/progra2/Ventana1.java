package progra2;


import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Ventana1 extends JFrame{
    JPanel panel;
    public Ventana1(){
        setTitle("Grafico pastel");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }
 
    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset pastel = new DefaultPieDataset();
        pastel.setValue("Programacion", 45);
        pastel.setValue("Electronica", 11);
        pastel.setValue("Hacking", 19.5);
        pastel.setValue("SEO", 30.5);
        pastel.setValue("Redes", 2.0);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Ejemplo de pastel", pastel, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
        pieplot3d.setDepthFactor(0.2); // Esto lo que dicta es la inclinacion del pastel
        pieplot3d.setStartAngle(290D); // Este es el angulo en el que se mostrara inicialmente
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F); //ESta es la cantidad de transparencia del pastel
        
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
    public static void main(String args[]){
        new Ventana1().setVisible(true);
    }
}


