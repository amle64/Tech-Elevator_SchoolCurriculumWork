<template>
  <div :class = "cardClass">
    <h2 class="book-title">{{ book.title }}</h2>
    <h3 class="book-author">{{ book.author }}</h3>
    <img class="book-image" :src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" alt="Book cover image" />
    <br>
    
    <button @click="toggleReadStatus" :class="buttonClass">{{book.read? 'Mark Unread':'Mark Read'}}</button>
  </div>
</template>

<script>
export default {
  props: {
    book: {
      type: Object,
      required: true
    }
  },
  methods:{
    
    toggleReadStatus(bookId){
      
        this.$store.commit('updateReadStatus',{
          isbn:this.book.isbn
        });
        console.log(this.book)
      }
    },
    computed:{
      cardClass(){
        return {
          'card':true,
          'read':this.book.read,
          'unread':!this.book.read

        }
      },
      buttonClass(){
        return{
          'mark-read':this.book.read,
          'mark-unread':!this.book.read
        }
      }
    }
  }

</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
  position: relative;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}

.book-image {
  width: 80%;
}

.mark-read, .mark-unread {
  display: block;
  position: absolute;
  bottom: 40px;
  width: 80%;
  left: 10%;
  font-size: 1rem;
}
</style>
