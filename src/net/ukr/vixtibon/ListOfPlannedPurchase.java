package net.ukr.vixtibon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akovalchuk on 4/15/2015.
 */
public class ListOfPlannedPurchase {
    List<Item> PlannedPurchase = new ArrayList<>();

    public void addItem(){
        Item it = new Item();
        it = it.createNewItem();
        PlannedPurchase.add(it);
    }
    public void deleteItem(int index){
        PlannedPurchase.remove(index);
    }
    public void sortPlannedPurchaseBuPurchased(){}

}
