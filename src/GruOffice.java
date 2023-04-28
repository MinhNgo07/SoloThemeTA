public class GruOffice extends ItemRoom{
    public GruOffice(int x, int y, Key key){
        super(x, y, key);
    }
    public String intro_text(){
        if(pickedItem == false){
            return String.format("You have walked into somebody's office but you found the key you were looking for!\n Now look for the secret room and escape!");
        }
        else{
            return "Why did you come back? Hurry escape before you get caught!";
        }
    }
}
