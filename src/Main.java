import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<Game>list=new ArrayList<>();
	
     list.add(Game_ObjectFactory.createGameObject("Main Charecter", 1.80, 70.0, 0));
     list.add(Game_ObjectFactory.createGameObject("Enemy", 1.75,65.0 , 0));
     list.add(Game_ObjectFactory.createGameObject("Health_Cure", 0, 0, 10));
      
     
    for (Game obj : list) {
		obj.render();
	}

	}

}
