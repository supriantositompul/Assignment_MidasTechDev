# Assignment_MidasTechDev

## Register User
Endpoint : POST /auth/register

Request Body :
```json
{
    "name" : "suprianto772",
    "email" :"suprinto2017@gmail.com",
    "password" : "12345678",
    "address" : "Jakarta",
    "role" : "admin"
}
```

Response Body (Success) :
``` json
{
    "statusCode": 200,
    "message": "User Saved Successfully",
    "ourUsers": {
        "id": 5,
        "email": "suprinto2017@gmail.com",
        "name": "suprianto772",
        "password": "$2a$10$YWR.ZDR71wEsDDDe3w.gpeRs7YamZrWXSp6807OqmqA8eY1EzjEFG",
        "address": "Jakarta",
        "role": "admin",
        "enabled": true,
        "authorities": [
            {
                "authority": "admin"
            }
        ],
        "username": "suprinto2017@gmail.com",
        "accountNonExpired": true,
        "credentialsNonExpired": true,
        "accountNonLocked": true
    }
}
```

Response Body (Failed) :
``` json
{
    "statusCode": 500,
    "error": "rawPassword cannot be null"
}
```


## Login User

Endpoint : POST /auth/login

Request Body :

``` json
{
    "email" :"suprinto2017@gmail.com",
    "password" : "12345678"
}
```
Response Body (Success) :

```json
{
    "statusCode": 200,
    "message": "Successfully Logged In",
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdXByaWFudG83NzIiLCJpYXQiOjE3MjUyODU2NjUsImV4cCI6MTcyNTM3MjA2NX0.ZXo8ycpwOo18jPtlL85InE327_WlM5Kkr5IipOua-oc",
    "refreshToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdXByaWFudG83NzIiLCJpYXQiOjE3MjUyODU2NjUsImV4cCI6MTcyNTM3MjA2NX0.ZXo8ycpwOo18jPtlL85InE327_WlM5Kkr5IipOua-oc",
    "expirationTime": "24Hrs",
    "role": "admin"
}
```
Response Body (Failed) :
``` json
{
    "statusCode": 500,
    "message": "Bad credentials"
}
```

## Get User
Endpoint : GET /admin/get-all-users

Request Header :

X-API-TOKEN : Token (Mandatory)
Response Body (Success) :

```json
{
    "statusCode": 200,
    "message": "User Saved Successfully",
    "ourUsersList": {
        "id": 6,
        "email": "suprinto@gmail.com",
        "name": "suprianto772",
        "password": "$2a$10$kPyCWerOd6muYlnbuiShTujp26pGeiU09ekpkoov1FINKw0XrNB.G",
        "address": "Jakarta",
        "role": "admin",
        "enabled": true,
        "authorities": [
            {
                "authority": "admin"
            }
        ],
        "username": "suprianto772",
        "accountNonExpired": true,
        "credentialsNonExpired": true,
        "accountNonLocked": true
    }
}
```


## Update User

Endpoint : PUT /admin/update/{userId}

Request Header :

X-API-TOKEN : Token (Mandatory)
Request Body :
```json
{
    "name" : "suprianto772",
    "email" :"suprinto2017@gmail.com",
    "password" : "12345678",
    "address" : "Bandung",
    "role" : "admin"
}
```

Response Body (Success) :
``` json
{
    "statusCode": 200,
    "message": "User with id '5' found successfully",
    "ourUsers": {
        "id": 5,
        "email": "suprinto2017@gmail.com",
        "name": "suprianto772",
        "password": "$2a$10$YWR.ZDR71wEsDDDe3w.gpeRs7YamZrWXSp6807OqmqA8eY1EzjEFG",
        "address": "Bandung",
        "role": "admin",
        "enabled": true,
        "authorities": [
            {
                "authority": "admin"
            }
        ],
        "username": "suprinto2017@gmail.com",
        "accountNonExpired": true,
        "credentialsNonExpired": true,
        "accountNonLocked": true
    }
}
```

## Delete User
Endpoint : PUT /admin/delete/{userId}

Request Header :

X-API-TOKEN : Token (Mandatory)
Response Body :
``` json
{
    "statusCode": 200,
    "message": "User deleted successfully",
}
```

## Logout

Endpoint : DELETE /api/auth/logout

Request Header :

X-API-TOKEN : Token (Mandatory)
Response Body (Success) :
```json
{
    "statusCode": 200,
    "message": "Logged out successfully",
}
```


