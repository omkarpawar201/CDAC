function add(...a) {

    let sum = 0

    console.log("Odd elements = ")
    a.forEach(element => {
        sum += element
        if (element % 2 != 0) {

            console.log(element)
        }
    });
    console.log("Addition of elements = " + sum)
}

add(1, 2, 3, 4, 5)
add(1, 2, 3)
add(1, 2, 3, 4, 5, 6, 7)