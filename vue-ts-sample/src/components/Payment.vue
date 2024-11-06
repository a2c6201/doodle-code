<script setup lang="ts">
import { ref, reactive, computed, toRef, toRefs, watch } from 'vue'

// const itemName1 = ref<string>('Bike')
const itemName2 = 'Desk'

// オブジェクトをリアクティブな値にしたい場合、reactiveを使う
const item1 = reactive({
  name: 'Desk',
  price: 40000,
})

// 変数をリアクティブな値にしたい場合、refを使う
// const price1 = ref(40000)
const price2 = ref(20000)

const url1 = 'https://www.amazon.co.jp/ref=nav_logo'
const url2 = 'https://www.amazon.co.jp/ref=nav_logo'

const buy = (itemName: string) => {
  alert('Are you sure to buy ' + itemName + '?')
}

const clear = () => {
  item1.name = ''
  item1.price = 0
}

const budget = 50000

// リアクティブに処理を行ってほしいときはcomputedを設定する
// computedを使わなくても実装はできる
// だが使うことでvueの方でキャッシュしてくれたりして動作が軽くなる
// 公式では使うことが推奨されている
// const priceLabel = computed(() => {
//   return item1.price <= 50000 ? item1.price + ' yen' : 'too expensive'
// })

const priceLabel = ref<string>(item1.price + 'yen')
const { price } = toRefs(item1)
// 第一引数に取った変数を監視し、変更があるたびに第2引数の関数を走らせる
// 一般的にはcomputedで事足りる事が多い
watch(price, () => {
  if (budget * 2 < price.value) {
    priceLabel.value = 'too expensive...'
  } else if (budget < price.value) {
    priceLabel.value = 'expensive'
  } else {
    priceLabel.value = price.value + 'yen'
  }
})
</script>

<template>
  <div class="container">
    <h1>最近の支出</h1>
    <input v-model="item1.name" />
    <input v-model="item1.price" />
    <button v-on:click="clear">Clear</button>
    <div class="payment">
      <label>{{ item1.name }}</label>
      <label>{{ priceLabel }}</label>
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
