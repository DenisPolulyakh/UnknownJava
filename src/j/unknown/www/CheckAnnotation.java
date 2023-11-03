package j.unknown.www;

import j.unknown.www.annotation.Marker;
import j.unknown.www.annotation.ThisClassMark;
import j.unknown.www.annotation.ThisClassNotMark;

public class CheckAnnotation {
    public static void main(String[] args) {
        ThisClassMark mark = new ThisClassMark();
        ThisClassNotMark notMark = new ThisClassNotMark();
        testMark(mark);
        //Если раскомментировать, то не скомпилируется
        //testMark(notMark);
    }

    public static void testMark(Marker marked){
        System.out.println("Переданный класс помечен Marker");
    }
}
