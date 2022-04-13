<template>
  <v-container>
      <v-app id="inspire">
        <v-hover v-slot="{ hover }">
        <v-card
          class="mx-auto"
          max-width="auto"
          outlined
          :elevation="hover ? 12 : 2"
        >
          <v-list-item three-line>
            <v-list-item-content>
              <div
                class="text-overline mb-4">
                {{ville}}
              </div>
              <v-list-item-title
                class="text-h5 mb-1">
                {{entreprise}}
              </v-list-item-title>
              <v-list-item-subtitle>
                {{titre}}
                toto
              </v-list-item-subtitle>
            </v-list-item-content>

            <v-list-item-avatar
              color="grey"
              size="60"
              tile
            ></v-list-item-avatar>
          </v-list-item>

          <v-card-actions>
            <v-btn
              color="secondary"
              elevation="2"
              class="ma-2"
              v-on:click="test()"
              rounded
              :to="{name: 'offer', params: {id: offerId } }">
              Détails
            </v-btn>
          </v-card-actions>
        </v-card>
        </v-hover>
      </v-app>
  </v-container>
</template>

<script>

export default {
  name: 'OfferCard',
  props: {
    titre: String,
    ville: String,
    entreprise: String,
    dateCreation: String,
    offerId: Number

  },
  methods: {
    test: function () {

    }
  }
}
</script>

<style lang="sass" scoped>

</style>
