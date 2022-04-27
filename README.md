# Cinema service

## Project description:
This is an example realization of a simple ticket selling service for the cinema (REST API), for selling tickets, adding new movies, and allowing users to login using Spring Security auth.


# Functions:
- `login/register` user
- `/cinema-halls` create/getAll
- `/movies` create/getAll
- `/movie-sessions` create/update/delete/getAllAvailable
- `/orders` completeOrder/getOrderHistory
- `/shopping-carts` addToCart/getByUser
- `/users` getByEmail

# Technologies:
- Java 11
- Maven 4.0.0
- MavenCheckstyle 3.1.1
- Tomcat 9.0.58
- MySQL 8.0.22
- Servlet 4.0.1
- Hibernate
- Spring

# How to start?
1. Configure Apache Tomcat for your IDE
2. Install MySQL and MySQL Workbench
3. Configure `db.properties` set: `db.user` `db.password` `hibernate.dialect`
4. Configure the tomcat library path in the startup settings
Enjoy!

# Authors:
@LinkClink [telegram](https://t.me/linkclink)
