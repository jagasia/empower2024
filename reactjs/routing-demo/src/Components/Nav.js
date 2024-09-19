import React, { useEffect, useState } from 'react';

const Nav = () => {
    
    const [status, setStatus]=useState('');

    useEffect(()=>{
        var str=localStorage.getItem("user");
        if(str==null)
        {
            setStatus(()=>{
                return "login"
            });
        }else{
            setStatus(()=>{
                return "logout"
            });
        }
    },[status,setStatus]);

    return (
        <div>
            <nav className="navbar navbar-expand-sm navbar-dark bg-dark">
                <div className="container-fluid">
                    <a className="navbar-brand" href="/">Home</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="mynavbar">
                        <ul className="navbar-nav me-auto">
                            <li className="nav-item">
                                <a className="nav-link" href="/about">About</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contact">Contact Us</a>
                            </li>
                        </ul>
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <a className="nav-link" href="/signup2">Sign Up</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href={"/"+status}>{status}</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default Nav