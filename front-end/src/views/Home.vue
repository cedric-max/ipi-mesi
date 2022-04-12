<template>
  <div class="home">
    <JumbotronHome></JumbotronHome>
    <v-item-group>
      <v-container>
        <v-row>
          <v-col
            v-for="post in posts"
            :key="post.id"
            cols="4"
            md="4"
            sm="6"
          >
            <OfferCard  v-bind:titre="post.titre" v-bind:ville="post.ville" v-bind:entreprise="post.nom_entreprise" v-bind:description="post.description" v-bind:offerId="post.id_offre"></OfferCard>
          </v-col>
        </v-row>
      </v-container>
    </v-item-group>
  </div>
</template>

<script>
import { HttpAllOffers } from '../http-common'

// @ is an alias to /src
import JumbotronHome from '@/components/JumbotronHome.vue'
import OfferCard from '@/components/OfferCard.vue'

export default {
  name: 'Home',
  data: function () {
    return {
      posts: [],
      errors: []
    }
  },
  components: {
    JumbotronHome,
    OfferCard
  },
  created () {
    HttpAllOffers.get(`${'offre/'}`)
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
