import uy.edu.um.adt.binarytree.BinaryTree;
import uy.edu.um.adt.binarytree.NodeAlreadyExists;
import uy.edu.um.adt.binarytree.SearchBinaryTreeImpl;
import uy.edu.um.adt.closedhash.ClosedHashImpl;
import uy.edu.um.adt.closedhash.DuplicateKey;

public class Main {
    public static void main(String[] args) throws NodeAlreadyExists, DuplicateKey {
        ClosedHashImpl<String, Integer> hash = new ClosedHashImpl<>(10);
        hash.insertar("a",1); //codigo ASCII de a es 97, 97%size = 97%10=7, va en la posicion 7 del hash
        System.out.println(hash);
    }
}