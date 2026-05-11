
public class ArmoredDecorator extends GameObject_Decorator {

	public ArmoredDecorator(Game decoratedObject) {
		super(decoratedObject);
	}
	
	@Override
    public void render() {
        super.render();
        System.out.println(" Karakterin üzerine parıldayan bir çelik zırh yerlestirldi.");
    }

}
