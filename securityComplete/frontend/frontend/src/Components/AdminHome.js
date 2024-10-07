import { useEffect, useState } from "react";
import UserService from "../Services/UserService";

const AdminHome=()=>{
    const [message, setMessage]=useState('')
    useEffect(()=>{
        UserService.accessAdminHome()
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

export default AdminHome;