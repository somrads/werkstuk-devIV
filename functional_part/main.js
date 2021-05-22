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

    if(leftArr.length > 0 && rightArr.length > 0) {
        return[...quickSort(leftArr), pivot, ...quickSort(rightArr)]
    } else if ( leftArr > 0) {
        return[...quickSort(leftArr), pivot];
    } else {
        return[pivot, ...quickSort(rightArr)]
    }
}

console.log(quickSort(toppings));

const cakeWithTopping = toppings.map(quickSort(cakeMaker2("cake")));
console.log(cakeWithTopping);





























   

  
  
  
  


