package jp.ac.uryukyu.ie.e205726;

public class LivingThing {
    protected String name;
    protected int hitPoint;
    protected int attack;
    protected boolean dead;

    //getterメソッドを用意する。
    public String getName(){
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public boolean isDead(){
        return this.dead;
    }
    //getterメソッドここまで

    //setterメソッドを用意する。
    public void setName(String name){
        this.name = name;
    }

    public void setHitpoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }
    //setterメソッドここまで


    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
           int damage = (int)(Math.random() * attack);
           System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
           opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
