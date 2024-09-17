import { Component } from "react";

export class MyLogin extends Component
{
    constructor()
    {
        super();
        this.state={"username":"", "password":"", "usernameTouched":false, x:"form-control"}
        this.onChangeHandler=this.onChangeHandler.bind(this);
    }

    componentDidUpdate()
    {

    }
    onChangeHandler(e)
    {
        if(e.target.id=="username")
        {            
            this.setState({'usernameTouched':true})
            if(this.state.username.length<3)
                this.setState({'x':'form-control is-invalid'})
            else
            this.setState({'x':'form-control'})
        }
        this.setState({[e.target.id]:e.target.value});
    }

    render(){
        return <div>
            {this.state.username}<br/>
            {this.state.password}<br/>
            {this.state.usernameTouched}
            <br/>
            { this.state.usernameTouched && this.state.username.length<3 && <div className="text-danger">Username is invalid</div> }
            <br/>
            <p style={{'color':(this.state.username.length<3)?'red':'black'}}>This is a paragraph</p>
            Username:<input type="text" id="username" className={this.state.x} onChange={(e)=>{ this.setState({[e.target.id]:e.target.value}) }} />
            Password:<input type="password" id="password" className="form-control" onChange={(e)=>{ this.setState({[e.target.id]:e.target.value}) }} />
            <br/>

            <input type="button" value="Login" className="btn btn-primary" />
            <br/><br/>
            <br/>
            <br/>
            <br/>
        </div>
    }
}