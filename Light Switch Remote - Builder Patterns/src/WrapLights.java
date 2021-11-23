public class WrapLights implements Light{
    String onWords;
    String offWords;
    boolean on = false;
    long startT = 0;
    long stopT = 0;
    
    public WrapLights(String offWords, String onWords){
        this.onWords = onWords;
        this.offWords = offWords;
    }
    
    public void action(){
        if (on){
            on = false;
            stopT = System.currentTimeMillis();
            int DurationOn = (int)(stopT-startT)/1000;
            System.out.println("The light have been on for "+ DurationOn+ " seconds." );
            System.out.println(this.offWords);
            return;
        }
        startT = System.currentTimeMillis();
        on =true;
        System.out.println(this.onWords);
    }
    public boolean check(){
        return on;
    }
}
