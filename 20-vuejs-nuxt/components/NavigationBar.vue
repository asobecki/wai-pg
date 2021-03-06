<template>
  <b-navbar toggleable="lg" type="dark" variant="danger">
    <b-navbar-brand href="#">WAI-PG</b-navbar-brand>

    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse id="nav-collapse" is-nav>
      <b-navbar-nav>
        <b-nav-item href="/students/add">Dodaj studenta</b-nav-item>
        <b-nav-item href="#">Drugi link</b-nav-item>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
export default {
name: "NavigationBar"
}
</script>

<style scoped>

</style>
