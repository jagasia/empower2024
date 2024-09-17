import { useState } from "react";

const Maths=()=>{
    const [no1, setNo1]=useState(0);
    const [no2, setNo2]=useState(0);
    const [sum, setSum]=useState(0);

    function onChangeHandler(e)
    {
        var value=e.target.value;
        switch(e.target.id)
        {
            case "no1":
                setNo1((x)=>{
                    setSum(parseInt(value)+parseInt(no2));
                    return value;
                })
                break;
            case "no2":
                setNo2((x)=>{
                    setSum(parseInt(value)+parseInt(no1));
                    return value;
                })
                break;
        }
    }
    

    return (<div style={{'background-color':'rgba(255,255,255,0.4)'}}>
        {no1}<br/>
        {no2}<br/>
        {sum}
        <br/>
        Number 1:<input type="number" id="no1" onChange={onChangeHandler} /><br/>
        Number 2:<input type="number" id="no2" onChange={onChangeHandler}  /><br/>
        <p style={{'color':'rgb(255,0,255)'}} id="p1">This is a paragraph</p>
    </div>)
}

export default Maths;