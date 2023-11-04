package j.unknown.www.annotation;

import  j.unknown.www.annotation.сontext.*;
import j.unknown.www.annotation.сontext.PackageContext;

@TypeUseContext
@TypeContext

public class TargetContext <@TypeParameterContext T>{
    private @TypeUseContext @FieldContext T field;

    @ConstructorContext
    @TypeUseContext
    public TargetContext(@ParameterContext @TypeUseContext T field) {
       this.field = field;
    }


    @MethodContext
    public int sum(int a,int b){

        @LocalVariableContext  int sum = a+b;
        return sum;
    }
}
