
package patterns;

public class Patterns {


    public static void main(String[] args) {
        // TODO code application logic here
        // Test code.
        Conference cec = new DinnerDecorator(new ExcursionDecorator(new CEC()));
        double gbp = cec.getCost();
        System.out.println(cec.getDescription() + ": GBP" + gbp + " (EUR" + Exchange.getInstance().gbpToEur(gbp) + ")");
        String cecTitle = "My paper tile";
        Publication cecPaper = cec.createPaper(cecTitle, false);
        System.out.println("Created paper " + cecTitle + ", maximum length is " + cecPaper.getPages() + " pages\n");
    }
}
