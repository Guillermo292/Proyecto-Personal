<script>

</script>

<template>
  <div class="container">

    <div class="card">
      <img src="../assets/img/fotter1.jpg" alt="">
      <p>DOCTOR PEPIN</p>
      <p>Traumatólogo</p>
      <p>Telf 59473939</p>
    </div>

    <div class="card">
      <img src="../assets/img/fotter2.jpg" alt="">
      <p>DOCTOR PEPON</p>
      <p>Otorrinolaringólogo</p>
      <p>Tlef 847630</p>
    </div>

    <div class="card">
      <img src="../assets/img/porti5.jpg" alt="">
      <p>DOCTORA MARY</p>
      <p>Physioterapeuta</p>
      <p>Telf 999293</p>
    </div>

    <div class="card">
      <img src="../assets/img/porti6.jpg" alt="">
      <P>DOCTORA PURI</P>
      <p>Dermatóloga</p>
      <p>Telf 9383830</p>
    </div>

    <div class="card">
      <img src="../assets/img/porti7.jpg" alt="">
      <p>DOCTOR DAZA</p>
      <p>Urólogo</p>
      <p>Telf 01020304</p>
    </div>

 
    <div class="card">
      <img src="../assets/img/porti8.jpg" alt="">
      <p>DOCTOR MANUEL</p>
      <p>Dentista</p>
      <p>Telf 561239</p>
    </div>

    <div class="card">
      <img src="../assets/img/porti9.jpg" alt="">
      <p>DOCTOR ENOL</p>
      <p>Ginecólogo</p>
      <p>Telf 666999</p>
    </div>

    <div class="card">
      <img src="../assets/img/porti10.jpg" alt="">
      <p>DOCTOR SAUL</p>
      <p>Traumatólogo</p>
      <p>Telf 920174</p>
    </div>


   

  </div>
</template>

<style lang="scss" scoped>
@import "../assets/scss/main.scss";


main {
  display: flex;
  width: 100%;
  height: 100vh;
  background-image: url("../assets/img/fotter2");
  background-repeat: no-repeat;
  background-size: cover;
}

.card {
  width: 15em;
  height: 20em;
  border-radius: 5%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

  img {
    width: 10em;
    height: 8em;
    border-radius: 8%;
  }
}

.container {
  display: flex;
    flex-direction: row;
    flex-wrap: wrap;
  width: 100%;
  justify-content: center;
}
p{
  display: flex;
  width: 10em;
  background-color: rgba(194, 197, 187, 0.993);
  border-radius: 2px;
  color: black;
  justify-content: center;
  height: 1.5em;
  align-items: center;
}
</style>