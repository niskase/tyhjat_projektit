package book;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;  

@ManagedBean
@SessionScoped
public class Book implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
    private String version;


    public Book() {
        name = "My Book";
        version =  1999;
    }
    
    public Book(String name, String version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "book " + name + " was published in " + version;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersionr(String version) {
        this.version = version;
    }


    
}
