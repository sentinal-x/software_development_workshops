package patterns;

public class CECPublication extends Publication
{
    
    public CECPublication(String name)
    {
        this.title = name;
        
    }
    @Override
    public int getPages() {
        return 8;
    }

}
