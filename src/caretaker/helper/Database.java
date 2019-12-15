package caretaker.helper;

import caretaker.model.Negara;
import caretaker.model.Pelatih;
import caretaker.model.Tim;
import caretaker.utils.Password;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Database {
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static CallableStatement cs;
    
    public static Pelatih currentPelatih = null;
    public static Tim currentTim = null;
    public static ArrayList<Negara> negara = new ArrayList<>();
    
    public static void startConnection(){
        try {
            Database.con = DriverManager.getConnection("jdbc:mysql://65.19.141.67:3306/nfach98_caretaker", 
                    "nfach98", "wolulas25");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean authLogin(String user, String pass){
        boolean success = false;
        try {
            int tim = 0;
            
            ps = con.prepareStatement("SELECT * FROM pelatih WHERE username=? AND password=?");
            ps.setString(1, user);
            ps.setString(2, new Password(pass).hashPassword());
            rs = ps.executeQuery();
            while(rs.next()){
                success = true;
                tim = rs.getInt("tim");
                currentPelatih = new Pelatih(rs.getInt("id"), 
                        rs.getString("nama"),
                        rs.getString("username"));
                InputStream binaryStream = rs.getBinaryStream("image");
                currentPelatih.setImage(ImageIO.read(binaryStream));
                currentPelatih.setIdTim(tim);
            }
            
            ps = con.prepareStatement("SELECT * FROM tim WHERE id=?");
            ps.setInt(1, tim);
            rs = ps.executeQuery();
            while(rs.next()){
                currentTim = new Tim(rs.getInt("id"), rs.getString("nama"));
                currentTim.setLogo(ImageIO.read(rs.getBinaryStream("logo")));
                currentTim.setJersey(ImageIO.read(rs.getBinaryStream("jersey")));
                currentTim.setJerseyGk(ImageIO.read(rs.getBinaryStream("jersey_gk")));
            }
            ps.close();
            
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }
    
    public static ResultSet getResult(PreparedStatement ps) {
        try {
            Database.ps = ps;
            rs = Database.ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static void storeData(PreparedStatement ps) {
        try {
            Database.ps = ps;
            Database.ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateData(PreparedStatement ps) {
        try {
            Database.ps = ps;
            Database.ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getNegara(){
        try {
            ps = con.prepareStatement("SELECT * FROM negara");
            rs = ps.executeQuery();
            while(rs.next()){
                negara.add(new Negara(rs.getInt("id"), rs.getString("disp"), 
                        rs.getString("nama"), ImageIO.read(rs.getBinaryStream("bendera"))));
            }
            ps.close();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static float getOvr(int id, String pos){
        float ovr = 0;
        
        try {
            cs = con.prepareCall("{ CALL ovr(?,?) }");
            cs.setInt(1, id);
            cs.setString(2, pos);
            
            rs = cs.executeQuery();
            while (rs.next()){
                ovr = rs.getFloat("ovr");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ovr;
    }
}
