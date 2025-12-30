package collectionfrmwrk.sortingtech.bycomparator;

import java.util.Comparator;

// Mark wise Student sorting
public class MarksWiseStudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.getMarks() > s2.getMarks())             
		{                                          
			return 1;                              
		}                                          
		else if(s1.getMarks() < s2.getMarks())        
		{                                          
			return -1;                             
		}                                          
		else                                       
		{                                          
			return 0;                              
		}                                          
	}
}
