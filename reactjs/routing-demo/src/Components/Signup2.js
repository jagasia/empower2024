import { useFormik } from 'formik';
import React from 'react';
import * as Yup from 'yup';

const Signup2 = () => {
  const formik=useFormik({
    initialValues:{username:'',password:'',cpassword:'', email:''},
    validationSchema:Yup.object({
        username:Yup.string().required("username is mandatory").min(6,"Username must be atleast 6 characters"),
        password:Yup.string().required("Password is mandatory"),
        cpassword:Yup.string().required("cPassword is mandatory"),
        email:Yup.string().email("Invalid email").required("Email is mandatory")
    })
},);

function onButtonClick()
{
  console.log(formik)
}

  return (
    <div>

      <h3>Signup form 2</h3>
      <br/>
      Username:<input type="text" className={`form-control ${formik.errors.username && 'is-invalid'}`} id='username' onChange={formik.handleChange} />
      {formik.errors.username && <p className='text-danger'>{formik.errors.username}</p>  }
      Password:<input type="text" className={`form-control ${formik.errors.password && 'is-invalid'}`} id='password' onChange={formik.handleChange} />
      {formik.errors.password && <p className='text-danger'>{formik.errors.password}</p>  }
      Confirm Password:<input type="text" className={`form-control ${formik.errors.cpassword && 'is-invalid'}`} id='cpassword' onChange={formik.handleChange} />
      {formik.errors.cpassword && <p className='text-danger'>{formik.errors.cpassword}</p>  }
      Email:<input type="email" className={`form-control ${formik.errors.email && formik.touched.email && 'is-invalid'}`} id='email' onChange={formik.handleChange} onBlur={formik.handleBlur} />
      {formik.errors.email && formik.touched.email && <p className='text-danger'>{formik.errors.email}</p>  }
      <input type="button" className={`btn btn-primary`} value="Sign up" onClick={onButtonClick} disabled={!(formik.dirty && formik.isValid)} />
    </div>
  )
}

export default Signup2