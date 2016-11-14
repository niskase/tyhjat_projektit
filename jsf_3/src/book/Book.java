package book;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;  

@ManagedBean
@SessionScoped
public class Book implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String version;
    public Book(String version) {
		super();
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	private int year;


    public Book() {
        name = "ABC Operation System";
	    version = "0.11";
    }
    
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + version;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    
}
