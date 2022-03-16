<template>
  <div class="home">
    <JumbotronHome></JumbotronHome>
    <b-container class="bv-example-row">
      <b-row>
        <OfferCard class="col-12"></OfferCard>
      </b-row>
    </b-container>
  </div>
</template>

<script>
// @ is an alias to /src
import JumbotronHome from '@/components/JumbotronHome.vue'
import OfferCard from '@/components/OfferCard.vue'

export default {
  name: 'Home',
  components: {
    JumbotronHome,
    OfferCard
  }
}
</script>
