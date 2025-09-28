import React, { useState } from 'react'
import './Factorial.css'

function Factorial(props) {
    let [num, setNum] = useState(0)
    let [mul, setMul] = useState(1)
    // let n = props.num
    // let mul = 1


    function handleFact(event) {
        // console.log(event)
        // console.log(event.target.value)
        setNum(parseInt(event.target.value))
        setMul(1)
        for (let i = 1; i <= parseInt(event.target.value); i++) {
            setMul(mul *= i)
        }
    }

    return (
        <div id='d2'>
            <div id='fact_cont'>
                <input type="text" name="num" id="num" onChange={handleFact} placeholder='Enter The Number'/>
                <p id='fact_text'>Factorial of {num} is {mul}</p>
            </div>
        </div>
    )
}

export default Factorial
