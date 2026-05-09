
public class Game_ObjectFactory {

	public static Game createGameObject(String type, double boy,double kilo ,int stok) {
        if (type.equalsIgnoreCase("PLAYER")) {
            return new Main_Charecter(boy,kilo);
        } else if (type.equalsIgnoreCase("ENEMY")) {
            return new Enemy(boy,kilo);
        } else if (type.equalsIgnoreCase("ITEM")) {
            return new Health_Cure(stok);
        }
        throw new IllegalArgumentException("Bilinmeyen nesne tipi: " + type);
    }
}
