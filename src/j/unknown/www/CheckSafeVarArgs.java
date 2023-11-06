package j.unknown.www;


public class CheckSafeVarArgs {

    static <T> void methodVarArgs(T... els) {
        Object[] objs = els;
        Integer[] integers = {1,2};
        objs[0] = integers[0];
    }

    public static void main(String[] args) {
        methodVarArgs("1", "2", "3");
    }

}
