package j.unknown.www;

import j.unknown.www.annotation.Game;
import j.unknown.www.annotation.Games;

@Game(name = "Крикет",  day = "воскресенье")
@Game(day = "четверг")
@Game(name = "Хоккей",   day = "понедельник")
public class CheckRepeatable {
    public static void main(String[] args) {
        Games games = CheckRepeatable.class.getAnnotation(Games.class);
        for(Game game:games.value()){
            System.out.println(game.name() + " в " + game.day());
        }
    }
}

