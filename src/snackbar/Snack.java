package snackbar;

public class Snack
{
    /* Snack has fields (so knows)
        * maxId - keep track of last used snack id
        * id - automatically generated field
        * name
        * quantity
        * cost
        * vending machine id*/

    public static int maxID = 0;
    
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    public Snack(String name, int quantity, double cost, int vendingMachineID)
    {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;

        maxID++;
        this.id = maxID;
    }

    /*Snack has methods (so can)
        * get id
        * set and get name
        * set and get cost
        * set and get vending machine id
        * get quantity
        * add quantity when given how many to add
        * buy snack when given how many to buy
        * get total cost given a quantity
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

    public double GetCost()
    {
        return cost;
    }

    public void SetCost(double cost)
    {
        this.cost = cost;
    }

    public int GetVendingMachineID()
    {
        return vendingMachineID;
    }

    public void SetVendingMachineID(int vendingMachineID)
    {
        this.vendingMachineID = vendingMachineID;
    }

    public int GetQuantity()
    {
        return quantity;
    }

    public void AddQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public double CostFor(int quantity)
    {
        return quantity * cost;
    }

    public int BuySnack(int quantity)
    {
        if(this.quantity >= quantity)
        {
            this.quantity -= quantity;
            return quantity;
        }
        else
        {
            int total = this.quantity;
            this.quantity = 0;
            return total;
        }
    }

    public double TotalCost()
    {
        return quantity * cost;
    }
}
