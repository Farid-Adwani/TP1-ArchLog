# Open Closed Principle (OCP) Exercise

## Before
The `ResourceAllocator` class has a method `allocate()` which allocates either a time slot or a space slot. The `ResourceAllocator` class violates the Open Closed Principle because it must be modified to add any new types of resources.

## After
The `ResourceAllocator` class now takes an instance of `Resource` as a parameter instead of `ResourceType` `enum`. A `Resource` interface has been created, which defines methods for finding a free resource and marking it busy or free. The `SpaceResource` and `TimeResource` classes implement the `Resource` interface and provide their own implementation for finding a free resource and marking it busy or free. Now, any new type of resource can be added by implementing the `Resource` interface.

## Explanation
By passing an instance of `Resource` instead of `ResourceType`, we've eliminated the need to modify the `ResourceAllocator` class whenever a new type of resource is added. The `Resource` interface provides a contract for finding a free resource and marking it busy or free. The `SpaceResource` and `TimeResource` classes implement this contract and provide their own implementation for finding a free resource and marking it busy or free. Now, any new type of resource can be added by implementing the `Resource` interface without modifying the existing classes. This way, we have made the `ResourceAllocator` class open for extension and closed for modification.


## Diagram

![UML DIAGRAM](./ocp/exercise_refactored/exercise_refactored.png)
