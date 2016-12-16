
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location
{
    private int r;
    private int c;
   
    public Location(int row, int col)
    {
        this.r = row;
        this.c = col;
    }
    
    public int getRow()
    {
        return this.r;
    }
    
    public int getCol()
    {
        return this.c;
    }
}
