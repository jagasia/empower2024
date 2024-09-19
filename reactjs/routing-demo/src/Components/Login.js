import React from 'react';

const Login = () => {
  return (
    <div>
        <form>
        Username:<input type="text" className='form-control' id="username" required />
        Password:<input type="password" className='form-control' id="password" required />
        <br/>
        <input type="submit" className='btn btn-info' value="Login" />
        </form>
    </div>
  )
}

export default Login;