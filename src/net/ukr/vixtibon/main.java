package net.ukr.vixtibon;

/**
 * Created by akovalchuk on 4/15/2015.
 */
public class main {

    public static void main(String[]args){
//Item item = new Item();
        //item.setPrice((float) 3.34);
        //item.setCount(2);
        //item.setWeight((float) 0.6);
        //item.setStoreName("Magelan");
        //item.setName("Bread Ukrainian");

        //item.showItemInfo();
        /*
        ListOfAvailableItems ls = new ListOfAvailableItems();
        ls.addItem("hleb");
        ls.addItem("hren");
        ls.addItem("halva");
        ls.addItem("maslo podsolnichnoe");
        ls.addItem("maslo slivochoe");
        ls.addItem("kuryatina");
        ls.addItem("myaso");
        ls.saveListOfAvailableItems();
        */
        ListOfAvailableItems ls = new ListOfAvailableItems();
        ls = ls.openListOfAvailableItems();
        System. out .println("point h ");
        String teststr = "h";
        ls.showExampleItemsList(teststr);
        System. out .println("point hl ");
        String teststr1 = "hl";
        ls.showExampleItemsList(teststr1);
        System. out .println("point maslo ");
        String teststr2 = "maslo";
        ls.showExampleItemsList(teststr2);
        System. out .println("point maslo s ");
        String teststr3 = "maslo s";
        ls.showExampleItemsList(teststr3);


    }
}
