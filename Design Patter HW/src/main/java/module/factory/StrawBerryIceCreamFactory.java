package module.factory;

import module.icecream.IceCreamModule;
import module.icecream.TypeIceCream;
import module.icecream.type.StrawBerryIceCream;

public class StrawBerryIceCreamFactory extends IceCreamFactory{
    @Override
    public IceCreamModule createIceCream(TypeIceCream typeIceCream) {
        if(typeIceCream == TypeIceCream.Strawberry)
            return new StrawBerryIceCream();

        return null;
    }
}
