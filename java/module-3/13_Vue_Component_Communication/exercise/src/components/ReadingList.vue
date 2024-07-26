<template>
  test
  <div class="book-container">
    <book-card v-for="book in $store.state.books" v-bind:key="book">
      
    </book-card>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';

export default {
  components:{
    BookCard
  }  
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>