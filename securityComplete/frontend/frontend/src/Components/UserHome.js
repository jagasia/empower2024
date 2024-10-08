import { useEffect, useState } from "react";
import UserService from "../Services/UserService";

const UserHome=()=>{
    const [message, setMessage]=useState('')
    useEffect(()=>{
        UserService.accessUserHome()
        .then((response)=>{
            console.log(response.data);
            setMessage(response.data)
        })
        .catch((error)=>{
            console.log(error);
            
        })
    },null);
    return <div>
        {message}
    </div>
}

export default UserHome;