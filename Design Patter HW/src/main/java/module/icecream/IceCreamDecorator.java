package module.icecream;

/**
 Главен декоратор за сладоледи
 */
public class IceCreamDecorator extends IceCreamModule{

    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }

    /**
        Създаване на сладолед
     */
    public void createIceCream(){
        iceCream.createIceCream();
    }

}
