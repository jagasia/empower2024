import { useState } from "react";
import UserService from "../Services/UserService";


const Login=()=>{
    const [username, setUsername]=useState('');
    const [password, setPassword]=useState('');
    const [success, setSuccess]=useState(false);
    const [failure, setFailure]=useState(false);
    const [url, setUrl]=useState('');

    function fnLogin()
    {
        var authRequest={};
        authRequest.username=username;
        authRequest.password=password;
        UserService.generateToken(authRequest)
        .then((response)=>{
            console.log(response.data);
            //store this token in localStorage
            var myToken=JSON.stringify(response.data)
            localStorage.setItem("myToken",myToken);
            myToken=JSON.parse(myToken)
            var role=myToken.authorities[0].authority;
            if(role=="admin")
                setUrl('adminHome');
            else if(role=="user")
                setUrl('userHome');
            setFailure(false)
            setSuccess(true)
        })
        .catch((error)=>{
            console.log(error);
            setFailure(true);
            setSuccess(false);
        })
    }

    return <div>
        {username}<br/>
        {password}<br/>
        Username:<input type="text" id="username" className="form-control" onChange={(e)=>setUsername(e.target.value)} />
        Password:<input type="password" id="password" className="form-control" onChange={(e)=>setPassword(e.target.value)} />
        <br/>
        <input type="button" className="btn btn-info" value={'Login'} onClick={fnLogin} />
        { failure && <div>Login Failed</div>}
        { success && <div>Login successful, click <a href={url}> here </a>to go to Home page</div>}
    </div>
}

export default Login;