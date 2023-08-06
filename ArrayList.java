import java.util.Arrays;

//package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  	public int getCurrentItem() {
  		
  		return currentItem;
  		
  	}// end getCurrentItem

  	public void setCurrentItem(int currentItem) {
  		
  		this.currentItem = currentItem;
  
  	}// end setCurrentItem

  	public T[] getArList() {
  		
  		return arList;
	
  	}// end getArList

  	public void setArList(T[] arList) {
  		
  		this.arList = arList;
	
  	}// end setArList

  	public int getDEFAULT_SIZE() {
  		
  		return DEFAULT_SIZE;
  		
  	}// end getDEFAULT_SIZE

	public boolean addItem(T item) {
  		
  		if(item != null) {
  			
  			for(currentItem = 0; currentItem < arList.length; currentItem ++) {
  				
  				if(arList[currentItem] == null) {
  					
  					arList[currentItem] = item;
  					
  					return true;
  				}
  			}
  		}
  		
		return false;
  		
  	}// end addItem

	@Override
	public String toString() {
		
		return "ArrayList " + "\n" + "DEFAULT SIZE: " + DEFAULT_SIZE + "\n" + "Current Item: " + getCurrentItem() + "\n" + "List: "
				+ Arrays.toString(arList) + "]";
		
	}// end toString
	
	
  	
}//end class




