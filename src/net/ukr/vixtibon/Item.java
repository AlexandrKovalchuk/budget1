package net.ukr.vixtibon;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by akovalchuk on 4/15/2015.
 */
public class Item {
    private String name;
    private String storeName;
    private float price;
    private float cost;
    private float weight = 0;
    private int count = 1;
    private Date daytimeofbye;
    private boolean puchase;

    Item(){}

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPuchase(boolean puchase) {
        this.puchase = puchase;
    }

    public boolean isPuchase() {

        return puchase;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDaytimeofbye(Date daytimeofbye) {
        this.daytimeofbye = daytimeofbye;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getStoreName() {
        return storeName;
    }

    public float getPrice() {
        return price;
    }

    public float getCostByCount() {
        cost = price * count;
        return cost;
    }

    public float getCostByWeight() {
        cost = price * weight;
        return cost;
    }

    public int getCount() {
        return count;
    }

    public Date getDaytimeofbye() {
        return daytimeofbye;
    }
    public Item createNewItem(){
        Item it = new Item();
        Scanner sc = new Scanner(System.in);
        System.out.println("insert storage name");
        it.setStoreName(sc.nextLine());
        System.out.println("insert product name");
        it.setStoreName(sc.nextLine());
        System.out.println("insert product count");
        it.setCount(sc.nextInt());
        System.out.println("insert product price");
        it.setPrice(sc.nextFloat());
        return it;
    }

    public void showItemInfo(){
        System.out.println("Storage name: " + storeName + "; name: " + name + "; \n weight: " + weight + "; count: " + count + "; \n price: " + price + "; cost: " + (weight == 0 ? getCostByCount():getCostByWeight()));
    }
}
