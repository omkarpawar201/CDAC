import React from 'react'
import { Component } from 'react'
import './Class_Comp.css'

class Class_Comp extends Component {

    constructor(props) {
        super(props)
        this.state = { input: '', result: '' }
    }

    doOperation() { }

    eventHandler = (event) => {
        console.log("Event happened")
        console.log(event.target)
        console.log(event.target.value)

        // let val = input


        if (event.target.name == 'string') {
            this.setState({ input: event.target.value })
        }
        if (event.target.value == 'uppercase') {
            // console.log(document.firstElementid('string'))
            this.setState(({ input }) => ({ result: input.toUpperCase() }));
        }
        if (event.target.value == 'lowercase') {
            this.setState(({ input }) => ({ result: input.toLowerCase() }));
        }
    }

    render() {
        return (
            <div id='d8'>
                <div id='d9'>
                    <label id='l2' htmlFor="string">Enter the string</label><br />
                    <input type="text" id='string' name='string' value={this.state.input} onChange={this.eventHandler} /><br /><br />
                    <p id='p1'>{this.state.result}</p><br />
                    <button className='btn' id='btn1' onClick={this.eventHandler} value='uppercase'>Upper Case</button>
                    <button className='btn' id='btn2' onClick={this.eventHandler} value='lowercase'>Lower Case</button>
                </div>
            </div>
        )
    }
}

export default Class_Comp

// constructor(props) {
//     super(props);
//     this.state = { input: '', result: '' };
// }

// handleInputChange = (e) => {
//     this.setState({ input: e.target.value });
// }

// toUpper = () => {
//     this.setState(({ input }) => (
//         { result: input.toUpperCase() }));
// }

// toLower = () => { this.setState(({ input }) => ({ result: input.toLowerCase() })); }