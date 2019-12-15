package caretaker.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import joc.Connection;
import joc.Database;

public class LocalStorage {
    static File myDB;
    static Database db;

    public static void startConnection(){
        try {
            LocalStorage.myDB = new File("caretaker");
            LocalStorage.db = Connection.openConnection(myDB);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LocalStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List getList(String key){
        return db.getList(key);
    }
    
    public static void storeList(String key, List list){
        try {
            if(db.getList(key)==null){
                db.addList(key, list);
            }
            Connection.save();
        } catch (IOException ex) {
            Logger.getLogger(LocalStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
