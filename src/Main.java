import uy.edu.um.adt.binarytree.BinaryTree;
import uy.edu.um.adt.binarytree.NodeAlreadyExists;
import uy.edu.um.adt.binarytree.SearchBinaryTreeImpl;

public class Main {
    public static void main(String[] args) throws NodeAlreadyExists {
        SearchBinaryTreeImpl<Integer> tree = new SearchBinaryTreeImpl<Integer>();
        try {
            tree.add(5);
        }
        catch(Exception NodeAlreadyExists) {
            System.out.println("Ese nodo ya existe!");
        }
        System.out.println( tree.inOrder());
    }
}