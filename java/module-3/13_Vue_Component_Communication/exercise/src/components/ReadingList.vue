<template>
  test
  <div class="book-container">
    <book-card v-for="book in books" v-bind:key="book" v-bind:book="book">
      
    </book-card>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';


export default {
  components:{
    BookCard
  },
  computed: {
    books() {
      return this.$store.state.books;

    }
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