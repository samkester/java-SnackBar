package snackbar;

public class Main {
    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.GetID());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.GetID());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.GetID());
        Snack soda = new Snack("Soda", 24, 2.50, drink.GetID());
        Snack water = new Snack("Water", 20, 2.75, drink.GetID());

        jane.BuySnacks(soda, 3);
        System.out.println(jane.GetName() + " cash on hand: " + jane.GetCash());
        System.out.println(soda.GetName() + " quantity remaining: " + soda.GetQuantity());

        jane.BuySnacks(pretzel, 1);
        System.out.println(jane.GetName() + " cash on hand: " + jane.GetCash());
        System.out.println(pretzel.GetName() + " quantity remaining: " + pretzel.GetQuantity());

        bob.BuySnacks(soda, 2);
        System.out.println(bob.GetName() + " cash on hand: " + bob.GetCash());
        System.out.println(soda.GetName() + " quantity remaining: " + soda.GetQuantity());

        jane.AddCash(10);
        System.out.println(jane.GetName() + " found $10 in the couch!");
        System.out.println(jane.GetName() + " quantity remaining: " + jane.GetCash());

        jane.BuySnacks(chocolateBar, 1);
        System.out.println(jane.GetName() + " cash on hand: " + jane.GetCash());
        System.out.println(chocolateBar.GetName() + " quantity remaining: " + chocolateBar.GetQuantity());

        pretzel.AddQuantity(12);
        System.out.println("A shipment arrived of 12x " + pretzel.GetName());
        System.out.println(pretzel.GetName() + " quantity remaining: " + pretzel.GetQuantity());

        bob.BuySnacks(pretzel, 3);
        System.out.println(bob.GetName() + " cash on hand: " + bob.GetCash());
        System.out.println(pretzel.GetName() + " quantity remaining: " + pretzel.GetQuantity());
    }
}
