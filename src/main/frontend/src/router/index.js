import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Homeview',
      component: HomeView
    },
    {
      path: '/profileview',
      name: 'Profileview',
      component: () => import('../views/ProfileView.vue')
    }
    
  ]
})

export default router
