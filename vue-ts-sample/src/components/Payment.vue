<script setup lang="ts">
const itemName1 = 'Bike'
const itemName2 = 'Desk'

const price1 = 40000
const price2 = 20000

const url1 = 'https://www.amazon.co.jp/ref=nav_logo'
const url2 =
  'https://www.amazon.co.jp/%E6%95%8F%E6%84%9F%E3%81%99%E3%81%8E%E3%82%8B%E7%A7%81%E3%81%AE%E6%B4%BB%E3%81%8B%E3%81%97%E6%96%B9-%E9%AB%98%E6%84%9F%E5%BA%A6%E3%81%8B%E3%82%89%E6%89%8D%E8%83%BD%E3%82%92%E5%BC%95%E3%81%8D%E5%87%BA%E3%81%99%E7%99%BA%E6%83%B3%E8%A1%93-%E3%82%A8%E3%83%AC%E3%82%A4%E3%83%B3%E3%83%BBN%E3%83%BB%E3%82%A2%E3%83%BC%E3%83%AD%E3%83%B3-ebook/dp/B08F9RFZ3K/?_encoding=UTF8&pd_rd_w=U0sP7&content-id=amzn1.sym.3b2bb6b9-5af8-49d2-a583-fb6c1fc7cca5&pf_rd_p=3b2bb6b9-5af8-49d2-a583-fb6c1fc7cca5&pf_rd_r=S0E6MPC5X71G2EBHNE1D&pd_rd_wg=WowU0&pd_rd_r=53ea29b2-0263-4e37-b2f8-e4b6f12400b2&ref_=pd_hp_d_btf_reads_byrv2_pncv2'
</script>

<template>
  <div class="container">
    <h1>最近の支出</h1>
    <div class="payment">
      <label>{{ itemName1 }}</label>
      <label>{{ price1 }}</label>
      <a v-bind:href="url1">bought at ...</a>
    </div>
    <div class="payment">
      <label>{{ itemName2 }}</label>
      <label>{{ price2 }}</label>
      <a v-bind:href="url1">bought at ...</a>
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

label {
  font-size: 20px;
}
</style>
