package br.com.healthtrack.entities;

public enum Academia {
	SMARTFIT {
		@Override
        public String getValue() {
            return "SmartFit";
        }
	},
	BODYTECH{
		@Override
        public String getValue() {
            return "BodyTech";
        }
	},
	COMPANHIAATHLETICA{
		@Override
        public String getValue() {
            return "Companhia Athl�tica";
        }
	},
	BIORITMO{
		@Override
        public String getValue() {
            return "BioRitmo";
        }
	},
	IRONBOX{
		@Override
        public String getValue() {
            return "IronBox";
        }
	};
	
	public abstract String getValue();
	
}
