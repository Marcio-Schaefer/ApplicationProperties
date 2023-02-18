# Application Properties

3 ways to read application properties file.

### Approaches Used

- **DatabaseConfig1.java**

In the first approach, the Environment interface was used.

Negative points:

> - The class has "access" to variables that are not of interest to it.

> - Difficult maintenance if there is change of variables in application properties file.


- **DatabaseConfig2.java**

In the second approach, the @value annotation was used.

Negative points:

> - Difficult maintenance if there is change of variables in application properties file.


- **DatabaseConfig3.java**

In the third approach a class was created that concentrates all the variables. 

It's similar to the approach of using the Environment interface, however, in this approach the class only has "view" of the properties that are relevant to it.

By concentrating all variables in one class, maintenance is facilitated, as the change takes place in just one point in the code.


### Author

- [@Marcio-Schaefer](https://github.com/Marcio-Schaefer)


### Reference

 - [Article on Baeldung](https://www.baeldung.com/spring-boot-properties-env-variables)