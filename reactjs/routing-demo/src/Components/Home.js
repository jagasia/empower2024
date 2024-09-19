import React, { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';

const Home = () => {

  const [obj, setObj] = useState({});
  const location = useLocation();


  useEffect(() => {
    setObj((x) => {
      if (location.state != null) {
        
        return location.state;
      }
      else
        return { name: '' }
    })

  }, obj, setObj)

  return (
    <div>
      <div>Home....</div>
      {(obj.name) ? <div>Welcome {obj.name} ! You are {obj.role}</div> : <div>You have not logged in</div>}
    </div>
  )
}

export default Home