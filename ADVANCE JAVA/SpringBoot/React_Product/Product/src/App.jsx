import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import MainNavBar from './components/MainNavBar'
import MyHeader from './components/MyHeader';
import MyFooter from './components/MyFooter';
import { Routes,Route ,Navigate} from 'react-router-dom';
import ProductDetails from './pages/ProductDetails';
import ProductForm from './pages/ProductForm';
import ProductTable from './pages/ProductTable';
import ProductEdit from './pages/ProductEdit';
import AboutUs from "./pages/AboutUs";
import HomeComponent from './pages/HomeComponent';

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <MyHeader />
      <MainNavBar></MainNavBar>
      <Routes>
        <Route path="/" element={<Navigate replace to="/home"></Navigate>}></Route>

        <Route path="/home" element={<HomeComponent></HomeComponent>}></Route>
        <Route path="/table" element={<ProductTable></ProductTable>}>
          <Route path="details/:pid" element={<ProductDetails></ProductDetails>}></Route>

        </Route>
        <Route path="/edit/:pid" element={<ProductEdit></ProductEdit>}></Route>

        <Route path="/form" element={<ProductForm></ProductForm>}></Route>

        <Route path="/aboutus" element={<AboutUs></AboutUs>}></Route>
      </Routes>
      <MyFooter />
    </div>
  );
}

export default App
