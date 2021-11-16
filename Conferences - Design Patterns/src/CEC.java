package patterns;
public class CEC implements Conference {
    @Override
    public double getCost() {
        return 300;
    }
    
    @Override
    public String getDescription() {
        return "CEC";
    }
    
    @Override
    public Publication createPaper(String title, boolean accept) {
        Publication Publication = new CECPublication(title);
        Publication.submitPaper();
        Publication.reviewPaper();
        Publication.acceptPaper(accept);
        return Publication;
    }
}
