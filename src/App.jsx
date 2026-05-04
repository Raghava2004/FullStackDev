import './App.css'
import HeaderComponent from './components/HeaderComponent';
import ListEmpComponent from './components/ListEmpComponent';
import FooterComponent from './components/FooterComponent';
import EmployeeComponent from './components/EmployeeComponent';
import EmployeeSearchComponent from './components/EmployeeSearchComponent';
import {BrowserRouter as Router, Route, Routes, BrowserRouter} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
function App() {

  return (
    <>
    <BrowserRouter>
    <HeaderComponent />
    <Routes>
       {/* // http://localhost:3000/  ListEmpComponent  */}
      <Route path='/' element={<ListEmpComponent />} />
      {/* // http://localhost:3000/employees/  ListEmpComponent  */}
      <Route path='/employees' element={<ListEmpComponent />} />
        {/* // http://localhost:3000/add-employee  EmployeeComponent  */}
      <Route path='/add-employee' element={<EmployeeComponent />} />
      <Route path='/search-employee' element={<EmployeeSearchComponent />} />
      {}


    </Routes>
    <FooterComponent />
    </BrowserRouter>

    </>
  )
}

export default App
