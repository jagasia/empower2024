import { Component } from "react";

export class Counter extends Component{
    
    constructor()
    {
        super();
        this.state={count:0, username:'', password:''};    
        this.fnClick=this.fnClick.bind(this);
    }
    
    fnClick(e){
        
        //find which button was clicked?
        switch(e.target.value)
        {
            case "Increment":
                this.setState({count:this.state.count+1})
                break;
            case "Decrement":
                this.setState({count:this.state.count-1})
                break;
        }
    }

    render(){
        return <div><br/>
            <input type="button" className="btn btn-primary" value="Increment" onClick={this.fnClick} /><br/>
            <input type="button" className="btn btn-primary" value="Decrement" onClick={this.fnClick} /><br/>
            <br/>
            {this.state.count}
        </div>
    }
}