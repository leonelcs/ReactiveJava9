package helpers;

@FunctionalInterface
public interface DisplayData {
	
	public String write(String item, Object... arguments);

}
