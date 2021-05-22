console.log("loaded");

//decorater pattern, add different toppings on cake = new cake

const toppings = ["chocolate", "whip cream", "strawberry"]

function cakeMaker(topping, cake){
    return `${topping} ${cake}`;
}

function cakeMaker2(cake){
    return function (topping){
        return `${topping} ${cake}`;
    }
}

<<<<<<< HEAD
const newCake2 = toppings.map(cakeMaker2("cake"));
document.getElementById("cakes").innerHTML += `<p>${newCake2}</p>`;
console.log(newCake2);
=======
const cakeWithTopping = toppings.map(cakeMaker2("cake"))
console.log(cakeWithTopping);
>>>>>>> ab0816eaed75a6d01329c7eee8d0415f9262efb3



  
  
  






























   

  
  
  
  


