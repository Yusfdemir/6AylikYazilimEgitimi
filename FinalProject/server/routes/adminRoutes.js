import express from "express";
import con from "../utils/db.js";
import jwt from "jsonwebtoken";

const router = express.Router();

router.post("/adminLogin", (req, res) => {
  const sql = "SELECT * from admin Where email = ? and password = ?";
  con.query(sql, [req.body.email, req.body.password], (err, result) => {
    if (err) return res.json({ loginStatus: false, Error: "Query error" });
    if (result.length > 0) {
      const email = result[0].email;
      const token = jwt.sign(
        { role: "admin", email: email },
        "jwt_secret_key",
        { expiresIn: "1d" },
      );
      res.cookie('token',token)
      return res.json({ loginStatus: true });
    }
    else{
        return res.json({ loginStatus: false, Error: "Wrong email or password" });
    }
    
  });
});

router.post("/add_car",(req,res)=>{
  const sql=`INSERT INTO cars (name,brand,model,plaka,year) VALUES(?)`;
  const values=[
    req.body.name,
    req.body.brand,
    req.body.model,
    req.body.plaka,
    req.body.year
  ]
  con.query(sql,[values],(err,result)=>{
      if(err) return res.json({Status:false,Error:"Query Error"})
    return res.json({Status:true})
  })
})

router.get("/cars",(req,res)=>{
    const sql="SELECT * FROM cars";
    con.query(sql,(err,result)=>{
      if(err) res.json({Status:false,Error:"Query Error"})
      return res.json({Status:true,Result:result})
    })
})

export { router as adminRouter };
