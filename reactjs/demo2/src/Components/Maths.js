import { useState } from "react";

const Maths=()=>{
    const [no1, setNo1]=useState();
    const [no2, setNo2]=useState();
    const [sum, setSum]=useState();

    function onChangeHandler(e)
    {
        switch(e.target.id)
        {
            case "no1":
                Promise.resolve()
                .then(()=>setNo1(e.target.value))
                .then(()=>{
                    setSum(parseInt(no1)+parseInt(no2));
                })
                break;
            case "no2":
                Promise.resolve()
                .then(()=>setNo2(e.target.value))
                .then(()=>{
                    setSum(parseInt(no1)+parseInt(no2));
                })
                break;
        }

        
        
        
    
    }
    

    return <div>
        {no1}<br/>
        {no2}<br/>
        {sum}
        <br/>
        Number 1:<input type="number" id="no1" onChange={onChangeHandler} /><br/>
        Number 2:<input type="number" id="no2" onChange={onChangeHandler}  /><br/>
        
    </div>
}

export default Maths;