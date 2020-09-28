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
    private int cost;
    private int vendingMachineID;

    public Snack(String name, int quantity, int cost, int vendingMachineID)
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

}
