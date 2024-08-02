import axios from 'axios';

const http = axios.create({
  baseURL: import.meta.env.VITE_REMOTE_API
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },
  post(item){
    return http.post(`/topics`,item);
  },
  update(item){
    return http.put(`/topics/${item.id}`,item)
  },
  delete(item){
    return http.delete(`/topics/${item.id}`)
  }
}
