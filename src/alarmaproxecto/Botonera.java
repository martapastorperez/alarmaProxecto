
package alarmaproxecto;

import static alarmaproxecto.AlarmaProxecto.alarm;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Botonera {

    
    /**
     * Se enciende un led cuando la alarma se enciende
     */
    public static void alarmON(){
      
        Display.showLeds(true, false, false);
    }
    /**
     * Se apagan todos cuando se apaga
     */
    public static void alarmOFF(){
        
        Display.showLeds(false, false, false);
    }
    /**
     * Cuando se configura la hora se enciende el led de set
     */
    public static void configHour(){
        Display.showLeds(true, false, true);
        
    }
    /**
     * Para configurar la alarma se enciende set y alarma
     */
    public static void configAlarm(){
         Display.showLeds(false,true,true);
        Display.showHoursMins();
    } 
    /**
     * A la hora actual se le suma una hora
     */
    public static void plusHours(){
//        return auxHr.plusHours(1);
//        int hr=AlarmaProxecto.horaActual.getHour();
//        AlarmaProxecto.horaActual.plusHours(1).getHour();
        System.out.println("Aumenta horas: "+AlarmaProxecto.horaActual.plusHours(1));
        Display.showHoursMins();
        
        
    }
    /**
     * A la hora actual se le suma un minuto
     */
    public static void masMins(){
        System.out.println("Aumenta minutos: "+AlarmaProxecto.horaActual.plusMinutes(1));
        Display.showHoursMins();
    }
    /**
     * Para parar la alarma
     */
    public static void stopAlarm(){
     AlarmaProxecto.timer.cancel();
    }
}
