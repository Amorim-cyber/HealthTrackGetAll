package br.com.healthtrack.entities;

public enum Turno {

	MANHA {
		@Override
        public String getValue() {
            return "Manhã";
        }
	},
	TARDE{
		@Override
        public String getValue() {
            return "Tarde";
        }
	},
	NOITE{
		@Override
        public String getValue() {
            return "Noite";
        }
	};
	
	public abstract String getValue();
	
}
