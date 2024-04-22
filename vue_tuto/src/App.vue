<template>
  <img alt="Vue logo" src="./assets/logo.png">
      <header>
      <ul class="nav">
        <li><RouterLink to="/">Posts</RouterLink></li>
        <li><RouterLink to="/news">News</RouterLink></li>
        <li><router-link to="/about">About</router-link></li>
      </ul>
    </header>
  <RouterView/>
  <TheButton/>
</template>

<script>
import TheButton from './components/TheButton.vue'

export default {
  name: 'App',
  components: {
    TheButton
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.nav li{
  display: inline-block;
  margin:10px;
}
</style>
