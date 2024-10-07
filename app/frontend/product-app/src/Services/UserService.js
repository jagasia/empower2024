import axios from "axios";

class UserService 
{
    URL="http://localhost:5002/auth"

    generateToken(authRequest)
    {
        return axios.post(this.URL+"/generateToken",authRequest);
    }

    accessUserHome()
    {
        var token=this.getToken();       
        return axios.get(this.URL+"/user/userProfile",{ headers: {"Authorization" : `Bearer ${token}`}});
    }

     accessAdminHome()
    {
        var token=this.getToken();        
        return axios.get(this.URL+"/admin/adminProfile", { headers: {"Authorization":`Bearer ${token}`}});
    }

    getToken() {
        var token = '';
        token = localStorage.getItem("token");
        return token;
    }
}

export default new UserService();