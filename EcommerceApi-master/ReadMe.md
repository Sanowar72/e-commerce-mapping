### User

#### Properties

- `id` (Long): The unique identifier of the user.
- `name` (String): The name of the user.
- `email` (String): The email address of the user.
- `password` (String): The password of the user.
- `phoneNumber` (String): The phone number of the user.

#### Constructors

- `User()`: Creates a new instance of the `User` model with default values.
- `User(Long id, String name, String email, String password, String phoneNumber)`: Creates a new instance of the `User` model with the specified values.

#### Annotations

- `@Entity`: Specifies that the `User` class is an entity that can be persisted in the database.
- `@Data`: Automatically generates getter and setter methods for all properties.
- `@AllArgsConstructor`: Generates a constructor with parameters for all properties.
- `@NoArgsConstructor`: Generates a constructor without parameters.

#### Database Mapping

- `@Id`: Specifies the primary key of the user entity.
- `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Configures the primary key to be automatically generated by the database.

### Address

#### Properties

- `id` (Long): The unique identifier of the address.
- `name` (String): The name associated with the address.
- `landMark` (String): The landmark associated with the address.
- `phoneNumber` (String): The phone number associated with the address.
- `zipCode` (String): The ZIP code of the address.
- `state` (String): The state where the address is located.

#### Relationships

- `user` (User): The user associated with the address.

#### Constructors

- `Address()`: Creates a new instance of the `Address` model with default values.
- `Address(Long id, String name, String landMark, String phoneNumber, String zipCode, String state)`: Creates a new instance of the `Address` model with the specified values.

#### Annotations

- `@Entity`: Specifies that the `Address` class is an entity that can be persisted in the database.
- `@Data`: Automatically generates getter and setter methods for all properties.
- `@AllArgsConstructor`: Generates a constructor with parameters for all properties.
- `@NoArgsConstructor`: Generates a constructor without parameters.

#### Database Mapping

- `@Id`: Specifies the primary key of the address entity.
- `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Configures the primary key to be automatically generated by the database.
- `@OneToOne`: Specifies a one-to-one relationship with the `User` entity.
- `@JoinColumn(name = "fk_user-id")`: Specifies the foreign key column name for the relationship.

### Order

#### Properties

- `id` (Long): The unique identifier of the order.
- `user` (User): The user associated with the order.
- `productList` (List<Product>): The list of products included in the order.
- `address` (Address): The address associated with the order.
- `productQuantity` (Integer): The quantity of products in the order.

#### Constructors

- `Order()`: Creates a new instance of the `Order` model with default values.
- `Order(Long id, User user, List<Product> productList, Address address, Integer productQuantity)`: Creates a new instance of the `Order` model with the specified values.

#### Annotations

- `@Entity`: Specifies that the `Order` class is an entity that can be persisted in the database.
- `@Data`: Automatically generates getter and setter methods for all properties.
- `@AllArgsConstructor`: Generates a constructor with parameters for all properties.
- `@NoArgsConstructor`: Generates a constructor without parameters.
- `@Table(name = "orders")`: Specifies the name of the database table for storing orders.

#### Database Mapping

- `@Id`: Specifies the primary key of the order entity.
- `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Configures the primary key to be automatically generated by the database.
- `@OneToOne`: Specifies a one-to-one relationship with the `User` and `Address` entities.
- `@JoinColumn(name = "fk_user_id")`: Specifies the foreign key column name for the relationship with the user.
- `@OneToMany`: Specifies a one-to-many relationship with the `Product` entity.
- `@JoinColumn(name = "fk_order_id")`: Specifies the foreign key column name for the relationship with the products.
- `@JoinColumn(name = "fk_address_id")`: Specifies the foreign key column name for the relationship with the address.

### Product

#### Properties

- `id` (Long): The unique identifier of the product.
- `name` (String): The name of the product.
- `price` (Double): The price of the product.
- `description` (String): The description of the product.
- `category` (Category): The category of the product.
- `brand` (String): The brand of the product.

#### Constructors

- `Product()`: Creates a new instance of the `Product` model with default values.
- `Product(Long id, String name, Double price, String description, Category category, String brand)`: Creates a new instance of the `Product` model with the specified values.

#### Annotations

- `@Entity`: Specifies that the `Product` class is an entity that can be persisted in the database.
- `@Data`: Automatically generates getter and setter methods for all properties.
- `@AllArgsConstructor`: Generates a constructor with parameters for all properties.
- `@NoArgsConstructor`: Generates a constructor without parameters.

#### Database Mapping

- `@Id`: Specifies the primary key of the product entity.
- `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Configures the primary key to be automatically generated by the database.
- `@Enumerated(value = EnumType.STRING)`: Specifies that the `Category` property should be persisted as a string in the database.

### User

#### Properties

- `id` (Long): The unique identifier of the user.
- `name` (String): The name of the user.
- `email` (String): The email address of the user.
- `password` (String): The password of the user.
- `phoneNumber` (String): The phone number of the user.

#### Constructors

- `User()`: Creates a new instance of the `User` model with default values.
- `User(Long id, String name, String email, String password, String phoneNumber)`: Creates a new instance of the `User` model with the specified values.

#### Annotations

- `@Entity`: Specifies that the `User` class is an entity that can be persisted in the database.
- `@Data`: Automatically generates getter and setter methods for all properties.
- `@AllArgsConstructor`: Generates a constructor with parameters for all properties.
- `@NoArgsConstructor`: Generates a constructor without parameters.

#### Database Mapping

- `@Id`: Specifies the primary key of the user entity.
- `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Configures the primary key to be automatically generated by the database.

#### MySQL Database

- **Table Name**: users
- **Column Names**: id, name, email, password, phoneNumber

```sql
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(20) NOT NULL
);
```
