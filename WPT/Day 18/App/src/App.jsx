import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PasswordGen from './components/PasswordGen'
import LoadData from './components/LoadData'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      {/* <PasswordGen></PasswordGen> */}
      <LoadData></LoadData>
    </>
  )
}

export default App
