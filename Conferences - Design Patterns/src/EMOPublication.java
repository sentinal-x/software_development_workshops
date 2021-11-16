package patterns;

public class EMOPublication extends Publication
{
    
    public EMOPublication(String name)
    {
        this.title = name;
        
    }
    @Override
    public int getPages() {
        return 15;
    }

}
