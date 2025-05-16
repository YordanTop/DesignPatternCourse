package module.factory;

import module.icecream.IceCreamModule;
import module.icecream.TypeIceCream;
import module.icecream.type.VanillaIceCream;

public class VanillaIceCreamFactory extends IceCreamFactory{
    @Override
    public IceCreamModule createIceCream(TypeIceCream typeIceCream) {
        if(typeIceCream == TypeIceCream.Vanilla)
            return new VanillaIceCream();

        return null;
    }
}