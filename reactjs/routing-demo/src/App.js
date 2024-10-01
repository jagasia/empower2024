import { Route, Routes } from 'react-router-dom';
import About from './Components/About';
import Contact from './Components/Contact';
import Home from './Components/Home';
import Login from './Components/Login';
import Logout from './Components/Logout';
import Nav from './Components/Nav';
import Signup2 from './Components/Signup2';


function App() {
  return (
    <div className="App">
      <div className='p-5 bg-primary text-white'>
        <h2>Routing demo</h2>
      </div>
      <Nav />
      <div className='row'>
      <div className='col-sm-4'></div>
      <div className='col-sm-4'>
        <Routes>
          <Route path='/' Component={Home } />
          <Route path='/about' element={<About />} />
          <Route path='/contact' Component={Contact} />
          <Route path='/login' Component={Login} />
          <Route path='/signup2' Component={Signup2} />
          <Route path='/logout' Component={Logout} />
        </Routes>
      </div>
      <div className='col-sm-4'></div>
      </div>
    </div>
  );
}

export default App;
