![alt text](image.png)




Here, we can see that we have changed one value of the numbers array 'after the assignment of the Numbers array to the positiveNumbers';we changed the value after the assignment and it shouldn't affect the positiveNumbers array but;When we print the positiveNumbers array, we can see that the same value is also changed.

It's because both arrays refer to the same array object. This is because of the shallow copy.
