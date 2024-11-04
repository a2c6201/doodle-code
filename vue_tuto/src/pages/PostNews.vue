// PostNews.vue
<script setup>
import { ref } from 'vue'

const text = ref('')

// function onInput(e) {
//   text.value = e.target.value
// }
</script>

<template>
  <input v-model="text" placeholder="Type here" maxlength="5">
  <p>{{ text }}</p>
</template>
