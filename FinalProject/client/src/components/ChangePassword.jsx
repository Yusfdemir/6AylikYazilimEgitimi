import axios from 'axios'
import React, { useState,useEffect } from 'react'
import { useNavigate } from 'react-router-dom'

const ChangePassword = () => {
  const navigate=useNavigate()
  const[newPassword,setNewPassword]=useState("")
  const[newPasswordConfirm,setNewPasswordConfirm]=useState("")
  const [admin,setAdmin]=useState({
    email:"",
    password:"",
  })

  useEffect(()=>{
    axios.get(`http://localhost:3000/auth/admin/1`)
    .then(result=>{
        setAdmin({
        ...admin,
        email:result.data.Result[0].email,
        password:result.data.Result[0].password,
       })
    })
    .catch(err=>{console.log(err)})
  },[])

  const handleSubmit=(e)=>{
      e.preventDefault();
      if(newPassword == newPasswordConfirm ){
        setAdmin({
          ...admin,
          password:newPassword
        })
        axios.put("http://localhost:3000/auth/change-password",admin)
        .then(result=>{
          if(result.data.Status){
            navigate("/dashboard") 
          }else{
            alert(result.data.Error)
          }  
        })
        .catch(err=>{console.log(err)})  
      }
      else{
        alert("Şifreler Eşleşmedi veya Geçerli bir şifre girmediniz")
      }
  }
  return (
    <div className="d-flex justify-content-center align-items-center mt-3">
    <div className="p-3 rounded w-75">
      <h3 className="text-center">Edit Car</h3>
      <form className="row g-1" 
       onSubmit={handleSubmit}
      >
        <div className="col-12">
          <label htmlFor="newPassword" className="form-label">
            New Password
          </label>
          <input
                type="password"
                className="form-control rounded-0"
                id="newPassword"
                placeholder="Enter New Password"
                onChange={(e) => setNewPassword(e.target.value)
                }
          />
        </div>
        <div className="col-12">
          <label htmlFor="newPasswordConfirm" className="form-label">
            New Password Confirm
          </label>
          <input
                type="password"
                className="form-control rounded-0"
                id="newPasswordConfirm"
                placeholder="Confirm New Password"
                onChange={(e) => setNewPasswordConfirm(e.target.value)
                }
          />
        </div>
        <div className="col-12">
          <button type="submit" className="btn btn-primary w-100 mt-2">
            Change Password
          </button>
        </div>
      </form>
    </div>
  </div>
  )
}

export default ChangePassword