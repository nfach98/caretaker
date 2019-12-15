package caretaker.viewmodel;

import caretaker.App;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AppStack {
    public static ArrayList<JPanel> stack = new ArrayList<>();
    public static CardLayout layout = (CardLayout) App.contentPanel.getLayout();
    
    public static void push(JPanel t){
        stack.add(t);
        App.contentPanel.add(t, t.getName());
        layout.next(App.contentPanel);
    }
 
    public static void close(JPanel t){
        layout.previous(App.contentPanel);
        App.contentPanel.remove(t);
        stack.remove(t);
    }
    
    public static void pop(){
        int currentSize = stack.size();
        JPanel t = stack.get(currentSize-1);
        layout.previous(App.contentPanel);
        App.contentPanel.remove(t);
        stack.remove(currentSize-1);
    }

    public static JPanel getActive(){
        int currentSize = stack.size();
        JPanel t = stack.get(currentSize - 1);
        return t;
    }
}
