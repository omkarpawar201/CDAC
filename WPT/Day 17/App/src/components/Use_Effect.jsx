import React, { useEffect, useState } from 'react'

function Use_Effect() {

    let [count, update] = useState(0)
    let [table, updateTable] = useState(1)

    function handleCount(event) {
        // console.log(event)
        // console.log(event.target)
        // console.log(event.target.value)
        // count += 1;
        update(count += 1)
        // console.log(count)
    }

    useEffect(() => {
        console.log("useEffect")
        let arr = [];
        // console.log(count)
        for (let i = 1; i <= 10; i++) {

            console.log(table)
            arr.push(count * i)
        }
        updateTable(arr)
    }, [count])

    return (
        <div>
            <p>Count = {count}</p><br />

            {
                count > 0 &&
                <table>
                    <th>Table of {count}</th>
                    <tr>
                        <td>{table + "\n"}</td>
                    </tr>
                </table>

            }
            <br /><button onClick={handleCount} >Click Me</button>
        </div>
    )
}

export default Use_Effect
