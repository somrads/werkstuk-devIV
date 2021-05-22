console.log("loaded");

//decorater patteren, add diffrent toppings on cake = new cake

const cake = "cake";
const toppings = ["chocolate", "whip cream", "strawberry"]

toppings.forEach((toppings)=> {
    htmlString = "";
    console.log(toppings, cake);
    
    htmlString = `<li>${toppings} ${cake}</li> `
    document.getElementById("cakes").innerHTML += htmlString
});


//template patteren = stappen plan


/*
htmlString = "";
    console.log(toppings, cake)
 
    htmlString = `<li> ${toppings} ${cake} </li>`
    console.log(toppings, cake)
   */ 

  
  
  
  


