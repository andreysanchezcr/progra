package progra2;


import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Pastel extends JFrame{
    public Pastel(){
        setTitle("Grafico pastel");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        barras();
    }
    void borrar(){
        
        
        //this.removeAll();
    }
        private void barras() {
        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(8, "Mujeres", "Lunes");
        dataset.setValue(7, "Hombres", "Lunes");
        dataset.setValue(9, "Mujeres", "Martes");
        dataset.setValue(4, "Hombres", "Martes");
        dataset.setValue(4, "Mujeres", "Miercoles");
        dataset.setValue(5, "Hombres", "Miercoles");
        dataset.setValue(8, "Mujeres", "Jueves");
        dataset.setValue(9, "Hombres", "Jueves");
        dataset.setValue(7, "Mujeres", "Viernes");
        dataset.setValue(8, "Hombres", "Viernes");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Participacion por Genero","Genero", "Dias",
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        JButton cambio= new JButton("Cambio");
        cambio.setBounds(0 , 0, 10, 10);
        ActionListener t = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                borrar();
System.out.println("Entro");   
            }
            
        };
        cambio.addActionListener(t);
        //this.removeAll();
        this.add(cambio);
        
        this.add(chartPanel);
    }
 
    private void pastel() {

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
        JButton cambio = new JButton("Cambio");
        cambio.setBounds(0, 0, 100, 100);
        ActionListener listener = new ActionListener(){
            

            @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("Ha entrado la funcion"); 
            borrar();}
        };
        cambio.addActionListener(listener);
        
        this.add(cambio);
        this.add(chartPanel);

      ;
    }
    
    public static void main(String args[]){
        new Pastel().setVisible(true);
    }
}


