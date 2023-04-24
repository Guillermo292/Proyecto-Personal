<script >
import { useRouter } from 'vue-router';
const router = useRouter();

export default {
  data() {
    return {
      name: '',
      profession: '',
      phone: '',
      book: {}
    };
  },
  created() {
    this.fetchData();
  },
  methods: {
    async fetchData() {
      const response = await fetch('book.json');
      const data = await response.json();
      this.book = data;
    }
  }
}

</script>




<template>
    <div class="form-group">
    <input v-model="formData.name" type="text" class="form-control" placeholder="Nombre">
    <input v-model="formData.profession" type="text" class="form-control" placeholder="Profesión">
    <input v-model="formData.phone" type="text" class="form-control" placeholder="Número de teléfono">

</div>
</template>



<style lang="scss" scoped>
.form-control {
  width: 100%;
  height: 40px;
  padding: 10px 20px;
  font-size: 16px;
  border: 1px solid black;
  border-radius: 8px;
}

label {
  display: block;
  margin-top: 6px;
  margin-bottom: 6px;
  color:grey;
}

</style>