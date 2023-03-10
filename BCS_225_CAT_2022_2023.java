/*
MASINDE MULIRO UNIVERSITY OF SCIENCE AND TECHNOLOGY
SCHOOL OF COMPUTING AND INFORMATICS
DEPARTMENT OF COMPUTER SCIENCE
2022/2023 ACADEMIC YEAR
SECOND YEAR SECOND SEMESTER

GROUP MEMBERS:

  NAME                              REG NO           PHONE NUMBER
1. MICHAEL OTIENO KASUKU    COM/B/01-00162/2021       0742644460
2. DENNIS  MUUO   MUTIE     COM/B/01-00144/2021       0742600571
3. DADIUS  OPIO             COM/B/01-04159/2021       0794241545
4. BRIAN   OCHIEKU          COM/B/01-00179/2021       0740824019

COURSE CODE: BCS 225
COURSE TITLE: DATA STRUCTURES
TASK: GROUP CAT
PRESENTED TO: MR.PRESTONE SIMIYU
DATE PRESENTED: FRIDAY, 10TH MARCH, 2023.
*/

/*
Question one:
Here's a Java code for a class called MmustLinkedin with an inner class that supports all the linked list operations:(5 marks)
*/

public class MmustLinkedin {
    private Node head;
    private int size;

    public MmustLinkedin() {
        head = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }

    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        } else if (head.next == null) {
            return removeFirst();
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            int data = current.next.data;
            current.next = null;
            size--;
            return data;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data = data;
        }
    }

    public int size() {
        return size;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}


/*
Question two:
Here's a Java program that uses the linked list concept to implement a stack:(5 marks)
*/

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new NoSuchElementException();
        } else {
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }
    }

    public int peek() {
        if (top == null) {
            throw new NoSuchElementException();
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}


/*
Question three:
Java program that uses the linked list concept to implement a queue:(3 marks)
*/

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public int peek() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}


/*Question four
Time complexity (Big O notation) for each operation in question 2 and 3:(7 marks)

For the stack implementation in question 2:

push operation: O(1)
pop operation: O(1)
peek operation: O(1)
isEmpty operation: O(1)
size operation: O(1)

For the queue implementation in question 3:

enqueue operation: O(1)
dequeue operation: O(1)
peek operation: O(1)
isEmpty operation: O(1)
size operation: O(1)
*/
