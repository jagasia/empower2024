import { useFormik } from 'formik';
import React from 'react';
import * as Yup from 'yup';

const Signup = () => {
  const formik=useFormik({
    initialValues:{"username":'',"password":'',"cpassword":'',"email":''},
    validationSchema:Yup.object({
      username:Yup.string().required("Username is mandatory").min(6,"Username must be atleast 6 letters"),
      password:Yup.string().required("Password is mandatory"),
      cpassword:Yup.string(),
      email:Yup.string().email("Invalid email").required("Email is mandatory")
    })
  });


  function fnConfirmPassword()
  {
    var pwd=formik.values.password;
    var cpwd=formik.values.cpassword;
    if(pwd!=cpwd)
    {      
      formik.setFieldError('cpassword','Passwords does not match')
    }else
    {
      formik.errors.cpassword=""
    }
    console.log("...................");
    
    console.log(pwd);
    console.log(cpwd);
    console.log(formik.errors.cpassword);
    console.log("...................");
    
  }

  function fnLogin()
  {
    console.log(formik)
  }

  return (
    <div>
      <form>
        {formik.errors.cpassword}
        <br/>
        Username:<input type="text" className={`form-control ${formik.errors.username && formik.touched.username && 'is-invalid'}`} id='username' onChange={formik.handleChange} onBlur={formik.handleBlur} />
        {formik.errors.username && formik.touched.username && <p className='alert alert-danger'>{formik.errors.username}</p>}
        Password:<input type="text" className={`form-control ${formik.errors.password && formik.touched.password && 'is-invalid'}`} id='password'  onChange={formik.handleChange} onBlur={formik.handleBlur} />
        {formik.errors.password && formik.touched.password && <p className='alert alert-danger'>{formik.errors.password}</p>}
        Confirm Password:<input type="text" className={`form-control ${formik.errors.cpassword && 'is-invalid'}`} id='cpassword' onChange={formik.handleChange} onBlur={formik.handleBlur}  onKeyUp={fnConfirmPassword} />
        {formik.errors.cpassword && <p className='alert alert-danger'>{formik.errors.cpassword}</p>}
        .Email:<input type="email" className={`form-control ${formik.errors.email && formik.touched.email && 'is-invalid'}`} id='email' onChange={formik.handleChange} onBlur={formik.handleBlur} />
        {formik.errors.email && formik.touched.email && <p className='alert alert-danger'>{formik.errors.email}</p>}
        <br/>
        <input type="button" className='btn btn-info' value="Signup" onClick={fnLogin} disabled={!(formik.dirty && formik.isValid)} />
      </form>
    </div>
  )
}

export default Signup