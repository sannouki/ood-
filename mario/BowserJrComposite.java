// BowserJr.java
import java.util.ArrayList;
import java.util.List;

public class BowserJrComposite extends EnemyInterface {
    private List<EnemyInterface> subordinates = new ArrayList<>();
    
    public void add(EnemyInterface enemy) {
        subordinates.add(enemy);
    }
    
    public void attack() {
        System.out.println("A Bowser Jr launch an attack with Bowser's minions");
        for (int i = 0; i < subordinates.size(); i++) {
            subordinates.get(i).attack(); // Attack from subordinates
        }
    }
}