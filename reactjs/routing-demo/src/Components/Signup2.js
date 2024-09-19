import { useFormik } from 'formik';
import React from 'react';
import * as Yup from 'yup';

const Signup2 = () => {
  const formik=useFormik({
    initialValues:{username:'',password:'',cpassword:'', email:''},
    validationSchema:Yup.object({
        username:Yup.string().required("username is mandatory").length(6,"Username must be atleast 6 characters"),
        password:Yup.string().required("Password is mandatory"),
        cpassword:Yup.string().required("cPassword is mandatory"),
        email:Yup.string().required("Email is mandatory")
    })
},

);

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
      Email:<input type="email" className={`form-control ${formik.errors.email && 'is-invalid'}`} id='email' onChange={formik.handleChange} />
      {formik.errors.email && <p className='text-danger'>{formik.errors.email}</p>  }
      <input type="button" className='btn btn-primary' value="Sign up" />
    </div>
  )
}

export default Signup2