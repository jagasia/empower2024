import './App.css';
import { Counter } from './components/Counter';
import Login from './components/Login';
import { Menu } from './components/Menu';


function App() {
  return (
    <div className="App">
    <div class="p-5 bg-primary text-white">
      <h1>This is our title</h1>
    </div>
    <Menu />
    <div className='row'>
      <div className='col-sm-4'>
        <img width="100" src="images/empower.jfif" />
      </div>
      <div className='col-sm-4'>
      <Counter />
      </div>
      <div className='col-sm-4'>
      <Login bgcolor="grey" title="User Login" />
      </div>
    </div>
    </div>
  );
}

export default App;
