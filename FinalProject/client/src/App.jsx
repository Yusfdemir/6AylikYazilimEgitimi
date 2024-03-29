import './App.css'
import Login from './components/Login'
import Dashboard from './components/Dashboard'
import {BrowserRouter,Routes,Route} from "react-router-dom"
import Home from './components/Home'
import ChangePassword from './components/ChangePassword'
import AddCars from './AddCars'
import EditCar from './components/EditCar'
import PrivateRoute from './components/PrivateRoute'

function App() {
  

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Login/>}/>
        <Route path='/dashboard' element={<PrivateRoute><Dashboard/></PrivateRoute>}>
          <Route path='' element={<Home/>}/>
          {/* <Route path='/dashboard/cars' element={<Cars/>}/> */}
          <Route path='/dashboard/change-password' element={<ChangePassword/>}/>
          <Route path='/dashboard/add_car' element={<AddCars/>}/>
          <Route path='/dashboard/edit_car/:id' element={<EditCar/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
