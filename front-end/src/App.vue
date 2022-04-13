<template>
  <v-app>
    <!-- Must have the app property -->
    <v-app-bar app></v-app-bar>
    <v-main>
      <v-container>
        <router-view></router-view>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
// @ is an alias to /src
// import Navbar from './components/NavBar.vue'
export default {
  name: 'Home',
  components: {}
}
</script>

<style>

</style>
