import { useEffect, useState } from "react";
import ProductService from "../Services/ProductService";

const Product=()=>{
    const [products, setProducts]=useState([]);
    const [product, setProduct]=useState({});

    useEffect(()=>{
        ProductService.retrieveAllProducts()
        .then((response)=>{
            console.log(response.data);
            setProducts(response.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    },[]);


    function onChangeHandler(e)
    {        
        var id=e.target.id;
        var prd=product;
        console.log(prd)
        switch(id)
        {
            case "id":
                prd.id=e.target.value;
                break;
            case "name":
                prd.name=e.target.value;
                break;
            case "category":
                prd.category=e.target.value;
                break;
            case "price":
                prd.price=e.target.value;
                break;
        }
        console.log(prd);
        setProduct(prd);
        console.log("---------------")
        console.log(product);
    }

    function addProduct()
    {
        // alert("Adding..."+JSON.stringify(product))


        ProductService.addProduct(product)
        .then((response)=>{
            console.log(response.data)
            window.location.reload();
        })
        .catch((error)=>{

        })

        ///
    }

    function updateProduct()
    {
        alert("Updating..."+JSON.stringify(product))
    }

    function deleteProduct()
    {
        alert("deleting..."+product.id)
    }



    return <div>
        {   JSON.stringify(product)}
        <br/>
        <div className="row">
        <div className="col-sm-3"></div>
        <div className="col-sm-6">
        <form className="container">
            Id:<input type="number" className="form-control" id="id" onChange={ onChangeHandler } />
            Name:<input type="text" className="form-control" id="name" onChange={ onChangeHandler } />
            Category:<input type="text" className="form-control" id="category" onChange={ onChangeHandler } />
            Price:<input type="number" className="form-control" id="price" onChange={ onChangeHandler } />
            <br/>
            <input type="button" value="Add" className="btn btn-success" onClick={addProduct} />&nbsp;
            <input type="button" value="Update" className="btn btn-warning" onClick={updateProduct} />&nbsp;
            <input type="button" value="Delete" className="btn btn-danger" onClick={deleteProduct} />&nbsp;
        </form>

        </div>        
        <div className="col-sm-3"></div>
            
        </div>
        <hr/>
        <table className="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th><th>Name</th><th>Category</th><th>Price</th>
                </tr>
            </thead>
            <tbody>
                {
                    products.map((p)=><tr>
                        <td>{p.id}</td>
                        <td>{p.name}</td>
                        <td>{p.category}</td>
                        <td>{p.price}</td>
                    </tr>)
                }
            </tbody>
        </table>
    </div>
}

export default Product;