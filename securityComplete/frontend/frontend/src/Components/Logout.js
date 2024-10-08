import { useEffect } from "react";

const Logout=()=>{
    useEffect(()=>{
        localStorage.removeItem("myToken");
    })

    return <div>
        You are logged out
    </div>
}
export default Logout;