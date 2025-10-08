import React from 'react'
import './Login.css'

function Login() {
    return (
        <>
            <h1>This is the Login Page</h1><br />
            <div id='log'>
                Enter Username: <input type="text" /><br />
                Enter Password: <input type="text" /><br />
                <button>Submit</button>
            </div>
        </>
    )
}

export default Login
