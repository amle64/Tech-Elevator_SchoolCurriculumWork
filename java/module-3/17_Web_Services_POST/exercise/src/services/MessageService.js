import axios from 'axios';

const http = axios.create({
  baseURL: import.meta.env.VITE_REMOTE_API
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },
  post(item){
    return http.post(`/messages`,item);
  },
  update(item){
    return http.put(`/messages/${item.id}`,item);
  },
  delete(item){
    return http.delete(`/messages/${item.id}`);
  }

}
