<script setup>
import { ref } from 'vue';
// import { useAuthStore } from '../stores/authStore';
import { useRouter } from 'vue-router';
const router = useRouter();
const shotList = ()=>{
router.push('/profileview')
}

</script>



<template>
    <div class="mainContainer">
        <div class="microheader">
            
                <img class="logo" src="../assets/img/Captura de pantalla (138).png" alt="">
            
            <label for="username"><span> * </span>Nombre de usuario</label>
            <input v-model="userName" type="text" class="form-control" id="name" required style="border-radius: 8px;">
            <div class="contra">
                <label for="password"><span> * </span>Contraseña</label>
            </div>
            <input v-model="password" type="password" class="form-control form-control" id="password" required
                style="border-radius: 8px;">
            <!-- <v-btn>Button</v-btn> -->

            <button class="btn btn-primary hvr-grow" @click="shotList">
                Pincha aqui
            </button>
        </div>
        <div class="imagen1">
            <img class="uno" src="../assets/img/fotter1.jpg" alt="">
            <img class="dos" src="../assets/img/fotter2.jpg" alt="">
        </div>



    </div>
</template>


<style lang="scss" scoped>
.mainContainer {
    width: 100%;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    padding: 2% 5%;

    .logo{
        display: flex;
        margin-top: 3px;
        width: 8em;
        position: absolute;
        top: 60px;
        border-radius: 50%;
        right: 170px;
    }
}

.microheader {
    display: flex;
    align-self: end;
    flex-direction: column;
    width: 25%;
    margin-top: 20%;
}

.rounded {
    border-radius: 8px;
    border-radius: 8px;
}

.imagen1 {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}

.uno {
    display: flex;
    justify-content: end;
    width: 20%;
    border-radius: 8%;
}

.dos {
    display: flex;
    justify-content: center;
    width: 20%;
    border-radius: 8%;
}

// @import 'variables';

.btn {
  border-radius: 8px;
}

.btn-primary {
  background-color: blue;
  color: white;
  padding: 0px 1px;
  margin-top: 5%;
}
</style>