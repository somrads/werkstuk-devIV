console.log("loaded");

//decorater patteren, add diffrent toppings on cake = new cake

const cake = ["cake"];
const toppings = ["chocolate", "whip cream", "strawberry"]

function cakesWeGot(topping){
    toppings.forEach((topping)=>{
        htmlString = "";
    console.log(topping);
    
    htmlString = `<li>${topping} ${cake}</li> `
    document.getElementById("cakes").innerHTML += htmlString
    })

}
cakesWeGot();
/*
toppings.forEach((toppings)=> {
    htmlString = "";
    console.log(toppings, cake);
    
    htmlString = `<li>${toppings} ${cake}</li> `
    document.getElementById("cakes").innerHTML += htmlString
});
*/

//template patteren = stappen plan to make cupCakes or plainclake


/*
htmlString = "";
    console.log(toppings, cake)
 
    htmlString = `<li> ${toppings} ${cake} </li>`
    console.log(toppings, cake)
   */ 

  
  
  
  


