console.log("loaded");

//decorater pattern, add different toppings on cake = new cake

const toppings = ["chocolate", "whip cream", "strawberry"]

function cakeMaker(cake, topping){
    return `${cake} ${topping}`;
}

function cakeMaker2(topping){
    return function (cake){
        return `${cake} ${topping}`;
    }
}

const newCake2 = toppings.map(cakeMaker2("cake"))
console.log(newCake2);

  
  
  






























   

  
  
  
  


