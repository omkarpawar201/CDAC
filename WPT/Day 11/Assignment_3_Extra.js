let num = process.argv[2]


function display(a) {

    for (let i = a; i > 0; i--) {
        for (let j = 0; j < i; j++) {
            process.stdout.write("*")
        }
        process.stdout.write("\n")
        // console.log()

    }
}

if (num > 0) {

    display(num)

} else {
    console.log('The numbers must be positive.');
}
