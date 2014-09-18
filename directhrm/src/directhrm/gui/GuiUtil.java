package directhrm.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class GuiUtil {

	public static void testFieldLength(
			String fieldName, JTextField textField, int maxLength, 
			StringBuilder sbMessage) 
	{
		if( textField.getText().length() > maxLength ) {
			sbMessage.append( String.format(
					"Слишком длинное значение поля '%s'. "
					+ "Максимально допустимое число символов: %d\n", 
					fieldName, maxLength) );
		}
	}
	
	public static void centerWindow(Component component) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		centerWindow(component, dim, new Point(0, 0));
	}
	public static void centerWindow(
			Component centeredComponent, Component baseComponent)
	{
		Dimension dimension = new Dimension(
				baseComponent.getWidth(), baseComponent.getHeight());
		centerWindow(
				centeredComponent, dimension, 
				baseComponent.getLocationOnScreen());
	}
	public static void centerWindow(
			Component component, Dimension baseDimension, Point baseLocation)
	{
		int componentWidth  = component.getWidth();
		int componentHeight = component.getHeight();

		int componentX = 
				baseLocation.x + ( baseDimension.width  - componentWidth  ) / 2;
		int componentY = 
				baseLocation.y + ( baseDimension.height - componentHeight ) / 2;
		if( componentX < 0 )
			componentX = 0;
		if( componentY < 0 )
			componentY = 0;
		component.setLocation(componentX, componentY);
	}
}
