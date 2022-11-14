public class EnhancedPlayer {

    private String name;
    private int plaerHealth = 100;  // assigning value to the field, encapsulating it so plaerHealth can not be set more than 100
    private String weapon;


    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.plaerHealth = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.plaerHealth = this.plaerHealth - damage;
        if ( this.plaerHealth <= 0 ){
            System.out.println("The player lost all his/her plaerHealth");
        }
    }

    public int getHealth(){
        return plaerHealth;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }
}
