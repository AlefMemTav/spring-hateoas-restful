<h1 align="center">
📄 README
</h1>

## Spring Hateoas restful example

### What is it?
Is a simple restful service that performs a CRUD of employee and a CRUD of customer.

#### Project status
Finished

### Technology and versions
- [x] Java 11;
- [x] Spring Boot 2.7.9;
- [x] Hateoas;
- [x] JPA;
- [x] Maven;
- [x] H2 database;

### Example of expected output:

#### 1) GET employess: `/employees`

```json
{
    "_embedded": {
        "employeeList": [
            {
                "id": 1,
                "firstName": "Bilbo",
                "lastName": "Baggins",
                "role": "burglar",
                "name": "Bilbo Baggins",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/employees/1"
                    },
                    "employees": {
                        "href": "http://localhost:8080/employees"
                    }
                }
            },
            {
                "id": 2,
                "firstName": "Frodo",
                "lastName": "Baggins",
                "role": "thief",
                "name": "Frodo Baggins",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/employees/2"
                    },
                    "employees": {
                        "href": "http://localhost:8080/employees"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```
#### 2) GET orders: `/orders`

```json
{
    "_embedded": {
        "customerOrderList": [
            {
                "id": 3,
                "description": "One Ring",
                "status": "COMPLETED",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/orders/3"
                    },
                    "orders": {
                        "href": "http://localhost:8080/orders"
                    }
                }
            },
            {
                "id": 4,
                "description": "Two Ring",
                "status": "IN_PROGRESS",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/orders/4"
                    },
                    "orders": {
                        "href": "http://localhost:8080/orders"
                    },
                    "cancel": {
                        "href": "http://localhost:8080/orders/4/cancel"
                    },
                    "complete": {
                        "href": "http://localhost:8080/orders/4/complete"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders"
        }
    }
}
```
#### 3) DEL order: `/orders/4/cancel`

```json
{
    "id": 4,
    "description": "Two Ring",
    "status": "CANCELLED",
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders/4"
        },
        "orders": {
            "href": "http://localhost:8080/orders"
        }
    }
}
```
### How to run
In your IDE run the PayrollAplication class, or in your terminal run: `$ ./mvnw clean spring-boot:run`, or: `$ mvn clean spring-boot:run`.
### Sources
Credits of the content of this repository to a tutorial guide of Spring's website: [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
