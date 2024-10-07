import './App.css';
import AdminHome from './Components/AdminHome';
import Login from './Components/Login';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-primary text-white'></div>
      <div className='row'>
        <div className='col-sm-4'>

        </div>
        <div className='col-sm-4'>
          <Login />
        </div>
        <div className='col-sm-4'>
          <AdminHome />
        </div>
      </div>
    </div>
  );
}

export default App;
