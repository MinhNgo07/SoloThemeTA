public class Hallway extends MapTile{
    public Hallway(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return String.format("A hallway full of paintings and portraits of a bald man.");
    }
    public void modify_player(Player player){}
}
