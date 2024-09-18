import { useState } from "react";
import UserService from "../Services/UserService";

const Login=()=>{
    const [username, setUsername]=useState('');
    const [password, setPassword]=useState('');

    function fnLogin()
    {
        var authRequest={};
        authRequest.username=username;
        authRequest.password=password;
        UserService.generateToken(authRequest)
        .then((response)=>{
            console.log(response.data);
            //store this token in localStorage
            localStorage.setItem("token",response.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    }

    return <div>
        {username}<br/>
        {password}<br/>
        Username:<input type="text" id="username" className="form-control" onChange={(e)=>setUsername(e.target.value)} />
        Password:<input type="password" id="password" className="form-control" onChange={(e)=>setPassword(e.target.value)} />
        <br/>
        <input type="button" className="btn btn-info" value={'Login'} onClick={fnLogin} />
    </div>
}

export default Login;