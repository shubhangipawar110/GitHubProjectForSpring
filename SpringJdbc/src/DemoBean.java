import org.springframework.jdbc.datasource.DriverManagerDataSource;


//Class for bean of Student information (Id,name) column
public class DemoBean
{
	
	private long id;
	private String name;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//getter setter method invocation of id and name
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
