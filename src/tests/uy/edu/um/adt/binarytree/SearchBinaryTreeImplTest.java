package uy.edu.um.adt.binarytree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchBinaryTreeImplTest {
    private SearchBinaryTreeImpl<Integer> testBinaryTree;
    private TreeNode<Integer> testTreeNode;

    @Before
    public void setup() {
        testBinaryTree = new SearchBinaryTreeImpl<Integer>();
    }

    @Test
    public void testAddCasoVacio() throws NodeAlreadyExists {
        testBinaryTree.add(2);
        Assert.assertTrue(testBinaryTree.contains(2));
    }

    @Test
    public void testAddCasoNoVacio() throws NodeAlreadyExists {
        testBinaryTree.add(1);
        testBinaryTree.add(2);
        Assert.assertTrue(testBinaryTree.contains(2));
    }

    @Test (expected = NodeAlreadyExists.class)
    public void testAddCasoNoVacioCoincidencia() throws NodeAlreadyExists {
        testBinaryTree.add(1);
        testBinaryTree.add(1);
    }

    @Test
    public void testContains() throws NodeAlreadyExists {
        testBinaryTree.add(1);
        Assert.assertTrue(testBinaryTree.contains(1));
    }

    @Test
    public void testRemove() throws NodeAlreadyExists {
        testBinaryTree.add(3);
        testBinaryTree.add(2);
        testBinaryTree.add(1);
        testBinaryTree.add(4);
        testBinaryTree.add(5);
        testBinaryTree.remove(5);
        Assert.assertFalse(testBinaryTree.contains(5));
    }

    @Test
    public void testRemoveNoHoja() throws NodeAlreadyExists {
        testBinaryTree.add(3);
        testBinaryTree.add(2);
        testBinaryTree.add(1);
        testBinaryTree.add(4);
        testBinaryTree.add(5);
        testBinaryTree.remove(2);
        Assert.assertFalse(testBinaryTree.contains(2));
    }

    @Test
    public void testFind() throws NodeAlreadyExists {
        testBinaryTree.add(3);
        testBinaryTree.add(2);
        testBinaryTree.add(1);
        Assert.assertEquals(Integer.valueOf(2),testBinaryTree.find(2));
    }

    @Test
    public void testNoFind() throws NodeAlreadyExists {
        testBinaryTree.add(3);
        testBinaryTree.add(2);
        testBinaryTree.add(1);
        Assert.assertNull(testBinaryTree.find(4));
    }

    @Test
    public void testPreOrder() {
    }

    @Test
    public void testPosOrder() {
    }

    @Test
    public void testInOrder() {
    }
}