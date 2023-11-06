package j.unknown.www.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
public @interface Game {
    String name() default "Что-то под вопросом";
    String day();
}
