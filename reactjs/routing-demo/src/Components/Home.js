import React, { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';

const Home = () => {

    const [obj, setObj]=useState({});
    const location=useLocation();

    useEffect(()=>{
        setObj(location.state)
    },null)

  return (
    <div>
            <div>Home....</div>
            <div>Welcome {obj.name} ! You are {obj.role}</div>
    </div>
  )
}

export default Home