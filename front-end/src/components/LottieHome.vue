<template>
  <div>
    <lottie-animation
      path='https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js'
    />
  </div>
</template>

<script>
import LottieAnimation from 'lottie-vuejs/src/LottieAnimation.vue' // import lottie-vuejs
export default {
  name: 'LottieHome',
  components: {
    LottieAnimation
  }
}
</script>

<style scoped>

</style>
