<template>
  <section id="app">
    <TodoHeader @add="handleAdd"></TodoHeader>
    <TodoMain :list="list" @del="handelDel"></TodoMain>
    <TodoFooter :list="list" @clear="clear"></TodoFooter>
  </section>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue'
import TodoMain from './components/TodoMain.vue'
import TodoFooter from './components/TodoFooter.vue'

export default {
  data() {
    return {
      list: JSON.parse(localStorage.getItem('list')) || [
        { id: 1, name: '打篮球' },
        { id: 2, name: '看电影' },
        { id: 3, name: '逛街' },
      ],
    }
  },
  components: {
    TodoHeader,
    TodoMain,
    TodoFooter,
  },
  watch: {
    list: {
      deep: true,
      handler(newVal) {
        localStorage.setItem('list', JSON.stringify(newVal))
      },
    },
  },
  methods: {
    handleAdd(todoName) {
      this.list.unshift({
        id: +new Date(),
        name: todoName,
      })
    },
    handelDel(id) {
      this.list = this.list.filter((item) => item.id !== id)
    },
    clear() {
      this.list = []
    },
  },
}
</script>

<style>
</style>