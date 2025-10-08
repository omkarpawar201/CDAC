import React, { useCallback, useEffect, useState } from 'react'

import './PasswordGen.css'

function PasswordGen() {

    const [length, setLength] = useState(12);
    const [num, setnum] = useState(false);
    const [sym, setsym] = useState(false);
    const [pass, setpass] = useState('');

    function eventHandle(event) {

        let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';

        if (num) {
            characters += '0123456789';
        }
        if (sym) {
            characters += '!@#$%^&*()_+';
        }

        let password = '';
        // console.log("l:"+characters.length);
        for (let i = 0; i < length; i++) {
            password += characters.charAt(
                Math.floor(Math.random() * characters.length));
            // console.log(Math.floor(Math.random() * characters.length))
        }
        setpass(password)

    }

    useEffect(() => {
        eventHandle()
    }, [length, num, sym]);

    useCallback(() => { 
        eventHandle()
    }, [length, num, sym]);

    return (
        <>
            <div id='d1'>
                <div id='pass-ctn'>
                    <label htmlFor="">Password length </label><br />
                    <input type="number" id='in' onChange={() => setLength(parseInt(event.target.value))} value={length} /><br /><br />
                    <input type="checkbox" name='num' onChange={() => setnum(true)} />
                    <label htmlFor=""> Use Numbers</label><br />
                    <input type="checkbox" name='sym' onChange={() => setsym(true)} />
                    <label htmlFor=""> Use Symbols</label><br /><br />
                    <input type="text" name="" id='in' readOnly value={pass} /><br /><br />
                    <button id='btn' onClick={eventHandle}>Regenerate</button>
                </div>
            </div>
        </>
    )
}

export default PasswordGen