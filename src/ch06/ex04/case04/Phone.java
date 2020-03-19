
package ch06.ex04.case04;

public class Phone {
	private String modelName;
	
	public Phone(String midelName){
		this.modelName = modelName;
	}
	
	public boolean equlas(Object obj){
		if(obj instanceof Phone)
			return modelName.equals(((Phone)obj).modelName);
		else
			return false;
	}
}
