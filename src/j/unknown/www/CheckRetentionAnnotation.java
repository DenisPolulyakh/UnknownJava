package j.unknown.www;

import j.unknown.www.types.RetentionWork;

import java.lang.annotation.Annotation;

public class CheckRetentionAnnotation {
    public static void main(String[] args) {
        RetentionWork retentionWork = new RetentionWork();
        Annotation[] annotations = retentionWork.getClass().getAnnotations();
        int i = 0;
        if (annotations.length > 0) {
            i = 1;

        }
        System.out.println("Всего аннотаций: " + annotations.length);
        for (Annotation annotation : annotations) {
            System.out.println("Аннотация № " + i + " " + annotation);
        }
    }

}
