package module.shop;

import module.flaver.additions.Topping;
import module.icecream.IceCreamModule;
import module.icecream.TypeIceCream;

import java.util.ArrayList;

public class ShopModule {

    private ShopModule shopInstance;

    private ArrayList<IceCreamModule> iceCreamList;

    private double totalSells = 0;

    private ShopModule(){}


    /** изброяване на цялостната печалба*/
    public double getTotalSells(){
        return totalSells;
    }

    /** добавяне на сладолед в магазина*/
    public void addIceCream(IceCreamModule iceCream){
        iceCreamList.add(iceCream);
    }
    /** продаване на сладолед от магазина*/
    public void sellIceCream(IceCreamModule iceCream){

        for (var ic : iceCreamList){
            if(iceCream.equals(ic)){
                totalSells += iceCream.price;

                iceCreamList.remove(iceCream);
                System.out.println("-1 Сладолед с вкус на: ");
                return;
            }
        }

        System.out.println("Нямаме в наличност!");

    }
    /** крайната бройка на всички сладоледи от даден тип*/
    public void countTotalIceCreamsFromType(TypeIceCream typeIceCream){

        int totalIceCreams = 0;

        for (var ic : iceCreamList){
            if(ic.typeIceCream == typeIceCream){
                totalIceCreams = totalIceCreams + 1;
            }
        }

        System.out.println("Обща бройка: "+totalIceCreams+" от вкуса: "+ typeIceCream.name());

    }

    /** крайната бройка на всички сладоледи*/
    public void countTotatIceCrems(){
        System.out.println("Обща бройка: "+iceCreamList.stream().count());
    }

    public ShopModule getInstance(ArrayList<IceCreamModule> iceCreamList){
        if(shopInstance == null)
            shopInstance = new ShopModule();

        this.iceCreamList = iceCreamList;

        return shopInstance;
    }

}
