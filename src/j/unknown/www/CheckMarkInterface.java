package j.unknown.www;

import j.unknown.www.annotation.Marker;
import j.unknown.www.annotation.ThisClassMark;
import j.unknown.www.annotation.ThisClassNotMark;

public class CheckMarkInterface {
    public static void main(String[] args) {
        ThisClassMark mark = new ThisClassMark();
        ThisClassNotMark notMark = new ThisClassNotMark();
        testMark(mark);
        //Если раскомментировать, то компиляция не будет произведена
        //testMark(notMark);
    }

    public static void testMark(Marker marked){
        System.out.println("Переданный класс помечен Marker");
    }
}
