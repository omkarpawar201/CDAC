const readline = require('readline');

function multiply(a, b) {
    return new Promise((resolve, reject) => {
        if (a > 0 && b > 0) {
            resolve(console.log('Result:', a * b));
        } else {
            reject('Both numbers must be positive.');
        }
    });
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter first number: ', (n1) => {
    rl.question('Enter second number: ', (n2) => {

        const num1 = Number(n1);
        const num2 = Number(n2);

        multiply(num1, num2)
            .catch(error => {
                console.log(error);
            })

        rl.close();
    });
});