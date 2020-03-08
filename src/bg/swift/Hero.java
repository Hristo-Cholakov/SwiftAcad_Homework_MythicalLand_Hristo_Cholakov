package bg.swift;

public class Hero {
    public static final int MAX_HEALTH_POINTS = 100;
    public static final int MAX_ENERGY = 100;
    private String name;
    private int healthPoints;
    private int power;
    private int progress;
    private int energy;
    private int gold;

    public Hero(String name, int power) {
        this.name = name;
        this.healthPoints = MAX_HEALTH_POINTS;
        setPower(power);
        this.gold = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = MAX_HEALTH_POINTS;
    }

    public int getPower() {
        return power;
    }

    private void setPower(int power) {
        this.power = power;
    }

    public int getProgress() {
        return progress;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = MAX_ENERGY;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = 0;
    }

    public void walking() {
        progress += 2;
    }

    public void running() {

        progress += 5;
        setEnergy(getEnergy()-5);
    }

    public void tumble() {
        healthPoints -= 10;
        progress -= 2;
    }

    public void sleeping() {
        if (gold < 10) {
            return;
        }
        healthPoints = MAX_HEALTH_POINTS;
        energy = MAX_ENERGY;
        gold -= 10;
    }

    public boolean isHeroDead() {
        if (getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCompletedLevel() {
        if (getProgress() >= 100) {
            return true;
        } else {
            return false;
        }

    }
}
