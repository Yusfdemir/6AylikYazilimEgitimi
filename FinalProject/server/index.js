import  express  from "express";
import cors from "cors"
import { adminRouter } from "./routes/adminRoutes.js";

const app=express();
app.use(cors({
    origin:["http://127.0.0.1:5173"],
    methods:['GET','POST','PUT'],
    credentials:true
}))
app.use(express.json())
app.use('/auth',adminRouter)

app.listen(3000,()=>{
    console.log("server is running")
})