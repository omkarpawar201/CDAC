import React, { useState } from 'react'

const set = new Set();

function Callback1() {

    const [cnt, setCnt] = useState(0);
    const [num, setNum] = useState(0);

    const incCnt = () => setCnt(cnt + 1);
    const decCnt = () => setCnt(cnt - 1);
    const incNum = () => setNum(num + 1);

    set.add(incCnt);
    set.add(decCnt);
    set.add(incNum);

    return (

        <div>
            <h2>Without useCallback</h2>
            <button onClick={incCnt}>Increase Counter</button>
            <button onClick={decCnt}>Decrease Counter</button>
            <button onClick={incNum}>Increase Number</button>

            <h1>Count : {cnt}</h1>
            <h1>Number : {num}</h1>
            <h2>Set Size  : {set.size}</h2>
        </div>
    )
}

export default Callback1
