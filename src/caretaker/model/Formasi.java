package caretaker.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Formasi {
    
    private final String formasi;
    private ArrayList<String> posisi;

    public Formasi(String formasi) {
        this.formasi = formasi;
        
        switch(formasi){
            case "4-4-2":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","LM","CM","CM","RM","ST","ST")); break;
            case "4-3-3":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","CM","CM","CM","LW","ST","RW")); break;    
        }
    }

    public String getPosisi(int index) {
        return posisi.get(index);
    }
}
