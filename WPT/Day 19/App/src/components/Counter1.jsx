import { Component } from "react";

class Counter1 extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        if (this.props.value == 3) {
            throw Error("Error Occured ");
        }
        return (
            <>
                <h1>Counter 1</h1>
                <h2>Data : {this.props.value}</h2>
                <button onClick={this.props.onClick}>Click </button>
            </>
        )
    }
}

export default Counter1