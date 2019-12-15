package caretaker.adapter;

import caretaker.model.Pemain;
import caretaker.helper.Database;
import caretaker.utils.SmartImageIcon;
import caretaker.view.AddPlayer;
import caretaker.view.Player;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class PlayerAdapter{
    
    private final ArrayList<Pemain> list;
    public int countList = 0;
    
    JPopupMenu pMenu;
    
    public PlayerAdapter(ArrayList<Pemain> list) {
        this.list = list;
    }
    
    public void bindViewHolder(JPanel parent){
        
        if(list.size() > 0){
            for (Pemain p : list) {
                Player player = new Player(p);
                player.name.setText(p.getNamaDisplay());
                player.img.setIcon(new SmartImageIcon(p.getImage(), player.img));
                player.num.setText(String.valueOf(p.getNoPunggung()));
                player.pos.setText(p.getPosisi());
                player.neg.setIcon(new SmartImageIcon(Database.negara.get(p.getAsal()-1).getImg(), player.neg));
                switch (p.getPosisi()) {
                    case "GK":
                        player.posBack.setBackground(new Color(255,204,0));
                        break;
                    case "CB":
                    case "LB":
                    case "RB":
                    case "LWB":
                    case "RWB":
                        player.posBack.setBackground(new Color(30,120,245));
                        break;
                    case "CDM":
                    case "CM":
                    case "LM":
                    case "RM":
                    case "CAM":
                        player.posBack.setBackground(new Color(10,210,75));
                        break;
                    case "LW":
                    case "RW":
                    case "LF":
                    case "RF":
                    case "CF":
                    case "ST":
                        player.posBack.setBackground(new Color(248,15,20));
                        break;
                    default:
                        break;
                }
                parent.add(player);
                countList++;
            }
        }
        
        parent.add(new AddPlayer());
        countList++;
    }
    
    public int getItemCount(){
        return this.list.size();
    }
}
