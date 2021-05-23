//decorater pattern, add different toppings on cake = new cake

const toppings = ["chocolate", "whip cream", "strawberry", "carrot", "oreo"]

function cakeMaker(topping, cake) {
    return `${topping} ${cake}`;
}

function cakeMaker2(cake) {
    return function (topping) {
        return `${topping} ${cake}`;
    }
}

const newCake = toppings.map(cakeMaker2("cake"));
document.getElementById("cakes").innerHTML += `<p>${newCake}</p>`;
console.log(newCake);


// quicksort algorithm, sorts on the last index of the array
function quickSort(array) {

    try {

        if (array.length <= 1) {
            return array;
        }

        const pivot = array[array.length - 1]
        const leftArr = [];
        const rightArr = [];

        for (const element of array.slice(0, array.length - 1)) {
            element < pivot ? leftArr.push(element) : rightArr.push(element);
        }

        return [...quickSort(leftArr), pivot, ...quickSort(rightArr)]

    } catch (error) {
        console.log("Error with quicksort function");
    }

}

console.log(quickSort(toppings));