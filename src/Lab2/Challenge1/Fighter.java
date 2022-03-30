package Lab2.Challenge1;

public class Fighter {

    //initializam atributele cu valori default
    private String name;
    private int health;
    private int damagePerAttack;

    //constructor care primeste parametrii atributele fighterilor
    public Fighter(String name, int health, int damagePerAttack ) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

   public void Attack(Fighter fighter1) {
        fighter1.health -= this.damagePerAttack;

    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
}
