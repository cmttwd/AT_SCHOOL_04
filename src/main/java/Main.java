import somepackage.Other;
import somepackage.Some;
import somethinggreen.Contract;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Some some = new Some("Secret_123");
        some.setNoMoreSecrets(321);

        System.out.println(some.getSecret());

        System.out.println(some.getNoMoreSecrets());
        System.out.println(some.noMoreSecrets);

        System.out.println(some);

        System.out.println(some.count());

        System.out.println(some.getДаТакТожеМожно());

        System.out.println(some.getSecret(true));

        some.soTellMeAboutInterfaces();

        Other.saySomthing();

        Contract.staticMethod("Static method Contract");

        for (Annotation annotation: Some.class.getAnnotations()){
            System.out.println(annotation.toString());
        }

    }
}
