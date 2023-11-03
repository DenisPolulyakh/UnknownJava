# Изучение или повторение JAVA 

# [Аннотации](#annotation)

 - #### [Ключевые моменты](#ключевые-моменты)
 - #### [Анатомия аннотации](#анатомия-аннотации-1)

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
   
3. ### Ключевые моменты
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



проверка


Включение плагина
В Obsidian в разделе Настройки => Основные плагины включите плагин Публикация. После этого в левой панели появится значок «Публикация изменений» (который выглядит как бумажный самолетик).

После включения плагина вы также можете задать сочетание клавиш для этого параметра или использовать «Палитру команд» для доступа к нему.

Настройка вашего сайта
В плагине «Публикация» вы увидите возможность создать сайт, введя уникальный идентификатор сайта. После публикации ваш сайт будет доступен по адресу https://publish.obisidian.md/{site-id}.

После создания уникального идентификатора сайта, у вас будет возможность задать имя вашему сайту, выбрать домашнюю страницу, установить тему и переключить различные компоненты, такие как графический вид, оглавление и т.д. Вы можете переключить эти параметры, нажав на значок шестеренки рядом с названием вашего сайта в верхней части плагина «Публикация».

Выбор файлов для публикации
После настройки вашего сайта вы сможете публиковать свои заметки!

На свежем, пустом сайте все ваши заметки появятся в разделе «Новое», что означает, что они являются новыми для вашего сайта. На этом этапе вы можете выбрать, какие файлы вы хотите опубликовать, а затем нажать кнопку «Опубликовать».

Примечание о конфиденциальности: Obsidian Publish не знает о заметках, которые вы решили не публиковать. И не хранит заметки, которые вы впоследствии удалите со своего опубликованного сайта.

Внесение изменений
При внесении изменений в уже опубликованные заметки эти изменения будут автоматически выбраны при открытии диалога плагина «Публикация». Вы можете снять флажок с любых файлов, которые вы не хотите публиковать на своем сайте.

Изменение параметров сайта
Вы можете изменить различные параметры сайта, нажав на значок шестеренки рядом с названием сайта в диалоговом окне «Публикация изменений».

Метаданные
В этом разделе вы можете установить имя сайта, файл домашней страницы (файл, который увидят пользователи, зашедшие на ваш сайт), и управлять пользовательским доменом (см. руководство по настройке пользовательского домена).

Внешний вид
Здесь вы можете выбрать между светлой и темной темой оформления.

Если вы хотите больше настроек, вы можете настроить пользовательский CSS и favicon.

Режим чтения
В этом разделе вы можете:

Включить специальный режим, называемый «раздвижные окна», который выглядит как записки Andy Matuschak;
Включить предварительный просмотр страницы при наведении курсора, как при использовании плагина Предпросмотр страницы в приложении;
Настроить длину строки и строгий разрыв строк.
Компоненты
Ваш сайт поставляется с несколькими компонентами, которые можно включить и выключить. Они включают в себя:

Навигация (по умолчанию включен)
Локального граф (по умолчанию включен)
Оглавление / структура заголовков (по умолчанию выключен)
Обратные ссылки (по умолчанию выключена)
Панель поиска (по умолчанию выключена, требует компонент Навигация)
Безопасность
Здесь вы можете установить пароли для защиты вашего сайта. После установки, все посетители должны ввести один из паролей для входа на ваш сайт.

Несколько паролей облегчают обмен с несколькими группами. Когда вы больше не хотите делиться с одной группой посетителей, вы можете просто удалить этот пароль. Каждый пароль также может быть назван для вашего удобства.

Начинаю с 20 января 2021 г. все заметки на вашем сайте защищены одним и тем же набором паролей.

Добавление связанных заметок
Кнопка «Добавить связанные» позволяет включить для публикации в хранилище любые заметки, на которые есть ссылки, связанные с любыми выбранными в данный момент заметками. Это хороший способ гарантировать отсутствие мертвых ссылок на вашем опубликованном сайте.

В качестве примера предположим, что вы выбрали для публикации заметку А. Предположим, что в заметке A есть ссылки на заметку P, заметку Q и заметку R, то если вы нажмёте кнопку «Добавить связанные», то все заметки P, Q и R будут выбраны для публикации вместе с текущей выбранной заметкой A.

Каждый раз, когда вы нажимаете кнопку «Добавить связанные», плагин «Публикация» будет искать ссылки в каждом текущем выбранном файле для публикации. Пожалуйста, убедитесь, что вы просмотрели список выбранных файлов перед тем, как нажимать кнопку «Опубликовать».

Удаление опубликованных заметок
У вас всегда есть возможность удалить любые заметки, которые были опубликованы на вашем сайте. В плагине «Публикация» будут перечислены все опубликованные заметки, из которых любые/все могут быть выбраны для удаления. Удаление заметки с вашего сайта не удаляет заметку из хранилища, что дает вам возможность повторно опубликовать заметку в будущем.

Удаление всего сайта
Если вы хотите удалить весь сайт, нажмите на значок переключения (стрелки) в верхней части плагина «Публикация». Затем нажмите на кнопку X, чтобы удалить ваш сайт. Обратите внимание: это удалит только ваш общедоступный сайт, но не повлияет ни на какие файлы в вашем хранилище. Вы всегда можете выбрать повторную публикацию своих заметок.

LINKS TO THIS PAGE
