<template>
  <div class="base-count">
    <button @click="handleSub">-</button>
    <span>{{ count }}</span>
    <button @click="handleAdd">+</button>
  </div>
</template>

<script>
export default {
  props: {
    count: {
      type: Number,
    },
  },
  methods: {
    handleSub() {
      this.$emit('changeCount', this.count - 1)
    },
    handleAdd() {
      this.$emit('changeCount', this.count + 1)
    },
  },
}
</script>

<style>
.base-count {
  margin: 20px;
}
</style>