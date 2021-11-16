package patterns;
public class ICEM implements Conference {
    @Override
    public double getCost() {
        return 250;
    }
    
    @Override
    public String getDescription() {
        return "ICEM";
    }
    
    @Override
    public Publication createPaper(String title, boolean accept) {
        Publication Publication = new ICEMPublication(title);
        Publication.submitPaper();
        Publication.reviewPaper();
        Publication.acceptPaper(accept);
        return Publication;
    }
}
