package caretaker.model;

import java.awt.Image;
import java.util.Date;

public class Pemain {
    
    int id;
    int idTim;
    
    String namaDepan;
    String namaTengah;
    String namaBelakang;
    String namaDisplay;
    String posisi;
    int noPunggung;
    int asal;
    Date tglLahir;
    
    private Image image;
    
    int acceleration, sprint_speed, 
            finishing, att_positioning, shot_power, long_shot, volley, penalty, 
            vision, crossing, free_kick, short_pass, long_pass, curve, 
            agility, balance, reaction, ball_control, dribbling, composure, 
            interception, heading, marking, stand_tackle, slide_tackle, 
            jumping, stamina, strength, agression,
            diving ,gk_kicking, handling, reflex, gk_position;
    
    int condition;

    public Pemain(int id, int tim , String namaDepan, String namaTengah, String namaBelakang, String namaDisplay, String posisi, int noPunggung, int asal, Date tglLahir, Image image) {
        this.id = id;
        this.idTim = tim;
        this.namaDepan = namaDepan;
        this.namaTengah = namaTengah;
        this.namaBelakang = namaBelakang;
        this.namaDisplay = namaDisplay;
        this.posisi = posisi;
        this.noPunggung = noPunggung;
        this.asal = asal;
        this.tglLahir = tglLahir;
        this.image = image;
    }

    public String getNamaDisplay() {
        return namaDisplay;
    }

    public void setNamaDisplay(String namaDisplay) {
        this.namaDisplay = namaDisplay;
    }

    public int getNoPunggung() {
        return noPunggung;
    }

    public void setNoPunggung(int noPunggung) {
        this.noPunggung = noPunggung;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getId() {
        return id;
    }

    public int getIdTim() {
        return idTim;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaTengah() {
        return namaTengah;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public int getAsal() {
        return asal;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getSprint_speed() {
        return sprint_speed;
    }

    public int getFinishing() {
        return finishing;
    }

    public int getAtt_position() {
        return att_positioning;
    }

    public int getShot_power() {
        return shot_power;
    }

    public int getLong_shot() {
        return long_shot;
    }

    public int getVolley() {
        return volley;
    }

    public int getPenalty() {
        return penalty;
    }

    public int getVision() {
        return vision;
    }

    public int getCrossing() {
        return crossing;
    }

    public int getFree_kick() {
        return free_kick;
    }

    public int getShort_pass() {
        return short_pass;
    }

    public int getLong_pass() {
        return long_pass;
    }

    public int getCurve() {
        return curve;
    }

    public int getAgility() {
        return agility;
    }

    public int getBalance() {
        return balance;
    }

    public int getReaction() {
        return reaction;
    }

    public int getBall_control() {
        return ball_control;
    }

    public int getDribbling() {
        return dribbling;
    }

    public int getComposure() {
        return composure;
    }

    public int getInterception() {
        return interception;
    }

    public int getHeading() {
        return heading;
    }

    public int getMarking() {
        return marking;
    }

    public int getStand_tackle() {
        return stand_tackle;
    }

    public int getSlide_tackle() {
        return slide_tackle;
    }

    public int getJumping() {
        return jumping;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgression() {
        return agression;
    }

    public int getDiving() {
        return diving;
    }

    public int getGk_kicking() {
        return gk_kicking;
    }

    public int getHandling() {
        return handling;
    }

    public int getReflex() {
        return reflex;
    }

    public int getGk_position() {
        return gk_position;
    }
    
    public int getCondition() {
        return condition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdTim(int idTim) {
        this.idTim = idTim;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public void setNamaTengah(String namaTengah) {
        this.namaTengah = namaTengah;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public void setAsal(int asal) {
        this.asal = asal;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setSprint_speed(int sprint_speed) {
        this.sprint_speed = sprint_speed;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public void setAtt_position(int position) {
        this.att_positioning = position;
    }

    public void setShot_power(int shot_power) {
        this.shot_power = shot_power;
    }

    public void setLong_shot(int long_shot) {
        this.long_shot = long_shot;
    }

    public void setVolley(int volley) {
        this.volley = volley;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public void setCrossing(int crossing) {
        this.crossing = crossing;
    }

    public void setFree_kick(int free_kick) {
        this.free_kick = free_kick;
    }

    public void setShort_pass(int short_pass) {
        this.short_pass = short_pass;
    }

    public void setLong_pass(int long_pass) {
        this.long_pass = long_pass;
    }

    public void setCurve(int curve) {
        this.curve = curve;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public void setBall_control(int ball_control) {
        this.ball_control = ball_control;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public void setComposure(int composure) {
        this.composure = composure;
    }

    public void setInterception(int interception) {
        this.interception = interception;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public void setMarking(int def_awareness) {
        this.marking = def_awareness;
    }

    public void setStand_tackle(int stand_tackle) {
        this.stand_tackle = stand_tackle;
    }

    public void setSlide_tackle(int slide_tackle) {
        this.slide_tackle = slide_tackle;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgression(int agression) {
        this.agression = agression;
    }

    public void setDiving(int diving) {
        this.diving = diving;
    }

    public void setGk_kicking(int gk_kicking) {
        this.gk_kicking = gk_kicking;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public void setGk_position(int gk_position) {
        this.gk_position = gk_position;
    }
    
    public void setCondition(int condition) {
        this.condition = condition;
    }
    
    public void setAttribute(int acceleration, int sprint_speed, 
            int finishing,int position, int shot_power, int long_shot, int volley, int penalty, 
            int vision, int crossing, int free_kick, int short_pass, int long_pass, int curve,
            int agility, int balance, int reaction, int ball_control, int dribbling, int composure, 
            int interception, int heading, int def_awareness, int stand_tackle, int slide_tackle, 
            int jumping, int stamina, int strength, int agression, 
            int diving ,int gk_kicking, int handling, int reflex, int gk_position) {
        
        this.acceleration = acceleration;
        this.sprint_speed = sprint_speed;
        this.finishing = finishing;
        this.att_positioning = position;
        this.shot_power = shot_power;
        this.long_shot = long_shot;
        this.volley = volley;
        this.penalty = penalty;
        this.vision = vision;
        this.crossing = crossing;
        this.free_kick = free_kick;
        this.short_pass = short_pass;
        this.long_pass = long_pass;
        this.curve = curve;
        this.agility = agility;
        this.balance = balance;
        this.reaction = reaction;
        this.ball_control = ball_control;
        this.dribbling = dribbling;
        this.composure = composure;
        this.interception = interception;
        this.heading = heading;
        this.marking = def_awareness;
        this.stand_tackle = stand_tackle;
        this.slide_tackle = slide_tackle;
        this.jumping = jumping;
        this.stamina = stamina;
        this.strength = strength;
        this.agression = agression;
        this.diving = diving;
        this.gk_kicking = gk_kicking;
        this.handling = handling;
        this.reflex = reflex;
        this.gk_position = gk_position;
    }
    
    
    
}
