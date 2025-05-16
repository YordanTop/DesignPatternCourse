package module.flaver.additions;

import module.icecream.IceCream;
import module.icecream.IceCreamDecorator;


/**
 Декоратор за добавки върху сладоледите
 */
public class ToppingDecoration extends IceCreamDecorator {

    private Topping topping;

    public ToppingDecoration(IceCream iceCream, Topping topping){
        super(iceCream);
        this.topping = topping;
    }

    public void createIceCream(){
        super.createIceCream();

        this.AddToppings();
    }

    public void AddToppings(){
        System.out.println("Addition: "+topping.toString());
    }

}
