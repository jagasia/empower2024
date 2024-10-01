import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const Login = () => {
    const [username, setUsername]=useState('');
    const [password, setPassword]=useState('');
    const [message, setMessage]=useState('');
    const [showSuccess, setShowSuccess]=useState(false);

    const navigate=useNavigate();

    function fnLogin()
    {
        if(username==password)
        {
            //success
            setMessage('');
            //redirect to home page
            var obj={};
            obj.name=username;
            obj.role="admin"
            //store in localStorage
            localStorage.setItem("user",JSON.stringify(obj))
            // navigate("/",{state:obj},{replace:false})
            setShowSuccess(true);
        }else{
            //failure
            setMessage("Login failed");
            setShowSuccess(false)
        }
    }
    
  return (
    <div>
        <form>
            Username:<input type="text" id="username" className='form-control' onChange={(e)=>setUsername(e.target.value)} />
            Password:<input type="password" id="password" className='form-control' onChange={(e)=>setPassword(e.target.value)} />
            <br/>
            <input type="button" className='btn btn-secondary' value="Login" onClick={fnLogin} />
            <br/>
            <p className='text-danger'>{message}</p>
            { showSuccess && <div id="div1"><font color='green'>You have logged in successfully. Please click <a href='/'>here</a> to go home page...</font></div>}
        </form>
    </div>
  )
}

export default Login;