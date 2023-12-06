<script setup>
import { ref ,watch } from 'vue'
const count = ref(0)
const nickname = ref('张三')

const changeCount = () => {
  count.value++
}
const changeNickname = () => {
  nickname.value = '李四'
}
const userInfo = ref({
  name: 'zs',
  age: 18
})
const setUserInfo = () => {
  userInfo.value.age++
}
watch(() => userInfo.value.age, (newValue, oldValue) => {
  console.log(newValue, oldValue)
})
</script>
<template>
  <div>{{ count }}</div>
  <button @click="changeCount">改数字</button>
  <div>{{ nickname }}</div>
  <button @click="changeNickname">改昵称</button>
  <div>-----------------------</div>
  <div>{{ userInfo }}</div>
  <button @click="setUserInfo">修改userInfo</button>
</template>