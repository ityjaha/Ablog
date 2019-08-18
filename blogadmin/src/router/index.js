import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import ArticlesList from '@/views/articles/ArticlesList'
import ArticlesEdit from '@/views/articles/ArticlesEdit'
import Login from '@/views/login/Login'
import Container from '@/views/Container'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      redirect: '/login'
    },
    {
      path: '/home',
      name: 'home',
      component: Container,
      children: [
        {
          path: '/articlesList',
          name: 'articlesList',
          component: ArticlesList
        },{
          path: '/articlesEdit',
          name: 'articlesEdit',
          component: ArticlesEdit
        }
      ]
    },{
      path: '/login',
      name: 'login',
      component: Login
    }
  ]
})
