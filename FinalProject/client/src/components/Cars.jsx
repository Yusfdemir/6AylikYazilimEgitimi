import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'

const Cars = () => {
  const [cars,setCars]=useState([])

  useEffect(()=>{
    axios.get("http://localhost:3000/auth/cars")
      .then(result=>{
        if(result.data.Status){
          setCars(result.data.Result)
        }else{
          alert(result.data.Error)
        }
      })
      .catch(err=>console.log(err))
  },[])

  return (
    <div className='px-5 mt-3'>
        <div className=''>
            <h3>My Cars</h3>
        </div>
        <Link to="/dashboard/add_car" className='btn btn-primary'> Add New Car</Link>
        <div className='mt-3'>
            <table className='table'>
              <thead>
                <tr>
                  <th>Car Name</th>
                  <th>Brand</th>
                  <th>Model</th>
                  <th>Year</th>
                  <th>Plaka</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                {
                  cars.map(car=>(
                    <tr>
                      <td>{car.name}</td>
                      <td>{car.brand}</td>
                      <td>{car.model}</td>
                      <td>{car.year}</td>
                      <td>{car.plaka}</td>
                      <td className=''>
                        <Link to={`/dashboard/edit_car/${car.id}`} className='btn btn-secondary me-2'>
                          <i className="bi-pencil-square me-1"></i>
                          <span>Edit</span>
                        </Link>
                        <button className='btn btn-danger'>
                          <i class="bi-trash-fill me-1"></i>
                          <span>Delete</span>
                        </button>
                      </td>
                      
                    </tr>
                  ))
                }
              </tbody>
            </table>
        </div>
    </div>
  )
}

export default Cars