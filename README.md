Coffee House

1. Technology – Java, Spring Boot, Junit, Mockito
2. Import to STS or Eclipse- import as existing maven Project
3. Use maven command for clean and build.
4. Run as Spring Boot App
5. Use Postman for accessing endpoints
6. Different end points with Data are below.
Post data in json format, i.e In postman body data should be in  json.

http://localhost:8900/CoffeeHouse/addCustomerDetails
{
"custName":"sawan",
"phoneNumber":"8971957135"
}


http://localhost:8900/CoffeeHouse/getAllCustomerDetails


http://localhost:8900/CoffeeHouse/addNewCoffeeVarity
{
"coffeeName":"Cappuccino",
"coffeeDescription":"StrongCoffee",
"servingsPerDay":150
}




http://localhost:8900/CoffeeHouse/processAnOrder
{
"custName":"sawan",
"phoneNumber":"8971957135",
"coffee":[{"coffeeName":"Latte",
"quantity":2},
{"coffeeName":"Cappuccino",
"quantity":3}]
}


http://localhost:8900/CoffeeHouse/generateReport



