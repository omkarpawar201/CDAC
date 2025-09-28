import React, { Component } from 'react'

class Predefined extends Component {

    constructor(props) {
        super(props)
        this.state = {input:''}
        console.log("Constructor called")
    }
    
    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps called")
        return 0
    }
    
    componentDidMount() {
        console.log("componentDidMount called")
        return 0
    }
    
    render() {
        return (
                console.log("render called")
        )
    }


}


export default Predefined


