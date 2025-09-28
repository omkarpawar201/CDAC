import React from 'react'
import './Mul_Comp.css'

export default function Mul_Comp() {
    return (
        <div id='d4'>
            <h2>This is from main function</h2>
            {/* {fun1()} */}
        </div>
    )
}

export function Fun1(){
    return (
        <h2>This is from fun1</h2>
    )
}
