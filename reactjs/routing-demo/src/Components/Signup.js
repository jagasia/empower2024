import React, { useState } from 'react'

const Signup = () => {
  const [username, setUsername]=useState('')
  const [password, setPassword]=useState('')
  const [cpassword, setCpassword]=useState('')
  const [email, setEmail]=useState('')
  const [usernameError, setUsernameError]=useState('')
  const [error, setError]=useState({})


 function onChangeHandler(e)
  {
    var source=e.target.id;
    var value=e.target.value;
    console.log(value)
    switch(source)
    {
      case "username":
        setUsername(value);
        if(value.length<6)
        {
          error.username="Username cannot be less than 6 characters"
        }else{
          error.username='';
          
        }        
        break;
      case "password":
        setPassword(value);
        if(value.length<8)
          {
            error.password="Password cannot be less than 8 characters"
          }
          else{
            error.password=''
        
          }
          if(cpassword!=value)
            {
              error.cpassword="Passwords does not match"
            }    else{
              error.cpassword=''
          
            }
        break;
      case "cpassword":    
      setCpassword(value)
        if(password!=value)
          {
            error.cpassword="Passwords does not match"
          }    else{
            error.cpassword=''
        
          }
        break;
      case "email":
        setEmail(value)
        // if(value.match("[a-z]+([.][a-z]+)?@[a-z][.][a-z]{2,3}"))
        if(value.match("[a-z]+@[a-z]+[.][a-z]{2,3}"))
        {
          error.email=''
        }
        else{
          error.email="Email address is invalid"
        }
        break;      
    }
  }


  return (
    <div>
      
      <br/>
      Username:<input type="text" className={`form-control ${error.username && 'is-invalid'}`} id='username' onChange={onChangeHandler} />
      {error.username && <p className='text-danger'>{error.username}</p>  }
      Password:<input type="text" className={'form-control'} id='password' onChange={onChangeHandler} />
      {error.password && <p className='text-danger'>{error.password}</p>  }
      Confirm Password:<input type="text" className={'form-control'} id='cpassword' onChange={onChangeHandler} />
      {error.cpassword && <p className='text-danger'>{error.cpassword}</p>  }
      Email:<input type="email" className={'form-control'} id='email' onChange={onChangeHandler} />
      {error.email && <p className='text-danger'>{error.email}</p>  }
      <input type="button" className='btn btn-primary' value="Sign up" />
    </div>
  )
}

export default Signup