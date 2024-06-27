import UserModel from "../models/user.js"
import jwt from 'jsonwebtoken'
import bcryptjs from 'bcryptjs'
export const Register = async (req, res) => {
    try {
        const { name, email, password } = req.body;

        // Check if all fields are provided
        if (!name || !email || !password) {
            return res.status(400).json({ success: false, message: "All fields are required" });
        }

        const existUser = await UserModel.findOne({ email });
        if (existUser) {
            return res.status(401).json({ success: false, message: "User already exists" });
        }

        const hashedPassword = bcryptjs.hashSync(password, 10);
        const newUser = new UserModel({
            name,
            email,
            password: hashedPassword
        });

        await newUser.save();

        res.status(200).json({ message: "User registered successfully", newUser });
    } catch (error) {
        res.status(500).json({ success: false, message: "Internal server error" });
        console.log(error);
    }
};


export const Login = async (req, res) => {
    try {
        const { email, password } = req.body

        const user = await UserModel.findOne({ email })

        if (!user) {
            return res.status(404).json({ success: false, message: "Invalid credentials" })
        }

        const ispassaowrdValid = await bcryptjs.compare(password, user.password)
        if (!ispassaowrdValid) {
            return res.status(404).json({ success: false, message: "Invalid credentials" })

        }
        const token = jwt.sign({ userId: user._id }, process.env.JWT_SECRETE)

        res.cookie('token', token, {
            httpOnly: true,
            secure: false,
            maxAge: 3600000,

        })
        res.status(200).json({ success: true, message: "Login successfully", user, token })

    } catch (error) {
        res.status(500).json({ success: false, message: "interanl server ereo" })
        console.log(error)
    }
}
export const Logout = async (req, res) => {
    try {
        res.clearCookie('token')
        res.status(200).json({ message: "user Logout successfully" })
    } catch (error) {
        res.status(500).json({ success: false, message: "interanl server ereo" })
        console.log(error)
    }
}
export const CheckUser = async (req, res) => {
    try {
        const user = req.user
        if (!user) {
            res.status(404).json({ message: 'User not found' })
        }
        res.status(200).json(user)


    } catch (error) {
        res.status(500).json({ message: "internal server error" })
        console.log(error)

    }
}