# Изучение или повторение JAVA 

#[Аннотации](#annotation)
 - #### [Ключевые моменты](#Ключевые-моменты)
 - #### [Анатомия аннотации](#Анатомия-аннотации)

### Аннотации

Предшественники аннотаций JAVA это маркерные клaссы, такие как Serializable, Cloneable.
``` java
public class Foo implements MarkerInterface {} //(1)

@MyAnnotation 
public class Foo {} //(2)

```

1 - маркерный интерфейс
2 - аннотация, как эквивалент маркерного класса

1. ### Интерфейсы определяют тип ##
   Маркерный интерфейс отмечает объект, реализующий какой либо тип и это исключает ошибки на этапе компиляции.
   [Пример с маркерными интерфейсами](/src/j/unknown/www/CheckMarkInterface.java "Нажми чтобы открыть")
   
2. ### Интерфейс определяет тип для наследников класса
   Если класс реализует интерфейс, то и все наследники будут реализовывать этот интерфейс. **Нельзя отвязать интерфейс от наследников**. Для "отсоединения" применяют аннотации. Минус - проверка наличия аннотации проводится на этапе выполнения, а это может привести к ошибкам
   [Пример с аннотациями](/j/unknown/www/CheckAnnotation.java "Нажми чтобы открыть").
   При вызове testAnnotation(child) возникает исключение, что класс не помечен аннотацией, и об этом мы узнаем только на этапе выполнения программы. Если в аннотацию, добавить аннотацию @Inherited, то ошибки во время выполнения программы не будет. Child класс также наследует аннотацию MarkAnnotation, которая определена у Parent.
   
3. ### **Ключевые моменты**
   Если необходимо знать могут ли какие либо методы принимать определенные классы, необходимо применять маркерные интерфейсы. В этом случае на этапе компиляции обнаружим ошибку
   Если необходимо провести анализ метаданных класса, тогда применяем аннотации, но проверить можно только во время выполнения программы
   
### Анатомия аннотации
   Базовое определение аннотации выглядит следующим образом
   
   ~~~ java
   @Retention(RetentionPolicy.RUNTIME)
   @Target(ElementType.TYPE)
   @Inherited
   @Documented
   public @interface MyAnnotation {
      String name() default "";
      int value();
   }
   ~~~
Кажется, что какая-то непонятная херобора, рассмотрим детальнее

**@Retention**: доступность аннотации. Аннотация может быть доступна в исходнике, классе, на этапе выполнения
**@Target**: для какого элемента ее можно использовать (поле, класс, пакет и тд)
**@Inherited**: позволяет реализовать наследование аннотаций родительского класса классом-наследником
**@Documented:** аннотация будет помещена в сгенерированную документацию javadoc
**@interface:** сообщает о том, что это аннотация

Аннотация может содержать параметры, в данном случае это String и int
   
   