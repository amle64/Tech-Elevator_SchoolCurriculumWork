<template>
  <div id="book-app">
    <nav class ="terms">
        <ol>
            <router-link class="term" :to="{name: 'home'}" id="home">Home</router-link>
            <router-link class="term" :to="{name: 'myBooks'}" id="myBooks">My Books</router-link>
        

        </ol>
      </nav>
    <router-view />
    <nav class = "terms">
        <router-link class="term" :to="{name: 'newBookForm'}">Add Book to Reading List</router-link>
      
    </nav>
    
  </div>
</template>

<script>

export default {
  
}
</script>

<style>
#book-app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}

.terms ol{
  list-style-type: none;
  padding-left:0;
}

.term:not(:last-child)::after{
  display: inline-block;
  color: #000;
  content: '>';
  font-size: 80%;
  font-weight: bold;
  padding: 0 3px;
}

.term:hover {
  color: #42b983;
}
</style>
