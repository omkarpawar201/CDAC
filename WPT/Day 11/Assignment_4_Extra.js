let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let esum = 0;
let psum = 0;
let isum = 0;

for (let i = 0; i < arr.length; i++) {

    if (arr[i] % 2 == 0) {
        esum += arr[i]
    }
    if (i % 2 == 0) {
        isum += arr[i]
    }

}

for (let j = 0; j < arr.length; j++) {
    let count = 0;

    if (arr[j] < 2) {
        continue;
    }

    for (let i = 2; i < arr[j]; i++) {
        if (arr[j] % i === 0) {
            count++;
            break;
        }
    }

    if (count === 0) {
        psum += arr[j];
    }
}

console.log("Addition of even numbers: " + esum)
console.log("Addition of even index numbers: " + isum)
console.log("Addition of prime numbers: " + psum)