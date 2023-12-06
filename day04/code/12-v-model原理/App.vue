<template>
  <div class="app">
    <input type="text" v-model="msg1" />
    <br />
    <input type="text" :value="msg2" @input="msg2 = $event.target.value" />
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg1: '',
      msg2: '',
    }
  },
}
</script>

<style>
</style>