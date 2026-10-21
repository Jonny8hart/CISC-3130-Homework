Name: Jonathan Hart

Programming Language: Java

IDE / Editor: VSCode

Question 1: ADT stands for Abstract Data Type

Question 2: An Abstract Data Type defines data types and gives them rules for which they have to follow, such as a Stack or Queue. 

Question 3: An ADT defines the operations and rules for that data type, WHAT it can do. The Implementation is HOW they’re built, like if a queue is built using an array or a linked list.

Question 4: Yes, two programmers can create different implementations of the same ADT because the implementation is how the ADT works meaning that the same ADT can fufill the same purpose but be created differently.

Question 5: Yes, if one programmer creates a Stack using an array and another creates a Stack using a linked list, they are both still stacks since they follow the same rules and have the same behavior, the only difference is in the implementation. 

Question 6: LIFO stands for Last in First Out which means that the final element pushed into a data set, will be the first one removed when popped.
Question 7: 55 got removed before 15 because 55 was the last element pushed into the stack, therefore it was the first one out.

Question 8: If D was the last item added, then D is also the first one removed since stacks are LIFO. 

Question 9: One software example of where a stack could be useful is in an undo feature in a text editor, where the last word typed will be the first one removed when the undo hotkey is pressed.

Question 10: FIFO means first in first out, the first element in is also the first one out.

Question 11: 15 was removed before 55 because 15 was the first element in, therefore the first one out.

Question 12: Alex should leave the queue first since he was the first one in the queue.

Question 13: A queue could be useful when server capacity for a website has been reached, and there is a queue of users waiting to get into the website, the first person to enter the queue is the first person to leave and get access to the website. 

Scenario 1 (Undo Feature): 
Stack because the most recent would be the last one, therefore if C was the most recent action it would be the first one out in a stack.

Scenario 2 (Printer): 
Queue, because if the first person to send one needs to be the first one to get it printed then it is FIFO which is a queue.

Scenario 3 (Browser Back Button):
Assuming the current page you were on was Amazon when you hit the back button, the page that should pop up would be Github because it goes to the previous website not the first one. This ADT is a Stack since it is Last in First Out.

Scenario 4 (Customer Service):
Queue since the first person to arrive, is the first one to be helped and removed from the queue. FIFO.

Scenario 5 (Plates): 
Five plates on top of one another is an example of a Stack ADT since the last plate that was put on the stack is the first one to be removed (LIFO).

Question 14: pop() should return 18.

Question 15: peek() returns 22.

Question 16: dequeue() returns 7.

Question 17: peek() returns 12.

Feature            | Stack           | Queue
Rule               |LIFO             |FIFO
Add operation      |push             |enqueue
Remove operation   |pop              |dequeue 
View next item     |peek             |peek
First item removed |Most recent item |First item added

Question 18: The Stack is the ADT since it is the WHAT.

Question 19: The Array is the implementation since it is the HOW.

Question 20 :Replacing the array but keeping the same Stack operations does not change the ADT, it is still a Stack and does the same function, but how it works (the implementation) is different.