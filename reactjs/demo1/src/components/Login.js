import { Component } from "react";

class Login extends Component
{
    render(){
        return <div>
            Username:<input type="text" id="username" class="form-control" />
            Password:<input type="password" id="password" class="form-control" />
            <input type="button" value="Login" class="btn btn-info" />
        </div>
    }
}

export default Login;