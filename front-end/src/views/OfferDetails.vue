<template>
  <v-container>
    <v-col cols="12">
      <v-img
        contain
        lazy-src="https://picsum.photos/id/11/10/6"
        max-height="300"
        max-width="500"
        src="https://picsum.photos/id/11/500/300"
      ></v-img>
    </v-col>
    <p class="m-12">{{offer.titre}}</p>
    <p class="m-12">{{offer.date_creation}}</p>
    <p class="m-12">{{offer.date_fin_validite}}</p>
    <p class="m-12">{{offer.description}}</p>
    <p class="m-12">{{offer.niveau_diplome_vise}}</p>
    <p class="m-12">{{offer.nom_entreprise}}</p>
    <p class="m-12">{{offer.ville}}</p>
  </v-container>
</template>

<script>
import {
  HttpDetailsOffer
} from '../http-common'

export default {
  name: 'OfferDetails',
  data: function () {
    return {
      offer: Object
    }
  },
  created () {
    const offerId = this.$route.params.id
    console.log(this.$route.params.id)
    HttpDetailsOffer.get(`${offerId}`)
      .then(response => {
        this.offer = response.data
        console.log(this.offer)
      })
      .catch(e => {
        this.errors.push(e)
      })
  }
}
</script>

<style scoped>

</style>
