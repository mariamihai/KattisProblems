package difficulty_2.difficulty_2_4.TRIED_iWannaBeTheVeryBest;

import java.util.Objects;

public class Pokemon {

    private int attack, defence, health;

    public Pokemon(int attack, int defence, int health) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return attack == pokemon.attack &&
                defence == pokemon.defence &&
                health == pokemon.health;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attack, defence, health);
    }
}
