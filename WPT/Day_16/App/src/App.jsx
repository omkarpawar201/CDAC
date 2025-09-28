import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Factorial from './components/Factorial'
import Cal_two from './components/Cal_two'
import Calculator from './components/Calculator'
import Predefined from './components/Predefined'
import Text_input from './components/Text_input'
import UserForm from './components/UserForm'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      {/* <Factorial num='6'/> */}
      {/* <Cal_two num1='5' num2='2'/> */}
      {/* <Calculator num1='5' num2='2' oper='-'/> */}
      {/* <Predefined/> */}
      <Text_input/>
      {/* <UserForm/> */}
    </>
  )
}

export default App
