package materials;

import java.io.IOException;

class CarbonStructure {
	 protected long count;
	 public abstract Number getCount() throws IOException; // q1
	 public CarbonStructure(int count) { this.count = count; }
	}