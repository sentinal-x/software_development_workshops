public class ChristmasLights implements Light {
    boolean on = false;
    public void action() {
        if (on){
            on = false;
            System.out.println("The twinkling lights have stopped. \nBah humbug!");
            return;
        }
        on = true;
        System.out.println("Twinkle Twinkle... \nThe festive ambience has increased.");
    }   
}