import {useEffect, useState} from 'react'
import { useParams } from 'react-router-dom'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'

const EditCar = () => {
    const {id}=useParams()
    const navigate=useNavigate();
    const [car,setCar]=useState({
        name:"",
        brand:"",
        model:"",
        plaka:"",
        year:""
    })
    useEffect(()=>{
        axios.get(`http://localhost:3000/auth/car/${id}`)
        .then(result=>{
           setCar({
            ...car,
            name:result.data.Result[0].name,
            brand:result.data.Result[0].brand,
            model:result.data.Result[0].model,
            plaka:result.data.Result[0].plaka,
            year:result.data.Result[0].year,
           })
        })
        .catch(err=>{console.log(err)})
    },[])

    const handleSubmit=(e)=>{
        e.preventDefault()
        console.log(car)
        axios.put(`http://localhost:3000/auth/edit_car/${id}`,car)
        .then(result=>{
            if(result.data.Status){
                navigate("/dashboard")
            }else{
                alert(result.data.Error)
            }
        })
        .catch(err=>{
            console.log(err)
        })
    }
  return (
    <div className="d-flex justify-content-center align-items-center mt-3">
    <div className="p-3 rounded w-75">
      <h3 className="text-center">Edit Car</h3>
      <form className="row g-1" 
       onSubmit={handleSubmit}
      >
        <div className="col-12">
          <label htmlFor="inputName" className="form-label">
            Car Name
          </label>
          <input
                type="text"
                className="form-control rounded-0"
                id="inputName"
                placeholder="Enter Car Name"
                value={car.name}
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
                value={car.brand}
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
                value={car.plaka}
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
                value={car.model}
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
                value={car.year}
                onChange={(e) =>
                setCar({ ...car, year: e.target.value })
                }
          />
        </div>
        <div className="col-12">
          <button type="submit" className="btn btn-primary w-100 mt-2">
            Edit Car
          </button>
        </div>
      </form>
    </div>
  </div>
  )
  
}

export default EditCar