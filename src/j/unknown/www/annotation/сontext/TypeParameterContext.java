package j.unknown.www.annotation.сontext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Аннотация для аннотирования типов параметра( при опеределнии генериков)
 */
@Target(ElementType.TYPE_PARAMETER)
public @interface TypeParameterContext {
}
