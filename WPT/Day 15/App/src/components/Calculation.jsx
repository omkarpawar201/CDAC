import React from 'react'
import './Calculation.css'

function Calculation(props) {

    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);

    // let sum = n1+n2

    return (
        <>
            <div id='i2'>
                <div>
                    <p id="p5">Addtion = {n1 + n2}</p>
                    <p id="p2">Substraction = {n1 - n2}</p>
                    <p id="p3">Multiplaction = {n1 * n2}</p>
                    <p id="p4">Division = {n1 / n2}</p>
                </div>
            </div>
        </>
    )
}

export default Calculation
