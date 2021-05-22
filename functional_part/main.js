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
    if(array.length == 1){
        return array;
    }

    const pivot = array[array.length - 1]
    const leftArr = [];
    const rightArr = [];
    for(let i = 0; i< array.length - 1; i++){
        if(array[i] < pivot) {
            leftArr.push(array[i]);
        } else {
            rightArr.push(array[i]);
        }
    }

    return array;
}




























   

  
  
  
  


