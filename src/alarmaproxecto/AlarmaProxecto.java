
package alarmaproxecto;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class AlarmaProxecto {
public static LocalTime  horaActual,alarm;
static Timer timer;
 
      
    public static void main(String[] args) {
      //  Timer comprobacion=new Timer(1500, new ActionListener()){
            
        //}
        System.out.println(horaActual=LocalTime.now());
       
       
        
        
        Altavoz.playSound();

        //Display.showHoursMins();
        //horaActual=LocalTime.of(12, 5);
      
        
         int op=0;
    
      do{
  
            try{
        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Aumentar una hora \n2. Aumentar un minuto \n3. Encender la alarma \n4. Configurar la alarma \n5.Apagar la alarma \n6. Salir"));
       
            }catch(Exception e){
                System.out.println(e.getMessage());
                op = 0;
            }
                switch (op) {

            case 1:
               Botonera.plusHours();
                break;
            case 2:
                 Botonera.masMins();
                break;
            case 3:
               Botonera.alarmON();
                break;
            case 4:
                Botonera.configAlarm();
                break;
            case 5:
                Botonera.alarmOFF();
                break;
            case 6:
                System.exit(0);
        
                }
    }while (op<6);
}

    }
    


