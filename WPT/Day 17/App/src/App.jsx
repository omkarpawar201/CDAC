import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Use_Effect from './components/Use_Effect'
import OrderedListOnBlur from './components/List'
import List from './components/List'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      {/* <Use_Effect/> */}
      <List/>
    </>
  )
}

export default App
