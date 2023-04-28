public class Lab extends MapTile{
    public Lab(int x, int y){ super (x, y);}
    public String intro_text(){
        return "\nYou were captured but have just woken up now. You look around you and it seems like you're in some sort of laboratory.\n Find the key and  escape through the secret door before the scientist catches you! ";
    }
    public void modify_player(Player player){}
}
