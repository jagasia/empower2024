import { Route, Routes } from 'react-router-dom';
import './App.css';
import AdminHome from './Components/AdminHome';
import Login from './Components/Login';
import Logout from './Components/Logout';
import Nav from './Components/Nav';
import UserHome from './Components/UserHome';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-primary text-white'></div>
      <Nav />
      <div className='row'>
        <div className='col-sm-4'>
        
        </div>
        <div className='col-sm-4'>
          <Routes>
            <Route path="/Login" element={<Login />} ></Route>
            <Route path="/Logout" element={<Logout />} ></Route>
            <Route path='/adminHome' element={<AdminHome />} ></Route>
            <Route path='/userHome' element={<UserHome />}></Route>
          </Routes>
        </div>
        <div className='col-sm-4'>
          
        </div>
      </div>
    </div>
  );
}

export default App;
