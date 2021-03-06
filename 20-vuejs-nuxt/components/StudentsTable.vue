<template>
  <div>
    <h2>Lista studentów</h2>
    <b-table hover :items="items" :fields="fields"></b-table>
    <button @click="this.fetch">Refresh</button>
  </div>
</template>

<script>
export default {
name: "StudentsTable",
  data() {
    return {
      items: [],
      fields: [
        {
          key: 'name',
          sortable: true,
          label: 'Imię'
        },
        {
          key: 'surname',
          sortable: true,
          label: 'Nazwisko'
        },
        {
          key: 'albumNr',
          sortable: true,
          label: 'Nr albumu'
        },
      ],
    }
  },
  async fetch() {
  try {
    this.items = await this.$axios.get('/students').then((res) => {
      if (res.status != 200) {
        return [];
      }
      return res.data;
    })
  } catch (ex) {
    console.log("Exception: "+ex);
  }
  },
}
</script>

<style scoped>

</style>
