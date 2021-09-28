package br.com.healthtrack.entities;

public enum SegmentoCorporal {

	PEITO {
		@Override
        public String getValue() {
            return "Peito";
        }
	},
	BRACOS{
		@Override
        public String getValue() {
            return "Braços";
        }
	},
	COSTAS{
		@Override
        public String getValue() {
            return "Costas";
        }
	},
	PERNAS{
		@Override
        public String getValue() {
            return "Pernas";
        }
	},
	ABDOMEN{
		@Override
        public String getValue() {
            return "Abdomen";
        }
	};
	
	public abstract String getValue();
	
	
}
