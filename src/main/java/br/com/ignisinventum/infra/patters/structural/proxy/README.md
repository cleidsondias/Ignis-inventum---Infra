## Proxy Pattern

**Type:** Structural

**What it is:**
A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes, consider a heavy Java object (like a JDBC connection or a SessionFactory) that requires some initial configuration.

We only want such objects to be initialized on demand, and once they are, we'd want to reuse them for all calls:


![Singleton Pattern](./Proxy%20Pattern.png?raw=true)
