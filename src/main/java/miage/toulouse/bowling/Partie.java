package miage.toulouse.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux = new ArrayList<>();

    public Partie(Jeu leJeu) {
        for (int i = 0; i < 10; i++)
            jeux.add(leJeu);
        if (jeux.get(9).isSpare())
            jeux.add(leJeu);
        if (jeux.get(9).isStrike()){
            jeux.add(leJeu);
            jeux.add(leJeu);
        }
    }

    public int calculeScore() {
        int score = 0;
        for(int i = 0; i<10; i++){
            Jeu jeuCourant = jeux.get(i);
            score += jeuCourant.getScore();
            if (jeuCourant.isSpare())
                score += jeux.get(i+1).getLancer1();
            if (jeuCourant.isStrike())
                score += jeux.get(i+1).getScore() + jeux.get(i+2).getScore();
        }
        return score;
    }
}
