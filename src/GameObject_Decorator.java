
public abstract class GameObject_Decorator implements Game {
Game decoratedObject;

public GameObject_Decorator(Game decoratedObject) {
    this.decoratedObject = decoratedObject;
}

@Override
public void render() {
    decoratedObject.render();
}

}
