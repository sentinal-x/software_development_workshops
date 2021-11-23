public class Client {

    LivingRoomLight lrl = new LivingRoomLight();
    ChristmasLights cl = new ChristmasLights();
    
    
    
    public Command getCommand(int selector) {
        switch(selector) {
            case 1:
                return new LightSwitchCommand(cl);
            case 2:
                return new LightSwitchCommand(lrl);
            default:
                return null;
        }
    }
}
