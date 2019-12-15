package caretaker.model;

public class Susunan {
    private String formasi;
    private String pemain;

    public Susunan(String formasi, String pemain) {
        this.formasi = formasi;
        this.pemain = pemain;
    }

    public String getFormasi() {
        return formasi;
    }

    public void setFormasi(String formasi) {
        this.formasi = formasi;
    }

    public String getPemain() {
        return pemain;
    }

    public void setPemain(String pemain) {
        this.pemain = pemain;
    }
    
    
}
