<template>
    <h2 :book="specificBook">{{ book.title }}</h2>
    <h2 :book="specificBook">{{ book.author }}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h2>{{ book.numPages }}</h2>
    <a href="moreInfoURL" target="_blank">More Information</a>
</template>
  


<script>

  export default {
    name: 'BookDetails',
    data(){
            return {
                book:null,
            };
    },
    created() {
    const bookId = this.$route.params.isbn;
    this.book = this.$store.state.books.find(book => book.isbn === bookId);
    },
    computed:{
        moreInfoUrl() {
      // Generate the URL based on existing book properties.
      return `https://example.com/more-info/${this.book.isbn}`;
    }
    }
    
    
  }
  </script>
  
  <style>
    .book-detail{
        padding: 20px;
    }
  </style>