package main

import (
	"fmt"
	"log"
	"net/http"
)

func homePage(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "To jest strona startowa")
	fmt.Println("Wywołano akcję do obsługi domyślnego adresu /")
}

func dispatcher() {
	http.HandleFunc("/", homePage)
	log.Fatal(http.ListenAndServe(":9080", nil))
}

func main() {
	dispatcher()
}
