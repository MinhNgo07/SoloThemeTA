public class Bedroom extends EnemyRoom {
    Minion enemy;

    public Bedroom(int x, int y, Minion enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text() {
        if (enemy.is_alive()) {
            return "You seem to have woken up a tiny yellow creature and now it is approaching you! You have to fight him or else it will kill you! \n";
        } else {
            return "The minion is lying on the ground defeated and is contemplating on life.";
        }
    }

    public void modify_player(Player the_player) {
        if (enemy.is_alive()) {
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("Enemy does %d damage! You have %d HP remaining.", enemy.damage, the_player.hp);
            while (enemy.hp > 0) {
                the_player.attackEnemy(enemy);
            }
        }
    }
}
