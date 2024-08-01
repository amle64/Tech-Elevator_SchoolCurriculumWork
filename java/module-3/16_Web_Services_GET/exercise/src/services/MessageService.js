import axios from 'axios';

const BASE_URL = 'http://localhost:3000';

const http = axios.create({
    baseURL: "http://localhost:3000"
})
export default {
    
    getMessage(messageId){
        return http.get(`/messages/${messageId}`);
    }
}