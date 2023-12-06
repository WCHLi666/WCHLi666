<script setup>
import { ref } from 'vue'
import SonCom from '@/components/son-com.vue'

const money = ref(100)
const getMoney = () => {
  money.value += 10
}
const changeFn = (newMoney) => {
  money.value = newMoney
}
</script>

<template>
  <div>
    <h3>
      父组件 - {{ money }}
      <button @click="getMoney">挣钱</button>
    </h3>
    <SonCom 
      @changeMoney="changeFn"
      car="宝马车" 
      :money="money">
    </SonCom>
  </div>
</template>