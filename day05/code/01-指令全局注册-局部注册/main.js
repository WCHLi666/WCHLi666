import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

// Vue.directive('focus',{
//   instead (el){
//     console.log(el);
//   }
// })

new Vue({
  render: h => h(App),
}).$mount('#app')
