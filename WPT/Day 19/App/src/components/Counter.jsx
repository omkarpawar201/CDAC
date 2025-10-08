import React, { useState } from 'react'
import Counter1 from './Counter1'
import ErrorBoundary from './ErrorBoundry'
import Counter2 from './Counter2'

function Counter() {
    const [count1, setCounter1] = useState(0);
    const [count2, setCounter2] = useState(0);

    const increament1 = () => {
        setCounter1(count1 + 1);
    }

    const increament2 = () => {
        setCounter2(count2 + 1);
    }

    return (
        <>
            <div id='d2'>
                <div>

                    {/* <ErrorBoundry> */}
                    <Counter1
                        value={count1}
                        onClick={increament1}>
                    </Counter1>
                    {/* </ErrorBoundry> */}

                    <Counter2 value={count2}
                        onClick={increament2}>
                    </Counter2>
                </div>
            </div>
        </>
    )
}

export default Counter
