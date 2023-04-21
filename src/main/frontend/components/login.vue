<script setup>
import { ref } from 'vue';
import { useAuthStore } from '../stores/authStore';
import { useRouter } from 'vue-router';

</script>



<template>
    <v-sheet width="37%" class="form mx-auto">
        <v-img :width="'50%'" aspect-ratio="16/9" cover src="../../src/assets/img/logo-login.jpg" class="img"></v-img>
        <v-form ref="form" @keyup.enter="login(username, password)">
            <v-text-field color="#FF4700" v-model="username" :counter="10" :rules="nameRules" label="Usuario" required
                class="form__name"></v-text-field>

            <v-text-field v-model="password" color="#FF4700" :counter="10" :rules="passwordRules" label="Contraseña"
                required class="form__pass" type="password"></v-text-field>

            <div class="btn">
                <v-btn color="#FF4700" rounded="xs" :width="'50%'" @click="login(username, password)">
                    Iniciar sesión
                </v-btn>
            </div>
        </v-form>
    </v-sheet>
</template>


<style lang="scss" scoped>
.form {
    box-shadow: 1px 3px 10px 1px rgba(0, 0, 0, 0.48);
    border-radius: 12px;

    .img {
        display: flex;
        max-width: 100%;
        position: relative;
        margin: auto;

    }

    .form__name {
        margin: 40px;
        border-radius: 12px;
    }

    .form__pass {
        margin: 40px;
    }

    .btn {
        display: flex;
        justify-content: center;
        width: 100%;
        padding-bottom: 50px;


    }
}
</style>