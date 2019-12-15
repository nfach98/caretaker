package caretaker.model;

import java.awt.Image;
import java.util.ArrayList;

public class Tim {
    private int id;
    
    private String nama;
    private Image logo;
    private Image jersey;
    private Image jerseyGk;
    
    private ArrayList<Susunan> susunan;
    private ArrayList<Pemain> pemain;
    
    private int kapten;

    public Tim(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.pemain = new ArrayList<>();
        this.susunan = new ArrayList<>();
    }

    public ArrayList<Susunan> getSusunan() {
        return susunan;
    }

    public void setSusunan(ArrayList<Susunan> susunan) {
        this.susunan = susunan;
    }

    public ArrayList<Pemain> getPemainList() {
        return pemain;
    }

    public void setPemain(ArrayList<Pemain> pemain) {
        this.pemain = pemain;
    }
    
    public void addPemain(Pemain pemain){
        this.pemain.add(pemain);
    }
    
    public void removePemain(Pemain pemain){
        this.pemain.remove(pemain);
    }
    
    public Pemain getPemain(int index){
        return this.pemain.get(index);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public Image getJersey() {
        return jersey;
    }

    public void setJersey(Image jersey) {
        this.jersey = jersey;
    }
    
    public Image getJerseyGk() {
        return jerseyGk;
    }

    public void setJerseyGk(Image jerseyGk) {
        this.jerseyGk = jerseyGk;
    }
}
