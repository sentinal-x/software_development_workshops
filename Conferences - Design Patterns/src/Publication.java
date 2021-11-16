package patterns;

public abstract class Publication {
    protected String title;
    public int getPages() {
        return 8;
    }

    public void submitAbstract() {
        System.out.println("Submitting abstract ’" + title + "’");
    }

    public void reviewAbstract() {
        System.out.println("Reviewing ’" + title + "’");
    }

    public void acceptAbstract(boolean accept) {
        if (accept) {
            System.out.println("Accepting abstract ’" + title + "’");
        } else {
            System.out.println("Rejecting abstract ’" + title + "’");
        }
    }

    public void submitPaper() {
        System.out.println("Submitting paper ’" + title + "’");
    }

    public void reviewPaper() {
        System.out.println("Reviewing ’" + title + "’");
    }

    public void acceptPaper(boolean accept) {
        if (accept) {
            System.out.println("Accepting paper ’" + title + "’");
        } else {
            System.out.println("Rejecting paper ’" + title + "’");
        }
    }

} 
