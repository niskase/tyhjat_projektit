package book;

import javax.validation.constraints.*;
import javax.faces.bean.*; 

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;


@ManagedBean
@SessionScoped
public class Tuotteet implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 52352351L;
	ArrayList<Tuote> tuotteet;
    public Tuotteet() {
        tuotteet = new ArrayList<Tuote>();
        tuotteet.add(new Tuote("Microsoft Office Standard", "#MO5345f089JT", 
736.90));
        tuotteet.add(new Tuote("HP Elitebook", "#XM592AA65UUW", 398.90));
        tuotteet.add(new Tuote("Nokia Lumia 640 XL", "#65064508AF01A00", 399.90));
        tuotteet.add(new Tuote("Adobe Acrobat Pro 7.0", "#HA2202015473", 623.90));
        tuotteet.add(new Tuote("Sony Bravia 40 Full HD", "#K5435534L40EX402", 
699.90 ));
        tuotteet.add(new Tuote("Apple iPad Pro","#APPTKLF50159476FDS", 655.90));
        tuotteet.add(new Tuote("Microsoft Surface Pro", "#MS027175X8JKY", 589.90));
        tuotteet.add(new Tuote("Apple Mac OS X", "#APP534563MC573", 27.90));
        tuotteet.add(new Tuote("F-Secure Internet Security", "#FCI650OE1N001FI", 
29.90));
        tuotteet.add(new Tuote("Samsung S6", "#SAM00565442M115", 449.90));         
    }
	@Override
	public String toString() {
		return "Tuotteet [tuotteet=" + tuotteet + "]";
	}
	
    
}
