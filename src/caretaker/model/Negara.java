package caretaker.model;

import java.awt.Image;

public class Negara implements Comparable<Negara>{

    private int id;
    private String disp;
    private String nama;
    private Image img;

    public Negara(int id, String disp, String nama, Image img) {
        this.id = id;
        this.disp = disp;
        this.nama = nama;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public String getNama(){
        return this.nama;
    }
    
    public Image getImg(){
        return this.img;
    }
    
    public String getDisp() {
        return disp;
    }

    @Override
    public int compareTo(Negara n) {
        if(!this.getNama().equals(n.getNama())){
            return this.getNama().compareTo(n.getNama());
        }
        else{
            return this.getDisp().compareTo(n.getDisp());
        }
    }

}
