package net.ukr.vixtibon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akovalchuk on 4/20/2015.
 */
public class ListOfAvailableItems {
    List<String> ItemsList = new ArrayList<>();

    private boolean changed = false;

    boolean getChanged(){
        return changed;
    }

    boolean findEqualItemName (String storeName){

        return true;
    }
    int findIndexEqualItemName(String storeName){
        int index = -1;
        for(int i = 0; i < ItemsList.size(); i++){
            if(ItemsList.get(i).equals(storeName)){
                index = i;
                break;
            }else{
                continue;
            }
        }
        return index;
    }

    ListOfAvailableItems openListOfAvailableItems(){
        ListOfAvailableItems loas = new ListOfAvailableItems();
        try(BufferedReader f =new BufferedReader(new FileReader("ExampleItems.txt"))){
            String str = "";
            int i = 0;
            for(;(str = f.readLine())!=null;) {
                loas.ItemsList.add(str);
                i++;
            }
            return loas;
        }catch(IOException e){
            System. out .println("ERROR");
            return null;
        }
    }
    void  saveListOfAvailableItems(){
        try(PrintWriter a=new PrintWriter("ExampleItems.txt")){
            //a.println(this.getName());
            for(int i=0;i< ItemsList.size();i++){
                a.println(ItemsList.get(i));
            }
        } catch(FileNotFoundException e){
            System. out .println("ERROR FILE WRITE");
        }
    }

    void addItem(String nameOfStorage){
        ItemsList.add(nameOfStorage);
        changed = true;
    }
    void deleteItem(String nameOfStorage){
        int index = findIndexEqualItemName(nameOfStorage);
        if(index != -1) {
            ItemsList.remove(index);
            changed = true;
        }else{
            System. out .println("ERROR IN DELETING");
        }
    }
    void renameItem(String nameOfStorage, String newNameOfStorage){
        if(nameOfStorage.equals(newNameOfStorage)){
            System. out .println("NO DIFFERENCE IN NAMES");
        }else {
            int index = findIndexEqualItemName(nameOfStorage);
            System. out .println("DOES NOT WORK");
            ItemsList.remove(index);
            ItemsList.add(newNameOfStorage);
            changed = true;
        }
    }

    void showExampleItemsList(String str){
        int length = str.length();
        for(int i = 0; i < ItemsList.size(); i++){
           // System. out .println("point 2 " + i + " substring is : " + ItemsList.get(i).substring(0, str.length()-1) );
            if(ItemsList.get(i).length() >= str.length()) {
                if (ItemsList.get(i).substring(0, str.length()).equals(str)) {
                    //System.out.println("point 3 " + i);
                    System.out.println(ItemsList.get(i));
                } else {
                    //System.out.println("point 4 " + i);
                    continue;
                }
            }else{
                continue;
            }
        }

    }

    void check(String nameOfStorage){
        if(findIndexEqualItemName(nameOfStorage) == -1){
            ItemsList.add(nameOfStorage);
            saveListOfAvailableItems();
        }else {
            System. out .println("PRESENT IN LIST");
        }
    }

    void showInfo(){
        for(int i = 0; i < ItemsList.size(); i++){
            System. out .println(ItemsList.get(i));
        }
    }

}
