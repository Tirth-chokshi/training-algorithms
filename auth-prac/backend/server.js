import express from 'express'
import dotenv from 'dotenv'
import cors from 'cors'
import DB from './utils/db.js'
import router from './routes/auth.js'
import cookieParser from 'cookie-parser'


dotenv.config()
const PORT = process.env.PORT
const app = express()

app.use(express.json())
app.use(cors())
app.use(cookieParser())


app.use('/api/auth',router)
app.listen(PORT, () => {
    DB()
    console.log(`Server is listening to ${PORT}`)
})