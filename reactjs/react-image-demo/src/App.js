import { useEffect, useState } from 'react';
import './App.css';
import ProductService from './Services/ProductService';

function App() {
  const [id, setId] = useState(0);
  const [name, setName] = useState('');
  const [category, setCategory] = useState('');
  const [price, setPrice] = useState(0);
  const [mfd, setMfd] = useState('');
  const [picture, setPicture] = useState('');
  const [products, setProducts]=useState([])

  useEffect(()=>{
    ProductService.retrieveAllProducts()
    .then((response)=>{
      setProducts(response.data)
    })
    .catch((err)=>{
      console.log(err);
      
    })
  },[]);


  function readFileDataAsBase64(e) {
    const file = e.target.files[0];
    return new Promise((resolve, reject) => {
      const reader = new FileReader();
      reader.onload = (event) => {
        resolve(event.target.result);
      };
      reader.onerror = (err) => {
        reject(err);
      };
      reader.readAsDataURL(file);
    });
  }

  function onFileChange(e) {
    readFileDataAsBase64(e)
      .then((data) => {
        setPicture(data)
      })
      .catch((error) => {

      })
  }

  function addProduct()
  {
    var product={};
    product.id=id;
    product.name=name;
    product.price=price;
    product.category=category;
    product.mdf=mfd;
    product.picture=picture;
    
    ProductService.fnAdd(product)
    .then((response)=>{
      console.log(response.data);
      window.location.reload();
    })
    .catch((err)=>{
      console.log(err);
      
    })
  }
  return (
    <div className="App">
      <div className='p-5 bg-secondary text-white'>
        <h2>Image Demo</h2>
      </div>
      <div className='row'>
        <div className='col-sm-4'></div>
        <div className='col-sm-4'>
          <form>
            <img width={100} src={picture} />
            <br />
            Id:<input type="number" className='form-control' id="id" onChange={(e) => setId(e.target.value)} />
            Name:<input type="text" className='form-control' id="name" onChange={(e) => setName(e.target.value)} />
            Category:<input type="text" className='form-control' id="category" onChange={(e) => setCategory(e.target.value)} />
            Price:<input type="number" className='form-control' id="price" onChange={(e) => setPrice(e.target.value)} />
            Mfd:<input type="date" className='form-control' id="mfd" onChange={(e) => setMfd(e.target.value)} />
            Picture:<input type="file" className='form-control' id="picture" onChange={onFileChange} />
            <br />
            <input type="button" className='btn btn-info' value="Add" onClick={addProduct} />
          </form>
          <table className='table table-bordered table-striped table-hover'>
            <thead>
              <tr>
                <th>Id</th><th>Name</th><th>Price</th><th>Category</th><th>Mfd</th><th>Picture</th>
              </tr>
            </thead>
            <tbody>
              {
                products.map((p)=><tr>
                  <td>{p.id}</td>
                  <td>{p.name}</td>
                  <td>{p.price}</td>
                  <td>{p.category}</td>
                  <td>{p.mfd}</td>
                  <td><img width={100} src={p.picture} /></td>
                  
                </tr>)
              }
            </tbody>
          </table>
        </div>
        <div className='col-sm-4'></div>
      </div>
    </div>
  );
}

export default App;
