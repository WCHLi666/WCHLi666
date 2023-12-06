<script setup>
import { onMounted } from 'vue';
const getList = () => {
  setTimeout(() => {
    console.log('发送请求，获取数据')
  }, 2000)
}
getList()
onMounted(() => {
  console.log('mounted生命周期函数 - 逻辑1')
})
onMounted(() => {
  console.log('mounted生命周期函数 - 逻辑2')
})
</script>
<template>
  <div></div>
</template>