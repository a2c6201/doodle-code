<script setup lang="ts">
import { ref, reactive } from 'vue'

// const itemName1 = ref<string>('Bike')
const itemName2 = 'Desk'

const item1 = reactive({
  name: 'Desk',
  price: 40000,
})

// const price1 = 40000
const price2 = 20000

const url1 = 'https://www.amazon.co.jp/ref=nav_logo'
const url2 = 'https://www.amazon.co.jp/ref=nav_logo'

const buy = (itemName: string) => {
  alert('Are you sure to buy ' + itemName + '?')
}

const clear = () => {
  item1.name = ''
  item1.price = 0
}
</script>

<template>
  <div class="container">
    <h1>最近の支出</h1>
    <input v-model="item1.name" />
    <input v-model="item1.price" />
    <button v-on:click="clear">Clear</button>
    <div class="payment">
      <label>{{ item1.name }}</label>
      <label>{{ item1.price }}</label>
      <a v-bind:href="url1">bought at ...</a>
      <button v-on:click="buy(item1.name)">Buy</button>
    </div>
    <div class="payment">
      <label>{{ itemName2 }}</label>
      <label>{{ price2 }}</label>
      <a v-bind:href="url1">bought at ...</a>
      <button v-on:click="buy(itemName2)">Buy</button>
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.payment {
  display: flex;
  justify-content: space-between;
  height: 80px;
  width: 400px;
  margin-bottom: 8px;
}

input {
  margin-bottom: 8px;
}

label {
  font-size: 20px;
}
</style>
