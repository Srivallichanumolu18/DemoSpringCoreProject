package AutoWiringDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*System.out.println("****Auto Wiring Using Constructor Methods****");
		Restaurant r=(Restaurant)context.getBean("restaurantbean");
		System.out.println(r.toString());
		context.close();*/
		
		Chef c=(Chef)context.getBean("chefbean");
		System.out.println(c.toString());
		context.close();
	}

}
