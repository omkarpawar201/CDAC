import { useState } from 'react'
import {
  BrowserRouter, Routes, Route, NavLink
  , Link,
  useNavigate
} from "react-router-dom";

import './App.css'
import Home from './components/Home'
import AboutUs from './components/AboutUs';
import ContactUs from './components/ContactUs';
import Login from './components/Login';

const App = () => {
  // const [count, setCount] = useState(0)

  return (
    <>
      <div id='main-div'>
        <BrowserRouter>
          <nav id='nav1'>
            <ul id='list1'>
              <li>
                <NavLink to="/">
                  Home
                </NavLink>
              </li>
              <li>
                <Link to="/about">
                  About Us
                </Link>
              </li>
              <li>
                <Link to="/contact">
                  Contact Us
                </Link>
              </li>
              <li>
                <Link to="/login">
                  Login
                </Link>
              </li>
            </ul>
          </nav>

          <div>
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<AboutUs />} />
              <Route path="/contact" element={<ContactUs />} />
              <Route path="/login" element={<Login />} />
            </Routes>
          </div>

        </BrowserRouter>
      </div>
    </>
  )
}

export default App
