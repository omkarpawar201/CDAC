const readline = require('readline');

let array = [1, 2, 3, 4, 5]
let value = '1';
console.log(array)

let num = 5;
console.log("1. length \n2. pop\n3. unshift\n4. delete\n5. push\n6. shift\n7. sort")

// console.log("Enter your choice " + );
// let userInput = prompt("Please enter something:");
// console.log("User entered:", userInput);

switch (value) {
    case '1':

        console.log("Length of array: " + array.length)
        break;

    case '2':

        console.log("Popped element: " + array.pop())

    case '3':

        console.log()
        array.unshift(num)
        console.log("New unshifted array: " + array)

    case '4':

        console.log()
        array.delete(num)
        console.log("New deleted array: " + array)

    case '5':

        console.log()
        array.push(num)
        console.log("New pushed array: " + array)

    case '6':

        array.shift()
        console.log("New shifted array: " + array)

    case '7':

        console.log("New sorted array: " + array.sort())

    default:
        break;
}