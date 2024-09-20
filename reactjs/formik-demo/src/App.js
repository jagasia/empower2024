import './App.css';
import Signup from './Components/Signup';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-primary text-white'>
        <h2>Formik demo</h2>
      </div>
      <div className='row'>
        <div className='col-sm-4'>          
        </div>
        <div className='col-sm-4'>          
          <Signup />
        </div>
        <div className='col-sm-4'>          
        </div>
      </div>
    </div>
  );
}

export default App;
