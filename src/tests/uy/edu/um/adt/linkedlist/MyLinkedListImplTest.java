package linkedlist;

import TADs.linkedlist.MyLinkedListImpl;
import TADs.queue.EmptyQueueException;
import TADs.stack.EmptyStackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListImplTest {
    //El metodo add es verificado en cada uno de los tests.
    @Test
    void getOneElement() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        assertEquals(7,testList.get(0));
    }

    @Test
    void containsOneElement() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        assertTrue(testList.contains(7));
    }

    @Test
    void remove() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        testList.remove(7);
        assertFalse(testList.contains(7));
    }

    @Test
    void size() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        assertEquals(1,testList.size());
    }

    @Test
    void enqueueCasoVacia() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.enqueue(3);
        assertTrue(testList.contains(3)); //Verifica que se haya agregado
        assertEquals(1,testList.size()); //Verifica que no se hayan agregado cosas de mas
    }

    @Test
    void enqueueCasoNoVacia() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        testList.enqueue(3);
        assertEquals(3,testList.get(0)); //Verifica que se haya agregado al principio de la lista
        assertEquals(2,testList.size()); //Verifica que no se hayan agregado cosas de mas
    }

    @Test
    void dequeueCasoVacia() throws EmptyQueueException { //QUEDO SIN HACER PORQUE NO SE COMO VERIFICAR LA EXCEPCION
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();

    }

    @Test
    void dequeueCasoNoVacia() throws EmptyQueueException {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        assertEquals(7,testList.dequeue());
    }


    @Test
    void pushCasoVacia() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.push(7);
        assertTrue(testList.contains(7)); //Verifica que se haya agregado
        assertEquals(1,testList.size()); //Verifica que no se hayan agregado cosas de mas
    }

    @Test
    void pushCasoNoVacia() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        testList.push(3);
        assertEquals(3,testList.get(1));
    }

    @Test
    void pushCasoValorVacio() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.push(null);
        assertEquals(0,testList.size());
    }

    @Test
    void popCasoVacia() throws EmptyStackException { //QUEDO SIN HACER PORQUE NO SE COMO VERIFICAR LA EXCEPCION
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();

    }

    @Test
    void popCasoNoVacia() throws EmptyStackException {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(3);
        testList.add(7);
        assertEquals(7,testList.pop());
    }


    @Test
    void peek() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        testList.add(3);
        assertEquals(3,testList.peek());
    }

    @Test
    void getCircularLogic() {
        MyLinkedListImpl<Integer> testList = new MyLinkedListImpl<>();
        testList.add(7);
        testList.add(3);
        testList.add(5);
        assertEquals(3,testList.getCircularLogic(1));
    }
}