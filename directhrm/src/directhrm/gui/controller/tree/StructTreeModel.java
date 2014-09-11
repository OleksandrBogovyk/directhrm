package directhrm.gui.controller.tree;

import directhrm.Application;
import directhrm.entity.Organization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author andre
 */
public class StructTreeModel implements TreeModel {

	public StructTreeModel(Application application, TreeNode<NodeValue> root) {
		super();
		
		this.application = application;
		this.root = root;
	}
	
	// -------------------------------------------------------------------------

	@Override
	public Object getRoot() {
		return root;
	}

	@Override
	public Object getChild(Object parent, int index) {
		@SuppressWarnings("unchecked")
		TreeNode<NodeValue> n = (TreeNode<NodeValue>)parent;
		return n.getChild(index);
	}

	@Override
	public int getChildCount(Object parent) {
			@SuppressWarnings("unchecked")
			TreeNode<NodeValue> n = (TreeNode<NodeValue>)parent;
			return n.getChildCount();
	}

	@Override
	public boolean isLeaf(Object node) {
		return false;
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		@SuppressWarnings("unchecked")
		TreeNode<NodeValue> p = (TreeNode<NodeValue>)parent;
		@SuppressWarnings("unchecked")
		TreeNode<NodeValue> c = (TreeNode<NodeValue>)child;
		return p.indexOfChild(c);
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		listeners.add(l);
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		listeners.remove(l);
	}
	
	// -------------------------------------------------------------------------
	
	public TreeNode<NodeValue> getRootNode() {
		return root;
	}

	// -------------------------------------------------------------------------
	
  	public void addChildren(
			TreeNode<NodeValue> parent, List<NodeValue> children) 
	{
		for( NodeValue c : children )
			addChild(parent, c);
	}
	
	public void addChild(TreeNode<NodeValue> node, NodeValue child) {
		int index = node.getChildCount();
		addChild(node, child, index);
	}
	public void addChild(
			TreeNode<NodeValue> node, NodeValue child, int index) 
	{
		TreeNode<NodeValue> childNode = new TreeNode<>( child, -1 );
		node.addChild(childNode, index);
		
		TreeModelEvent event = createEvent(node, index, childNode);
		for(TreeModelListener l : listeners) {
			l.treeNodesInserted(event);
		}
	}
	
	public void updateNode(TreeNode<NodeValue> node, NodeValue newValue) {
		node.setValue(newValue);

		TreeNode<NodeValue> parent = node.getParent();
		int index = node.indexOfSelf();
		TreeModelEvent event = createEvent(parent, index, node);
		for(TreeModelListener l : listeners) {
			l.treeNodesChanged(event);
		}
	}

	public void deleteNode(TreeNode<NodeValue> node) {
		TreeNode<NodeValue> parent = node.getParent();
		int index = node.indexOfSelf();
		if( index < 0 )
			return;
		parent.removeChild(index);
		
		TreeModelEvent event = createEvent(parent, index, node);
		for(TreeModelListener l : listeners) {
			l.treeNodesRemoved(event);
		}
	}
	
	public void clearNodeChildren(TreeNode<NodeValue> node) {
		for(int i = node.getChildCount()-1; i >= 0; i--) {
			TreeNode<NodeValue> child = node.getChild(i);
			deleteNode(child);
		}
	}
	
	// -------------------------------------------------------------------------
	
	private TreeModelEvent createEvent(
			TreeNode<NodeValue> parent, int index, 
			TreeNode<NodeValue> node)
	{
		TreePath treePath = createPath(parent);
		
		TreeModelEvent event = new TreeModelEvent(
				this, treePath, new int[] {index}, new Object[] {node});
		return event;
	}
	
	public TreePath createPath(TreeNode<NodeValue> node) {
		List<Object> list = new ArrayList<>();
		list.add(node);
		while( node.getParent() != null ) {
			node = node.getParent();
			list.add(node);
		}
		Collections.reverse(list);
		Object[] array = new Object[ list.size() ];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		
		TreePath treePath = new TreePath(array);
		return treePath;
	}
	
	// -------------------------------------------------------------------------
	
	public void updateOrganization(Organization o) {
		List<TreeNode<NodeValue>> descendants = root.getDescendants();
		for(TreeNode<NodeValue> node : descendants) {
			NodeValue value = node.getValue();
			if( value.getOrganization() == null )
				continue;
			if( value.getOrganization().getId() != o.getId() )
				continue;
			updateNode(node, new NodeValue(o));
		}
	}
	
	// ===== Attributes ========================================================
	
	private Application application;
	
	private TreeNode<NodeValue> root = new TreeNode<>();
	protected ArrayList<TreeModelListener> listeners = new ArrayList<>();
	
}
