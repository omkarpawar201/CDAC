import React, { useState } from 'react'
import './Text_input.css'

function Text_input() {

    let [data, update] = useState("-")

    function eventHandler(event) {


        // console.logl
        console.log(event.target.value)
        if (event.target.name == 'line') {
            update(data = event.target.value)
            console.log(data)
        }
        if (event.target.value == 'uppercase') {
            update(data = data.toUpperCase())
        }
        if (event.target.value == 'lowercase') {
            update(data = data.toLowerCase())

        }
        function titlecase(str) {
            str = str.toLowerCase().split(' ');
            console.log(str)
            for (var i = 0; i < str.length; i++) {
                str[i] = str[i].charAt(0).toUpperCase() + str[i].slice(1);
            }
            console.log(str)
            console.log(str.join(' '))
            return str.join(' ');
        }

        if (event.target.value == 'titlecase') {
            update(data = titlecase(data))
        }
        // return 0
    }

    return (

        <div className='body'>
            <div className='box'>
                <label htmlFor="">Enter the string</label>
                <br />
                <input type="text" name="line" id="str" onBlur={eventHandler} /><br />
                <p id='uptext'>{data}</p>

                <div id='radio-div'>
                    <input type="radio" name="abc" value='uppercase' onClick={eventHandler} />
                    <label htmlFor="">Upper Case</label><br />
                    <input type="radio" name="abc" value='lowercase' onClick={eventHandler} />
                    <label htmlFor="">Lower Case</label><br />
                    <input type="radio" name="abc" value='titlecase' onClick={eventHandler} />
                    <label htmlFor="">Title Case</label>
                </div>
            </div>
        </div>
    )
}

export default Text_input
