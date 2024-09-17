import { Component } from "react";

class Login extends Component
{
    constructor(props)
    {
        super(props);
    }
    render(){
        return <div style={{'background-color':this.props.bgcolor}}>
            <h2>{this.props.title}</h2>
            Username:<input type="text" id="username" class="form-control" />
            Password:<input type="password" id="password" class="form-control" />
            <input type="button" value="Login" class="btn btn-info" />
        </div>
    }
}

export default Login;