

let num = process.argv[2]
let mul = 1;


num = Number(num)

for (let i = 1; i <= num; i++) {

    mul = mul * i;

}
mul = String(mul)
process.stdout.write(mul);
// console.log(mul);

