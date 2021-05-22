console.log("loaded");

//decorater pattern, add different toppings on cake = new cake

const toppings = ["chocolate", "whip cream", "strawberry", "carrot", "oreo"]

function cakeMaker(topping, cake){
    return `${topping} ${cake}`;
}

function cakeMaker2(cake){
    return function (topping){
        return `${topping} ${cake}`;
    }
}

const cakeWithTopping = toppings.map(cakeMaker2("cake"))
console.log(cakeWithTopping);

  
  
  

function quickSort(array){

}




























   

  
  
  
  


