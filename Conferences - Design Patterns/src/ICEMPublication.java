package patterns;


public class ICEMPublication extends Publication
{
    
    public ICEMPublication(String name)
    {
        this.title = name;
        
    }
    @Override
    public int getPages() {
        return 2;
    }

}
