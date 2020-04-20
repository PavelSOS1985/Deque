import java.util.*;

public class Deque<T> {
    LinkedList<T> deque;

    public Deque() {
        // инициализация внутреннего хранилища
        deque = new LinkedList<>();
    }

    public void addFront(T item) {
        // добавление в голову
        deque.addFirst(item);
    }

    public void addTail(T item) {
        // добавление в хвост
        deque.addLast(item);
    }

    public T removeFront() {
        // удаление из головы
        if (deque.isEmpty()) return null;
        return deque.removeFirst();
    }

    public T removeTail() {
        // удаление из хвоста
        if (deque.isEmpty()) return null;
        return deque.removeLast();
    }

    public int size() {
        // размер очереди
        return deque.size();
    }
}