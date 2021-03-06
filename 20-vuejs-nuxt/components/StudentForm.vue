<template>
  <b-row>
    <b-col lg="9">
      <h3>Wprowadź dane studenta</h3>
      <ValidationObserver v-slot="{ invalid, handleSubmit }">
        <form @submit.prevent="handleSubmit(sendMessage)">

          <div class="row">
            <div class="col-md-6 form-group g-mb-20">
              <label class="g-color-gray-dark-v2 g-font-size-13">Imię</label>
              <ValidationProvider :rules="{required: true, min: 3, max: 20}" name="imię" v-slot="v">
                <b-form-input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v4 g-brd-primary--hover rounded-3 g-py-13 g-px-15"
                              type="text"
                              placeholder="Jan"
                              v-model="formData.name"
                              :state="v.errors[0] ? false : (v.valid ? true : null)"
                ></b-form-input>

                <span v-if="v.errors[0]">
                        <span style="color: red"> {{ v.errors[0] }} </span>
                      </span>
              </ValidationProvider>

            </div>

            <div class="col-md-6 form-group g-mb-20">
              <label class="g-color-gray-dark-v2 g-font-size-13">Nazwisko</label>
              <ValidationProvider :rules="{required: true, min: 3, max: 20}" name="nazwisko" v-slot="v">
                <b-form-input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v4 g-brd-primary--hover rounded-3 g-py-13 g-px-15"
                              type="text"
                              placeholder="Kowalski"
                              v-model="formData.surname"
                              :state="v.errors[0] ? false : (v.valid ? true : null)"
                ></b-form-input>

                <span v-if="v.errors[0]">
                        <span style="color: red"> {{ v.errors[0] }} </span>
                      </span>
              </ValidationProvider>

            </div>

            <div class="col-md-6 form-group g-mb-20">
              <label class="g-color-gray-dark-v2 g-font-size-13">Nr albumu</label>
              <ValidationProvider :rules="{required: true, numeric: true, min_value: 0, max_value: 9999999}" name="nr albumu" v-slot="v">
                <b-form-input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v4 g-brd-primary--hover rounded-3 g-py-13 g-px-15"
                              type="text"
                              placeholder="123456"
                              v-model="formData.albumNr"
                              :state="v.errors[0] ? false : (v.valid ? true : null)"
                ></b-form-input>

                <span v-if="v.errors[0]">
                        <span style="color: red"> {{ v.errors[0] }} </span>
                      </span>
              </ValidationProvider>

            </div>

          </div>

          <div class="text-center">
            <b-button variant="info"
                    type="submit"
                    role="button"
                    v-if="!sending">Wyślij wiadomość
            </b-button>
          </div>

        </form>
      </ValidationObserver>
    </b-col>
  </b-row>
</template>

<script>
import { ValidationProvider, ValidationObserver } from "vee-validate";

export default {
  name: "StudentForm",
  components: {
    ValidationObserver: ValidationObserver,
    ValidationProvider: ValidationProvider,

  },
  data() {
    return {
      sending: false,
      formData: {
        name: null,
        surname: null,
        albumNr: null,
      },
    }
  },
  methods: {
    sendMessage() {
      let form = new FormData();
      form.append('name', this.formData.name);
      form.append('surname', this.formData.surname);
      form.append('albumNr', this.formData.albumNr);

      this.sending = true;
      try {
        this.$axios.post('/students', form).then((res) => {
          if (res.status == 200) {
            this.notificationSuccess();

          } else {
            // nie udalo sie zarejestrowac
          }
          this.sending = false;

        })
      } catch (ex) {
        this.sending = false;
      }

    },
    notificationSuccess() {
      this.$root.$bvToast.toast('Prawidłowo zarejestrowano studenta', {
        title: 'Rejestracja studenta',
        autoHideDelay: 5000,
        appendToast: true,
        solid: true,
        variant: 'info',
        toaster: 'b-toaster-bottom-right'
      })
    },
  }
}
</script>

<style scoped>

</style>
