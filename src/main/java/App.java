import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld sameBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstCat =
                (Cat) applicationContext.getBean("cat");
        Cat secondCat =
                (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld - " + (bean == sameBean));
        System.out.println("Cat - " + (firstCat == secondCat));
    }
}