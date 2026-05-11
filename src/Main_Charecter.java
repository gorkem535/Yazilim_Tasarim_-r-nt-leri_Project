
public class Main_Charecter implements Game{
int health=100;
int damage=60;
int defence=35;
double boy;
double kilo;

public Main_Charecter(double boy,double kilo) {
this.boy=boy;;
this.kilo=kilo;
}



@Override
public void render() {
	System.out.println("Ana karekter ekrana çizildi");
	
}
}
