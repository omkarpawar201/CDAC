import React from 'react'
import './Demo.css'

function Demo(props) {

    let n = props.num
    let mul = 1

    for (let i = 1; i <= n; i++) {
        mul *= i;
    }

    return (
        <div id='d2'>
            <div>

                <h1>Factorial of {n} is {mul}</h1>
            </div>
        </div>
    )
}

export default Demo
