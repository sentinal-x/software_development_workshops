package patterns;
public class GECCO implements Conference {
    @Override
    public double getCost() {
        return 340;
    }
    
    @Override
    public String getDescription() {
        return "GECCO";
    }
    
    @Override
    public Publication createPaper(String title, boolean accept) {
        Publication Publication = new GECCOPublication(title);
        Publication.submitPaper();
        Publication.reviewPaper();
        Publication.acceptPaper(accept);
        return Publication;
    }
}

