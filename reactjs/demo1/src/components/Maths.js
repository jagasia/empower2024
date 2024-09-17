import { Component } from "react";

export class Maths extends Component
{
    constructor()
    {
        super();
        this.state={"no1":0, "no2":0, "sum":0}
        this.onChangeHandler=this.onChangeHandler.bind(this)
    }

    onChangeHandler(e)
    {
        Promise.resolve()
        .then(()=>this.setState({[e.target.id]:e.target.value}))
        .then(()=>this.setState({'sum':parseInt(this.state.no1)+parseInt(this.state.no2)}))
    }

    render(){
        return <div>
            {JSON.stringify(this.state)}
            <br/>
            Number 1: <input type="number" id="no1" className="form-control" onKeyUp={this.onChangeHandler}  />
            Number 2: <input type="number" id="no2" className="form-control" onKeyUp={this.onChangeHandler} />
            <br/>
            <input type="button" className="btn btn-primary" id="btnAdd" value="Add" />
        </div>
    }
}