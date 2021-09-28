package br.com.healthtrack.entities;

public enum Plano {

	MENSAL {
		@Override
        public String getValue() {
            return "Mensal";
        }
	},
	TRIMESTRAL{
		@Override
        public String getValue() {
            return "Trimestral";
        }
	},
	SEMESTRAL{
		@Override
        public String getValue() {
            return "Semestral";
        }
	},
	ANUAL{
		@Override
        public String getValue() {
            return "Anual";
        }
	};
	
	public abstract String getValue();
	
}
