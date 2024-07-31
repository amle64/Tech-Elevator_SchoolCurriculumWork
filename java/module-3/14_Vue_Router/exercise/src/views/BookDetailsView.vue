<template>
    <div class="home">
      <BookDetails/>
      
    </div>
  </template>
  
  <script>
import BookDetails from '../components/BookDetails.vue';

  export default {
    name: 'BookDetailsView',
    components: 
    {
        BookDetails
    }
    }</script>
  
  <style scoped>
  .home {
    padding: 20px;
  }
  </style>
  