<script setup>
import CenterCom from '@/components/center-com.vue'
import { provide, ref } from 'vue'

provide('theme-color', 'pink')

const count = ref(100)
provide('count', count)

setTimeout(() => {
  count.value = 500
}, 2000)

provide('changeCount', (newCount) => {
  count.value = newCount
})

</script>

<template>
<div>
  <h1>我是顶层组件</h1>
  <CenterCom></CenterCom>
</div>
</template>



