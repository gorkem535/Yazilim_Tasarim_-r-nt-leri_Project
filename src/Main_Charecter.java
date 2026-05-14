import java.util.ArrayList;
import java.util.List;


public class Main_Charecter implements Game{
int health=100;
int damage=60;
int defence=35;
double boy;
double kilo;

AttackStrategy attackStrategy;
ArrayList<HealthObserver> observers = new ArrayList<>();

public Main_Charecter(double boy,double kilo) {
this.boy=boy;;
this.kilo=kilo;
}



@Override
public void render() {
	System.out.println("Ana karekter ekrana çizildi");
	
}

public void addObserver(HealthObserver observer) {
    observers.add(observer);
}

public void takeDamage(float damage) {
    this.health -= damage;
    System.out.println("Oyuncu " + damage + " hasar aldı!");
    notifyObservers(); 
}


private void notifyObservers() {
    for (HealthObserver observer : observers) {
        observer.HealthChanged(this.health);
    }
}

public void setAttackStrategy(AttackStrategy attackStrategy) {
    this.attackStrategy = attackStrategy;
    System.out.println("Sistem: Silah değiştirildi.");
}

public void performAttack() {
    if (attackStrategy != null) {
        attackStrategy.attack();
    }
}




}
