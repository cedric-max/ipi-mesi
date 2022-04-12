<template>
  <header>
    <div class="container py-5 my-5">
      <div class="jumbotron text-white jumbotron-image shadow my-5 rounded shadow-lg" style="background-image: url(https://images.unsplash.com/photo-1552152974-19b9caf99137?fit=crop&w=1350&q=80);">
        <h1 class="my-5">
          Numer'Alt
        </h1>
        <p class="my-5">
          Hey, check this out.
        </p>
        <a href="https://bootstrapious.com/snippets" class="btn btn-primary">More Bootstrap Snippets</a>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: 'JumbotronHome'
}
</script>

<style scoped>
.jumbotron-image {
  background-position: center center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
