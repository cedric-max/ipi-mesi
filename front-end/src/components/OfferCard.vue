<template>
  <div>
    <div class="container">
      <ul id="example-1" v-for="post in posts"
          :key="post.id">
          <div class="card">
            <div class="card__header">
              <img
                alt="card__image"
                class="card__image"
                src="https://source.unsplash.com/600x400/?work"
                width="600">
            </div>
            <div class="card__body">
              <span class="tag tag-red">work</span>
              <h4>{{ post.titre }} /
                {{ post.niveau_diplome_vise }}</h4>
              <p>
                {{ post.description }}</p>
            </div>
            <div class="card__footer">
              <div class="user">
                <img
                  alt="user__image"
                  class="user__image"
                  src="https://i.pravatar.cc/40?img=2">
                <div class="user__info">
                  <h5>{{
                      post.nom_entreprise
                    }} / {{
                      post.ville
                    }}</h5>
                  <small>{{
                      post.date_fin_validite
                    }}</small>
                </div>
              </div>
            </div>
          </div>
      </ul>
    </div>
  </div>
</template>

<script>
import { HTTP } from '../http-common'

export default {
  name: 'OfferCard',
  data: function () {
    return {
      posts: [],
      errors: []
    }
  },
  created () {
    HTTP.get(`${'offre/'}`)
      .then(response => {
        this.posts = response.data
        console.log(this.posts)
      })
      .catch(e => {
        this.errors.push(e)
      })
  }
}
</script>

<style scoped>

*,
*::before,
*::after {
  box-sizing: border-box;
  padding: 0;
  margin: 0;
}

body {
  font-family: "Quicksand", sans-serif;
  display: grid;
  place-items: center;
  height: 100vh;
  background: #7f7fd5;
  background: linear-gradient(to right, #91eae4, #86a8e7, #7f7fd5);
}

.container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  max-width: 1200px;
  margin-block: 2rem;
  gap: 2rem;
}

img {
  max-width: 100%;
  display: block;
  object-fit: cover;
}

.card {
  display: flex;
  flex-direction: column;
  width: clamp(20rem, calc(20rem + 2vw), 22rem);
  overflow: hidden;
  box-shadow: 0 0.1rem 1rem rgba(0, 0, 0, 0.1);
  border-radius: 1em;
  background: #ece9e6;
  background: linear-gradient(to right, #ffffff, #ece9e6);
}

.card__body {
  padding: 1rem;
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

.tag {
  align-self: flex-start;
  padding: 0.25em 0.75em;
  border-radius: 1em;
  font-size: 0.75rem;
}

.tag + .tag {
  margin-left: 0.5em;
}

.tag-blue {
  background: #56ccf2;
  background: linear-gradient(to bottom, #2f80ed, #56ccf2);
  color: #fafafa;
}

.tag-brown {
  background: #d1913c;
  background: linear-gradient(to bottom, #ffd194, #d1913c);
  color: #fafafa;
}

.tag-red {
  background: #cb2d3e;
  background: linear-gradient(to bottom, #ef473a, #cb2d3e);
  color: #fafafa;
}

.card__body h4 {
  font-size: 1.5rem;
  text-transform: capitalize;
}

.card__footer {
  display: flex;
  padding: 1rem;
  margin-top: auto;
}

.user {
  display: flex;
  gap: 0.5rem;
}

.user__image {
  border-radius: 50%;
}

.user__info > small {
  color: #666;
}
</style>
