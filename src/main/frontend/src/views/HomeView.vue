<script setup>
import { useRoute } from 'vue-router'
import Login from "../components/Login.vue"

// const router = createRouter({ history: createWebHistory(import.meta.env.BASE_URL),})

</script>

<template>
    <main>
        <Login />
    </main>

</template>



<style lang="scss" scoped>

main{
    display: flex;
    width: 100%;
    height: 100vh;
    background-image: url("../assets/img/porti3.jpg");
    background-repeat: no-repeat;
    background-size: cover;
}
 


</style>
