
public class LegacyBoss_Adapter implements Game{
LegacyBoss oldBoss;

public LegacyBoss_Adapter(LegacyBoss oldBoss) {
this.oldBoss=oldBoss;
}

@Override
public void render() {
oldBoss.renderBigCharecter();
	
}


}
