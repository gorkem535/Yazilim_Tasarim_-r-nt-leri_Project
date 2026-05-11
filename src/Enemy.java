
public class Enemy implements Game{
	int health=100;
	int damage=30;
	int defence=20;
	double boy;
	double kilo;
	
	public Enemy(double boy,double kilo) {
		this.boy=boy;
		this.kilo=kilo;
	}
	
	
	@Override
	public void render() {
		System.out.println("Ekrana düşman karekteri çizildi");
		
	}

}
