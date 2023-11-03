package j.unknown.www;

import j.unknown.www.annotation.*;



public class CheckAnnotation {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        testInterface(parent);
        testInterface(child);
        testAnnotation(parent);
        testAnnotation(child);

    }

    public static void testInterface(Marker marked){
        System.out.println("Переданный класс помечен Marker");
    }

    public static void testAnnotation(Marker marked){

        if (!marked.getClass().isAnnotationPresent(MarkAnnotation.class)) {
            throw new RuntimeException("Объект не аннотирован аннотацией 'MarkAnnotation'");
        }
        System.out.println("Метод 'testAnnotation' успешно завершен!");
    }
}
