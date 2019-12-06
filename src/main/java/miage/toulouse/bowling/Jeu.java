package miage.toulouse.bowling;

public class Jeu {
    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2){
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }

    public Integer getLancer1() {
        return lancer1;
    }

    public Integer getLancer2() {
        return lancer2;
    }

    public int getScore(){
        if (lancer1 != 10)
            return this.lancer1+this.lancer2;
        else
            return this.lancer1;
    }

    public boolean isSpare(){

        return (lancer1!=10 && lancer1+lancer2==10);
    }

    public boolean isStrike(){
        return (lancer1==10);
    }

}
