import { useState } from "react";

const Fun=()=>{
    const [red, setRed]=useState(0);
    const [green, setGreen]=useState(0);
    const [blue, setBlue]=useState(0);
    
    return <div style={{'background-color':`rgb(${red},${green},${blue})`}}>
        {red}<br/>
        {green}<br/>
        {blue}<br/>
        
        <input type="range" id="red" min={0} max={255} onChange={(e)=>setRed(e.target.value)} /><br/>
        <input type="range" id="green" min={0} max={255} onChange={(e)=>setGreen(e.target.value)}  /><br/>
        <input type="range" id="blue" min={0} max={255} onChange={(e)=>setBlue(e.target.value)}  /><br/>
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>    
        
    </div>
}

export default Fun;