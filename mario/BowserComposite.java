import java.util.ArrayList;
import java.util.List;

public class BowserComposite extends EnemyInterface {
    private List<EnemyInterface> subordinates = new ArrayList<>();
    
    public void add(EnemyInterface enemy) {
        subordinates.add(enemy);
    }
    
    public void attack() {
        System.out.println("The Bowser attacks with his army");
        for (int i = 0; i < subordinates.size(); i++) {
            subordinates.get(i).attack(); // Attack from subordinates
        }
    }
}