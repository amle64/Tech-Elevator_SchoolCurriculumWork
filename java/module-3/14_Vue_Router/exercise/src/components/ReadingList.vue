<template>
  <div class="book-container">
    <book-card v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.isbn" @show-detail="viewBookDetail"/>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';

export default {
  components: {
    BookCard
  },
  methods:{
    viewBookDetail(book){
      this.$router.push({name: 'bookDetail',params:{isbn:book.isbn}});
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