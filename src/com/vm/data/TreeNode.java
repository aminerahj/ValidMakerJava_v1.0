/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.data;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public class TreeNode<E> implements Cloneable, Iterable<TreeNode<E>>, Collection<TreeNode<E>> {

    private ArrayList<TreeNode<E>> childs;
    private TreeNode<E> root;
    private TreeNode<E> parent;
    private E element;

    public TreeNode(E element) {
        this(null, null, element);
    }

    public TreeNode(TreeNode<E> root, TreeNode<E> parent, E element) {
        this.root = root;
        this.parent = parent;
        this.element = element;
        childs = new ArrayList<>();
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    @Override
    public Iterator<TreeNode<E>> iterator() {
        Iterator<TreeNode<E>> it;
        it = new Iterator<TreeNode<E>>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public TreeNode<E> next() {
                return get(index++);
            }
        };
        return it;
    }

    public TreeNode<E> get(int index) {
        return childs.get(index);
    }

    public TreeNode<E> set(int index, TreeNode<E> node) {
        node.parent = this;
        node.root = this.root;
        return childs.set(index, node);
    }

    @Override
    public int size() {
        return childs.size();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        for (TreeNode<E> node : childs) {
            if (node.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] oa = new Object[size()];
        for (int indx = 0; indx < size(); indx++) {
            oa[indx] = get(indx).element;
        }
        return oa;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(toArray(), size(), a.getClass());
    }

    @Override
    public boolean add(TreeNode<E> node) {
        if (node == null) {
            return false;
        }
        if (this.contains(node)) {
            return false;
        }
        node.parent = this;
        node.root = this.root;
        childs.add(node);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (TreeNode<E> node : childs) {
            if (node.equals(o)) {
                node.parent = null;
                node.root = null;
                childs.remove(node);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends TreeNode<E>> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
