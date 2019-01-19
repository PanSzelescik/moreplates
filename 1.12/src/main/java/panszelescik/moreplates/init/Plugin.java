package panszelescik.moreplates.init;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    String modid();

    String modname();

    boolean checkModid() default true;

    boolean checkConfig() default true;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface PreInit {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface PostInit {
    }
}
