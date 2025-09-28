import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import Demo from './components/Demo.jsx'
import Calculation from './components/Calculation.jsx'
import Calculator from './components/Calculator.jsx'
import Mul_Comp from './components/Mul_Comp.jsx'
import { Fun1 } from './components/Mul_Comp.jsx'
import Class_Comp from './components/Class_Comp.jsx'


createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App /> */}
    {/* <Demo num = "6"/> */}
    {/* <Calculation num1="5" num2="2" /> */}
    {/* <Calculator num1="50" num2="50" oper="*"/> */}
    {/* <Mul_Comp />
    <Fun1 /> */}

    <Class_Comp />
  </StrictMode>,
)
