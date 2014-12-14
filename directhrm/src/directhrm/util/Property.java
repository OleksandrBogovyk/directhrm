package directhrm.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class Property implements Serializable {

	public static int indexOf(List<Property> list, String key) {
		for(int i=0,size=list.size(); i < size; i++) {
			if( list.get(i).getKey().equals(key) )
				return i;
		}
		return -1;
	}
	public static String getValue(
			Collection<Property> collection, String key, String defaultValue) 
	{
		for(Property p : collection) {
			if( p.getKey().equals(key) )
				return p.getValue();
		}
		return defaultValue;
	}
	public static int getIntValue(
			Collection<Property> collection, String key, int defaultValue) 
	{
		for(Property p : collection) {
			if( p.getKey().equals(key) ) {
				return Util.parseInt(p.getValue(), defaultValue);
			}
		}
		return defaultValue;
	}
	public static long getLongValue(
			Collection<Property> collection, String key, long defaultValue) 
	{
		for(Property p : collection) {
			if( p.getKey().equals(key) ) {
				return Util.parseLong(p.getValue(), defaultValue);
			}
		}
		return defaultValue;
	}

	public Property() {
		super();
	}
	public Property(Property property) {
		super();
		
		copyFrom(property);
	}
	public Property(String key, String value) {
		super();

		this.key = key;
		this.value = value;
	}
	
	public void copyFrom(Property property) {
		key = property.key;
		value = property.value;
	}
	
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Property other = (Property) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	private String key   = "";
	private String value = "";
}
