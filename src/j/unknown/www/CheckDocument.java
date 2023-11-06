package j.unknown.www;

import j.unknown.www.annotation.TestDocumented;
import j.unknown.www.annotation.TestNotDocumented;

public class CheckDocument {
    @TestDocumented(doTestDocument = "That will be in documentation")
    public void doSomeTestDocumented() {
        System.out.println("Test for annotation with 'Documented'");
    }

    @TestNotDocumented(doTestNoDocument = "Than will not be in documentation")
    public void doSomeTestNotDocumented() {
        System.out.println("Test for annotation without 'Documented'");
    }
}
