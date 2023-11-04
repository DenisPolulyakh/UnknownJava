package j.unknown.www.annotation.сontext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Аннотация для аннотирования только аннотаций
 */
@Target({ElementType.ANNOTATION_TYPE})
public @interface AnnotationTypeContext {
}

