package book;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;  

@ManagedBean
@SessionScoped
public class Book implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
    private int year;


    public Book() {
        name = "My Book";
        year =  1999;
    }
    
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "book " + name + " was published in " + year;
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
