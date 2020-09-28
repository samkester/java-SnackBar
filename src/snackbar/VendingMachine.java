package snackbar;

public class VendingMachine
{
    /* Vending machine has fields (so knows)
        * maxId - keep track of last used vending machine id
        * id - automatically generated field
        * name */

    public static int maxID = 0;
    
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        this.name = name;

        maxID++;
        this.id = maxID;
    }

    /* Vending Machine has methods (so can)
        * get id
        * set and get name
    */

    public int GetID()
    {
        return id;
    }

    public String GetName()
    {
        return name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }
}
