<template>
    <form v-on:submit.prevent="saveNewBookForm" class="new-book-form">
        <label for="title"> Title</label>
        <input type="text" v-model="newBook.title" class="title-input" id="title" required>
        <label for="author">Author</label>
        <input type="text" v-model="newBook.author" class="author-input" id="author" required>
        <label for="isbn">ISBN</label>
        <input type="text" v-model="newBook.isbn" class = "isbn-input" required>
        <button type="submit">Submit</button>
    </form>
</template>

<script>
export default{
    data(){
        return{
            newBook:{
                title:'',
                author:'',
                isbn:''
            }
        };
    },
    methods: {
        saveNewBookForm() {
        if (this.newBook.title && this.newBook.author && this.newBook.isbn) {
        // Commit the new book to the Vuex store
        this.$store.commit('addNewBook', this.newBook);

        // Clear the form
        this.newBook = {
          title: '',
          author: '',
          isbn: ''
        };
      } 
    
  }
    }
}

</script>

<style>
.new-book-form {
  display: flex;
  flex-direction: column;
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 5px;
}

.title-input,
.author-input,
.isbn-input {
  margin-bottom: 10px;
  padding: 8px;
  font-size: 16px;
}

button {
  padding: 10px;
  font-size: 16px;
}
</style>