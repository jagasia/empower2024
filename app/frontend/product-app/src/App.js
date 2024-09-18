import './App.css';
import AdminHome from './Components/AdminHome';
import Login from './Components/Login';
import Product from './Components/Product';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-secondary text-white'>
        <h2>Product Demo</h2>
      </div>
      <div className='row'>
      <div className='col-sm-2'>
        <Login />
      </div>
      <div className='col-sm-8'>
        <Product />
      </div>
      <div className='col-sm-2'>
        <AdminHome />
      </div>
      </div>
    </div>
  );
}

export default App;
