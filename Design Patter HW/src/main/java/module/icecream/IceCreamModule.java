package module.icecream;

public abstract class IceCreamModule implements IceCream {

    public String name;

    public double price;

    public TypeIceCream typeIceCream;

    @Override
    public void createIceCream() {
        System.out.println("Name: "+ name +" Price: "+ price + "Type of ice cream: "+ typeIceCream);
    }


}
