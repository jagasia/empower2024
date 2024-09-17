import './App.css';
import AirlinesComponent from './Components/AirlinesComponent';

function App() {
  return (
    <div  className="App">
      <div className='bg-primary p-5 text-white'>
        <h1>Airlines Website</h1>
      </div>
      <div className='row'>
      <div className='col-sm-4'>1</div>
      <div className='col-sm-4'>
        <AirlinesComponent />
      </div>
      <div className='col-sm-4'>3</div>
      </div>
    </div>
  );
}

export default App;
