<template>
    <div class="home">
      <BestSellerList/>
      <NewReleasesList/>
      <ReadingList/>
    </div>
  </template>
  
  <script>
import BestSellerList from '../components/BestSellerList.vue';
import NewReleasesList from '../components/NewReleasesList.vue';

import ReadingList from '../components/ReadingList.vue';

  export default {
    name: 'HomeView',
    components: 
    {
        BestSellerList,
        NewReleasesList,
        ReadingList
    }
    }</script>
  
  <style scoped>
  .home {
    padding: 20px;
  }
  </style>
  