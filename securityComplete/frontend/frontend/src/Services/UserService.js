import axios from "axios";

class UserService
{
    URL="http://localhost:5001/auth";


    generateToken(authRequest)
    {
        return axios.post(this.URL+"/generateToken",authRequest);
    }

    accessUserHome()
    {
        var token=this.getToken();       
        return axios.get(this.URL+"/user/userProfile",{ headers: {Authorization : `Bearer ${token}`}});
    }

     accessAdminHome()
    {
        var token=this.getToken();        
        // alert(token)  
        if(token!=null)      
        return axios.get(this.URL+"/admin/adminProfile", { headers: {Authorization:`Bearer ${token}`}});
    }

    getToken() {
        var myToken = '';
        myToken = localStorage.getItem("myToken");
        myToken=JSON.parse(myToken)
        if(myToken==null)
            return '';
        return myToken.token;
    }
}

export default new UserService();