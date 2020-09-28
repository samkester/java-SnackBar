package snackbar;

public class Customer
{
    /* Customer has fields (so knows)
        * maxId - keep track of last used customer id
        * id - automatically generated field
        * name
        * cash on hand
    */

    public static int maxID = 0;
    
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        this.name = name;
        this.cash = cash;

        maxID++;
        this.id = maxID;
    }

    /* Customer has methods (so can)
        * get id
        * set and get name
        * add cash to cash on hand
        * get cash on hand
        * buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
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

    public double GetCash()
    {
        return cash;
    }

    public void AddCash(double amount)
    {
        cash += amount;
    }

    public void BuySnacks(Snack snack, int quantity)
    {
        if(cash >= snack.CostFor(quantity))
        {
            double price = snack.BuySnack(quantity);
            cash -= price;
        }
    }
}
