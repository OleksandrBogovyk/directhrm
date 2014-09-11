package directhrm.gui.controller.tree;

/**
 *
 * @author andre
 */
import java.util.*;

import javax.swing.tree.TreePath;

public class TreeNode<E> {

	/* === Constructors === */

	private final static int INITIAL_CAPACITY = 10;

	public TreeNode() {
		this(null, INITIAL_CAPACITY);
	}
	public TreeNode(int initialCapacity) {
		this(null, initialCapacity);
	}
	public TreeNode(E value) {
		this(value, INITIAL_CAPACITY);
	}
	public TreeNode(E value, int initialCapacity) {
		this.value = value;
		if( initialCapacity >= 0 )
			children = new ArrayList<>( initialCapacity );
	}
	public void initChildren() {
		initChildren( INITIAL_CAPACITY );
	}
	public void initChildren(int initialCapacity) {
		children = new ArrayList<>( initialCapacity );
	}

	/* === Object override === */

	@Override
	public String toString() {
		if( value == null )
			return "";
		return value.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object o) {

		if( o == null )
			return false;
		if( !(o instanceof TreeNode<?>) )
			return false;
		TreeNode<?> node = (TreeNode<?>)o;
		if( !value.equals( node.getValue() ) )
			return false;
		if( node.children == null ) {
			return children == null;
		}
		if( children == null ) {
			return node.children == null;
		}
		if( children.size() != node.getChildCount() )
			return false;
		for(int i=0, size=children.size(); i < size; i++ )
			if( !children.get(i).equals(node.getChild(i)) )
				return false;

		return true;
	}

	/* === Getters === */

	public E getValue() {
		return value;
	}
	public TreeNode<E> getParent() {
		return parent;
	}
	public boolean isChildrenPopulated() {
		return children != null;
	}
	public int getChildCount() {
		return children.size();
	}
	public TreeNode<E> getChild(int index) {
		return children.get( index );
	}
	public TreeNode<E> getLastChild() {
		int size = children.size();
		if( size == 0 )
			return null;
		return children.get( size-1 );
	}

	public List<TreeNode<E>> getChildren() {
		return new ArrayList<>( children );
	}

	public List<TreeNode<E>> getAscendants() {
		List<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> a = this;
		while( a != null ) {
			list.add(a);
			a = a.parent;
		}
		return list;
	}
	
	public List<TreeNode<E>> getDescendants() {
		List<TreeNode<E>> list = new ArrayList<>();
		list.add(this);
		for(TreeNode<E> c : children)
			list.addAll( c.getDescendants() );
		
		return list;
	}
	
	public TreePath getTreePath() {
		if( parent == null )
			return new TreePath(this);
		TreePath path = parent.getTreePath();
		return path.pathByAddingChild(this);
	}
	
 	public int indexOfChild(TreeNode<E> child) {
		for(int i=0, size=children.size(); i < size; i++)
			if( children.get(i) == child )
				return i;
		return -1;
	}
	public int indexOfSelf() {
		if( parent == null )
			return -1;
		return parent.indexOfChild(this);
	}

	public boolean isRoot() {
		return parent == null;
	}
	public boolean isLeaf() {
		return children.isEmpty();
	}
	public boolean isDescendantOf(TreeNode<E> node) {
		TreeNode<E> ascendant = this;
		while( ascendant != null ) {
			if( ascendant == node )
				return true;
			ascendant = ascendant.getParent();
		}
		return false;
	}
	/**
	 *
	 * @return level for node (root has level 0)
	 */
	public int getLevel() {
		int level = 0;
		TreeNode<E> item = this.parent;
		while( item != null ) {
			item = item.getParent();
			++level;
		}
		return level;
	}
	/**
	 *
	 * @return кількість рівнів "під" вузлом (для "листа" - 0)
	 */
	public int getDepth() {
		int childDepth = -1;
		for(TreeNode<E> child : children) {
			int d = child.getDepth();
			if( d > childDepth )
				childDepth = d;
		}
		return childDepth + 1;
	}

	public TreeNode<E> getRoot() {
		TreeNode<E> ascendant = this;
		while( ascendant.parent != null )
			ascendant = ascendant.parent;
		return ascendant;
	}
	public TreeNode<E> getPrevSibling() {
		if( parent == null )
			return null;
		int index = parent.indexOfChild(this);
		if( index == 0 ) // first element
			return null;
		return parent.getChild(index-1);
	}
	public TreeNode<E> getNextSibling() {
		if( parent == null )
			return null;
		int index = parent.indexOfChild(this);
		if( index == parent.getChildCount()-1 ) // last element
			return null;
		return parent.getChild(index+1);
	}

	/* === Mutators === */

	public void clearValue() {
		value = null;
	}
	public void setValue(E value) {
		this.value = value;
	}

	public TreeNode<E> addChild(TreeNode<E> child) {
		child.parent = this;
		children.add(child);
		return child;
	}
	public TreeNode<E> addChild(TreeNode<E> child, int index) {
		child.parent = this;
		children.add( index, child );
		return child;
	}
	public TreeNode<E> addChild() {
		TreeNode<E> child = new TreeNode<>();
		return addChild( child );
	}
	public TreeNode<E> addChild(int initialCapacity) {
		TreeNode<E> child = new TreeNode<>( initialCapacity );
		return addChild( child );
	}
	public TreeNode<E> addChild(E value) {
		TreeNode<E> child = new TreeNode<>( value );
		return addChild( child );
	}
	public TreeNode<E> addChild(E value, int initialCapacity) {
		TreeNode<E> child = new TreeNode<>(value, initialCapacity);
		return addChild( child );
	}

	public boolean move(int newIndex) {
		int index = indexOfSelf();
		if( index == newIndex )
			return false;
		parent.children.remove(index);
		parent.children.add(newIndex, this);
		return true;
	}
	public boolean moveUp() {
		int index = indexOfSelf();
		if( index == -1 || index == 0 )
			return false;
		Collections.swap(parent.children, index, index-1);
		return true;
	}
	public boolean moveDown() {
		int index = indexOfSelf();
		if( index == -1 || index == parent.getChildCount()-1 )
			return false;
		Collections.swap(parent.children, index, index+1);
		return true;
	}

	public boolean moveChild(int childIndex, int newIndex) {
		if( childIndex == newIndex )
			return false;
		TreeNode<E> child = children.remove(childIndex);
		children.add(newIndex, child);
		return true;
	}
	public boolean moveUpChild(int childIndex) {
		if( childIndex == -1 || childIndex == 0 )
			return false;
		Collections.swap(children, childIndex, childIndex-1);
		return true;
	}
	public boolean moveDownChild(int childIndex) {
		if( childIndex == -1 || childIndex == parent.getChildCount()-1 )
			return false;
		Collections.swap(children, childIndex, childIndex+1);
		return true;
	}
	
	public void removeThis() {
		if( parent == null )
			return;
		parent.removeChild(this);
	}
	public void removeChild( TreeNode<E> child ) {
		children.remove(child);
	}
	public void removeChild( int childIndex ) {
		children.remove(childIndex);
	}
	public void removeChildren() {
		children.clear();
	}

	/* === Attributes === */

	private E value;

	private TreeNode<E> parent;
	private List<TreeNode<E>> children;
}
