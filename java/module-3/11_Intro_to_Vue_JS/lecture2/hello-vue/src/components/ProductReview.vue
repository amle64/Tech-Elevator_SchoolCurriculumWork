<template>
    <div class = "main">
        <h2>Product Reviews for {{ name }} </h2>
        <p class = "description" >
            {{ description }}
        </p>
        <div class = "review"
         v-for='review in reviews'
         v-bind:key='review.id'
         >
            
            <h4> {{ review.reviewer }}</h4>   
            <img src="src\assets\star.png" 
            alt="" 
                class = "ratingStar"
                v-for="n in review.rating"
                v-bind:key="n">
                
            <h3> {{ review.title }}</h3>
            <p> {{ review.review }}</p>
        </div>

        
    </div>
</template>

<script>
export default{
    name: 'product-review',
    data(){
        return {
            name: 'Head First Design Patterns',
            description: 'A brain friendly guide to building extensible and maintainable object-oriented software.',
            reviews: [
                {
                    id: 1000,
                    reviewer: 'R Perez',
                    title: 'Approachable pattern guide',
                    review: 4,
                    favorited: false
                },
                {
                    id: 1001,
                    reviewer: "Tim Ferriss",
                    title: "Had a cigar party started in less than 4 hours.",
                    review: "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4,
                    favorited: false
                },
                {
                    id: 1002,
                    reviewer: "Ramit Sethi",
                    title: "What every new entrepreneurs needs. A door stop.",
                    review: "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1,
                    favorited: false
                },
                {
                    id: 1003,
                    reviewer: "Gary Vaynerchuk",
                    title: "And I thought I could write",
                    review:"There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3,
                    favorited: false
                }
            ]
        }
    }
}
</script>

<style scoped>

</style>