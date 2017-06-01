
package alarmaproxecto;


public class Display {
  static  boolean ledClock,ledAlarm,ledSet;
    
  /**
   * Recogemos la hora actual y los minutos y los mostramos
   */
    public static void showHoursMins(){
       
        if(Display.ledAlarm ==true){
        System.out.println(AlarmaProxecto.horaActual.getHour()+" : "+AlarmaProxecto.horaActual.getMinute());
        }else{
               System.out.println(AlarmaProxecto.horaActual.getHour()+": "+AlarmaProxecto.horaActual.getMinute()); 
               
    }
    } 
    
    public static void showAlarm(){
        
        
    }
    /**
     * Se encienden los led de hora y set(configuración)
     * @param ledClock
     * @param ledAlarm
     * @param ledSet 
     */
    public static void showLeds(boolean ledClock,boolean ledAlarm,boolean ledSet){
        ledClock=true;
        ledAlarm=false;
        ledSet=true;
    }
}
