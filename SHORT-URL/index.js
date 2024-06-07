import express from 'express'
import urlRoute from './routers/routes.js'
import mongoose from 'mongoose'
const app = express()
const PORT = 8001
app.use(express.json())
app.use('/url', urlRoute)
app.get('/:shortID', async (req, res) => {
    const shortId = req.params.shortId
    const entry = await URL.findOneAndUpdate(
        {
            shortId,
        }, {
        $push: {
            visitHistroy: {
                timestamp: Date.now()
            },
        },
    },
    )
    res.redirect(entry.redirectURL)
})

mongoose.connect()
    .then(() => {
        console.log('Database connected successfully');
        app.listen(PORT, () => {
            console.log(`Server is listening on port ${PORT}`);
        });
    })
    .catch((err) => {
        console.error('Error connecting to MongoDB:', err);
    });