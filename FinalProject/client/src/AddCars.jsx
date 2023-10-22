import React, { useState } from 'react'
import axios from 'axios'
const AddCars = () => {
    const [car,setCar]=useState({
        name:"",
        brand:"",
        model:"",
        plaka:"",
        year:""
    })

    const handleSubmit=(e)=>{
        e.preventDefault()
        axios.post("http://localhost:3000/auth/add_car",car)
        .then(result=>console.log(result.data))
        .catch(err=>console.log(err))
    }
  return (
    <div className="d-flex justify-content-center align-items-center mt-3">
    <div className="p-3 rounded w-75">
      <h3 className="text-center">Add Car</h3>
      <form className="row g-1" onSubmit={handleSubmit}>
        <div className="col-12">
          <label htmlFor="inputName" className="form-label">
            Car Name
          </label>
          <input
            type="text"
            className="form-control rounded-0"
            id="inputName"
            placeholder="Enter Car Name"
            onChange={(e) =>
              setCar({ ...car, name: e.target.value })
            }
          />
        </div>
        <div className="col-12">
          <label htmlFor="inputMarka" className="form-label">
            Marka
          </label>
          <input
            type="text"
            className="form-control rounded-0"
            id="inputMarka"
            placeholder="Enter Brand"
            onChange={(e) =>
              setCar({ ...car, brand: e.target.value })
            }
          />
        </div>
        <div className="col-12">
          <label htmlFor="inputPlaka" className="form-label">
            Plaka
          </label>
          <input
            type="text"
            className="form-control rounded-0"
            id="inputPlaka"
            placeholder="Enter Plaka"
            onChange={(e) =>
              setCar({ ...car, plaka: e.target.value })
            }
          />
        </div>
        <div className='col-12'>
            <label htmlFor="inputModel" className="form-label">
                Model
            </label>
            <input
                type="text"
                className="form-control rounded-0"
                id="inputModel"
                placeholder="Enter Model"
                onChange={(e) =>
                  setCar({ ...car, model: e.target.value })
                }
            />
        </div>
        <div className="col-12">  
          <label htmlFor="inputYear" className="form-label">
            Year
          </label>
          <input
            type="text"
            className="form-control rounded-0"
            id="inputYear"
            placeholder="Enter Year"
            onChange={(e) =>
              setCar({ ...car, year: e.target.value })
            }
          />
        </div>
        <div className="col-12">
          <button type="submit" className="btn btn-primary w-100 mt-2">
            Add Car
          </button>
        </div>
      </form>
    </div>
  </div>
  )
}

export default AddCars