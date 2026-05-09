import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<Game>list=new ArrayList<>();
	
	list.add(new Game("Main Charecter" ));
	list.add(new Game("İtem"));
	list.add(new Game("Enemy"));
	
	for (Game obj : list) {
	  obj.Render();
	}

	}

}
