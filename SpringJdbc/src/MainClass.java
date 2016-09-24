import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		DemoBean demoBean = (DemoBean) context.getBean("demoBean");
		/*demoBean.setName("Yeshshree");
		demoBean.setPassword("XYZ");
		*/
		DemoDao demoDao = (DemoDao) context.getBean("demoDao");
		
		demoDao.createTable();
		demoDao.insertValues(demoBean.getName(), demoBean.getPassword());
	}

}
