# Java Intermediate Labs

This README provides detailed documentation for each lab in the `src/main/java/org/example/` directory. Each section describes the purpose, main classes, and usage of the lab and its sub-labs.

---

## 1. AVL Tree Lab (`avl`)

**Purpose:**
Implements a self-balancing binary search tree (AVL Tree) that maintains balance after insertions.

**Main Class:** `AVLTree`

- Contains an inner `AVLNode` class.
- Supports insertion with automatic balancing (rotations).
- Methods: `insert(int value)`, private balancing and rotation helpers.

**Usage:**

```java
AVLTree tree = new AVLTree();
tree.insert(10);
tree.insert(20);
// ...
```

---

## 2. Collections Lab (`collections`)

### a. Comparator (`collections/comparator`)

**Purpose:**
Demonstrates custom sorting and transformation of a list of movies using Java Streams and Comparators.

**Main Classes:**

- `Movie`: Represents a movie with a title and number of likes.
- `CustomComparator`: Provides static methods for sorting and transforming movie lists.
- `Main`: Runs the sort and transform examples.

**Usage:**

```java
CustomComparator.sort();      // Sorts movies by likes and prints titles
CustomComparator.transform(); // Filters and transforms movie titles to uppercase
```

### b. Thread-Safe Cache (`collections/threadsafecache`)

**Purpose:**
Implements a thread-safe cache using `ConcurrentHashMap` and demonstrates basic cache operations.

**Main Classes:**

- `Cache`: Thread-safe cache with add, get, remove, and print methods.
- `Main`: Demonstrates adding and printing cache entries.

**Usage:**

```java
Cache cache = new Cache();
cache.add("Hello");
cache.add("World");
cache.print();
```

---

## 3. Concurrency Lab (`concurrency`)

### a. Thread Pool (`concurrency/threadpool`)

**Purpose:**
Demonstrates the use of a thread pool to process tasks concurrently.

**Main Classes:**

- `Demo`: Submits multiple `ProcessImageTask` instances to a fixed thread pool.
- `ProcessImageTask`: Runnable that simulates image processing and updates status.
- `ImageProcessingStatus`: Tracks total bytes processed using `AtomicInteger`.

**Usage:**

```java
Demo.show(); // Processes images in parallel and prints total bytes processed
```

### b. Synchronized Block (`concurrency/synchronizedBlock`)

**Purpose:**
Shows how to use synchronized blocks to safely update shared state across threads.

**Main Classes:**

- `Demo`: Starts multiple threads to run `DownloadFileTask` and waits for completion.
- `DownloadFileTask`: Runnable that simulates file download and updates status.
- `DownloadStatus`: Tracks total bytes downloaded with synchronization.

**Usage:**

```java
Demo.show(); // Downloads files in parallel and prints total bytes
```

### c. Thread-Safe Caching (`concurrency/ThreadSafeCaching.java`)

**Purpose:**
Generic thread-safe cache using `ConcurrentHashMap` and `AtomicInteger` for key generation.

**Main Class:**

- `ThreadSafeCaching<K, V>`: Generic cache with add and print methods.

**Usage:**

```java
ThreadSafeCaching<Integer, String> cache = new ThreadSafeCaching<>();
cache.add("353");
cache.print();
```

---

## 4. Exceptions Lab (`exceptions`)

### a. Checked and Unchecked Exceptions

**Purpose:**
Demonstrates handling of checked and unchecked exceptions in Java.

**Main Classes:**

- `CheckedException`: Shows handling of `IOException` with try-with-resources.
- `UnCheckedException`: (See file for details)

**Usage:**

```java
CheckedException.show();
```

### b. Custom Exception (`exceptions/customException`)

**Purpose:**
Implements a custom exception for insufficient funds in an account.

**Main Classes:**

- `Account`: Method `withdraw(int amount)` throws `InsufficientFundsException` if balance is insufficient.
- `InsufficientFundsException`: Custom exception extending `Exception`.
- `Main`: Demonstrates usage.

**Usage:**

```java
try {
    int newBalance = Account.withdraw(1500);
} catch (InsufficientFundsException e) {
    System.out.println(e.getMessage());
}
```

---

## 5. Generics Lab (`generics`)

**Purpose:**
Demonstrates the use of generics in Java with a generic stack implementation.

**Main Classes:**

- `GenericStack<E>`: Wrapper around Java's `Stack` with generic add and getStack methods.
- `Main`: Demonstrates adding different types to the stack.

**Usage:**

```java
GenericStack stack = new GenericStack();
stack.add("3453");
stack.add(3456);
System.out.println(stack.getStack());
```

---

## 6. Graph Lab (`graph`)

**Purpose:**
Implements a simple graph structure with nodes and edges.

**Main Class:**

- `Graph`: Allows adding nodes and edges, with error checking for missing nodes.

**Usage:**

```java
Graph graph = new Graph();
graph.addNode("A");
graph.addNode("B");
graph.addEdge("A", "B");
```

---

## 7. Heap Lab (`heap`)

**Purpose:**
Implements a binary heap, max heap, and a priority queue using a heap.

**Main Classes:**

- `Heap`: Array-based max heap with insert, remove, and max operations.
- `MaxHeap`: Static methods for heapifying arrays and finding the kth largest element.
- `PriorityQueueWithHeap`: Priority queue backed by a heap.

**Usage:**

```java
Heap heap = new Heap();
heap.insert(10);
heap.insert(20);
int max = heap.max();

int[] arr = {3, 1, 4, 1, 5};
MaxHeap.heapify(arr);
int kth = MaxHeap.getKthLargest(arr, 2);

PriorityQueueWithHeap pq = new PriorityQueueWithHeap();
pq.add(5);
int item = pq.remove();
```

---

## 8. Trie Lab (`trie`)

**Purpose:**
Implements a trie (prefix tree) for efficient string storage and retrieval.

**Main Class:**

- `Trie`: Supports insert, contains, remove, traverse, and prefix search operations.

**Usage:**

```java
Trie trie = new Trie();
trie.insert("cat");
trie.insert("car");
System.out.println(trie.contains("cat")); // true
trie.remove("cat");
```

---

## How to Run

Each lab can be run by executing the corresponding `Main` class or calling the static methods as shown above. For more details, see the source code in each directory.
