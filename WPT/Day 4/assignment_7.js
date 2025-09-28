let array = [7, 5, 9, 3, 2, 8]

let max = array[0]

for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i]
    }
}
console.log("Max element by for loop is " + max)

max = array[0]

array.forEach(element => {
    if (element > max) {
        max = element
    }
})
console.log("Max element by for each is " + max)

array.sort()
console.log(array)
console.log("Max element by sort is " + array[array.length - 1])