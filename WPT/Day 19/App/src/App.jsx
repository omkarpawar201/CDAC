import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PasswordGen from './components/PasswordGen'
import Callback1 from './components/Callback1'
import Callback2 from './components/Callback2'
import ErrorBoundry from './components/ErrorBoundry'
import Counter from './components/Counter'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <PasswordGen></PasswordGen>
      {/* <Callback1></Callback1> */}
      {/* <Callback2></Callback2> */}
      {/* <ErrorBoundry>
        <Counter></Counter>
      </ErrorBoundry> */}
    </>
  )
}

export default App
