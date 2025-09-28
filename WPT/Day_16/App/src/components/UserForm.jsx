import React, { useState } from 'react'
import './UserForm.css'

function UserForm() {

    let [name, updateName] = useState('')
    let [email, updateEmail] = useState('')
    let [data, updateData] = useState('')
    let [submit, updateSubmit] = useState(false)

    function namehandle(event) {
        updateName(event.target.value)
    }

    function emailhandle(event) {
        updateEmail(event.target.value)
    }

    function listhandle(event) {
        updateData(event.target.value)

    }

    function submithandle(event) {
        // updateData(event.target.value)
        console.log(event.target.value)
        updateSubmit(submit = event.target.value)
        console.log(submit = event.target.value)

    }

    return (
        <div id='main'>
            <div id='form'>
                <label htmlFor="">Enter Your Name</label><br />
                <input type="text" name="name" id="name" onChange={namehandle} value={name} /><br />
                <label htmlFor="">Enter Your Email</label><br />
                <input type="text" name="email" id="email" onChange={emailhandle} />
                <br />
                <select name="edu" id="edu" onChange={listhandle}>
                    <option value="">-</option>
                    <option value="Graduate">Graduate</option>
                    <option value="PG">PG</option>
                    <option value="UnderGrad">UnderGrad</option>
                </select>
                <br /><br />

                {
                    data == 'Graduate' && (
                        <>
                            <div id='grad'>
                                <label htmlFor="">Degree </label>
                                <input type="text" /><br />
                                <label htmlFor="">Year of Passing   </label>
                                <input type="text" /><br />
                                <label htmlFor="">CGPA   </label>
                                <input type="text" /><br />
                            </div>
                        </>
                    )
                }
                {
                    data == 'PG' && (
                        <>
                            <label htmlFor="">Year of Passing</label>
                            <input type="text" /><br />
                            <label htmlFor="">Subject</label>
                            <input type="text" /><br />
                        </>
                    )
                }
                {
                    data == 'UnderGrad' && (
                        <>
                            <label htmlFor="">SSC Year</label>
                            <input type="text" /><br />
                            <label htmlFor="">SSC Percentage</label>
                            <input type="text" /><br />
                            <label htmlFor="">HSC Year</label>
                            <input type="text" /><br />
                            <label htmlFor="">HSC Percentage</label>
                            <input type="text" /><br />
                        </>
                    )
                }

                <br />
                <button type='button' id='sub_btn' onClick={submithandle} value={true}>Submit</button>
                {submit && (
                    <>
                        <p>Name: {name}</p>
                        <p>Email: {email}</p>
                        <p>Education: {data}</p>
                    </>
                )}
            </div>
        </div>
    )
}

export default UserForm
