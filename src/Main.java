import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Game> list = new ArrayList<>();
        
       

        // 1. Zırhlı Ana Karakter (Factory + Decorator)
        Game player = Game_ObjectFactory.createGameObject("Main Charecter", 1.80, 70.0, 0);
        Game armoredPlayer = new ArmoredDecorator(player);
        list.add(armoredPlayer);

        // 2. Düşman ve Can İksiri (Factory)
        list.add(Game_ObjectFactory.createGameObject("Enemy", 1.75, 65.0, 0));
        list.add(Game_ObjectFactory.createGameObject("Health_Cure", 0, 0, 10));
        
        // 3. Eski Boss Entegrasyonu (Adapter)
        LegacyBoss oldBoss = new LegacyBoss();
        Game adaptedBoss = new LegacyBoss_Adapter(oldBoss);
        list.add(adaptedBoss);
        
        // Tüm nesneleri render et (Faz 0'daki ilkel kodlar ve Git artıkları temizlendi)
        for (Game obj : list) {
            obj.render(); 
        }
        
        Main_Charecter hero = new Main_Charecter(1.80,75.0);
        HealthUI screenUI = new HealthUI();
       
        hero.addObserver(screenUI);
        
        System.out.println(" Varsayılan Silahla Saldırı:");
        hero.performAttack();
        
        System.out.println(" Büyüye Geçiş ve Saldırı:");
        hero.setAttackStrategy(new MagicAttack());
        hero.performAttack();
        
        System.out.println("\n3. Hasar Alma ve Bildirim Sistemi:");
        hero.takeDamage(30);
        hero.takeDamage(60);
        
        System.out.println(" OCP KANITI: Koda Dokunmadan Ok Atma Yeteneği Eklendi:");
        hero.setAttackStrategy(new BowAttack());
        hero.performAttack();
        
        
    }
    
}