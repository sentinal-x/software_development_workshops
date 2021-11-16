package patterns;
public class EMO implements Conference {
    @Override
    public double getCost() {
        return 325;
    }
    
    @Override
    public String getDescription() {
        return "EMO";
    }
    
    @Override
    public Publication createPaper(String title, boolean accept) {
        Publication Publication = new EMOPublication(title);
        Publication.submitPaper();
        Publication.reviewPaper();
        Publication.acceptPaper(accept);
        return Publication;
    }
}

