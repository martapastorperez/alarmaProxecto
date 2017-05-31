
package alarmaproxecto;

import static alarmaproxecto.AlarmaProxecto.alarm;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Botonera {

    
    
    public static void alarmON(){
      
        Display.showLeds(true, false, false);
    }
    public static void alarmOFF(){
        
        Display.showLeds(false, false, false);
    }
    public static void configHour(){
        Display.showLeds(true, false, true);
        
    }
    public static void configAlarm(){
        
    } 
    public static void plusHours(){
//        return auxHr.plusHours(1);
//        int hr=AlarmaProxecto.horaActual.getHour();
//        AlarmaProxecto.horaActual.plusHours(1).getHour();
        System.out.println("Aumenta horas: "+AlarmaProxecto.horaActual.plusHours(1));
        Display.showHoursMins();
        
        
    }
    public static void masMins(){
        System.out.println("Aumenta minutos: "+AlarmaProxecto.horaActual.plusMinutes(1));
        Display.showHoursMins();
    }
    public static void stopAlarm(){
        
    }
}
