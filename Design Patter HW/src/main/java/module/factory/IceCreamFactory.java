package module.factory;

import module.icecream.IceCream;
import module.icecream.IceCreamModule;
import module.icecream.TypeIceCream;

public abstract class IceCreamFactory {

    public abstract IceCreamModule createIceCream(TypeIceCream typeIceCream);

    public IceCreamModule prepareIceCream(TypeIceCream typeIceCream){
        IceCreamModule iceCream = this.createIceCream(typeIceCream);
        return iceCream;
    }

}
