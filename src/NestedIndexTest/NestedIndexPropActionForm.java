package NestedIndexTest;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;


public class NestedIndexPropActionForm extends ActionForm {  
	   

		private static final long serialVersionUID = 1L;
	
		private List<Line> lines = new ArrayList<Line>();  

	   
	     public List<Line> getLines() {  
	         return lines;  
	     }  

	     public Line getLineDto(int index) 
	     { 
                int lineSize = lines.size();
			
	     	if ((index + 1) > lineSize)
			{
				//add objects to arrayList
				for (int j = lineSize; j < index + 1; j++)
				{
					Line line =
						new Line();
				
					lines.add(j, line);
				}
			}
	        return (Line) this.lines.get(index);  
	     }  
	   
	   
	     public void setLineDto(int index, Line line) {  
	         this.lines.set(index, line);  
	     }  
	   
	     public void setLines(List<Line> lines){
	    	 this.lines = lines;
	     }
	     

	  
	 }  
