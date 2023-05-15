package aplicacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TiempoActual implements Runnable {
	    //Creamos una clase que implementa interfaz runnable
	    JLabel someLabel;
	    //Debemos guardar el label que queremos modificar, o en el que va el tiempo
	    TiempoActual (JLabel dateLabel){
	        //Hacemos un constructor de la clase, que reciba el label que queremos actualizar
	        someLabel=dateLabel;
	        //Colocamos el label en la variable someLabel, para mas tarde referirlo, y modificarlo
	    }
	    @Override
	    public void run() {
	        /*Se sobreescribe el metodo run que es donde ira el codigo para obtener la fecha
	        * y armar un string que es el que luego ira en el label de la fecha y hora*/
	        while(true){
	            /*Un loop infinito para mantener este hilo corriendo pues, si termina de ejecutarse, se cierra y los objetos Runnable no puede
	            * volver a ser ejecutados*/
	            try{
	                //El try y catch es por la linea Thread.sleep, dado que esta funcon arroja InterruptedException
	               Thread.sleep(999);
	                //Obtenermos la hora que deseamos mostrar
	               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
	               
	                //Y luego mandamos a actualizar, el label en otro runnable, ya que este se esta ejecutando en otro hilo
	                //y por tanto no tiene acceso a la Interfaz grafica.         	
	                SwingUtilities.invokeLater(new Runnable() {
	                    @Override
	                    public void run() {
	                    	someLabel.setText(dtf.format(LocalDateTime.now()));
	                    }
	                });
	            } catch (Exception ex){}
	        }
	    }
	}
