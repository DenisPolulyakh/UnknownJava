package j.unknown.www;

import j.unknown.www.annotation.DemoInfoAnnotation;
import j.unknown.www.annotation.InfoAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;


public class CheckInfoAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        DemoInfoAnnotation demoInfoAnnotation = new DemoInfoAnnotation();
        readAnnotationOn(demoInfoAnnotation.getClass());
        Method method = demoInfoAnnotation.getClass().getMethod("getDemo");
        readAnnotationOn(method);


    }


    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\nПоиск аннотаций в " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof InfoAnnotation) {
                    System.out.println("Автор: " + ((InfoAnnotation) annotation).name());
                    System.out.println("Версия: " + ((InfoAnnotation) annotation).version());
                    System.out.println("Значение: " + ((InfoAnnotation) annotation).value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /* Вывод консоли
    Поиск аннотаций в java.lang.Class
    Автор: Leo M
    Версия: 1.1
    Значение: 2

    Поиск аннотаций в java.lang.reflect.Method
    Автор: Den P
    Версия: 1.2
    Значение: 1
     */
}
