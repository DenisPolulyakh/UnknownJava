package j.unknown.www.annotation;

@InfoAnnotation(name="Leo M", version = 1.1, value = 2)
public class DemoInfoAnnotation {

    @InfoAnnotation(version = 1.2)
    public String getDemo(){
        return "Демонстрация аннотирования";
    }
}
