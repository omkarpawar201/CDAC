import React from 'react'
import './Calculator.css'

function Calculator(props) {
    let n1 = props.num1;
    let n2 = props.num2;
    let op = props.oper;

    return (
        <div id='d3'>
            <div>
                <p id='p6'>Calculation = {eval(n1 + op + n2)}</p>
            </div>
        </div>
    )
}

export default Calculator
