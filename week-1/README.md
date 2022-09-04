
## Namespace nedir?

Aynı isimde etiketlere sahip olan XML kaynaklarının çakışabilirler. Bu çakışmaların önüne geçmek için namespace veya prefix kullanılmalıdır. 
Bir namespace tanımlanırken genellikle URL veya URN verilir. Böyle yaparak bu namespace'nin benzersiz olması sağlanır çünkü aynısından iki tane olamaz.
  

## Örnekler
```xml
<persons xmlns="http://www.godoro.com/test">
	<person no="122">
		<name>Albert</name>
		<surname>Einstein</surname>
		<address xmlns="http://www.godoro.com/profile">
			<city>istanbul</city>
			<country>Turkiye</country>
		</address>
	</person>
	<person no="122">
		<name>Orhan</name>
		<surname>Gencebay</surname>
		<address xmlns="http://www.godoro.com/profile">
			<city>Ankara</city>
			<country>Turkiye</country>
		</address>
	</person>
</persons>

<ps:persons xmlns:ps="http://www.godoro.com/test">
	<ps:person no="122">
		<ps:name>Albert</ps:name>
		<ps:surname>Einstein</ps:surname>
	</ps:person>
	<ps:person no="122">
		<ps:name>Orhan</ps:name>
		<ps:surname>Gencebay</ps:surname>
	</ps:person>
</ps:persons>

```

  
