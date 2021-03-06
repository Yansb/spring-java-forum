package br.com.yanbarreiro.forum.model;

public class Curso {

        private Long id;
        private String nome;
        private String categoria;

        public Curso(String nome, String categoria) {
            this.nome = nome;
            this.categoria = categoria;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Curso other = (Curso) obj;
            if (id == null) {
                return other.id == null;
            } else {
              return id.equals(other.id);
            }
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

}
