import axios from 'axios';
import { useState } from 'react'

const Login = () => {
    const [values,setValues]=useState({
        email:"",
        password:""
    });

    const handleSubmit=(e)=>{
        e.preventDefault()
        axios.post('http://localhost:3000/auth/adminlogin',values)
            .then(result=>console.log(result))
            .catch(err=>console.log(err))
    }

  return (
    <div className='d-flex justify-content-center align-items-center vh-100 '>
        <div className='p-3 rounded w-50 border '>
            <h1 className='text-center fw-bold'>XYZ-Cars</h1>
            <p className='text-center '>Please login to continue</p>
            <form onSubmit={handleSubmit}>
                <div className='mb-3'>
                    <label htmlFor="email">Email:</label>
                    <input 
                        type="email" 
                        name='email' 
                        autoComplete='off' 
                        placeholder='Enter Email' 
                        className='form-control rounded-0'
                        onChange={(e)=>setValues({...values, email:e.target.value})}
                    />
                </div>
                <div className='mb-3'>
                    <label htmlFor="password">Password:</label>
                    <input 
                        type="password" 
                        name='password' 
                        placeholder='Enter Password' 
                        className='form-control rounded-0'
                        onChange={(e)=>setValues({...values, password:e.target.value})}
                    />
                </div>
                <button className='btn btn-success w-100 rounded'>Log In</button>
            </form>
        </div>

    </div>
  )
}

export default Login