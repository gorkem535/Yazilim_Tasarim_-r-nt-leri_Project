
public class HealthUI implements HealthObserver{

	@Override
	public void HealthChanged(int currentHealth) {
		System.out.println(" DİKKAT! Oyuncunun yeni canı: " + currentHealth);
        if(currentHealth <= 20) {
            System.out.println("Can kritik seviyede!");
        }
		
	}

	
	

}
