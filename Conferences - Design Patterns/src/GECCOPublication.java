package patterns;

public class GECCOPublication extends Publication
{
    
    public GECCOPublication(String name)
    {
        this.title = name;
        
    }
    @Override
    public int getPages() {
        return 8;
    }

}
