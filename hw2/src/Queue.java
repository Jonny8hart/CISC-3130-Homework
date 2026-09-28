import java.util.NoSuchElementException;

// --------------------
// Queue
// --------------------
public class Queue {
    private int[] items = new int[10];
    private int size;

    public void enqueue(int item) {
        if (size == items.length) {
            int[] expanded = new int[items.length * 2];
            for (int index = 0; index < items.length; index++) {
                expanded[index] = items[index];
            }
            items = expanded;
        }

        items[size] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue from an empty queue");
        }

        int frontItem = items[0];
        for (int index = 1; index < size; index++) {
            items[index - 1] = items[index];
        }
        size--;
        return frontItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot peek at an empty queue");
        }
        return items[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}