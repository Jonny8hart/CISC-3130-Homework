import java.util.NoSuchElementException;

// --------------------
// Stack
// --------------------
public class Stack {
    private int[] items = new int[10];
    private int size;

    public void push(int item) {
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

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop from an empty stack");
        }

        return items[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot peek at an empty stack");
        }
        return items[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}