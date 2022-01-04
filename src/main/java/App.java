import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean3 =//
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean3.getMessage());

        boolean comparisonHello = bean == bean3;
        System.out.println(comparisonHello);

        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getMessage());
        System.out.println(bean2.getMessage());

        boolean comparisonCat = bean2 == bean4;
        System.out.println(comparisonCat);

    }
}