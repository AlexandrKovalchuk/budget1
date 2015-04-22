package net.ukr.vixtibon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akovalchuk on 4/15/2015.
 */
public class ListOfAvailableStorages {
    List<String> StoragesList = new ArrayList<>();

    private boolean changed = false;

    boolean getChanged(){
        return changed;
    }

    boolean findEqualStoreName (String storeName){

        return true;
    }
    int findIndexEqualStoreName(String storeName){
        int index = -1;
        for(int i = 0; i < StoragesList.size(); i++){
            if(StoragesList.get(i).equals(storeName)){
                index = i;
                break;
            }else{
                continue;
            }
        }
        return index;
    }

    ListOfAvailableStorages openListOfAvailableStorages(){
        ListOfAvailableStorages loas = new ListOfAvailableStorages();
        try(BufferedReader f =new BufferedReader(new FileReader("Storages.txt"))){
            String str = "";
            int i = 0;
            for(;(str = f.readLine())!=null;) {
                loas.StoragesList.add(str);
                i++;
            }
            return loas;
            }catch(IOException e){
            System. out .println("ERROR");
            return null;
        }
    }
    void  saveListOfAvailableStorages(){
        try(PrintWriter a=new PrintWriter("Storages.txt")){
            //a.println(this.getName());
            for(int i=0;i< StoragesList.size();i++){
                a.println(StoragesList.get(i));
            }
        } catch(FileNotFoundException e){
            System. out .println("ERROR FILE WRITE");
        }
    }

    void addStorage(String nameOfStorage){
        StoragesList.add(nameOfStorage);
        changed = true;
    }
    void deleteStorage(String nameOfStorage){
        int index = findIndexEqualStoreName(nameOfStorage);
        if(index != -1) {
            StoragesList.remove(index);
            changed = true;
        }else{
            System. out .println("ERROR IN DELETING");
        }
    }
    void renameStorage(String nameOfStorage, String newNameOfStorage){
        if(nameOfStorage.equals(newNameOfStorage)){
            System. out .println("NO DIFFERENCE IN NAMES");
        }else {
            int index = findIndexEqualStoreName(nameOfStorage);
            System. out .println("DOES NOT WORK");
            StoragesList.remove(index);
            StoragesList.add(newNameOfStorage);
            changed = true;
        }
    }
    void check(String nameOfStorage){
        if(findIndexEqualStoreName(nameOfStorage) == -1){
            StoragesList.add(nameOfStorage);
            saveListOfAvailableStorages();
        }else {
            System. out .println("PRESENT IN LIST");
        }
    }

    void showInfo(){
        for(int i = 0; i < StoragesList.size(); i++){
            System. out .println(StoragesList.get(i));
        }
    }


}
