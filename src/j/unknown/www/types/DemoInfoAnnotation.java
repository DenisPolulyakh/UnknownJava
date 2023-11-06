package j.unknown.www.types;

import j.unknown.www.annotation.InfoAnnotation;

@InfoAnnotation(name="Leo M", version = 1.1, value = 2)
public class DemoInfoAnnotation {

    @InfoAnnotation(version = 1.2)
    public String getDemo(){
        return "Демонстрация аннотирования";
    }
}
