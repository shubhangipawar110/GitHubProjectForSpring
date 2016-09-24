import org.springframework.jdbc.core.JdbcTemplate;

//Dao class for JdbcTemplate implementation

public class DemoDao 
{
	private JdbcTemplate jt;

	//getter setter for method invocation of JdbcTemplate
	public JdbcTemplate getJt() 
	{
		return jt;
	}

	public void setJt(JdbcTemplate jt) 
	{
		this.jt = jt;
	}
   public void createTable()
   {
	   jt.execute("CREATE TABLE student(id bigint IDENTITY(1,1),name varchar(30),password varchar(30))");
	   System.out.println("table created");
   }
	
   public void insertValues(String name,String password)
   
   {
	   String qry = "INSERT INTO student(name,password) VALUES('"+name+"','"+password+"')";
	   
	   jt.update(qry);
   }
}
