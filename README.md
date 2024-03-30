## Annotation Library
Build such Processor. It will find the MyBuilder in the project. Also need `META-INF/services/javax.annotation.processing.Processor` to tell compiler what processors it will parse.

Some says to use google AutoService. After some test, it shows AutoService could help to generate `META-INF/services/javax.annotation.processing.Processor`. However, if existing code uses generated code which is having error, it wouldn't parse successfully. Seems need to rely on the native way.

<img src='https://github.com/allenlipeng47/AnnotationProcessorApp/assets/9972586/9a6a834c-698d-4961-a15a-f0e2a8aa7f2f' width='600'>

After `mvn compile`, can actually see the logs.

<img src='https://github.com/allenlipeng47/AnnotationProcessorApp/assets/9972586/e87060a1-684b-4f42-8d30-b0f798bd2707' width='600'>

Run `mvn install`, it installs to local .m2

<img src='https://github.com/allenlipeng47/AnnotationProcessorApp/assets/9972586/5a790658-4e75-4b73-91af-d1145fce25b7' width='600'>

Also can see the MyClassBuilder has been created:

<img src='https://github.com/allenlipeng47/AnnotationProcessorApp/assets/9972586/6ed3f94d-f7b0-42c3-ac6b-55fcbc9c1950' width='300'>

## App

All it needs is just to include below dependency. Unlike many articles says, it doesn't seem need the `annotationProcessorPaths` stuff.
```
        <dependency>
            <groupId>org.example</groupId>
            <artifactId>common-lib</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

Can also define your own `MyBuilder` at places you want in current project.

Can also run the code or compile directly in the project.

<img src='https://github.com/allenlipeng47/AnnotationProcessorApp/assets/9972586/ac55659d-fcc2-40e4-9862-5c87458572af' width='600'>


