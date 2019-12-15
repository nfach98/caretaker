package caretaker.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Formasi {
    
    private final String formasi;
    private ArrayList<String> posisi;

    public Formasi(String formasi) {
        this.formasi = formasi;
        
        switch(formasi){
            case "4-3-3":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","CM","CM","CM","LW","RW","ST")); break;
            case "3-4-3":
                posisi = new ArrayList<>(Arrays.asList("GK","CB","CB","CB","LM","CM","CM","RM","LW","RW","ST")); break;
            case "3-4-2-1":
                posisi = new ArrayList<>(Arrays.asList("GK","CB","CB","CB","LM","CM","CM","RM","LF","RF","ST")); break;
            case "4-2-3-1":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","CDM","CDM","CAM","CAM","CAM","ST")); break;
            case "4-4-2":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","LM","CM","CM","RM","ST","ST")); break;
            case "4-5-1":
                posisi = new ArrayList<>(Arrays.asList("GK","LB","CB","CB","RB","LM","CM","CM","CM","RM","ST")); break;
            case "4-1-2-1-2":
                posisi = new ArrayList<>(Arrays.asList("GK","CB","CB","CB","LM","CM","CM","RM","LF","RF","ST")); break;
            case "5-2-1-2":
                posisi = new ArrayList<>(Arrays.asList("GK","LWB","CB","CB","CB","RWB","CM","CM","CAM","ST","ST")); break;
        }
    }

    public String getPosisi(int index) {
        return posisi.get(index);
    }
}
