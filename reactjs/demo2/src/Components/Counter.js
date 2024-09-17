import { useState } from "react";

const Counter=()=>{
    const [count, setCount] = useState(0);
    return <div>
        <input id="increment" type="button" value="+" onClick={(e)=>setCount(count+1)} />
        &nbsp;
        {count}
        &nbsp;
        <input id="decrement" type="button" value="-" onClick={(e)=>setCount(count-1)} />
    </div>
}
export default Counter;