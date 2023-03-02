<script>
import { ref } from 'vue'

const columns = [
  {
    name: 'Events',
    required: true,
    label: 'Events',
    align: 'center',
    field: row => row.Events,
    format: val => `${val}`,
    sortable: true
  },

  { name: 'imagen', align: 'center', label: 'Imagen', field: 'imagen', sortable: false, format: (val) => 'imagen' },
  { name: 'Description', align: 'center', label: 'Description', field: 'Description', sortable: true },
  { name: 'Date', align: 'center', label: 'Date', field: 'Date' },
  { name: 'MaxCrowd', align: 'center', label: 'MaxCrowd', field: 'MaxCrowd' },
  { name: 'Button', align: 'center', label: 'Button', field: 'Button' }
]

const rows = [
  {
    imagen: "/src/assets/images/Altj.jpg",
    Events: 'Alt-J',
    Description: 'vfvef efvefvfrefrv efvwrefvervfe fvefv',
    Date: 24,
    MaxCrowd: 4.0,
    imageIndex: 0
  },
  {
    imagen: "/src/assets/images/bon-jovi-1992.PNG",
    Events: 'Bon Jovi',
    Description: 'vfvef efvefvfrefrv efvwrefvervfe vfrf',
    Date: 37,
    MaxCrowd: 4.3
  },
  {
    imagen: "/src/assets/images/king-gizzard-and-the-lizard-wizard-2022.jpg",
    Events: 'King Gizzard & The Lizard Wizard',
    Description: 'vfvef efvefvfrefrv efvwrefv fvefv vfrf',
    Date: 23,
    MaxCrowd: 6.0
  },
  {
    imagen: "/src/assets/images/Los-Gatos-De-Chernobyl.jpg",
    Events: 'Los Gatos De Chernobyl',
    Description: 3.7,
    Date: 67,
    MaxCrowd: 4.3
  },
  {
    imagen: "/src/assets/images/TashSultana.jpeg",
    Events: 'Tash Sultana',
    Description: 16.0,
    Date: 49,
    MaxCrowd: 3.9
  },
  {
    Events: 'Jelly bean',
    Description: 0.0,
    Date: 94,
    MaxCrowd: 0.0
  },
  {
    Events: 'Lollipop',
    Description: 0.2,
    Date: 98,
    MaxCrowd: 0
  },
  {
    Events: 'Honeycomb',
    Description: 3.2,
    Date: 87,
    MaxCrowd: 6.5
  },
  {
    Events: 'Donut',
    Description: 25.0,
    Date: 51,
    MaxCrowd: 4.9
  },
  {
    Events: 'KitKat',
    Description: 26.0,
    Date: 65,
    MaxCrowd: 7
  }
]

export default {
  setup() {
    return {
      selected: ref([]),
      columns,
      rows
    }
  }
}
</script>

<template>
  <div class="q-pa-md">
    <q-table class="bg-grey-4" :rows="rows" :columns="columns" row-key="name" selection="multiple"
      v-model:selected="selected" :grid="$q.screen.xs">


      <template #body-cell-imagen="{ row }">
        <q-img :src="row.imagen" />
      </template>

      <template #body-cell-Button>
        <q-td align="center">
          <q-btn push color="white" text-color="primary" label="Add" />
          <q-btn push color="white" text-color="primary" label="Edit" />
          <q-btn push color="red" text-color="primary" label="delete" />
        </q-td>
      </template>

      <template v-slot:header-selection="scope">
        <q-toggle v-model="scope.selected" />
      </template>

      <template v-slot:body-selection="scope">
        <q-toggle v-model="scope.selected" />
      </template>

    </q-table>
  </div>
</template>
<style lang="scss">
.q-pa-md {
  width: 80vw;

  .q-table {
    thead {
      background-color: #D9D9D9;
    }

    th {
      font-size: 2vw;
    }

    tbody {
      background-color: #B7B7B7;

      td {
        &:nth-child(2) {
          background-color: #9E0404;
          color: white;
          max-width: 3vw;
          white-space: pre-wrap;
        }

        &:nth-child(4) {
          background-color: #9E0404;
          white-space: pre-wrap;
          max-width: 20vw;
        }
        
        font-size: 1.5vw;
        font-weight: bold;
      }
    }
  }
  
  .q-table__bottom {
    background-color: white;
  }
}

.q-img {
  height: 15vh;
  width: 15vw;
}
</style>
