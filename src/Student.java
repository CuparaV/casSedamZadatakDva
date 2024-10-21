

public class Student {




        private String ime;
        private String prezime;
        private int ocena;


        public Student(String ime, String prezime, int ocena) {
            this.ime = ime;
            this.prezime = prezime;
            this.ocena = ocena;
        }


        public String getIme() {
            return ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public int getOcena() {
            return ocena;
        }

        // ispis podataka o studentu
        public String toString() {
            return "Ime: " + ime + ", Prezime: " + prezime + ", Ocena: " + ocena;
        }
    }

