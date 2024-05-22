package uy.edu.um.adt.binarytree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchBinaryTreeImplTest {
    private SearchBinaryTreeImpl<Integer> testBinaryTree;
    private SearchBinaryTreeImpl<Integer> testBinaryTreeTraverse;

    @Before
    public void setup() throws NodeAlreadyExists {
        testBinaryTree = new SearchBinaryTreeImpl<Integer>();
        testBinaryTreeTraverse = new SearchBinaryTreeImpl<Integer>();
        testBinaryTreeTraverse.add(5);
        testBinaryTreeTraverse.add(7);
        testBinaryTreeTraverse.add(8);
        testBinaryTreeTraverse.add(3);
        testBinaryTreeTraverse.add(4);
        testBinaryTreeTraverse.add(10);
        testBinaryTreeTraverse.add(2);
        testBinaryTreeTraverse.add(1);
        testBinaryTreeTraverse.add(6);
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
        Assert.assertArrayEquals(new Integer[] {5,3,2,1,4,7,6,8,10}, testBinaryTreeTraverse.preOrder().toArray());
    }

    @Test
    public void testPosOrder() {
        Assert.assertArrayEquals(new Integer[] {1,2,4,3,6,10,8,7,5}, testBinaryTreeTraverse.posOrder().toArray());
    }

    @Test
    public void testInOrder() {
        Assert.assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,10}, testBinaryTreeTraverse.inOrder().toArray());
    }
}