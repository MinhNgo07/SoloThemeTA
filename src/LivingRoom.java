public class LivingRoom extends ItemRoom{
    public LivingRoom(int x, int y, Freezegun freezegun){
        super(x, y, freezegun);
    }
    public String intro_text() {
        if (pickedItem == false) {
            return String.format("This is a living room that has a giat tv and I found a rare book!\n I'm definitely going to need this.");
        } else {
            return "It looks like there's nothing here that I really need.";
        }
    }
}
