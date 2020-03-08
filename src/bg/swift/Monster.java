package bg.swift;

public class Monster {
    private int power;
    private int rewardForKilling;
    private int healthPoints;

    public Monster(int power, int rewardForKilling) {
        setPower(power);
        setRewardForKilling(rewardForKilling);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRewardForKilling() {
        return rewardForKilling;
    }

    public void setRewardForKilling(int rewardForKilling) {
        this.rewardForKilling = rewardForKilling;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = 30;
    }

    public boolean isMonsterDead() {
        if (getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Hero hero) {
        while (!(hero.isHeroDead() || isMonsterDead())) {
            hero.setHealthPoints(hero.getHealthPoints() - getPower());
            setHealthPoints(getHealthPoints() - hero.getPower());
        }
        if (isMonsterDead()) {
            hero.setGold(hero.getGold() + getRewardForKilling());
        }


        }
        }
