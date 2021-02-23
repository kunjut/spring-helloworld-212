import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() == bean2.getMessage());

        Cat catBean1 = applicationContext.getBean("catBean", Cat.class);
        Cat catBean2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean1 == catBean2);
    }
}