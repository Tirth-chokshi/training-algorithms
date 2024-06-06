import express from 'express'
import { handleGenerateNewShortURL } from '../controllers/url.js'
const router = express.Router()

export default router.post('/', handleGenerateNewShortURL)