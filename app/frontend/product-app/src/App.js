import './App.css';
import Product from './Components/Product';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-secondary text-white'>
        <h2>Product Axios Demo</h2>
      </div>
      <div className='row'>
      <div className='col-sm-2'></div>
      <div className='col-sm-8'>
        <Product />
      </div>
      <div className='col-sm-2'></div>
      </div>
    </div>
  );
}

export default App;
