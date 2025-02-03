## Homework


### Problem:

Write your own MyVector class (in any language)

#### Requirements:
- The vector created should be able to store any type of data
- The vector should be able to grow dynamically (similar to arraylist)
- The vector should be able to shrink dynamically (similar to arraylist)
- It should not use internal libraries that provide the same functionality like arraylist and internal vectors
- Add more utility functions like isEmpty, isFull, etc.
- Now users should not be able to directly access the data of this MyVector class, intead the strategy if accessing the data should be exposed by us.
  - One strategy can be to access data in forward sequential fashion
  - Another strategy can be to access data in reverse sequential fashion
  - Another strategy can be to access data in random fashion
  - Another strategy can be to access data in sequential fashion but with a jump of K elements
  - Another strategy can be to access data in bidirectional fashion