<template>
    <div class="home">
      
        <NewBookForm/>

      
    </div>
  </template>
  
  <script>
import NewBookForm from '../components/NewBookForm.vue';

  export default {
    name: 'NewBookView',
    components: 
    {
        NewBookForm
    }
    }</script>
  
  <style scoped>
  .home {
    padding: 20px;
  }
  </style>
  