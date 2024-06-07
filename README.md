# sorting

#SOME IMPORTANT THEORY

//Algorithms - a finite sequence of well-defined operations, which given input will produce in finite time a required output 

//Data Structures - structured memory space and the set of operations and actions for accessing and manipulating such memory space

//Sorting - order a given set according to order relation

                                                            //Selection sort 
set through direct selection

//Idea 
-Look for the smallest or largest element 
-Replace it with the first elememt 
-Move to the second element 
-Repeat with the rest array 

//Complexity 
(N-1)+(N-2)+(N-3)...3+2+1=N(N-1)/2  that's formula from math. series 
So, at infinity O(N^2)

                                                            //Insertion sort
Sort through insert

//Idea
-Chose a still unsorted element  (first time : first element)
-Put it in the right place among already sorted elements 
-Chose the second undsorted element until whole array is sorted 

//Comlexity 
O(N^2), but if data alsmost sorted then O(N) 

                                                            //Bubble sort 
Sort through swapping

//Idea 
-Move through array from left to right 
-Swap elements if they are in wrong order 
-Repeat until there is nothing left to swap 

//Complexity
O(N^2), but when data almost sorted: O(N)

                                                            //Shell sort (improved insertion sort)
Breaking the original list into sublist and sorting these sublists using insertion sort

//Idea(explanation from GPT-4)
-Choose the gap sequence, for example using a the sequence S={1,4,13,...} where s(i+1) = 3s(i) + 1;
-Start with a large gap from the sequence and devide the list into multiple sublists, each consisting of elements that are a gap distance apart 
-Sort sublists using insertion sort
-Reduce gap, move to the next smaller gap and repeat the sorting process 
-The last pass uses a gap of 1, ensuring the entire list is sorted 

//Complexity
Worst case O(N^3/2)
Average case O(N^5/4) or O(NlogN^2)

                                                            //Quicksort
Devide and conquer algorithm 

//Idea
-Choose one element w arbitrarily, the pivot
-Subdivide array in two parts:
  Set A1 of elements <= w;
  Set A2 of elements > w;
-If A1 and A2 are sorted, END;
-Else sort A1 and A2 recursively

//Process

Suppose our array to sort is [a(1),.....,a(N)]
Chose element a(r) = w as a pivot
    -Swap a(r) = w and a(N) (move pivot to end);
    -Take 2 indexes i = 1, h = N;
    -Increase i until you find an element a(i) > w;
    -Decrease h until you find an element a(h) <= w;
    -Swap a(i) and a(h);
    -Repeat until i >= h;
    -Now swap a(i) and w: this brings w at the right place in the field;
Now do the same for arrays a(1),...,a(i)=w and a(i+1),...,a(N)

//Complexity
Average case need O(NlogN);

                                                            //Heap Sort
A heap is a binary treee, such that each father node is greater or equal to its children nodes 
It implies the root of the heap is the biggest node

//Building a heap 

Initialise a tree with one element 
 -Start with an empty heap and insert the first element. This element is the root of the heap 
Insert node at Free Leaf 
  -Add the new element at the next availible position in the heap 
Compare with parent and swap if necessary
Push upwards until heap condition is satisfied
  -Continue the process of comparing the node with its parent and swapping if necessary, pushing the node upwards in the tree until the heap property is restored 
Repeat for all new elements 

//Sort from a heap

-Swap the root of the heap with the last element 
-Reduce the size of the heap by one 
-Restore heap property
-Pick again from root until tree is empty 

//Stack 

-A linear data structure that follows the principle LIFO (last in first out), that means that the last element added to the stack is the first one to be removed.

-Pile of plates where you can only add or remove the top plate

-Colllection items to work with them later on, undo mechanism in text editiors or function call management 

-Depth-first search (like solving puzzles)

-Key Points
-Maintaining Depth: The LIFO nature of the stack ensures that nodes are processed in a way that goes as deep as possible before backtracking.
-Deep Exploration: By pushing all unvisited neighbors, the stack helps in exploring one path deeply before moving to another path.
-Backtracking: The stack automatically manages backtracking. When a path is fully explored, it pops back to the previous node to explore new paths.


//Queses 

-A linear data structure that follows principle FIFO (first in first out), the first element added to the queue is the first one to be removed 

-A line of people waiting for a service, where the first person in line is served first 

-Collection items to work with them later on
-Ques are useful when you need to process items in exact order they were added. For instance managing tasks in the printer queu or handling request on a web server 

-Breadth-first search (shortest path in unweighted graph)

-Key Points
-Maintaining Order: The FIFO nature of the queue ensures that nodes are processed in the order they are discovered, which is essential for BFS.
-Complete Exploration: By enqueuing all unvisited neighbors, the queue helps in ensuring that all nodes at a given depth are processed before moving to the next depth.
-Correct Sequence: The queue automatically manages the sequence of nodes to be processed, preventing the need for manual tracking of nodes at each level.


                                                            

                                                              









