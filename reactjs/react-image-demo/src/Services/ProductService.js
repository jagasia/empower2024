import axios from "axios";

class ProductService
{
    URL="http://localhost:5001/product"

    fnAdd(product)
    {
        return axios.post(this.URL,product);
    }

    retrieveAllProducts()
    {
        return axios.get(this.URL)
    }
}

export default new ProductService();