<template>
    <div class="home">
      
        <ReadingList/>

      
    </div>
  </template>
  
  <script>
import ReadingList from '../components/ReadingList.vue';

  export default {
    name: 'MyBooksView',
    components: 
    {
        ReadingList
    }
    }</script>
  
  <style scoped>
  .home {
    padding: 20px;
  }
  </style>
  