
package alarmaproxecto;


public class Display {
  static  boolean ledClock,ledAlarm,ledSet;
    
    public static void showHoursMins(){
       
        if(Display.ledAlarm ==true){
        System.out.println(AlarmaProxecto.horaActual.getHour()+" : "+AlarmaProxecto.horaActual.getMinute());
        }else{
               System.out.println(AlarmaProxecto.horaActual.getHour()+": "+AlarmaProxecto.horaActual.getMinute()); 
               
    }
    } 
    
    public static void showAlarm(){
        
        
    }
    public static void showLeds(boolean ledClock,boolean ledAlarm,boolean ledSet){
        ledClock=true;
        ledAlarm=false;
        ledSet=true;
    }
}
