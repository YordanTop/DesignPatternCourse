package module.factory;

import module.icecream.IceCreamModule;
import module.icecream.TypeIceCream;
import module.icecream.type.ChocolateIceCream;

public class ChocolateIceCreamFactory extends IceCreamFactory{
    @Override
    public IceCreamModule createIceCream(TypeIceCream typeIceCream) {
        if(typeIceCream == TypeIceCream.Chocolate)
            return new ChocolateIceCream();

        return null;
    }
}