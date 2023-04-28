public class SecretDoor extends MapTile{
    private static final String defaulttext = "I found the door but not the key I gotta look somewhere else";
    private static final String keytext = "You found the key to unlock the secret door! Now be free my friend!";
    public SecretDoor(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        if (Player.hasItem("Rare Key"))
            return keytext;
        else{
            return defaulttext;
        }
    }
    public void modify_player(Player player){}
}
