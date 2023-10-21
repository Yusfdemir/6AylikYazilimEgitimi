import mysql from "mysql"

const con=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"",
    database:"car-management"
})

con.connect(function (err){
    if(err){
        console.log("connection error is :",err)
    }
    else{
        console.log("Connected")
    }
})

export default con;