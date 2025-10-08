import React, { useState } from 'react'
const fruitlist = ['apple', 'banana', 'cherry'];

function List() {

    let [list, update] = useState([])

    // function handle(event) {
    //     console.log(event.target)
    //     console.log(event.target.value)
    //     update(list,event.target.value)
    //     console.log(list)
    // }

    update(['apple', 'banana', 'cherry'])

    return (
        // <div>
        //     <input type="text" onBlur={handle} />
        <ol>
            <ul>
                {list.map((item, index) =>
                    <li key={index}>{item}</li>
                )}
            </ul>
        </ol>
        // </div>


    )


}



export default List
