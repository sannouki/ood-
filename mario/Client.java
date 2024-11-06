// main
public class Client {
    public static void main(String[] args) {
        // Create leaf objects
        EnemyInterface goomba = new GoombaLeaf();
        EnemyInterface koopa1 = new KoopaLeaf();
        EnemyInterface koopa2 = new KoopaLeaf();

        //this bowserjr only control 1 goomba and 1 koopa
        //when attacks he will command the goomba and kooopa to attack with him
        BowserJrComposite LarryKoopa = new BowserJrComposite();
        LarryKoopa.add(goomba);  
        LarryKoopa.add(koopa1);  
        
        //this bowserjr only control 1 koopa
        //when attacks he will command the kooopa to attack with him
        BowserJrComposite MortonKoopa = new BowserJrComposite();
        MortonKoopa.add(koopa2);  

        //bowser is the highest hiararchy level boss
        //bowser control his 2 commanders: the bowser jrs and the minions: all koopas and goombas
        BowserComposite bowser = new BowserComposite();
        bowser.add(LarryKoopa);   
        bowser.add(MortonKoopa);   

        //level 1 attack 
        MortonKoopa.attack();
        System.out.println("");
        //level 2 attack
        LarryKoopa.attack();
        
        System.out.println("");
        // The main boss attacks with his army
        bowser.attack();
    
        
    }
}