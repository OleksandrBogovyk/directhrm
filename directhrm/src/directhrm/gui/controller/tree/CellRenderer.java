package directhrm.gui.controller.tree;

import directhrm.img.icon.Icons;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author andre
 */
public class CellRenderer extends DefaultTreeCellRenderer {

	@SuppressWarnings("unchecked")
	@Override
	public Component getTreeCellRendererComponent(
			JTree tree, Object value, boolean sel, boolean expanded,
			boolean leaf, int row, boolean hasFocus) 
	{

		super.getTreeCellRendererComponent(
				tree, value, sel, expanded, leaf, row, hasFocus);

		TreeNode<NodeValue> node = (TreeNode<NodeValue>)value;
		NodeValue nodeValue = node.getValue();
		if( nodeValue.getPerson() != null ) {
			java.net.URL imgURL = Icons.class.getResource("person.png");
			Icon icon = new ImageIcon(imgURL);
			setIcon(icon);
		}

		return this;
	}
}
