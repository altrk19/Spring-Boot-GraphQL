http://localhost:8080/graphiql

CREATE Vehicle-1
mutation{
  createVehicle(vehicle:{type:"SW",modelCode:"2019",brandName:"Audi"}) {
    id,
    launchDate,
    brandName
  }
}

CREATE Vehicle-2
mutation{
  createVehicle(vehicle:{type:"Sedan",modelCode:"2019",brandName:"Mercedes"}) {
    id,
    launchDate,
    brandName
  }
}

CREATE Vehicle-3
mutation{
  createVehicle(vehicle:{type:"SW",modelCode:"2019",brandName:"Mercedes"}) {
    id,
    launchDate,
    brandName
  }
}



GET Vehicle By Id
{
  getById(id: 2) {
    id
    type
    modelCode
    brandName
    launchDate
  }
}

GET Vehicle By Id
{
  getById(id: 2) {
    id
    type
    modelCode
  }
}

GET Vehicles By Type
{
  getVehicles(type: "SW") {
    id
    modelCode
    launchDate
  }
}

GET Vehicles By Type
{
  getVehicles(type: "%n") {
    id
    type
    modelCode
    launchDate
    brandName
  }
}
