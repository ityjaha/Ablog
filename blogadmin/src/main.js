// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import Vuex from 'vuex'
import 'es6-promise/auto'
import App from './App'
import router from './router'
import axios from 'axios'
import ElementUI from 'element-ui' //element-ui的全部组件
import 'element-ui/lib/theme-chalk/index.css'//element-ui的css
import StoreLocal from 'storejs';
Vue.use(ElementUI) //使用elementUI
Vue.use(Vuex)

Vue.config.productionTip = false
Vue.prototype.$http=axios.create({
	baseURL:'http://localhost:8020/api'
})
Vue.prototype.$storeLocal = StoreLocal
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
