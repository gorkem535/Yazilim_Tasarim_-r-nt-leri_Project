
public class Game {
String object_type;
int health;
int damage;
int defence;


public Game(String object_type) {
this.object_type=object_type;
this.health=100;

if(object_type.equals("Enemy")) {
this.damage=30;
this.defence=20;
}else if(object_type.equals("Main Charecter")) {
this.damage=60;
this.defence=35;
}
}

public void Render() {
if(object_type.equals("Main Charecter")) {
System.out.println("Ekrana ana karekterimiz çizildi");
}else if(object_type.equals("Enemy")) {
System.out.println("Ekrana düşman karekteri çizildi");
}else if(object_type.equals("Health cure")) {
System.out.println("Ekrana can iksiri çizildi");
}
}

}




