package NestedIndexTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;


public class Line implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name="";
    private String town="";
    
    List<Inch> inches = new ArrayList<Inch>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Inch getInch(int index){

        int inchSize = inches.size();
	
	 	if ((index + 1) > inchSize)
		{
			//add objects to arrayList
			for (int j = inchSize; j < index + 1; j++)
			{
					this.inches.add(new Inch());
				
	    	}
		}
    	
    	return this.inches.get(index);
    }
    
    public void setInch(int index, Inch inch){
    	this.inches.set(index, inch);
    }
    
    public List<Inch> getInches() {
		return inches;
	}

	public void setInches(List<Inch> inches) {
		this.inches = inches;
	}

	public Line(){

    }
    public Line(String name,String town){
        this.name = name;
        this.town = town;

    }
}