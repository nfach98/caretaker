package caretaker.model;

import java.awt.Image;

public class Pelatih {

    private int id;

    private String nama;
    private String username;
    private int idTim;
    private Image image;
    
    private String asal;

    public Pelatih(int id, String nama, String username) {
        this.id = id;
        this.nama = nama;
        this.username = username;
    }
    
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIdTim() {
        return idTim;
    }

    public void setIdTim(int idTim) {
        this.idTim = idTim;
    }
}
